/**
 */
package intermediate;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Attribute Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediate.GeneratorAttributeElement#getUseTemplate <em>Use Template</em>}</li>
 * </ul>
 *
 * @see intermediate.IntermediatePackage#getGeneratorAttributeElement()
 * @model
 * @generated
 */
public interface GeneratorAttributeElement extends IAttributeElement, IGeneratorTypedElement {
	/**
	 * Returns the value of the '<em><b>Use Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Template</em>' attribute.
	 * @see #setUseTemplate(String)
	 * @see intermediate.IntermediatePackage#getGeneratorAttributeElement_UseTemplate()
	 * @model
	 * @generated
	 */
	String getUseTemplate();

	/**
	 * Sets the value of the '{@link intermediate.GeneratorAttributeElement#getUseTemplate <em>Use Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Template</em>' attribute.
	 * @see #getUseTemplate()
	 * @generated
	 */
	void setUseTemplate(String value);

} // GeneratorAttributeElement
