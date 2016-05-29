package com.elobanova.mbdg.model.ui.intermediate.wizard;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.elobanova.mbdg.model.ui.intermediate.wizard.messages"; //$NON-NLS-1$
	public static String IntermediateFileCreationPage_Validate_Page_Error;
	public static String IntermediateWizard_Build_Model_Intermediate_Wizard_Finish_Error;
	public static String IntermediateWizard_Execute_Intermediate_Wizard_Finish_Error;
	public static String IntermediateWizard_Intermediate_File_Creation_Page_Description;
	public static String IntermediateWizard_Intermediate_File_Creation_Page_Name;
	public static String IntermediateWizard_Intermediate_File_Creation_Page_Title;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
