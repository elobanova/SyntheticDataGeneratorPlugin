package com.elobanova.mbdg.model.domain;

import java.io.File;

import javax.xml.bind.JAXBException;

import org.eclipse.osgi.util.NLS;

import com.elobanova.mbdg.model.ModelBasedDataGeneratorPlugin;
import com.elobanova.mbdg.model.xml.JAXBContentResolver;

public class GeneratorXMLModel {
	public static final String FILE_EXTENSION = "xml";
	public static final String XMLNS = "http://databene.org/benerator/0.9.8";
	public static final String ENCODING = "Cp1251";

	private GeneratorRootElement rootNode;

	private File setupFile;
	private JAXBContentResolver<GeneratorRootElement> resolver;

	public GeneratorXMLModel(File setupFile) {
		this.resolver = new JAXBContentResolver<>();
		this.rootNode = loadRoot();
		this.setupFile = setupFile;
	}

	public void setRootNode(GeneratorRootElement rootNode) {
		this.rootNode = rootNode;
	}

	private GeneratorRootElement loadRoot() {
		if (setupFile != null && setupFile.exists()) {
			try {
				return resolver.loadRoot(setupFile, GeneratorRootElement.class);
			} catch (JAXBException e) {
				ModelBasedDataGeneratorPlugin.logError(NLS.bind("Error loading xml file", setupFile.getPath()),
						ModelBasedDataGeneratorPlugin.getDefault(), e);
			}
		}
		return new GeneratorRootElement();
	}

	public void save() {
		if (setupFile != null) {
			try {
				resolver.saveRoot(rootNode, setupFile, GeneratorRootElement.class);
			} catch (JAXBException e) {
				ModelBasedDataGeneratorPlugin.logError(NLS.bind("Error saving xml file", setupFile.getPath()),
						ModelBasedDataGeneratorPlugin.getDefault(), e);
			}
		}
	}
}
