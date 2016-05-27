/**
 */
package intermediate.impl;

import intermediate.EntitiesContainer;
import intermediate.GeneratorAttributeElement;
import intermediate.GeneratorEntityElement;
import intermediate.GeneratorReference;
import intermediate.IAttributeElement;
import intermediate.IGeneratorTypedElement;
import intermediate.IdNode;
import intermediate.IntermediateFactory;
import intermediate.IntermediatePackage;
import intermediate.ModelRoot;
import intermediate.TemplateAttributeElement;
import intermediate.TemplateAttributesContainer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediatePackageImpl extends EPackageImpl implements IntermediatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorAttributeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iGeneratorTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorEntityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entitiesContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateAttributesContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAttributeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateAttributeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorReferenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see intermediate.IntermediatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntermediatePackageImpl() {
		super(eNS_URI, IntermediateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IntermediatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntermediatePackage init() {
		if (isInited) return (IntermediatePackage)EPackage.Registry.INSTANCE.getEPackage(IntermediatePackage.eNS_URI);

		// Obtain or create and register package
		IntermediatePackageImpl theIntermediatePackage = (IntermediatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntermediatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntermediatePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIntermediatePackage.createPackageContents();

		// Initialize created meta-data
		theIntermediatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntermediatePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntermediatePackage.eNS_URI, theIntermediatePackage);
		return theIntermediatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorAttributeElement() {
		return generatorAttributeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorAttributeElement_UseTemplate() {
		return (EAttribute)generatorAttributeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIGeneratorTypedElement() {
		return iGeneratorTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIGeneratorTypedElement_Name() {
		return (EAttribute)iGeneratorTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIGeneratorTypedElement_Type() {
		return (EAttribute)iGeneratorTypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorEntityElement() {
		return generatorEntityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorEntityElement_Count() {
		return (EAttribute)generatorEntityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorEntityElement_Attribute() {
		return (EReference)generatorEntityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorEntityElement_Type() {
		return (EAttribute)generatorEntityElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorEntityElement_IdNode() {
		return (EReference)generatorEntityElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorEntityElement_Consumer() {
		return (EAttribute)generatorEntityElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorEntityElement_Reference() {
		return (EReference)generatorEntityElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntitiesContainer() {
		return entitiesContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntitiesContainer_Entities() {
		return (EReference)entitiesContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelRoot() {
		return modelRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRoot_EntitiesContainer() {
		return (EReference)modelRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRoot_TemplateAttributesContainer() {
		return (EReference)modelRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateAttributesContainer() {
		return templateAttributesContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateAttributesContainer_TemplateAttribute() {
		return (EReference)templateAttributesContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAttributeElement() {
		return iAttributeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIAttributeElement_Pattern() {
		return (EAttribute)iAttributeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIAttributeElement_Min() {
		return (EAttribute)iAttributeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIAttributeElement_Max() {
		return (EAttribute)iAttributeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIAttributeElement_Generator() {
		return (EAttribute)iAttributeElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIAttributeElement_Validator() {
		return (EAttribute)iAttributeElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIAttributeElement_Converter() {
		return (EAttribute)iAttributeElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIAttributeElement_Source() {
		return (EAttribute)iAttributeElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIAttributeElement_Distribution() {
		return (EAttribute)iAttributeElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIAttributeElement_Filter() {
		return (EAttribute)iAttributeElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateAttributeElement() {
		return templateAttributeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateAttributeElement_TemplateName() {
		return (EAttribute)templateAttributeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdNode() {
		return idNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorReference() {
		return generatorReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorReference_GeneratorEntityElement() {
		return (EReference)generatorReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorReference_Size() {
		return (EAttribute)generatorReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateFactory getIntermediateFactory() {
		return (IntermediateFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		generatorAttributeElementEClass = createEClass(GENERATOR_ATTRIBUTE_ELEMENT);
		createEAttribute(generatorAttributeElementEClass, GENERATOR_ATTRIBUTE_ELEMENT__USE_TEMPLATE);

		iGeneratorTypedElementEClass = createEClass(IGENERATOR_TYPED_ELEMENT);
		createEAttribute(iGeneratorTypedElementEClass, IGENERATOR_TYPED_ELEMENT__NAME);
		createEAttribute(iGeneratorTypedElementEClass, IGENERATOR_TYPED_ELEMENT__TYPE);

		generatorEntityElementEClass = createEClass(GENERATOR_ENTITY_ELEMENT);
		createEAttribute(generatorEntityElementEClass, GENERATOR_ENTITY_ELEMENT__COUNT);
		createEReference(generatorEntityElementEClass, GENERATOR_ENTITY_ELEMENT__ATTRIBUTE);
		createEAttribute(generatorEntityElementEClass, GENERATOR_ENTITY_ELEMENT__TYPE);
		createEReference(generatorEntityElementEClass, GENERATOR_ENTITY_ELEMENT__ID_NODE);
		createEAttribute(generatorEntityElementEClass, GENERATOR_ENTITY_ELEMENT__CONSUMER);
		createEReference(generatorEntityElementEClass, GENERATOR_ENTITY_ELEMENT__REFERENCE);

		entitiesContainerEClass = createEClass(ENTITIES_CONTAINER);
		createEReference(entitiesContainerEClass, ENTITIES_CONTAINER__ENTITIES);

		modelRootEClass = createEClass(MODEL_ROOT);
		createEReference(modelRootEClass, MODEL_ROOT__ENTITIES_CONTAINER);
		createEReference(modelRootEClass, MODEL_ROOT__TEMPLATE_ATTRIBUTES_CONTAINER);

		templateAttributesContainerEClass = createEClass(TEMPLATE_ATTRIBUTES_CONTAINER);
		createEReference(templateAttributesContainerEClass, TEMPLATE_ATTRIBUTES_CONTAINER__TEMPLATE_ATTRIBUTE);

		iAttributeElementEClass = createEClass(IATTRIBUTE_ELEMENT);
		createEAttribute(iAttributeElementEClass, IATTRIBUTE_ELEMENT__PATTERN);
		createEAttribute(iAttributeElementEClass, IATTRIBUTE_ELEMENT__MIN);
		createEAttribute(iAttributeElementEClass, IATTRIBUTE_ELEMENT__MAX);
		createEAttribute(iAttributeElementEClass, IATTRIBUTE_ELEMENT__GENERATOR);
		createEAttribute(iAttributeElementEClass, IATTRIBUTE_ELEMENT__VALIDATOR);
		createEAttribute(iAttributeElementEClass, IATTRIBUTE_ELEMENT__CONVERTER);
		createEAttribute(iAttributeElementEClass, IATTRIBUTE_ELEMENT__SOURCE);
		createEAttribute(iAttributeElementEClass, IATTRIBUTE_ELEMENT__DISTRIBUTION);
		createEAttribute(iAttributeElementEClass, IATTRIBUTE_ELEMENT__FILTER);

		templateAttributeElementEClass = createEClass(TEMPLATE_ATTRIBUTE_ELEMENT);
		createEAttribute(templateAttributeElementEClass, TEMPLATE_ATTRIBUTE_ELEMENT__TEMPLATE_NAME);

		idNodeEClass = createEClass(ID_NODE);

		generatorReferenceEClass = createEClass(GENERATOR_REFERENCE);
		createEReference(generatorReferenceEClass, GENERATOR_REFERENCE__GENERATOR_ENTITY_ELEMENT);
		createEAttribute(generatorReferenceEClass, GENERATOR_REFERENCE__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		generatorAttributeElementEClass.getESuperTypes().add(this.getIAttributeElement());
		generatorAttributeElementEClass.getESuperTypes().add(this.getIGeneratorTypedElement());
		templateAttributeElementEClass.getESuperTypes().add(this.getIAttributeElement());
		idNodeEClass.getESuperTypes().add(this.getIGeneratorTypedElement());
		idNodeEClass.getESuperTypes().add(this.getIAttributeElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(generatorAttributeElementEClass, GeneratorAttributeElement.class, "GeneratorAttributeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorAttributeElement_UseTemplate(), ecorePackage.getEString(), "useTemplate", null, 0, 1, GeneratorAttributeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iGeneratorTypedElementEClass, IGeneratorTypedElement.class, "IGeneratorTypedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIGeneratorTypedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, IGeneratorTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIGeneratorTypedElement_Type(), ecorePackage.getEString(), "type", null, 0, 1, IGeneratorTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorEntityElementEClass, GeneratorEntityElement.class, "GeneratorEntityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorEntityElement_Count(), ecorePackage.getEInt(), "count", null, 0, 1, GeneratorEntityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorEntityElement_Attribute(), this.getGeneratorAttributeElement(), null, "attribute", null, 0, -1, GeneratorEntityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorEntityElement_Type(), ecorePackage.getEString(), "type", null, 0, 1, GeneratorEntityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorEntityElement_IdNode(), this.getIdNode(), null, "idNode", null, 0, 1, GeneratorEntityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorEntityElement_Consumer(), ecorePackage.getEString(), "consumer", null, 0, 1, GeneratorEntityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorEntityElement_Reference(), this.getGeneratorReference(), null, "reference", null, 0, -1, GeneratorEntityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entitiesContainerEClass, EntitiesContainer.class, "EntitiesContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntitiesContainer_Entities(), this.getGeneratorEntityElement(), null, "entities", null, 0, -1, EntitiesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelRootEClass, ModelRoot.class, "ModelRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelRoot_EntitiesContainer(), this.getEntitiesContainer(), null, "entitiesContainer", null, 0, 1, ModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRoot_TemplateAttributesContainer(), this.getTemplateAttributesContainer(), null, "templateAttributesContainer", null, 0, 1, ModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateAttributesContainerEClass, TemplateAttributesContainer.class, "TemplateAttributesContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateAttributesContainer_TemplateAttribute(), this.getTemplateAttributeElement(), null, "templateAttribute", null, 0, -1, TemplateAttributesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iAttributeElementEClass, IAttributeElement.class, "IAttributeElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIAttributeElement_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, IAttributeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIAttributeElement_Min(), ecorePackage.getEString(), "min", null, 0, 1, IAttributeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIAttributeElement_Max(), ecorePackage.getEString(), "max", null, 0, 1, IAttributeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIAttributeElement_Generator(), ecorePackage.getEString(), "generator", null, 0, 1, IAttributeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIAttributeElement_Validator(), ecorePackage.getEString(), "validator", null, 0, 1, IAttributeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIAttributeElement_Converter(), ecorePackage.getEString(), "converter", null, 0, 1, IAttributeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIAttributeElement_Source(), ecorePackage.getEString(), "source", null, 0, 1, IAttributeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIAttributeElement_Distribution(), ecorePackage.getEString(), "distribution", null, 0, 1, IAttributeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIAttributeElement_Filter(), ecorePackage.getEString(), "filter", null, 0, 1, IAttributeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateAttributeElementEClass, TemplateAttributeElement.class, "TemplateAttributeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateAttributeElement_TemplateName(), ecorePackage.getEString(), "templateName", null, 0, 1, TemplateAttributeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idNodeEClass, IdNode.class, "IdNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generatorReferenceEClass, GeneratorReference.class, "GeneratorReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorReference_GeneratorEntityElement(), this.getGeneratorEntityElement(), null, "generatorEntityElement", null, 1, 1, GeneratorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorReference_Size(), ecorePackage.getEInt(), "size", null, 0, 1, GeneratorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IntermediatePackageImpl
