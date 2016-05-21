/**
 */
package intermediate.impl;

import intermediate.IntermediatePackage;
import intermediate.TemplateAttributeElement;
import intermediate.TemplateAttributesContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Attributes Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link intermediate.impl.TemplateAttributesContainerImpl#getTemplateAttribute <em>Template Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateAttributesContainerImpl extends MinimalEObjectImpl.Container implements TemplateAttributesContainer {
	/**
	 * The cached value of the '{@link #getTemplateAttribute() <em>Template Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateAttributeElement> templateAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateAttributesContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.TEMPLATE_ATTRIBUTES_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateAttributeElement> getTemplateAttribute() {
		if (templateAttribute == null) {
			templateAttribute = new EObjectContainmentEList<TemplateAttributeElement>(TemplateAttributeElement.class, this, IntermediatePackage.TEMPLATE_ATTRIBUTES_CONTAINER__TEMPLATE_ATTRIBUTE);
		}
		return templateAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediatePackage.TEMPLATE_ATTRIBUTES_CONTAINER__TEMPLATE_ATTRIBUTE:
				return ((InternalEList<?>)getTemplateAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediatePackage.TEMPLATE_ATTRIBUTES_CONTAINER__TEMPLATE_ATTRIBUTE:
				return getTemplateAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntermediatePackage.TEMPLATE_ATTRIBUTES_CONTAINER__TEMPLATE_ATTRIBUTE:
				getTemplateAttribute().clear();
				getTemplateAttribute().addAll((Collection<? extends TemplateAttributeElement>)newValue);
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
			case IntermediatePackage.TEMPLATE_ATTRIBUTES_CONTAINER__TEMPLATE_ATTRIBUTE:
				getTemplateAttribute().clear();
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
			case IntermediatePackage.TEMPLATE_ATTRIBUTES_CONTAINER__TEMPLATE_ATTRIBUTE:
				return templateAttribute != null && !templateAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateAttributesContainerImpl
