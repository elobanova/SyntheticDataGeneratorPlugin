package com.elobanova.mbdg.model.test;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

public class ModelBasedDataGeneratorTestPlugin implements BundleActivator {
	private static ModelBasedDataGeneratorTestPlugin plugin;

	private static BundleContext context;

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
		ModelBasedDataGeneratorTestPlugin.context = bundleContext;
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		ModelBasedDataGeneratorTestPlugin.context = null;
		plugin = null;
	}

	public Bundle getBundle() {
		return FrameworkUtil.getBundle(getClass());
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static ModelBasedDataGeneratorTestPlugin getDefault() {
		return plugin;
	}

}
