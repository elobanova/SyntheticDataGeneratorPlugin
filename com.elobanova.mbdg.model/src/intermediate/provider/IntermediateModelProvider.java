package intermediate.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import intermediate.EntitiesContainer;
import intermediate.GeneratorAttributeElement;
import intermediate.GeneratorEntityElement;
import intermediate.GeneratorReference;
import intermediate.IdNode;
import intermediate.ModelRoot;
import intermediate.impl.IntermediateFactoryImpl;

public class IntermediateModelProvider {
	private List<EPackage> packages;
	private EntitiesContainer entitiesContainer;

	public IntermediateModelProvider(List<EPackage> packages) {
		this.packages = new ArrayList<>(packages);
		this.entitiesContainer = IntermediateFactoryImpl.eINSTANCE.createEntitiesContainer();
	}

	public ModelRoot createIntermediateModel() {
		if (packages != null) {
			packages.stream().forEach(packageItem -> createIntermediateNodes(packageItem));
		}

		ModelRoot modelRoot = IntermediateFactoryImpl.eINSTANCE.createModelRoot();
		modelRoot.setEntitiesContainer(entitiesContainer);
		return modelRoot;
	}

	private void createIntermediateNodes(EPackage packageItem) {
		List<EClassifier> domainClassifiers = packageItem.getEClassifiers();
		domainClassifiers.stream().forEach(classifier -> entitiesContainer.getEntities().add(createIntermediateEntity(classifier)));
		domainClassifiers.stream().forEach(classifier -> resolveReferences(classifier));
	}

	private GeneratorEntityElement createIntermediateEntity(EClassifier classifier) {
		GeneratorEntityElement entityElement = IntermediateFactoryImpl.eINSTANCE.createGeneratorEntityElement();
		if (classifier instanceof EClass) {
			EClass definedClass = (EClass) classifier;
			entityElement.setType(definedClass.getName());
			EAttribute idAttribute = definedClass.getEIDAttribute();
			if (idAttribute != null) {
				IdNode idNode = IntermediateFactoryImpl.eINSTANCE.createIdNode();
				idNode.setName(idAttribute.getName());
				idNode.setType(idAttribute.getEType().getInstanceClassName());
				entityElement.setIdNode(idNode);
			}

			definedClass.getEAttributes().stream().forEach(attribute -> createGeneratedEntityAttribute(attribute, entityElement));
		}
		return entityElement;
	}

	private void resolveReferences(EClassifier classifier) {
		if (classifier instanceof EClass) {
			EClass definedClass = (EClass) classifier;
			GeneratorEntityElement entityElement = entitiesContainer.getEntityByName(definedClass.getName());
			definedClass.getEReferences().stream().forEach(reference -> entityElement.getReference().add(createGeneratorReference(reference)));
		}
	}

	private GeneratorReference createGeneratorReference(EReference reference) {
		GeneratorReference generatorReference = IntermediateFactoryImpl.eINSTANCE.createGeneratorReference();
		generatorReference.setGeneratorEntityElement(entitiesContainer.getEntityByName(reference.getEType().getName()));
		generatorReference.setSize(reference.getUpperBound());
		return generatorReference;
	}

	private void createGeneratedEntityAttribute(EAttribute attribute, GeneratorEntityElement entityElement) {
		if (!attribute.isID()) {
			GeneratorAttributeElement genAttribute = IntermediateFactoryImpl.eINSTANCE.createGeneratorAttributeElement();
			genAttribute.setName(attribute.getName());
			genAttribute.setType(attribute.getEType().getInstanceClassName());
			entityElement.getAttribute().add(genAttribute);
		}
	}
}