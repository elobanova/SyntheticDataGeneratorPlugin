package com.elobanova.mbdg.ui.setup;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.elobanova.mbdg.ui.setup.setup.wizard.messages"; //$NON-NLS-1$
	public static String SetupFileCreationPage_Validate_Page_Error;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
