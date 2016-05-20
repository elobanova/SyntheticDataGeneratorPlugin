package com.elobanova.mbdg.ui.setup;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.elobanova.mbdg.ui.setup.setup.wizard.messages"; //$NON-NLS-1$
	public static String SetupFileCreationPage_Validate_Page_Error;
	public static String SetupWizard_Build_Model_Setup_Wizard_Finish_Error;
	public static String SetupWizard_Execute_Setup_Wizard_Finish_Error;
	public static String SetupWizard_Setup_File_Creation_Page_Description;
	public static String SetupWizard_Setup_File_Creation_Page_Name;
	public static String SetupWizard_Setup_File_Creation_Page_Title;
	public static String SetupWizard_Setup_Initialization_Page_Description;
	public static String SetupWizard_Setup_Initialization_Page_Title;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
