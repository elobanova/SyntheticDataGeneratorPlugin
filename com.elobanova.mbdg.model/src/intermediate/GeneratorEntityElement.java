/**
 */
package intermediate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Entity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediate.GeneratorEntityElement#getCount <em>Count</em>}</li>
 *   <li>{@link intermediate.GeneratorEntityElement#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link intermediate.GeneratorEntityElement#getType <em>Type</em>}</li>
 *   <li>{@link intermediate.GeneratorEntityElement#getIdNode <em>Id Node</em>}</li>
 *   <li>{@link intermediate.GeneratorEntityElement#getConsumer <em>Consumer</em>}</li>
 *   <li>{@link intermediate.GeneratorEntityElement#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see intermediate.IntermediatePackage#getGeneratorEntityElement()
 * @model
 * @generated
 */
public interface GeneratorEntityElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see intermediate.IntermediatePackage#getGeneratorEntityElement_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link intermediate.GeneratorEntityElement#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link intermediate.GeneratorAttributeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see intermediate.IntermediatePackage#getGeneratorEntityElement_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratorAttributeElement> getAttribute();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see intermediate.IntermediatePackage#getGeneratorEntityElement_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link intermediate.GeneratorEntityElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Id Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Node</em>' containment reference.
	 * @see #setIdNode(IdNode)
	 * @see intermediate.IntermediatePackage#getGeneratorEntityElement_IdNode()
	 * @model containment="true"
	 * @generated
	 */
	IdNode getIdNode();

	/**
	 * Sets the value of the '{@link intermediate.GeneratorEntityElement#getIdNode <em>Id Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Node</em>' containment reference.
	 * @see #getIdNode()
	 * @generated
	 */
	void setIdNode(IdNode value);

	/**
	 * Returns the value of the '<em><b>Consumer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer</em>' attribute.
	 * @see #setConsumer(String)
	 * @see intermediate.IntermediatePackage#getGeneratorEntityElement_Consumer()
	 * @model
	 * @generated
	 */
	String getConsumer();

	/**
	 * Sets the value of the '{@link intermediate.GeneratorEntityElement#getConsumer <em>Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer</em>' attribute.
	 * @see #getConsumer()
	 * @generated
	 */
	void setConsumer(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link intermediate.GeneratorReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see intermediate.IntermediatePackage#getGeneratorEntityElement_Reference()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratorReference> getReference();

} // GeneratorEntityElement
