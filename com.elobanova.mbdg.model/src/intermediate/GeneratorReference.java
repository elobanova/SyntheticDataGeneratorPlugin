/**
 */
package intermediate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediate.GeneratorReference#getGeneratorEntityElement <em>Generator Entity Element</em>}</li>
 * </ul>
 *
 * @see intermediate.IntermediatePackage#getGeneratorReference()
 * @model
 * @generated
 */
public interface GeneratorReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Generator Entity Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Entity Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Entity Element</em>' reference.
	 * @see #setGeneratorEntityElement(GeneratorEntityElement)
	 * @see intermediate.IntermediatePackage#getGeneratorReference_GeneratorEntityElement()
	 * @model required="true"
	 * @generated
	 */
	GeneratorEntityElement getGeneratorEntityElement();

	/**
	 * Sets the value of the '{@link intermediate.GeneratorReference#getGeneratorEntityElement <em>Generator Entity Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Entity Element</em>' reference.
	 * @see #getGeneratorEntityElement()
	 * @generated
	 */
	void setGeneratorEntityElement(GeneratorEntityElement value);

} // GeneratorReference
