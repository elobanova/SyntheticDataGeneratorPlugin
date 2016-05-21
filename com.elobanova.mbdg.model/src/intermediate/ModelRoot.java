/**
 */
package intermediate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediate.ModelRoot#getEntitiesContainer <em>Entities Container</em>}</li>
 *   <li>{@link intermediate.ModelRoot#getTemplateAttributesContainer <em>Template Attributes Container</em>}</li>
 * </ul>
 *
 * @see intermediate.IntermediatePackage#getModelRoot()
 * @model
 * @generated
 */
public interface ModelRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities Container</em>' containment reference.
	 * @see #setEntitiesContainer(EntitiesContainer)
	 * @see intermediate.IntermediatePackage#getModelRoot_EntitiesContainer()
	 * @model containment="true"
	 * @generated
	 */
	EntitiesContainer getEntitiesContainer();

	/**
	 * Sets the value of the '{@link intermediate.ModelRoot#getEntitiesContainer <em>Entities Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entities Container</em>' containment reference.
	 * @see #getEntitiesContainer()
	 * @generated
	 */
	void setEntitiesContainer(EntitiesContainer value);

	/**
	 * Returns the value of the '<em><b>Template Attributes Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Attributes Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Attributes Container</em>' containment reference.
	 * @see #setTemplateAttributesContainer(TemplateAttributesContainer)
	 * @see intermediate.IntermediatePackage#getModelRoot_TemplateAttributesContainer()
	 * @model containment="true"
	 * @generated
	 */
	TemplateAttributesContainer getTemplateAttributesContainer();

	/**
	 * Sets the value of the '{@link intermediate.ModelRoot#getTemplateAttributesContainer <em>Template Attributes Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Attributes Container</em>' containment reference.
	 * @see #getTemplateAttributesContainer()
	 * @generated
	 */
	void setTemplateAttributesContainer(TemplateAttributesContainer value);

} // ModelRoot
