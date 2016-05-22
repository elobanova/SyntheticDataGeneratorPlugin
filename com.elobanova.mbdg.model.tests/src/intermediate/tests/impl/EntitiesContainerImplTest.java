package intermediate.tests.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import intermediate.EntitiesContainer;
import intermediate.GeneratorEntityElement;
import intermediate.impl.IntermediateFactoryImpl;

public class EntitiesContainerImplTest {
	private EntitiesContainer entitiesContainer;

	@Before
	public void setUp() {
		entitiesContainer = IntermediateFactoryImpl.eINSTANCE.createEntitiesContainer();
	}

	@Test
	public void testGetEntityByName() {
		GeneratorEntityElement entityElement = IntermediateFactoryImpl.eINSTANCE.createGeneratorEntityElement();
		entityElement.setType("Account");
		entitiesContainer.getEntities().add(entityElement);
		GeneratorEntityElement retrievedEntityElement = entitiesContainer.getEntityByName("Account");
		assertEquals(entityElement, retrievedEntityElement);
	}

	@Test
	public void testGetEntityByNameIfNotInContainer() {
		GeneratorEntityElement entityElement = IntermediateFactoryImpl.eINSTANCE.createGeneratorEntityElement();
		entityElement.setType("Account");
		entitiesContainer.getEntities().add(entityElement);
		GeneratorEntityElement retrievedEntityElement = entitiesContainer.getEntityByName("Customer");
		assertNull(retrievedEntityElement);
	}

	@Test
	public void testGetEntityByNameContainerIsEmpty() {
		GeneratorEntityElement retrievedEntityElement = entitiesContainer.getEntityByName("Customer");
		assertNull(retrievedEntityElement);
	}
}
