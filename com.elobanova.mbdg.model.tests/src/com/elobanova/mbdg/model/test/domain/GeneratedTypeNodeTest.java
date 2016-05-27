package com.elobanova.mbdg.model.test.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.elobanova.mbdg.model.domain.FieldNode;
import com.elobanova.mbdg.model.domain.GeneratedTypeNode;
import com.elobanova.mbdg.model.domain.TypedNode;

public class GeneratedTypeNodeTest {
	private GeneratedTypeNode entityNode;

	@Before
	public void setUp() {
		entityNode = new GeneratedTypeNode();
	}

	@Test
	public void testGetCount() {
		entityNode.setCount(10000);
		int entitiesCount = entityNode.getCount();
		assertEquals(10000, entitiesCount);
	}

	@Test
	public void testGetType() {
		entityNode.setType("Account");
		String entityType = entityNode.getType();
		assertEquals("Account", entityType);
	}

	@Test
	public void testGetConsumer() {
		entityNode.setConsumer("com.my.ConsoleConsumer");
		String entitiesConsumer = entityNode.getConsumer();
		assertEquals("com.my.ConsoleConsumer", entitiesConsumer);
	}

	@Test
	public void testAddAttribute() {
		FieldNode fieldNode = new FieldNode();
		fieldNode.setName("balance");
		assertEquals(0, entityNode.getAttributes().size());

		assertTrue(entityNode.addAttribute(fieldNode));
		assertTrue(entityNode.getAttributes().contains(fieldNode));
	}

	@Test
	public void testAddAlreadyExistingAttribute() {
		FieldNode fieldNode = new FieldNode();
		fieldNode.setName("balance");
		assertEquals(0, entityNode.getAttributes().size());

		assertTrue(entityNode.addAttribute(fieldNode));
		assertTrue(entityNode.getAttributes().contains(fieldNode));

		assertFalse(entityNode.addAttribute(fieldNode));
	}

	@Test
	public void testFailIfAddedAttributeNameIsNull() {
		FieldNode fieldNode = new FieldNode();
		assertFalse(entityNode.addAttribute(fieldNode));
	}

	@Test
	public void testGetIdNode() {
		FieldNode idNode = new FieldNode();
		idNode.setName("accountId");
		entityNode.setIdNode(idNode);
		TypedNode entitiesId = entityNode.getIdNode();
		assertEquals(idNode, entitiesId);
	}
}
