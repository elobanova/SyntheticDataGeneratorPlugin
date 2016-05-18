package com.elobanova.mbdg.model.test.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.elobanova.mbdg.model.domain.GeneratedTypeNode;
import com.elobanova.mbdg.model.domain.GeneratorRootElement;

public class GeneratorRootElementTest {
	private GeneratorRootElement rootNode;

	@Before
	public void setUp() {
		rootNode = new GeneratorRootElement();
	}

	@Test
	public void testGetComment() {
		rootNode.setComment("Populates a testing database with accounts");
		String rootNodeComment = rootNode.getComment();
		assertEquals("Populates a testing database with accounts", rootNodeComment);
	}

	@Test
	public void testAddGenerateEntity() {
		GeneratedTypeNode generateNode = new GeneratedTypeNode();
		generateNode.setType("account");
		assertEquals(0, rootNode.getGeneratedTypes().size());

		assertTrue(rootNode.addGeneratedType(generateNode));
		assertTrue(rootNode.getGeneratedTypes().contains(generateNode));
	}

	@Test
	public void testAddAlreadyExistingGenerateEntity() {
		GeneratedTypeNode generateNode = new GeneratedTypeNode();
		generateNode.setType("account");
		assertEquals(0, rootNode.getGeneratedTypes().size());

		assertTrue(rootNode.addGeneratedType(generateNode));
		assertTrue(rootNode.getGeneratedTypes().contains(generateNode));

		assertFalse(rootNode.addGeneratedType(generateNode));
	}

	@Test
	public void testFailIfGenerateEntityTypeIsNull() {
		GeneratedTypeNode generateNode = new GeneratedTypeNode();
		assertFalse(rootNode.addGeneratedType(generateNode));
	}
}
