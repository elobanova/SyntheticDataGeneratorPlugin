package com.elobanova.mbdg.model.test.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.elobanova.mbdg.model.domain.TypedNode;

public class TypedNodeTest {
	private TypedNode typedNode;

	@Before
	public void setUp() {
		typedNode = new TypedNode();
	}

	@Test
	public void testGetName() {
		typedNode.setName("id");
		String nameOfNode = typedNode.getName();
		assertEquals("id", nameOfNode);
	}

	@Test
	public void testGetEmptyName() {
		String nameOfNode = typedNode.getName();
		assertNull(nameOfNode);
	}

	@Test
	public void testGetType() {
		typedNode.setType("long");
		String typeOfNode = typedNode.getType();
		assertEquals("long", typeOfNode);
	}
}
