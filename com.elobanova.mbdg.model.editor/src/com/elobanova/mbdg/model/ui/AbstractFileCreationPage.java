package com.elobanova.mbdg.model.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public abstract class AbstractFileCreationPage extends WizardNewFileCreationPage {

	protected AbstractFileCreationPage(String pageId, IStructuredSelection selection) {
		super(pageId, selection);
	}

	@Override
	protected boolean validatePage() {
		if (super.validatePage()) {
			String extension = new Path(getFileName()).getFileExtension();
			return validateExtension(extension);
		}
		return false;
	}

	protected abstract boolean validateExtension(String extension);

	public IFile getModelFile() {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
	}
}
