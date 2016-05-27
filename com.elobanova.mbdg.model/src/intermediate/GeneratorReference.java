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
 *   <li>{@link intermediate.GeneratorReference#getSize <em>Size</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see intermediate.IntermediatePackage#getGeneratorReference_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link intermediate.GeneratorReference#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // GeneratorReference
