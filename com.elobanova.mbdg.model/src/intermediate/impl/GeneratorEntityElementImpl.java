/**
 */
package intermediate.impl;

import intermediate.GeneratorAttributeElement;
import intermediate.GeneratorEntityElement;
import intermediate.IdNode;
import intermediate.IntermediatePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Entity Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link intermediate.impl.GeneratorEntityElementImpl#getCount <em>Count</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorEntityElementImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorEntityElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorEntityElementImpl#getIdNode <em>Id Node</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorEntityElementImpl#getConsumer <em>Consumer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorEntityElementImpl extends MinimalEObjectImpl.Container implements GeneratorEntityElement {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorAttributeElement> attribute;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIdNode() <em>Id Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdNode()
	 * @generated
	 * @ordered
	 */
	protected IdNode idNode;

	/**
	 * The default value of the '{@link #getConsumer() <em>Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumer() <em>Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer()
	 * @generated
	 * @ordered
	 */
	protected String consumer = CONSUMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorEntityElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.GENERATOR_ENTITY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ENTITY_ELEMENT__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorAttributeElement> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<GeneratorAttributeElement>(GeneratorAttributeElement.class, this, IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ENTITY_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdNode getIdNode() {
		return idNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdNode(IdNode newIdNode, NotificationChain msgs) {
		IdNode oldIdNode = idNode;
		idNode = newIdNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ID_NODE, oldIdNode, newIdNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdNode(IdNode newIdNode) {
		if (newIdNode != idNode) {
			NotificationChain msgs = null;
			if (idNode != null)
				msgs = ((InternalEObject)idNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ID_NODE, null, msgs);
			if (newIdNode != null)
				msgs = ((InternalEObject)newIdNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ID_NODE, null, msgs);
			msgs = basicSetIdNode(newIdNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ID_NODE, newIdNode, newIdNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumer() {
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumer(String newConsumer) {
		String oldConsumer = consumer;
		consumer = newConsumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ENTITY_ELEMENT__CONSUMER, oldConsumer, consumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ID_NODE:
				return basicSetIdNode(null, msgs);
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
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__COUNT:
				return getCount();
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ATTRIBUTE:
				return getAttribute();
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__TYPE:
				return getType();
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ID_NODE:
				return getIdNode();
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__CONSUMER:
				return getConsumer();
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
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__COUNT:
				setCount((Integer)newValue);
				return;
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends GeneratorAttributeElement>)newValue);
				return;
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__TYPE:
				setType((String)newValue);
				return;
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ID_NODE:
				setIdNode((IdNode)newValue);
				return;
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__CONSUMER:
				setConsumer((String)newValue);
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
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ATTRIBUTE:
				getAttribute().clear();
				return;
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ID_NODE:
				setIdNode((IdNode)null);
				return;
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__CONSUMER:
				setConsumer(CONSUMER_EDEFAULT);
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
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__COUNT:
				return count != COUNT_EDEFAULT;
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__ID_NODE:
				return idNode != null;
			case IntermediatePackage.GENERATOR_ENTITY_ELEMENT__CONSUMER:
				return CONSUMER_EDEFAULT == null ? consumer != null : !CONSUMER_EDEFAULT.equals(consumer);
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
		result.append(" (count: ");
		result.append(count);
		result.append(", type: ");
		result.append(type);
		result.append(", consumer: ");
		result.append(consumer);
		result.append(')');
		return result.toString();
	}

} //GeneratorEntityElementImpl
