package com.elobanova.mbdg.ui.setup;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.elobanova.mbdg.model.setup.SetupModel;
import com.elobanova.mbdg.ui.ModelBasedDataGeneratorUIPlugin;

public class SetupFileCreationPage extends WizardNewFileCreationPage {

	public SetupFileCreationPage(String pageId, IStructuredSelection selection) {
		super(pageId, selection);
	}

	@Override
	protected boolean validatePage() {
		if (super.validatePage()) {
			String extension = new Path(getFileName()).getFileExtension();
			if (extension == null || !SetupModel.FILE_EXTENSION.equalsIgnoreCase(extension)) {
				ModelBasedDataGeneratorUIPlugin.logError(Messages.SetupFileCreationPage_Validate_Page_Error, getShell());
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