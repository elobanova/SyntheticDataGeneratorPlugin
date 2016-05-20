package com.elobanova.mbdg.ui.setup;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.importer.ecore.EcoreImporter;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import com.elobanova.mbdg.model.setup.DomainModelNode;
import com.elobanova.mbdg.model.setup.SetupModel;
import com.elobanova.mbdg.ui.ModelBasedDataGeneratorUIPlugin;

public class SetupWizard extends Wizard implements INewWizard {
	public static final String DEFAULT_SETUP_MODEL_FILENAME = "Intermediate"; //$NON-NLS-1$
	public static final String DEFAULT_SETUP_MODE_PATH = DEFAULT_SETUP_MODEL_FILENAME + "." + SetupModel.FILE_EXTENSION; //$NON-NLS-1$
	private IWorkbench workbench;
	private IStructuredSelection selection;
	private SetupFileCreationPage setupCreationPage;
	private SetupModelInitializationPage modelInitizalizationPage;
	private EcoreImporter importer;

	public SetupWizard() {
		this.importer = new EcoreImporter();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}

	@Override
	public boolean performFinish() {
		final IFile modelFile = getModelFile();
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor progressMonitor) {
				try {
					URI ecoreModelURI = SetupWizard.this.importer.getFirstModelLocationURI(true);
					DomainModelNode domainModel = new DomainModelNode();
					domainModel.setNsUri(ecoreModelURI.toString());
					IPath location = modelFile.getRawLocation();
					File file = location.toFile();
					SetupModel setupModel = new SetupModel(file);
					setupModel.setDomainModel(domainModel);
					setupModel.save();
				} catch (Exception exception) {
					Shell shell = workbench.getActiveWorkbenchWindow().getShell();
					ModelBasedDataGeneratorUIPlugin.logError(Messages.SetupWizard_Build_Model_Setup_Wizard_Finish_Error, shell, exception);
				} finally {
					progressMonitor.done();
				}
			}
		};

		try {
			getContainer().run(false, false, operation);
		} catch (InvocationTargetException | InterruptedException e) {
			Shell shell = workbench.getActiveWorkbenchWindow().getShell();
			ModelBasedDataGeneratorUIPlugin.logError(Messages.SetupWizard_Execute_Setup_Wizard_Finish_Error, shell, e);
			return false;
		}

		return true;
	}

	@Override
	public void addPages() {
		this.setupCreationPage = new SetupFileCreationPage(Messages.SetupWizard_Setup_File_Creation_Page_Name, this.selection);
		this.setupCreationPage.setTitle(Messages.SetupWizard_Setup_File_Creation_Page_Title);
		this.setupCreationPage.setDescription(Messages.SetupWizard_Setup_File_Creation_Page_Description);
		this.setupCreationPage.setFileName(DEFAULT_SETUP_MODE_PATH);
		addPage(this.setupCreationPage);

		if (this.selection != null && !this.selection.isEmpty()) {
			Object selectedElement = this.selection.iterator().next();
			if (selectedElement instanceof IResource) {
				IResource selectedResource = (IResource) selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					this.setupCreationPage.setContainerFullPath(selectedResource.getFullPath());
					this.setupCreationPage.setFileName(getUniqueSetupModelName(selectedResource));
				}
			}
		}
		this.modelInitizalizationPage = new SetupModelInitializationPage(this.importer, "com.rwth.swc.mt.mbdg.model.init.page.ID");
		this.modelInitizalizationPage.setTitle(Messages.SetupWizard_Setup_Initialization_Page_Title);
		this.modelInitizalizationPage.setDescription(Messages.SetupWizard_Setup_Initialization_Page_Description);
		addPage(this.modelInitizalizationPage);
	}

	private String getUniqueSetupModelName(IResource selectedResource) {
		String modelFilename = DEFAULT_SETUP_MODE_PATH;
		for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; i++) {
			modelFilename = DEFAULT_SETUP_MODEL_FILENAME + i + "." + SetupModel.FILE_EXTENSION; //$NON-NLS-1$
		}
		return modelFilename;
	}

	public IFile getModelFile() {
		return this.setupCreationPage.getModelFile();
	}

}
