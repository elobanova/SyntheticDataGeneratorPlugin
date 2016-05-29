package com.elobanova.mbdg.model.ui;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.importer.ecore.EcoreImporter;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import intermediate.presentation.GeneratorIntermediateModelEditorPlugin;

public abstract class AbstractModelWizard extends Wizard implements INewWizard {

	protected IWorkbench workbench;
	protected IStructuredSelection selection;
	protected AbstractFileCreationPage fileCreationPage;
	protected ModelInitializationPage modelInitizalizationPage;
	protected EcoreImporter importer;

	protected AbstractModelWizard() {
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
					createModel(modelFile);
				} catch (Exception exception) {
					Shell shell = workbench.getActiveWorkbenchWindow().getShell();
					GeneratorIntermediateModelEditorPlugin.logError(Messages.AbstractModelWizard_ConstructiModelError, shell, exception);
				} finally {
					progressMonitor.done();
				}
			}
		};

		try {
			getContainer().run(false, false, operation);
		} catch (InvocationTargetException | InterruptedException e) {
			Shell shell = workbench.getActiveWorkbenchWindow().getShell();
			GeneratorIntermediateModelEditorPlugin.logError(Messages.AbstractModelWizard_FinishingWizardError, shell, e);
			return false;
		}

		return true;
	}

	@Override
	public void addPages() {
		this.fileCreationPage = getFileCreationPage();

		this.fileCreationPage.setFileName(getDefaultFilePath());
		addPage(this.fileCreationPage);

		if (this.selection != null && !this.selection.isEmpty()) {
			Object selectedElement = this.selection.iterator().next();
			if (selectedElement instanceof IResource) {
				IResource selectedResource = (IResource) selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					this.fileCreationPage.setContainerFullPath(selectedResource.getFullPath());
					this.fileCreationPage.setFileName(getUniqueModelName(selectedResource));
				}
			}
		}
		this.modelInitizalizationPage = getModelInitPage();
		this.modelInitizalizationPage.setTitle(Messages.AbstractModelWizard_InitPageName);
		this.modelInitizalizationPage.setDescription(Messages.AbstractModelWizard_InitPageDescription);
		addPage(this.modelInitizalizationPage);
	}

	protected abstract ModelInitializationPage getModelInitPage();

	protected abstract void createModel(IFile modelFile) throws IOException;

	protected abstract AbstractFileCreationPage getFileCreationPage();

	protected abstract String getDefaultFilePath();

	protected abstract String getUniqueModelName(IResource selectedResource);

	public IFile getModelFile() {
		return this.fileCreationPage.getModelFile();
	}

}
