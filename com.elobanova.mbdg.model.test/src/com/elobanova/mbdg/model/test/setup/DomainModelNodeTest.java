package com.elobanova.mbdg.model.test.setup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.elobanova.mbdg.model.setup.DomainModelNode;

public class DomainModelNodeTest {

	@Test
	public void testGetNsUri() {
		DomainModelNode domainModelNode = new DomainModelNode();
		domainModelNode.setNsUri("http://org/eclipse/example/bank");
		String nsUri = domainModelNode.getNsUri();
		assertEquals("http://org/eclipse/example/bank", nsUri);
	}
}
