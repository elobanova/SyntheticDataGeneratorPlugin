package com.elobanova.mbdg.model.ui.benerator.wizard;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.elobanova.mbdg.model.ui.benerator.wizard.messages"; //$NON-NLS-1$
	public static String BeneratorFileCreationPage_Description;
	public static String BeneratorFileCreationPage_FileExtensionError;
	public static String BeneratorFileCreationPage_Title;
	public static String BeneratorModelWizard_CreationPageName;
	public static String BeneratorModelWizard_InitPageName;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
