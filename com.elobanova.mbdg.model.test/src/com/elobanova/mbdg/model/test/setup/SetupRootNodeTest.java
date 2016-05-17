package com.elobanova.mbdg.model.test.setup;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.elobanova.mbdg.model.setup.DomainModelNode;
import com.elobanova.mbdg.model.setup.SetupRootNode;

public class SetupRootNodeTest {

	@Test
	public void testGetDomainModelNode() {
		SetupRootNode rootNode = new SetupRootNode();
		DomainModelNode domainModelNode = new DomainModelNode();
		rootNode.setDomainModel(domainModelNode);
		assertNotNull(rootNode.getDomainModelNode());
	}
}
