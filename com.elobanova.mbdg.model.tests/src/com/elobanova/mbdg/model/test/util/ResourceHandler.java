package com.elobanova.mbdg.model.test.util;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.elobanova.mbdg.model.test.ModelBasedDataGeneratorTestPlugin;

public class ResourceHandler {
	public static URI getResolvedUri(String entry) throws IOException, URISyntaxException {
		URL expectedFileURL = ModelBasedDataGeneratorTestPlugin.getDefault().getBundle().getEntry(entry);
		URL resolvedFileURL = FileLocator.toFileURL(expectedFileURL);
		URI resolvedURI = new URI(resolvedFileURL.getProtocol(), resolvedFileURL.getPath(), null);
		return resolvedURI;
	}

	public static List<EPackage> getEcoreResourcePackages(String modelLocation) throws IOException, URISyntaxException {
		List<EPackage> packages = new ArrayList<>();
		EList<EObject> contents = getModelFileContents(modelLocation);
		if (contents != null && contents.size() > 0) {
			EObject topObject = contents.get(0);
			if (topObject instanceof EPackage) {
				packages.add((EPackage) topObject);
			}
		}
		return packages;
	}

	public static EList<EObject> getModelFileContents(String modelLocation) throws IOException, URISyntaxException {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI ecoreModelFileUri = ResourceHandler.getResolvedUri(modelLocation);
		Resource resource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createURI(ecoreModelFileUri.toString()), true);
		return resource.getContents();
	}
}
