/**
 */
package intermediate.util;

import intermediate.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see intermediate.IntermediatePackage
 * @generated
 */
public class IntermediateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntermediatePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateSwitch<Adapter> modelSwitch =
		new IntermediateSwitch<Adapter>() {
			@Override
			public Adapter caseGeneratorAttributeElement(GeneratorAttributeElement object) {
				return createGeneratorAttributeElementAdapter();
			}
			@Override
			public Adapter caseIGeneratorTypedElement(IGeneratorTypedElement object) {
				return createIGeneratorTypedElementAdapter();
			}
			@Override
			public Adapter caseGeneratorEntityElement(GeneratorEntityElement object) {
				return createGeneratorEntityElementAdapter();
			}
			@Override
			public Adapter caseEntitiesContainer(EntitiesContainer object) {
				return createEntitiesContainerAdapter();
			}
			@Override
			public Adapter caseModelRoot(ModelRoot object) {
				return createModelRootAdapter();
			}
			@Override
			public Adapter caseTemplateAttributesContainer(TemplateAttributesContainer object) {
				return createTemplateAttributesContainerAdapter();
			}
			@Override
			public Adapter caseIAttributeElement(IAttributeElement object) {
				return createIAttributeElementAdapter();
			}
			@Override
			public Adapter caseTemplateAttributeElement(TemplateAttributeElement object) {
				return createTemplateAttributeElementAdapter();
			}
			@Override
			public Adapter caseIdNode(IdNode object) {
				return createIdNodeAdapter();
			}
			@Override
			public Adapter caseGeneratorReference(GeneratorReference object) {
				return createGeneratorReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link intermediate.GeneratorAttributeElement <em>Generator Attribute Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediate.GeneratorAttributeElement
	 * @generated
	 */
	public Adapter createGeneratorAttributeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediate.IGeneratorTypedElement <em>IGenerator Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediate.IGeneratorTypedElement
	 * @generated
	 */
	public Adapter createIGeneratorTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediate.GeneratorEntityElement <em>Generator Entity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediate.GeneratorEntityElement
	 * @generated
	 */
	public Adapter createGeneratorEntityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediate.EntitiesContainer <em>Entities Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediate.EntitiesContainer
	 * @generated
	 */
	public Adapter createEntitiesContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediate.ModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediate.ModelRoot
	 * @generated
	 */
	public Adapter createModelRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediate.TemplateAttributesContainer <em>Template Attributes Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediate.TemplateAttributesContainer
	 * @generated
	 */
	public Adapter createTemplateAttributesContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediate.IAttributeElement <em>IAttribute Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediate.IAttributeElement
	 * @generated
	 */
	public Adapter createIAttributeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediate.TemplateAttributeElement <em>Template Attribute Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediate.TemplateAttributeElement
	 * @generated
	 */
	public Adapter createTemplateAttributeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediate.IdNode <em>Id Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediate.IdNode
	 * @generated
	 */
	public Adapter createIdNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediate.GeneratorReference <em>Generator Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediate.GeneratorReference
	 * @generated
	 */
	public Adapter createGeneratorReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IntermediateAdapterFactory
