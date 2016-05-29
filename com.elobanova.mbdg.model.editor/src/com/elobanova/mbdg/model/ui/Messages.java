package com.elobanova.mbdg.model.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.elobanova.mbdg.model.ui.messages"; //$NON-NLS-1$
	public static String AbstractModelWizard_ConstructiModelError;
	public static String AbstractModelWizard_FinishingWizardError;
	public static String AbstractModelWizard_InitPageDescription;
	public static String AbstractModelWizard_InitPageName;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
