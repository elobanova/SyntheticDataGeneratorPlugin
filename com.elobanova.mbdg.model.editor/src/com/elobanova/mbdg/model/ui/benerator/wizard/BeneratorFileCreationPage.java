package com.elobanova.mbdg.model.ui.benerator.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;

import com.elobanova.mbdg.model.domain.GeneratorXMLModel;
import com.elobanova.mbdg.model.ui.AbstractFileCreationPage;

import intermediate.presentation.GeneratorIntermediateModelEditorPlugin;

public class BeneratorFileCreationPage extends AbstractFileCreationPage {

	public BeneratorFileCreationPage(String pageId, IStructuredSelection selection) {
		super(pageId, selection);
		setTitle(Messages.BeneratorFileCreationPage_Title);
		setDescription(Messages.BeneratorFileCreationPage_Description);
	}

	@Override
	protected boolean validateExtension(String extension) {
		if (extension == null || !GeneratorXMLModel.FILE_EXTENSION.equalsIgnoreCase(extension)) {
			GeneratorIntermediateModelEditorPlugin.logError(Messages.BeneratorFileCreationPage_FileExtensionError, getShell());
			return false;
		}
		return true;
	}
}