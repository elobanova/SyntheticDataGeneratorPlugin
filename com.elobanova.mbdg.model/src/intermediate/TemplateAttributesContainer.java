/**
 */
package intermediate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Attributes Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediate.TemplateAttributesContainer#getTemplateAttribute <em>Template Attribute</em>}</li>
 * </ul>
 *
 * @see intermediate.IntermediatePackage#getTemplateAttributesContainer()
 * @model
 * @generated
 */
public interface TemplateAttributesContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link intermediate.TemplateAttributeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Attribute</em>' containment reference list.
	 * @see intermediate.IntermediatePackage#getTemplateAttributesContainer_TemplateAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateAttributeElement> getTemplateAttribute();

} // TemplateAttributesContainer
