package com.elobanova.mbdg.model.setup;

import java.io.File;

import javax.xml.bind.JAXBException;

import org.eclipse.osgi.util.NLS;

import com.elobanova.mbdg.model.ModelBasedDataGeneratorPlugin;
import com.elobanova.mbdg.model.xml.JAXBContentResolver;

public class SetupModel {
	public static final String FILE_EXTENSION = "gensetup";
	private SetupRootNode rootNode;
	private File setupFile;
	private JAXBContentResolver<SetupRootNode> resolver;

	public SetupModel(File setupFile) {
		this.resolver = new JAXBContentResolver<>();
		this.rootNode = loadSetup();
		this.setupFile = setupFile;
	}

	private SetupRootNode loadSetup() {
		if (setupFile != null && setupFile.exists()) {
			try {
				return resolver.loadSetup(setupFile, SetupRootNode.class);
			} catch (JAXBException e) {
				ModelBasedDataGeneratorPlugin.logError(NLS.bind("Error loading setup file", setupFile.getPath()),
						ModelBasedDataGeneratorPlugin.getDefault(), e);
			}
		}
		return new SetupRootNode();
	}

	public void save() {
		if (setupFile != null) {
			try {
				resolver.saveSetup(rootNode, setupFile, SetupRootNode.class);
			} catch (JAXBException e) {
				ModelBasedDataGeneratorPlugin.logError(NLS.bind("Error saving setup file", setupFile.getPath()),
						ModelBasedDataGeneratorPlugin.getDefault(), e);
			}
		}
	}

	public void setDomainModel(DomainModelNode domainModelNode) {
		this.rootNode.setDomainModel(domainModelNode);
	}

	public DomainModelNode getDomainModelNode() {
		return rootNode.getDomainModelNode();
	}

}
