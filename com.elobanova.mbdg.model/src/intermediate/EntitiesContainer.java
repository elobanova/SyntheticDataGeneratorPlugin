/**
 */
package intermediate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entities Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediate.EntitiesContainer#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see intermediate.IntermediatePackage#getEntitiesContainer()
 * @model
 * @generated
 */
public interface EntitiesContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link intermediate.GeneratorEntityElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see intermediate.IntermediatePackage#getEntitiesContainer_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratorEntityElement> getEntities();

} // EntitiesContainer
