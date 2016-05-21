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
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.elobanova.mbdg.model.setup.DomainModelNode;
import com.elobanova.mbdg.model.setup.SetupModel;
import com.elobanova.mbdg.model.setup.SetupRootNode;
import com.elobanova.mbdg.model.test.util.ResourceHandler;
import com.elobanova.mbdg.model.test.util.XMLEqualizer;
import com.elobanova.mbdg.model.xml.JAXBContentResolver;
import com.elobanova.mbdg.model.xml.RootProperty.PropertyBuilder;

public class JAXBContentResolverTest {
	private SetupRootNode rootNode;
	private DomainModelNode domainModelNode;
	private IWorkspaceRoot root;
	private JAXBContentResolver<SetupRootNode> resolver;

	@Before
	public void setUp() {
		this.rootNode = new SetupRootNode();
		this.domainModelNode = new DomainModelNode();
		this.domainModelNode.setNsUri("http://org/eclipse/example/bank");
		this.rootNode.setDomainModel(this.domainModelNode);
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		this.root = workspace.getRoot();
		this.resolver = new JAXBContentResolver<>();
	}

	@Test
	public void testSaveSetup() throws JAXBException, ParserConfigurationException, SAXException, IOException, URISyntaxException {
		File expectedFile = new File(ResourceHandler.getResolvedUri("resources/test.gensetup"));
		File actualFile = root.getRawLocation().append("intermediate").addFileExtension(SetupModel.FILE_EXTENSION).toFile();
		this.resolver.saveRoot(this.rootNode, actualFile, SetupRootNode.class);

		assertTrue(XMLEqualizer.equals(expectedFile, actualFile));
	}

	@Test
	public void testSaveWithParameters() throws IOException, URISyntaxException, JAXBException, SAXException, ParserConfigurationException {
		File expectedFile = new File(ResourceHandler.getResolvedUri("resources/parameters.gensetup"));
		File actualFile = root.getRawLocation().append("actparam").addFileExtension(SetupModel.FILE_EXTENSION).toFile();
		PropertyBuilder rootPropertyBuilder = new PropertyBuilder();
		this.resolver.saveWithParameters(this.rootNode, actualFile, SetupRootNode.class,
				rootPropertyBuilder.setEncoding("Cp1251").setSchemaLocation("http://lobanova/setup.xsd").build());

		assertTrue(XMLEqualizer.equals(expectedFile, actualFile));
	}
}
