/**
 */
package intermediate.impl;

import intermediate.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateFactoryImpl extends EFactoryImpl implements IntermediateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermediateFactory init() {
		try {
			IntermediateFactory theIntermediateFactory = (IntermediateFactory)EPackage.Registry.INSTANCE.getEFactory(IntermediatePackage.eNS_URI);
			if (theIntermediateFactory != null) {
				return theIntermediateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntermediateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT: return createGeneratorAttributeElement();
			case IntermediatePackage.GENERATOR_TYPED_ELEMENT: return createGeneratorTypedElement();
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT: return createGeneratorEntityElement();
			case IntermediatePackage.ENTITIES_CONTAINER: return createEntitiesContainer();
			case IntermediatePackage.MODEL_ROOT: return createModelRoot();
			case IntermediatePackage.TEMPLATE_ATTRIBUTES_CONTAINER: return createTemplateAttributesContainer();
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT: return createTemplateAttributeElement();
			case IntermediatePackage.ID_NODE: return createIdNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorAttributeElement createGeneratorAttributeElement() {
		GeneratorAttributeElementImpl generatorAttributeElement = new GeneratorAttributeElementImpl();
		return generatorAttributeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorTypedElement createGeneratorTypedElement() {
		GeneratorTypedElementImpl generatorTypedElement = new GeneratorTypedElementImpl();
		return generatorTypedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorEntityElement createGeneratorEntityElement() {
		GeneratorEntityElementImpl generatorEntityElement = new GeneratorEntityElementImpl();
		return generatorEntityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitiesContainer createEntitiesContainer() {
		EntitiesContainerImpl entitiesContainer = new EntitiesContainerImpl();
		return entitiesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRoot createModelRoot() {
		ModelRootImpl modelRoot = new ModelRootImpl();
		return modelRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateAttributesContainer createTemplateAttributesContainer() {
		TemplateAttributesContainerImpl templateAttributesContainer = new TemplateAttributesContainerImpl();
		return templateAttributesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateAttributeElement createTemplateAttributeElement() {
		TemplateAttributeElementImpl templateAttributeElement = new TemplateAttributeElementImpl();
		return templateAttributeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdNode createIdNode() {
		IdNodeImpl idNode = new IdNodeImpl();
		return idNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediatePackage getIntermediatePackage() {
		return (IntermediatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntermediatePackage getPackage() {
		return IntermediatePackage.eINSTANCE;
	}

} //IntermediateFactoryImpl
