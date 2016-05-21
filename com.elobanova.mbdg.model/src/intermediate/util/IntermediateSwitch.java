/**
 */
package intermediate.util;

import intermediate.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see intermediate.IntermediatePackage
 * @generated
 */
public class IntermediateSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediatePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateSwitch() {
		if (modelPackage == null) {
			modelPackage = IntermediatePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT: {
				GeneratorAttributeElement generatorAttributeElement = (GeneratorAttributeElement)theEObject;
				T result = caseGeneratorAttributeElement(generatorAttributeElement);
				if (result == null) result = caseIAttributeElement(generatorAttributeElement);
				if (result == null) result = caseGeneratorTypedElement(generatorAttributeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.GENERATOR_TYPED_ELEMENT: {
				GeneratorTypedElement generatorTypedElement = (GeneratorTypedElement)theEObject;
				T result = caseGeneratorTypedElement(generatorTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT: {
				GeneratorEntityElement generatorEntityElement = (GeneratorEntityElement)theEObject;
				T result = caseGeneratorEntityElement(generatorEntityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.ENTITIES_CONTAINER: {
				EntitiesContainer entitiesContainer = (EntitiesContainer)theEObject;
				T result = caseEntitiesContainer(entitiesContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.MODEL_ROOT: {
				ModelRoot modelRoot = (ModelRoot)theEObject;
				T result = caseModelRoot(modelRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.TEMPLATE_ATTRIBUTES_CONTAINER: {
				TemplateAttributesContainer templateAttributesContainer = (TemplateAttributesContainer)theEObject;
				T result = caseTemplateAttributesContainer(templateAttributesContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.IATTRIBUTE_ELEMENT: {
				IAttributeElement iAttributeElement = (IAttributeElement)theEObject;
				T result = caseIAttributeElement(iAttributeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT: {
				TemplateAttributeElement templateAttributeElement = (TemplateAttributeElement)theEObject;
				T result = caseTemplateAttributeElement(templateAttributeElement);
				if (result == null) result = caseIAttributeElement(templateAttributeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.ID_NODE: {
				IdNode idNode = (IdNode)theEObject;
				T result = caseIdNode(idNode);
				if (result == null) result = caseGeneratorTypedElement(idNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Attribute Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Attribute Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorAttributeElement(GeneratorAttributeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorTypedElement(GeneratorTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Entity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Entity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorEntityElement(GeneratorEntityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entities Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entities Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntitiesContainer(EntitiesContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelRoot(ModelRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Attributes Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Attributes Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateAttributesContainer(TemplateAttributesContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAttribute Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAttribute Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAttributeElement(IAttributeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Attribute Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Attribute Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateAttributeElement(TemplateAttributeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdNode(IdNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IntermediateSwitch
