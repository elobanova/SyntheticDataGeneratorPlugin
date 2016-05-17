package com.elobanova.mbdg.model;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ModelBasedDataGeneratorPlugin implements BundleActivator {
	private static ModelBasedDataGeneratorPlugin plugin;
	private static BundleContext context;

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static ModelBasedDataGeneratorPlugin getDefault() {
		return plugin;
	}

	public static void logError(String bind, ModelBasedDataGeneratorPlugin modelBasedGeneratorPlugin, Exception e) {
		// TODO: log
	}

	public static void logError(String bind, ModelBasedDataGeneratorPlugin modelBasedGeneratorPlugin) {
		logError(bind, modelBasedGeneratorPlugin, null);
	}

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		ModelBasedDataGeneratorPlugin.context = bundleContext;
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		ModelBasedDataGeneratorPlugin.context = null;
		plugin = null;
	}

}
