package com.elobanova.mbdg.ui.setup;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.elobanova.mbdg.ui.setup.configuration.wizard.messages"; //$NON-NLS-1$
	public static String ConfigurationFileCreationPage_Validate_Page_Error;
	public static String ConfigurationWizard_Build_Model_Configuration_Wizard_Finish_Error;
	public static String ConfigurationWizard_Execute_Configuration_Wizard_Finish_Error;
	public static String ConfigurationWizard_Configuration_File_Creation_Page_Description;
	public static String ConfigurationWizard_Configuration_File_Creation_Page_Name;
	public static String ConfigurationWizard_Configuration_File_Creation_Page_Title;
	public static String ConfigurationWizard_Configuration_Initialization_Page_Description;
	public static String ConfigurationWizard_Configuration_Initialization_Page_Title;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
