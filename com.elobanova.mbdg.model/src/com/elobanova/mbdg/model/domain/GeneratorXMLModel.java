package com.elobanova.mbdg.model.domain;

import java.io.File;

import javax.xml.bind.JAXBException;

import org.eclipse.osgi.util.NLS;

import com.elobanova.mbdg.model.ModelBasedDataGeneratorPlugin;
import com.elobanova.mbdg.model.xml.JAXBContentResolver;

public class GeneratorXMLModel implements IGeneratorModel {
	public static final String FILE_EXTENSION = "xml";
	public static final String XMLNS = "http://databene.org/benerator/0.9.8";
	public static final String ENCODING = "Cp1251";

	private GeneratorRootElement rootNode;

	private File generatorFile;
	private JAXBContentResolver<GeneratorRootElement> resolver;

	public GeneratorXMLModel() {
		this.resolver = new JAXBContentResolver<>();
	}

	public GeneratorXMLModel(File generatorFile) {
		this();
		this.generatorFile = generatorFile;
		this.rootNode = loadRoot();
	}

	@Override
	public void setFinalFile(File generatorFile) {
		this.generatorFile = generatorFile;
	}

	public void setRootNode(GeneratorRootElement rootNode) {
		this.rootNode = rootNode;
	}

	private GeneratorRootElement loadRoot() {
		if (generatorFile != null && generatorFile.exists()) {
			try {
				return resolver.loadRoot(generatorFile, GeneratorRootElement.class);
			} catch (JAXBException e) {
				ModelBasedDataGeneratorPlugin.logError(NLS.bind("Error loading xml file", generatorFile.getPath()),
						ModelBasedDataGeneratorPlugin.getDefault(), e);
			}
		}
		return new GeneratorRootElement();
	}

	@Override
	public void save() {
		if (generatorFile != null && rootNode != null) {
			try {
				resolver.saveRoot(rootNode, generatorFile, GeneratorRootElement.class);
			} catch (JAXBException e) {
				ModelBasedDataGeneratorPlugin.logError(NLS.bind("Error saving xml file", generatorFile.getPath()),
						ModelBasedDataGeneratorPlugin.getDefault(), e);
			}
		}
	}
}
