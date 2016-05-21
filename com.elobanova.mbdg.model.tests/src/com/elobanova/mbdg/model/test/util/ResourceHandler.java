package com.elobanova.mbdg.model.test.util;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import com.elobanova.mbdg.model.test.ModelBasedDataGeneratorTestPlugin;


public class ResourceHandler {
	public static URI getResolvedUri(String entry) throws IOException, URISyntaxException {
		URL expectedFileURL = ModelBasedDataGeneratorTestPlugin.getDefault().getBundle().getEntry(entry);
		URL resolvedFileURL = FileLocator.toFileURL(expectedFileURL);
		URI resolvedURI = new URI(resolvedFileURL.getProtocol(), resolvedFileURL.getPath(), null);
		return resolvedURI;
	}
}
