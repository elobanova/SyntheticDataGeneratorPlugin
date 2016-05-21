/**
 */
package intermediate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see intermediate.IntermediateFactory
 * @model kind="package"
 * @generated
 */
public interface IntermediatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "intermediate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com/elobanova/mbdg/intermediate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.elobanova.mbdg.intermediate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediatePackage eINSTANCE = intermediate.impl.IntermediatePackageImpl.init();

	/**
	 * The meta object id for the '{@link intermediate.IAttributeElement <em>IAttribute Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediate.IAttributeElement
	 * @see intermediate.impl.IntermediatePackageImpl#getIAttributeElement()
	 * @generated
	 */
	int IATTRIBUTE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_ELEMENT__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_ELEMENT__MIN = 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_ELEMENT__MAX = 2;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_ELEMENT__GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_ELEMENT__VALIDATOR = 4;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_ELEMENT__CONVERTER = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_ELEMENT__SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_ELEMENT__DISTRIBUTION = 7;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_ELEMENT__FILTER = 8;

	/**
	 * The number of structural features of the '<em>IAttribute Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_ELEMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>IAttribute Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediate.impl.GeneratorAttributeElementImpl <em>Generator Attribute Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediate.impl.GeneratorAttributeElementImpl
	 * @see intermediate.impl.IntermediatePackageImpl#getGeneratorAttributeElement()
	 * @generated
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT__PATTERN = IATTRIBUTE_ELEMENT__PATTERN;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT__MIN = IATTRIBUTE_ELEMENT__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT__MAX = IATTRIBUTE_ELEMENT__MAX;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT__GENERATOR = IATTRIBUTE_ELEMENT__GENERATOR;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT__VALIDATOR = IATTRIBUTE_ELEMENT__VALIDATOR;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT__CONVERTER = IATTRIBUTE_ELEMENT__CONVERTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT__SOURCE = IATTRIBUTE_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT__DISTRIBUTION = IATTRIBUTE_ELEMENT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT__FILTER = IATTRIBUTE_ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT__NAME = IATTRIBUTE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT__TYPE = IATTRIBUTE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT__USE_TEMPLATE = IATTRIBUTE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generator Attribute Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT_FEATURE_COUNT = IATTRIBUTE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Generator Attribute Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ATTRIBUTE_ELEMENT_OPERATION_COUNT = IATTRIBUTE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediate.impl.GeneratorTypedElementImpl <em>Generator Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediate.impl.GeneratorTypedElementImpl
	 * @see intermediate.impl.IntermediatePackageImpl#getGeneratorTypedElement()
	 * @generated
	 */
	int GENERATOR_TYPED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPED_ELEMENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Generator Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generator Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TYPED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediate.impl.GeneratorEntityElementImpl <em>Generator Entity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediate.impl.GeneratorEntityElementImpl
	 * @see intermediate.impl.IntermediatePackageImpl#getGeneratorEntityElement()
	 * @generated
	 */
	int GENERATOR_ENTITY_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ENTITY_ELEMENT__COUNT = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ENTITY_ELEMENT__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ENTITY_ELEMENT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ENTITY_ELEMENT__ID_NODE = 3;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ENTITY_ELEMENT__CONSUMER = 4;

	/**
	 * The number of structural features of the '<em>Generator Entity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ENTITY_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Generator Entity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ENTITY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediate.impl.EntitiesContainerImpl <em>Entities Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediate.impl.EntitiesContainerImpl
	 * @see intermediate.impl.IntermediatePackageImpl#getEntitiesContainer()
	 * @generated
	 */
	int ENTITIES_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITIES_CONTAINER__ENTITIES = 0;

	/**
	 * The number of structural features of the '<em>Entities Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITIES_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entities Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITIES_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediate.impl.ModelRootImpl <em>Model Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediate.impl.ModelRootImpl
	 * @see intermediate.impl.IntermediatePackageImpl#getModelRoot()
	 * @generated
	 */
	int MODEL_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Entities Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__ENTITIES_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Template Attributes Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__TEMPLATE_ATTRIBUTES_CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediate.impl.TemplateAttributesContainerImpl <em>Template Attributes Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediate.impl.TemplateAttributesContainerImpl
	 * @see intermediate.impl.IntermediatePackageImpl#getTemplateAttributesContainer()
	 * @generated
	 */
	int TEMPLATE_ATTRIBUTES_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Template Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTES_CONTAINER__TEMPLATE_ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Template Attributes Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTES_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Template Attributes Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTES_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediate.impl.TemplateAttributeElementImpl <em>Template Attribute Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediate.impl.TemplateAttributeElementImpl
	 * @see intermediate.impl.IntermediatePackageImpl#getTemplateAttributeElement()
	 * @generated
	 */
	int TEMPLATE_ATTRIBUTE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTE_ELEMENT__PATTERN = IATTRIBUTE_ELEMENT__PATTERN;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTE_ELEMENT__MIN = IATTRIBUTE_ELEMENT__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTE_ELEMENT__MAX = IATTRIBUTE_ELEMENT__MAX;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTE_ELEMENT__GENERATOR = IATTRIBUTE_ELEMENT__GENERATOR;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTE_ELEMENT__VALIDATOR = IATTRIBUTE_ELEMENT__VALIDATOR;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTE_ELEMENT__CONVERTER = IATTRIBUTE_ELEMENT__CONVERTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTE_ELEMENT__SOURCE = IATTRIBUTE_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTE_ELEMENT__DISTRIBUTION = IATTRIBUTE_ELEMENT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTE_ELEMENT__FILTER = IATTRIBUTE_ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTE_ELEMENT__TEMPLATE_NAME = IATTRIBUTE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Attribute Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTE_ELEMENT_FEATURE_COUNT = IATTRIBUTE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Attribute Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATTRIBUTE_ELEMENT_OPERATION_COUNT = IATTRIBUTE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediate.impl.IdNodeImpl <em>Id Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediate.impl.IdNodeImpl
	 * @see intermediate.impl.IntermediatePackageImpl#getIdNode()
	 * @generated
	 */
	int ID_NODE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NODE__NAME = GENERATOR_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NODE__TYPE = GENERATOR_TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Id Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NODE_FEATURE_COUNT = GENERATOR_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Id Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NODE_OPERATION_COUNT = GENERATOR_TYPED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link intermediate.GeneratorAttributeElement <em>Generator Attribute Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Attribute Element</em>'.
	 * @see intermediate.GeneratorAttributeElement
	 * @generated
	 */
	EClass getGeneratorAttributeElement();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.GeneratorAttributeElement#getUseTemplate <em>Use Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Template</em>'.
	 * @see intermediate.GeneratorAttributeElement#getUseTemplate()
	 * @see #getGeneratorAttributeElement()
	 * @generated
	 */
	EAttribute getGeneratorAttributeElement_UseTemplate();

	/**
	 * Returns the meta object for class '{@link intermediate.GeneratorTypedElement <em>Generator Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Typed Element</em>'.
	 * @see intermediate.GeneratorTypedElement
	 * @generated
	 */
	EClass getGeneratorTypedElement();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.GeneratorTypedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermediate.GeneratorTypedElement#getName()
	 * @see #getGeneratorTypedElement()
	 * @generated
	 */
	EAttribute getGeneratorTypedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.GeneratorTypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see intermediate.GeneratorTypedElement#getType()
	 * @see #getGeneratorTypedElement()
	 * @generated
	 */
	EAttribute getGeneratorTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link intermediate.GeneratorEntityElement <em>Generator Entity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Entity Element</em>'.
	 * @see intermediate.GeneratorEntityElement
	 * @generated
	 */
	EClass getGeneratorEntityElement();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.GeneratorEntityElement#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see intermediate.GeneratorEntityElement#getCount()
	 * @see #getGeneratorEntityElement()
	 * @generated
	 */
	EAttribute getGeneratorEntityElement_Count();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediate.GeneratorEntityElement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see intermediate.GeneratorEntityElement#getAttribute()
	 * @see #getGeneratorEntityElement()
	 * @generated
	 */
	EReference getGeneratorEntityElement_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.GeneratorEntityElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see intermediate.GeneratorEntityElement#getType()
	 * @see #getGeneratorEntityElement()
	 * @generated
	 */
	EAttribute getGeneratorEntityElement_Type();

	/**
	 * Returns the meta object for the containment reference '{@link intermediate.GeneratorEntityElement#getIdNode <em>Id Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Node</em>'.
	 * @see intermediate.GeneratorEntityElement#getIdNode()
	 * @see #getGeneratorEntityElement()
	 * @generated
	 */
	EReference getGeneratorEntityElement_IdNode();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.GeneratorEntityElement#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer</em>'.
	 * @see intermediate.GeneratorEntityElement#getConsumer()
	 * @see #getGeneratorEntityElement()
	 * @generated
	 */
	EAttribute getGeneratorEntityElement_Consumer();

	/**
	 * Returns the meta object for class '{@link intermediate.EntitiesContainer <em>Entities Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entities Container</em>'.
	 * @see intermediate.EntitiesContainer
	 * @generated
	 */
	EClass getEntitiesContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediate.EntitiesContainer#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see intermediate.EntitiesContainer#getEntities()
	 * @see #getEntitiesContainer()
	 * @generated
	 */
	EReference getEntitiesContainer_Entities();

	/**
	 * Returns the meta object for class '{@link intermediate.ModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Root</em>'.
	 * @see intermediate.ModelRoot
	 * @generated
	 */
	EClass getModelRoot();

	/**
	 * Returns the meta object for the containment reference '{@link intermediate.ModelRoot#getEntitiesContainer <em>Entities Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entities Container</em>'.
	 * @see intermediate.ModelRoot#getEntitiesContainer()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_EntitiesContainer();

	/**
	 * Returns the meta object for the containment reference '{@link intermediate.ModelRoot#getTemplateAttributesContainer <em>Template Attributes Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Attributes Container</em>'.
	 * @see intermediate.ModelRoot#getTemplateAttributesContainer()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_TemplateAttributesContainer();

	/**
	 * Returns the meta object for class '{@link intermediate.TemplateAttributesContainer <em>Template Attributes Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Attributes Container</em>'.
	 * @see intermediate.TemplateAttributesContainer
	 * @generated
	 */
	EClass getTemplateAttributesContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediate.TemplateAttributesContainer#getTemplateAttribute <em>Template Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Attribute</em>'.
	 * @see intermediate.TemplateAttributesContainer#getTemplateAttribute()
	 * @see #getTemplateAttributesContainer()
	 * @generated
	 */
	EReference getTemplateAttributesContainer_TemplateAttribute();

	/**
	 * Returns the meta object for class '{@link intermediate.IAttributeElement <em>IAttribute Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAttribute Element</em>'.
	 * @see intermediate.IAttributeElement
	 * @generated
	 */
	EClass getIAttributeElement();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.IAttributeElement#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see intermediate.IAttributeElement#getPattern()
	 * @see #getIAttributeElement()
	 * @generated
	 */
	EAttribute getIAttributeElement_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.IAttributeElement#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see intermediate.IAttributeElement#getMin()
	 * @see #getIAttributeElement()
	 * @generated
	 */
	EAttribute getIAttributeElement_Min();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.IAttributeElement#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see intermediate.IAttributeElement#getMax()
	 * @see #getIAttributeElement()
	 * @generated
	 */
	EAttribute getIAttributeElement_Max();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.IAttributeElement#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see intermediate.IAttributeElement#getGenerator()
	 * @see #getIAttributeElement()
	 * @generated
	 */
	EAttribute getIAttributeElement_Generator();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.IAttributeElement#getValidator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validator</em>'.
	 * @see intermediate.IAttributeElement#getValidator()
	 * @see #getIAttributeElement()
	 * @generated
	 */
	EAttribute getIAttributeElement_Validator();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.IAttributeElement#getConverter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converter</em>'.
	 * @see intermediate.IAttributeElement#getConverter()
	 * @see #getIAttributeElement()
	 * @generated
	 */
	EAttribute getIAttributeElement_Converter();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.IAttributeElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see intermediate.IAttributeElement#getSource()
	 * @see #getIAttributeElement()
	 * @generated
	 */
	EAttribute getIAttributeElement_Source();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.IAttributeElement#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution</em>'.
	 * @see intermediate.IAttributeElement#getDistribution()
	 * @see #getIAttributeElement()
	 * @generated
	 */
	EAttribute getIAttributeElement_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.IAttributeElement#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see intermediate.IAttributeElement#getFilter()
	 * @see #getIAttributeElement()
	 * @generated
	 */
	EAttribute getIAttributeElement_Filter();

	/**
	 * Returns the meta object for class '{@link intermediate.TemplateAttributeElement <em>Template Attribute Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Attribute Element</em>'.
	 * @see intermediate.TemplateAttributeElement
	 * @generated
	 */
	EClass getTemplateAttributeElement();

	/**
	 * Returns the meta object for the attribute '{@link intermediate.TemplateAttributeElement#getTemplateName <em>Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Name</em>'.
	 * @see intermediate.TemplateAttributeElement#getTemplateName()
	 * @see #getTemplateAttributeElement()
	 * @generated
	 */
	EAttribute getTemplateAttributeElement_TemplateName();

	/**
	 * Returns the meta object for class '{@link intermediate.IdNode <em>Id Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Node</em>'.
	 * @see intermediate.IdNode
	 * @generated
	 */
	EClass getIdNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntermediateFactory getIntermediateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link intermediate.impl.GeneratorAttributeElementImpl <em>Generator Attribute Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediate.impl.GeneratorAttributeElementImpl
		 * @see intermediate.impl.IntermediatePackageImpl#getGeneratorAttributeElement()
		 * @generated
		 */
		EClass GENERATOR_ATTRIBUTE_ELEMENT = eINSTANCE.getGeneratorAttributeElement();

		/**
		 * The meta object literal for the '<em><b>Use Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_ATTRIBUTE_ELEMENT__USE_TEMPLATE = eINSTANCE.getGeneratorAttributeElement_UseTemplate();

		/**
		 * The meta object literal for the '{@link intermediate.impl.GeneratorTypedElementImpl <em>Generator Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediate.impl.GeneratorTypedElementImpl
		 * @see intermediate.impl.IntermediatePackageImpl#getGeneratorTypedElement()
		 * @generated
		 */
		EClass GENERATOR_TYPED_ELEMENT = eINSTANCE.getGeneratorTypedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPED_ELEMENT__NAME = eINSTANCE.getGeneratorTypedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TYPED_ELEMENT__TYPE = eINSTANCE.getGeneratorTypedElement_Type();

		/**
		 * The meta object literal for the '{@link intermediate.impl.GeneratorEntityElementImpl <em>Generator Entity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediate.impl.GeneratorEntityElementImpl
		 * @see intermediate.impl.IntermediatePackageImpl#getGeneratorEntityElement()
		 * @generated
		 */
		EClass GENERATOR_ENTITY_ELEMENT = eINSTANCE.getGeneratorEntityElement();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_ENTITY_ELEMENT__COUNT = eINSTANCE.getGeneratorEntityElement_Count();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_ENTITY_ELEMENT__ATTRIBUTE = eINSTANCE.getGeneratorEntityElement_Attribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_ENTITY_ELEMENT__TYPE = eINSTANCE.getGeneratorEntityElement_Type();

		/**
		 * The meta object literal for the '<em><b>Id Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_ENTITY_ELEMENT__ID_NODE = eINSTANCE.getGeneratorEntityElement_IdNode();

		/**
		 * The meta object literal for the '<em><b>Consumer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_ENTITY_ELEMENT__CONSUMER = eINSTANCE.getGeneratorEntityElement_Consumer();

		/**
		 * The meta object literal for the '{@link intermediate.impl.EntitiesContainerImpl <em>Entities Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediate.impl.EntitiesContainerImpl
		 * @see intermediate.impl.IntermediatePackageImpl#getEntitiesContainer()
		 * @generated
		 */
		EClass ENTITIES_CONTAINER = eINSTANCE.getEntitiesContainer();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITIES_CONTAINER__ENTITIES = eINSTANCE.getEntitiesContainer_Entities();

		/**
		 * The meta object literal for the '{@link intermediate.impl.ModelRootImpl <em>Model Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediate.impl.ModelRootImpl
		 * @see intermediate.impl.IntermediatePackageImpl#getModelRoot()
		 * @generated
		 */
		EClass MODEL_ROOT = eINSTANCE.getModelRoot();

		/**
		 * The meta object literal for the '<em><b>Entities Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROOT__ENTITIES_CONTAINER = eINSTANCE.getModelRoot_EntitiesContainer();

		/**
		 * The meta object literal for the '<em><b>Template Attributes Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROOT__TEMPLATE_ATTRIBUTES_CONTAINER = eINSTANCE.getModelRoot_TemplateAttributesContainer();

		/**
		 * The meta object literal for the '{@link intermediate.impl.TemplateAttributesContainerImpl <em>Template Attributes Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediate.impl.TemplateAttributesContainerImpl
		 * @see intermediate.impl.IntermediatePackageImpl#getTemplateAttributesContainer()
		 * @generated
		 */
		EClass TEMPLATE_ATTRIBUTES_CONTAINER = eINSTANCE.getTemplateAttributesContainer();

		/**
		 * The meta object literal for the '<em><b>Template Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_ATTRIBUTES_CONTAINER__TEMPLATE_ATTRIBUTE = eINSTANCE.getTemplateAttributesContainer_TemplateAttribute();

		/**
		 * The meta object literal for the '{@link intermediate.IAttributeElement <em>IAttribute Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediate.IAttributeElement
		 * @see intermediate.impl.IntermediatePackageImpl#getIAttributeElement()
		 * @generated
		 */
		EClass IATTRIBUTE_ELEMENT = eINSTANCE.getIAttributeElement();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IATTRIBUTE_ELEMENT__PATTERN = eINSTANCE.getIAttributeElement_Pattern();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IATTRIBUTE_ELEMENT__MIN = eINSTANCE.getIAttributeElement_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IATTRIBUTE_ELEMENT__MAX = eINSTANCE.getIAttributeElement_Max();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IATTRIBUTE_ELEMENT__GENERATOR = eINSTANCE.getIAttributeElement_Generator();

		/**
		 * The meta object literal for the '<em><b>Validator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IATTRIBUTE_ELEMENT__VALIDATOR = eINSTANCE.getIAttributeElement_Validator();

		/**
		 * The meta object literal for the '<em><b>Converter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IATTRIBUTE_ELEMENT__CONVERTER = eINSTANCE.getIAttributeElement_Converter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IATTRIBUTE_ELEMENT__SOURCE = eINSTANCE.getIAttributeElement_Source();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IATTRIBUTE_ELEMENT__DISTRIBUTION = eINSTANCE.getIAttributeElement_Distribution();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IATTRIBUTE_ELEMENT__FILTER = eINSTANCE.getIAttributeElement_Filter();

		/**
		 * The meta object literal for the '{@link intermediate.impl.TemplateAttributeElementImpl <em>Template Attribute Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediate.impl.TemplateAttributeElementImpl
		 * @see intermediate.impl.IntermediatePackageImpl#getTemplateAttributeElement()
		 * @generated
		 */
		EClass TEMPLATE_ATTRIBUTE_ELEMENT = eINSTANCE.getTemplateAttributeElement();

		/**
		 * The meta object literal for the '<em><b>Template Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_ATTRIBUTE_ELEMENT__TEMPLATE_NAME = eINSTANCE.getTemplateAttributeElement_TemplateName();

		/**
		 * The meta object literal for the '{@link intermediate.impl.IdNodeImpl <em>Id Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediate.impl.IdNodeImpl
		 * @see intermediate.impl.IntermediatePackageImpl#getIdNode()
		 * @generated
		 */
		EClass ID_NODE = eINSTANCE.getIdNode();

	}

} //IntermediatePackage
