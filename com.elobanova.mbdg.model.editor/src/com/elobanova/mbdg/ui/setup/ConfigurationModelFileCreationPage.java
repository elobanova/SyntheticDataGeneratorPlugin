package com.elobanova.mbdg.ui.setup;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import intermediate.presentation.GeneratorIntermediateModelEditorPlugin;

public class ConfigurationModelFileCreationPage extends WizardNewFileCreationPage {

	public ConfigurationModelFileCreationPage(String pageId, IStructuredSelection selection) {
		super(pageId, selection);
	}

	@Override
	protected boolean validatePage() {
		if (super.validatePage()) {
			String extension = new Path(getFileName()).getFileExtension();
			if (extension == null || !IntermediateConfigurationModelWizard.FILE_EXTENSIONS.get(0).equalsIgnoreCase(extension)) {
				GeneratorIntermediateModelEditorPlugin.logError(Messages.ConfigurationFileCreationPage_Validate_Page_Error, getShell());
				return false;
			}
			return true;
		}
		return false;
	}

	public IFile getModelFile() {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
	}
}