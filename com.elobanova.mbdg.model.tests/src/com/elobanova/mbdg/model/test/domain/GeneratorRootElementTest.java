package com.elobanova.mbdg.model.test.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
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

	@Test
	public void testSearchGeneratedTypeNode() {
		GeneratedTypeNode info = constructCustomerAccountInfo();

		GeneratedTypeNode infoFound = this.rootNode.searchGeneratedTypeNode(info.getType());
		assertEquals(info, infoFound);
	}

	@Test
	public void testSearchGeneratedTypeNodeIfNotFound() {
		constructCustomerAccountInfo();

		GeneratedTypeNode bankFound = this.rootNode.searchGeneratedTypeNode("Bank");
		assertNull(bankFound);
	}

	@Test
	public void testSearchGeneratedTypeEmptyCollection() {
		GeneratedTypeNode accountFound = this.rootNode.searchGeneratedTypeNode("Account");
		assertNull(accountFound);
	}

	@Test
	public void testSearchGeneratedTypeNoNestity() {
		GeneratedTypeNode person = new GeneratedTypeNode();
		person.setType("Person");

		GeneratedTypeNode eclipse = new GeneratedTypeNode();
		eclipse.setType("Eclipse");

		this.rootNode.addGeneratedType(person);
		this.rootNode.addGeneratedType(eclipse);

		GeneratedTypeNode eclipseFound = this.rootNode.searchGeneratedTypeNode(eclipse.getType());
		assertEquals(eclipse, eclipseFound);
	}

	private GeneratedTypeNode constructCustomerAccountInfo() {
		GeneratedTypeNode customer = new GeneratedTypeNode();
		customer.setType("Customer");

		GeneratedTypeNode account = new GeneratedTypeNode();
		account.setType("Account");

		GeneratedTypeNode info = new GeneratedTypeNode();
		info.setType("Info");

		account.getNestedGeneratedTypes().add(info);
		customer.getNestedGeneratedTypes().add(account);

		this.rootNode.addGeneratedType(customer);
		return info;
	}
}
