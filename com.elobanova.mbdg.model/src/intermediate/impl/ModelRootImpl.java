/**
 */
package intermediate.impl;

import intermediate.EntitiesContainer;
import intermediate.IntermediatePackage;
import intermediate.ModelRoot;
import intermediate.TemplateAttributesContainer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link intermediate.impl.ModelRootImpl#getEntitiesContainer <em>Entities Container</em>}</li>
 *   <li>{@link intermediate.impl.ModelRootImpl#getTemplateAttributesContainer <em>Template Attributes Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelRootImpl extends MinimalEObjectImpl.Container implements ModelRoot {
	/**
	 * The cached value of the '{@link #getEntitiesContainer() <em>Entities Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitiesContainer()
	 * @generated
	 * @ordered
	 */
	protected EntitiesContainer entitiesContainer;

	/**
	 * The cached value of the '{@link #getTemplateAttributesContainer() <em>Template Attributes Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateAttributesContainer()
	 * @generated
	 * @ordered
	 */
	protected TemplateAttributesContainer templateAttributesContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.MODEL_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitiesContainer getEntitiesContainer() {
		return entitiesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntitiesContainer(EntitiesContainer newEntitiesContainer, NotificationChain msgs) {
		EntitiesContainer oldEntitiesContainer = entitiesContainer;
		entitiesContainer = newEntitiesContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.MODEL_ROOT__ENTITIES_CONTAINER, oldEntitiesContainer, newEntitiesContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntitiesContainer(EntitiesContainer newEntitiesContainer) {
		if (newEntitiesContainer != entitiesContainer) {
			NotificationChain msgs = null;
			if (entitiesContainer != null)
				msgs = ((InternalEObject)entitiesContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.MODEL_ROOT__ENTITIES_CONTAINER, null, msgs);
			if (newEntitiesContainer != null)
				msgs = ((InternalEObject)newEntitiesContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.MODEL_ROOT__ENTITIES_CONTAINER, null, msgs);
			msgs = basicSetEntitiesContainer(newEntitiesContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.MODEL_ROOT__ENTITIES_CONTAINER, newEntitiesContainer, newEntitiesContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateAttributesContainer getTemplateAttributesContainer() {
		return templateAttributesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateAttributesContainer(TemplateAttributesContainer newTemplateAttributesContainer, NotificationChain msgs) {
		TemplateAttributesContainer oldTemplateAttributesContainer = templateAttributesContainer;
		templateAttributesContainer = newTemplateAttributesContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.MODEL_ROOT__TEMPLATE_ATTRIBUTES_CONTAINER, oldTemplateAttributesContainer, newTemplateAttributesContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateAttributesContainer(TemplateAttributesContainer newTemplateAttributesContainer) {
		if (newTemplateAttributesContainer != templateAttributesContainer) {
			NotificationChain msgs = null;
			if (templateAttributesContainer != null)
				msgs = ((InternalEObject)templateAttributesContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.MODEL_ROOT__TEMPLATE_ATTRIBUTES_CONTAINER, null, msgs);
			if (newTemplateAttributesContainer != null)
				msgs = ((InternalEObject)newTemplateAttributesContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.MODEL_ROOT__TEMPLATE_ATTRIBUTES_CONTAINER, null, msgs);
			msgs = basicSetTemplateAttributesContainer(newTemplateAttributesContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.MODEL_ROOT__TEMPLATE_ATTRIBUTES_CONTAINER, newTemplateAttributesContainer, newTemplateAttributesContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediatePackage.MODEL_ROOT__ENTITIES_CONTAINER:
				return basicSetEntitiesContainer(null, msgs);
			case IntermediatePackage.MODEL_ROOT__TEMPLATE_ATTRIBUTES_CONTAINER:
				return basicSetTemplateAttributesContainer(null, msgs);
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
			case IntermediatePackage.MODEL_ROOT__ENTITIES_CONTAINER:
				return getEntitiesContainer();
			case IntermediatePackage.MODEL_ROOT__TEMPLATE_ATTRIBUTES_CONTAINER:
				return getTemplateAttributesContainer();
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
			case IntermediatePackage.MODEL_ROOT__ENTITIES_CONTAINER:
				setEntitiesContainer((EntitiesContainer)newValue);
				return;
			case IntermediatePackage.MODEL_ROOT__TEMPLATE_ATTRIBUTES_CONTAINER:
				setTemplateAttributesContainer((TemplateAttributesContainer)newValue);
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
			case IntermediatePackage.MODEL_ROOT__ENTITIES_CONTAINER:
				setEntitiesContainer((EntitiesContainer)null);
				return;
			case IntermediatePackage.MODEL_ROOT__TEMPLATE_ATTRIBUTES_CONTAINER:
				setTemplateAttributesContainer((TemplateAttributesContainer)null);
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
			case IntermediatePackage.MODEL_ROOT__ENTITIES_CONTAINER:
				return entitiesContainer != null;
			case IntermediatePackage.MODEL_ROOT__TEMPLATE_ATTRIBUTES_CONTAINER:
				return templateAttributesContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelRootImpl
