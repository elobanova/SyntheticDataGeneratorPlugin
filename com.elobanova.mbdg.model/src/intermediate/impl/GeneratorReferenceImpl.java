/**
 */
package intermediate.impl;

import intermediate.GeneratorEntityElement;
import intermediate.GeneratorReference;
import intermediate.IntermediatePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link intermediate.impl.GeneratorReferenceImpl#getGeneratorEntityElement <em>Generator Entity Element</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorReferenceImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorReferenceImpl extends MinimalEObjectImpl.Container implements GeneratorReference {
	/**
	 * The cached value of the '{@link #getGeneratorEntityElement() <em>Generator Entity Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorEntityElement()
	 * @generated
	 * @ordered
	 */
	protected GeneratorEntityElement generatorEntityElement;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.GENERATOR_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorEntityElement getGeneratorEntityElement() {
		if (generatorEntityElement != null && generatorEntityElement.eIsProxy()) {
			InternalEObject oldGeneratorEntityElement = (InternalEObject)generatorEntityElement;
			generatorEntityElement = (GeneratorEntityElement)eResolveProxy(oldGeneratorEntityElement);
			if (generatorEntityElement != oldGeneratorEntityElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediatePackage.GENERATOR_REFERENCE__GENERATOR_ENTITY_ELEMENT, oldGeneratorEntityElement, generatorEntityElement));
			}
		}
		return generatorEntityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorEntityElement basicGetGeneratorEntityElement() {
		return generatorEntityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorEntityElement(GeneratorEntityElement newGeneratorEntityElement) {
		GeneratorEntityElement oldGeneratorEntityElement = generatorEntityElement;
		generatorEntityElement = newGeneratorEntityElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_REFERENCE__GENERATOR_ENTITY_ELEMENT, oldGeneratorEntityElement, generatorEntityElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_REFERENCE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediatePackage.GENERATOR_REFERENCE__GENERATOR_ENTITY_ELEMENT:
				if (resolve) return getGeneratorEntityElement();
				return basicGetGeneratorEntityElement();
			case IntermediatePackage.GENERATOR_REFERENCE__SIZE:
				return getSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntermediatePackage.GENERATOR_REFERENCE__GENERATOR_ENTITY_ELEMENT:
				setGeneratorEntityElement((GeneratorEntityElement)newValue);
				return;
			case IntermediatePackage.GENERATOR_REFERENCE__SIZE:
				setSize((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IntermediatePackage.GENERATOR_REFERENCE__GENERATOR_ENTITY_ELEMENT:
				setGeneratorEntityElement((GeneratorEntityElement)null);
				return;
			case IntermediatePackage.GENERATOR_REFERENCE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntermediatePackage.GENERATOR_REFERENCE__GENERATOR_ENTITY_ELEMENT:
				return generatorEntityElement != null;
			case IntermediatePackage.GENERATOR_REFERENCE__SIZE:
				return size != SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //GeneratorReferenceImpl
