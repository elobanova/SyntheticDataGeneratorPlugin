package com.elobanova.mbdg.ui.setup;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.importer.ecore.EcoreImporter;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import com.elobanova.mbdg.model.setup.SetupModel;

import intermediate.ModelRoot;
import intermediate.presentation.GeneratorIntermediateModelEditorPlugin;
import intermediate.provider.IntermediateModelProvider;

public class IntermediateConfigurationModelWizard extends Wizard implements INewWizard {
	public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(
			Arrays.asList(GeneratorIntermediateModelEditorPlugin.INSTANCE.getString("_UI_IntermediateEditorFilenameExtensions").split("\\s*,\\s*"))); //$NON-NLS-1$

	public static final String DEFAULT_SETUP_MODEL_FILENAME = "Intermediate"; //$NON-NLS-1$
	public static final String DEFAULT_SETUP_MODE_PATH = DEFAULT_SETUP_MODEL_FILENAME + "." + SetupModel.FILE_EXTENSION; //$NON-NLS-1$

	public static final String DEFAULT_INTERMEDIATE_MODEL_FILENAME = "Configuration"; //$NON-NLS-1$
	public static final String DEFAULT_INTERMEDIATE_MODEL_PATH = DEFAULT_INTERMEDIATE_MODEL_FILENAME + "." + FILE_EXTENSIONS.get(0); //$NON-NLS-1$

	private IWorkbench workbench;
	private IStructuredSelection selection;
	private ConfigurationModelFileCreationPage configurationCreationPage;
	private ConfigurationModelInitializationPage modelInitizalizationPage;
	private EcoreImporter importer;

	public IntermediateConfigurationModelWizard() {
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
					ResourceSet resourceSet = new ResourceSetImpl();
					URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
					Resource resource = resourceSet.createResource(fileURI);
					ModelRoot modelRoot = createIntermediateModel();
					if (modelRoot != null) {
						resource.getContents().add(modelRoot);
					}

					Map<Object, Object> options = new HashMap<Object, Object>();
					options.put(XMLResource.OPTION_ENCODING, "UTF-8");
					resource.save(options);
				} catch (Exception exception) {
					Shell shell = workbench.getActiveWorkbenchWindow().getShell();
					GeneratorIntermediateModelEditorPlugin.logError(Messages.ConfigurationWizard_Build_Model_Configuration_Wizard_Finish_Error, shell,
							exception);
				} finally {
					progressMonitor.done();
				}
			}
		};

		try {
			getContainer().run(false, false, operation);
		} catch (InvocationTargetException | InterruptedException e) {
			Shell shell = workbench.getActiveWorkbenchWindow().getShell();
			GeneratorIntermediateModelEditorPlugin.logError(Messages.ConfigurationWizard_Execute_Configuration_Wizard_Finish_Error, shell, e);
			return false;
		}

		return true;
	}

	protected ModelRoot createIntermediateModel() {
		List<EPackage> packages = importer.getEPackages();
		IntermediateModelProvider intermediateModelProvider = new IntermediateModelProvider(packages);
		return intermediateModelProvider.createIntermediateModel();
	}

	@Override
	public void addPages() {
		this.configurationCreationPage = new ConfigurationModelFileCreationPage(Messages.ConfigurationWizard_Configuration_File_Creation_Page_Name,
				this.selection);
		this.configurationCreationPage.setTitle(Messages.ConfigurationWizard_Configuration_File_Creation_Page_Title);
		this.configurationCreationPage.setDescription(Messages.ConfigurationWizard_Configuration_File_Creation_Page_Description);
		this.configurationCreationPage.setFileName(DEFAULT_SETUP_MODE_PATH);
		addPage(this.configurationCreationPage);

		if (this.selection != null && !this.selection.isEmpty()) {
			Object selectedElement = this.selection.iterator().next();
			if (selectedElement instanceof IResource) {
				IResource selectedResource = (IResource) selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					this.configurationCreationPage.setContainerFullPath(selectedResource.getFullPath());
					this.configurationCreationPage.setFileName(getUniqueIntermediateModelName(selectedResource));
				}
			}
		}
		this.modelInitizalizationPage = new ConfigurationModelInitializationPage(this.importer, "com.rwth.swc.mt.mbdg.model.init.page.ID");
		this.modelInitizalizationPage.setTitle(Messages.ConfigurationWizard_Configuration_Initialization_Page_Title);
		this.modelInitizalizationPage.setDescription(Messages.ConfigurationWizard_Configuration_Initialization_Page_Description);
		addPage(this.modelInitizalizationPage);
	}

	private String getUniqueIntermediateModelName(IResource selectedResource) {
		String modelFilename = DEFAULT_INTERMEDIATE_MODEL_PATH;
		for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; i++) {
			modelFilename = DEFAULT_INTERMEDIATE_MODEL_FILENAME + i + "." + FILE_EXTENSIONS.get(0); //$NON-NLS-1$
		}
		return modelFilename;
	}

	public IFile getModelFile() {
		return this.configurationCreationPage.getModelFile();
	}

}
