package com.elobanova.mbdg.model.test.domain;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.elobanova.mbdg.model.domain.FieldNode;
import com.elobanova.mbdg.model.domain.GeneratedTypeNode;
import com.elobanova.mbdg.model.domain.GeneratorRootElement;
import com.elobanova.mbdg.model.domain.GeneratorXMLModel;
import com.elobanova.mbdg.model.test.util.ResourceHandler;
import com.elobanova.mbdg.model.test.util.XMLEqualizer;

public class GeneratorXMLModelTest {

	@Test
	public void testSaveFinalModel() throws JAXBException, ParserConfigurationException, SAXException, IOException, URISyntaxException {
		File expectedFile = new File(ResourceHandler.getResolvedUri("resources/generate.xml"));
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		File actualFile = root.getRawLocation().append("finalmodel").addFileExtension(GeneratorXMLModel.FILE_EXTENSION).toFile();

		GeneratorRootElement rootNode = createRootNode();
		GeneratorXMLModel generatorModel = new GeneratorXMLModel(actualFile);
		generatorModel.setRootNode(rootNode);
		generatorModel.save();

		assertTrue(XMLEqualizer.equals(expectedFile, actualFile));
	}

	private GeneratorRootElement createRootNode() {
		GeneratorRootElement rootNode = new GeneratorRootElement();
		FieldNode fieldNode = new FieldNode();
		fieldNode.setName("balance");
		fieldNode.setType("double");

		GeneratedTypeNode generateNode = new GeneratedTypeNode();
		generateNode.setType("Account");
		generateNode.setCount(10000);
		generateNode.addAttribute(fieldNode);
		rootNode.addGeneratedType(generateNode);
		return rootNode;
	}
}
