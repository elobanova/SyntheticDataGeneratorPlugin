package com.elobanova.mbdg.model.ui.intermediate.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;

import com.elobanova.mbdg.model.ui.AbstractFileCreationPage;

import intermediate.presentation.GeneratorIntermediateModelEditorPlugin;

public class IntermediateModelFileCreationPage extends AbstractFileCreationPage {

	public IntermediateModelFileCreationPage(String pageId, IStructuredSelection selection) {
		super(pageId, selection);
		setTitle(Messages.IntermediateWizard_Intermediate_File_Creation_Page_Title);
		setDescription(Messages.IntermediateWizard_Intermediate_File_Creation_Page_Description);
	}

	@Override
	protected boolean validateExtension(String extension) {
		if (extension == null || !IntermediateModelWizard.FILE_EXTENSIONS.get(0).equalsIgnoreCase(extension)) {
			GeneratorIntermediateModelEditorPlugin.logError(Messages.IntermediateFileCreationPage_Validate_Page_Error, getShell());
			return false;
		}
		return true;
	}
}