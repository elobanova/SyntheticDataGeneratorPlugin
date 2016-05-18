package com.elobanova.mbdg.model.test.xml;

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

import com.elobanova.mbdg.model.setup.DomainModelNode;
import com.elobanova.mbdg.model.setup.SetupModel;
import com.elobanova.mbdg.model.setup.SetupRootNode;
import com.elobanova.mbdg.model.test.util.ResourceHandler;
import com.elobanova.mbdg.model.test.util.XMLEqualizer;
import com.elobanova.mbdg.model.xml.JAXBContentResolver;

public class JAXBContentResolverTest {

	@Test
	public void testSaveSetup() throws JAXBException, ParserConfigurationException, SAXException, IOException, URISyntaxException {
		File expectedFile = new File(ResourceHandler.getResolvedUri("resources/test.gensetup"));

		SetupRootNode rootNode = new SetupRootNode();
		DomainModelNode domainModelNode = new DomainModelNode();
		domainModelNode.setNsUri("http://org/eclipse/example/bank");
		rootNode.setDomainModel(domainModelNode);

		JAXBContentResolver<SetupRootNode> resolver = new JAXBContentResolver<>();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		File actualFile = root.getRawLocation().append("intermediate").addFileExtension(SetupModel.FILE_EXTENSION).toFile();
		resolver.saveRoot(rootNode, actualFile, SetupRootNode.class);

		assertTrue(XMLEqualizer.equals(expectedFile, actualFile));
	}
}
