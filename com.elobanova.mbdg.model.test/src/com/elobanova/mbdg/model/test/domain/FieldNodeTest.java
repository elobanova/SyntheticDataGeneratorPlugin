package com.elobanova.mbdg.model.test.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.elobanova.mbdg.model.domain.FieldNode;

public class FieldNodeTest {
	private FieldNode fieldNode;

	@Before
	public void setUp() {
		fieldNode = new FieldNode();
	}

	@Test
	public void testGetName() {
		fieldNode.setName("balance");
		String nameOfField = fieldNode.getName();
		assertEquals("balance", nameOfField);
	}

	@Test
	public void testGetEmptyName() {
		String nameOfField = fieldNode.getName();
		assertNull(nameOfField);
	}

	@Test
	public void testGetPattern() {
		fieldNode.setPattern("^\\$(\\d{1,3}(\\,\\d{3})*|(\\d+))(\\.\\d{2})?$");
		String pattern = fieldNode.getPattern();
		assertEquals("^\\$(\\d{1,3}(\\,\\d{3})*|(\\d+))(\\.\\d{2})?$", pattern);
	}

	@Test
	public void testGetType() {
		fieldNode.setType("double");
		String typeOfField = fieldNode.getType();
		assertEquals("double", typeOfField);
	}

	@Test
	public void testGetDistribution() {
		fieldNode.setDistribution("com.my.ReciprocalWeight");
		String distibution = fieldNode.getDistribution();
		assertEquals("com.my.ReciprocalWeight", distibution);
	}

	@Test
	public void testGetGenerator() {
		fieldNode.setGenerator("new com.my.NumberGenerator(99)");
		String generator = fieldNode.getGenerator();
		assertEquals("new com.my.NumberGenerator(99)", generator);
	}

	@Test
	public void testGetValidator() {
		fieldNode.setValidator("com.my.CreditCardValidator");
		String validator = fieldNode.getValidator();
		assertEquals("com.my.CreditCardValidator", validator);
	}

	@Test
	public void testGetConverter() {
		fieldNode.setConverter("new com.my.NumberConverter('00')");
		String converter = fieldNode.getConverter();
		assertEquals("new com.my.NumberConverter('00')", converter);
	}

	@Test
	public void testGetSource() {
		fieldNode.setSource("com.my.PersonSource");
		String source = fieldNode.getSource();
		assertEquals("com.my.PersonSource", source);
	}

	@Test
	public void testGetMin() {
		fieldNode.setMin("1");
		String min = fieldNode.getMin();
		assertEquals("1", min);
	}

	@Test
	public void testGetMax() {
		fieldNode.setMax("99");
		String max = fieldNode.getMax();
		assertEquals("99", max);
	}
}
