package com.elobanova.mbdg.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ModelBasedDataGeneratorUIPlugin implements BundleActivator {

	private static BundleContext context;
	private static ModelBasedDataGeneratorUIPlugin plugin;

	static BundleContext getContext() {
		return context;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static ModelBasedDataGeneratorUIPlugin getDefault() {
		return plugin;
	}

	public static void logError(String bind, Shell shell, Exception e) {
		Status status = new Status(IStatus.ERROR, "com.elobanova.mbdg.ui", e.getLocalizedMessage());
		ErrorDialog.openError(shell, bind, "Error occured", status);
	}

	public static void logError(String bind, Shell shell) {
		logError(bind, null);
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		ModelBasedDataGeneratorUIPlugin.context = bundleContext;
		plugin = this;
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		ModelBasedDataGeneratorUIPlugin.context = null;
		plugin = null;
	}

}