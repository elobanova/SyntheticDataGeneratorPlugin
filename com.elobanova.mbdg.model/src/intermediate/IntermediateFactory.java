/**
 */
package intermediate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see intermediate.IntermediatePackage
 * @generated
 */
public interface IntermediateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateFactory eINSTANCE = intermediate.impl.IntermediateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Generator Attribute Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Attribute Element</em>'.
	 * @generated
	 */
	GeneratorAttributeElement createGeneratorAttributeElement();

	/**
	 * Returns a new object of class '<em>Generator Entity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Entity Element</em>'.
	 * @generated
	 */
	GeneratorEntityElement createGeneratorEntityElement();

	/**
	 * Returns a new object of class '<em>Entities Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entities Container</em>'.
	 * @generated
	 */
	EntitiesContainer createEntitiesContainer();

	/**
	 * Returns a new object of class '<em>Model Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Root</em>'.
	 * @generated
	 */
	ModelRoot createModelRoot();

	/**
	 * Returns a new object of class '<em>Template Attributes Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Attributes Container</em>'.
	 * @generated
	 */
	TemplateAttributesContainer createTemplateAttributesContainer();

	/**
	 * Returns a new object of class '<em>Template Attribute Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Attribute Element</em>'.
	 * @generated
	 */
	TemplateAttributeElement createTemplateAttributeElement();

	/**
	 * Returns a new object of class '<em>Id Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Node</em>'.
	 * @generated
	 */
	IdNode createIdNode();

	/**
	 * Returns a new object of class '<em>Generator Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Reference</em>'.
	 * @generated
	 */
	GeneratorReference createGeneratorReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntermediatePackage getIntermediatePackage();

} //IntermediateFactory
