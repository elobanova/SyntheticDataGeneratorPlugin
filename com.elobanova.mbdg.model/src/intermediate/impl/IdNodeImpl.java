/**
 */
package intermediate.impl;

import intermediate.IAttributeElement;
import intermediate.IdNode;
import intermediate.IntermediatePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Id Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link intermediate.impl.IdNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link intermediate.impl.IdNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link intermediate.impl.IdNodeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link intermediate.impl.IdNodeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link intermediate.impl.IdNodeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link intermediate.impl.IdNodeImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link intermediate.impl.IdNodeImpl#getValidator <em>Validator</em>}</li>
 *   <li>{@link intermediate.impl.IdNodeImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link intermediate.impl.IdNodeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link intermediate.impl.IdNodeImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link intermediate.impl.IdNodeImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdNodeImpl extends MinimalEObjectImpl.Container implements IdNode {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected String min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected String max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected String generator = GENERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidator() <em>Validator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidator()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidator() <em>Validator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidator()
	 * @generated
	 * @ordered
	 */
	protected String validator = VALIDATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getConverter() <em>Converter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverter()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConverter() <em>Converter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverter()
	 * @generated
	 * @ordered
	 */
	protected String converter = CONVERTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected String distribution = DISTRIBUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.ID_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.ID_NODE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.ID_NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.ID_NODE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(String newMin) {
		String oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.ID_NODE__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(String newMax) {
		String oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.ID_NODE__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerator() {
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(String newGenerator) {
		String oldGenerator = generator;
		generator = newGenerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.ID_NODE__GENERATOR, oldGenerator, generator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidator() {
		return validator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidator(String newValidator) {
		String oldValidator = validator;
		validator = newValidator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.ID_NODE__VALIDATOR, oldValidator, validator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConverter() {
		return converter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConverter(String newConverter) {
		String oldConverter = converter;
		converter = newConverter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.ID_NODE__CONVERTER, oldConverter, converter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.ID_NODE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistribution() {
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution(String newDistribution) {
		String oldDistribution = distribution;
		distribution = newDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.ID_NODE__DISTRIBUTION, oldDistribution, distribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.ID_NODE__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediatePackage.ID_NODE__NAME:
				return getName();
			case IntermediatePackage.ID_NODE__TYPE:
				return getType();
			case IntermediatePackage.ID_NODE__PATTERN:
				return getPattern();
			case IntermediatePackage.ID_NODE__MIN:
				return getMin();
			case IntermediatePackage.ID_NODE__MAX:
				return getMax();
			case IntermediatePackage.ID_NODE__GENERATOR:
				return getGenerator();
			case IntermediatePackage.ID_NODE__VALIDATOR:
				return getValidator();
			case IntermediatePackage.ID_NODE__CONVERTER:
				return getConverter();
			case IntermediatePackage.ID_NODE__SOURCE:
				return getSource();
			case IntermediatePackage.ID_NODE__DISTRIBUTION:
				return getDistribution();
			case IntermediatePackage.ID_NODE__FILTER:
				return getFilter();
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
			case IntermediatePackage.ID_NODE__NAME:
				setName((String)newValue);
				return;
			case IntermediatePackage.ID_NODE__TYPE:
				setType((String)newValue);
				return;
			case IntermediatePackage.ID_NODE__PATTERN:
				setPattern((String)newValue);
				return;
			case IntermediatePackage.ID_NODE__MIN:
				setMin((String)newValue);
				return;
			case IntermediatePackage.ID_NODE__MAX:
				setMax((String)newValue);
				return;
			case IntermediatePackage.ID_NODE__GENERATOR:
				setGenerator((String)newValue);
				return;
			case IntermediatePackage.ID_NODE__VALIDATOR:
				setValidator((String)newValue);
				return;
			case IntermediatePackage.ID_NODE__CONVERTER:
				setConverter((String)newValue);
				return;
			case IntermediatePackage.ID_NODE__SOURCE:
				setSource((String)newValue);
				return;
			case IntermediatePackage.ID_NODE__DISTRIBUTION:
				setDistribution((String)newValue);
				return;
			case IntermediatePackage.ID_NODE__FILTER:
				setFilter((String)newValue);
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
			case IntermediatePackage.ID_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntermediatePackage.ID_NODE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IntermediatePackage.ID_NODE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case IntermediatePackage.ID_NODE__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case IntermediatePackage.ID_NODE__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case IntermediatePackage.ID_NODE__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
				return;
			case IntermediatePackage.ID_NODE__VALIDATOR:
				setValidator(VALIDATOR_EDEFAULT);
				return;
			case IntermediatePackage.ID_NODE__CONVERTER:
				setConverter(CONVERTER_EDEFAULT);
				return;
			case IntermediatePackage.ID_NODE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case IntermediatePackage.ID_NODE__DISTRIBUTION:
				setDistribution(DISTRIBUTION_EDEFAULT);
				return;
			case IntermediatePackage.ID_NODE__FILTER:
				setFilter(FILTER_EDEFAULT);
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
			case IntermediatePackage.ID_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntermediatePackage.ID_NODE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case IntermediatePackage.ID_NODE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case IntermediatePackage.ID_NODE__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case IntermediatePackage.ID_NODE__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case IntermediatePackage.ID_NODE__GENERATOR:
				return GENERATOR_EDEFAULT == null ? generator != null : !GENERATOR_EDEFAULT.equals(generator);
			case IntermediatePackage.ID_NODE__VALIDATOR:
				return VALIDATOR_EDEFAULT == null ? validator != null : !VALIDATOR_EDEFAULT.equals(validator);
			case IntermediatePackage.ID_NODE__CONVERTER:
				return CONVERTER_EDEFAULT == null ? converter != null : !CONVERTER_EDEFAULT.equals(converter);
			case IntermediatePackage.ID_NODE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case IntermediatePackage.ID_NODE__DISTRIBUTION:
				return DISTRIBUTION_EDEFAULT == null ? distribution != null : !DISTRIBUTION_EDEFAULT.equals(distribution);
			case IntermediatePackage.ID_NODE__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IAttributeElement.class) {
			switch (derivedFeatureID) {
				case IntermediatePackage.ID_NODE__PATTERN: return IntermediatePackage.IATTRIBUTE_ELEMENT__PATTERN;
				case IntermediatePackage.ID_NODE__MIN: return IntermediatePackage.IATTRIBUTE_ELEMENT__MIN;
				case IntermediatePackage.ID_NODE__MAX: return IntermediatePackage.IATTRIBUTE_ELEMENT__MAX;
				case IntermediatePackage.ID_NODE__GENERATOR: return IntermediatePackage.IATTRIBUTE_ELEMENT__GENERATOR;
				case IntermediatePackage.ID_NODE__VALIDATOR: return IntermediatePackage.IATTRIBUTE_ELEMENT__VALIDATOR;
				case IntermediatePackage.ID_NODE__CONVERTER: return IntermediatePackage.IATTRIBUTE_ELEMENT__CONVERTER;
				case IntermediatePackage.ID_NODE__SOURCE: return IntermediatePackage.IATTRIBUTE_ELEMENT__SOURCE;
				case IntermediatePackage.ID_NODE__DISTRIBUTION: return IntermediatePackage.IATTRIBUTE_ELEMENT__DISTRIBUTION;
				case IntermediatePackage.ID_NODE__FILTER: return IntermediatePackage.IATTRIBUTE_ELEMENT__FILTER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IAttributeElement.class) {
			switch (baseFeatureID) {
				case IntermediatePackage.IATTRIBUTE_ELEMENT__PATTERN: return IntermediatePackage.ID_NODE__PATTERN;
				case IntermediatePackage.IATTRIBUTE_ELEMENT__MIN: return IntermediatePackage.ID_NODE__MIN;
				case IntermediatePackage.IATTRIBUTE_ELEMENT__MAX: return IntermediatePackage.ID_NODE__MAX;
				case IntermediatePackage.IATTRIBUTE_ELEMENT__GENERATOR: return IntermediatePackage.ID_NODE__GENERATOR;
				case IntermediatePackage.IATTRIBUTE_ELEMENT__VALIDATOR: return IntermediatePackage.ID_NODE__VALIDATOR;
				case IntermediatePackage.IATTRIBUTE_ELEMENT__CONVERTER: return IntermediatePackage.ID_NODE__CONVERTER;
				case IntermediatePackage.IATTRIBUTE_ELEMENT__SOURCE: return IntermediatePackage.ID_NODE__SOURCE;
				case IntermediatePackage.IATTRIBUTE_ELEMENT__DISTRIBUTION: return IntermediatePackage.ID_NODE__DISTRIBUTION;
				case IntermediatePackage.IATTRIBUTE_ELEMENT__FILTER: return IntermediatePackage.ID_NODE__FILTER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", generator: ");
		result.append(generator);
		result.append(", validator: ");
		result.append(validator);
		result.append(", converter: ");
		result.append(converter);
		result.append(", source: ");
		result.append(source);
		result.append(", distribution: ");
		result.append(distribution);
		result.append(", filter: ");
		result.append(filter);
		result.append(')');
		return result.toString();
	}

} //IdNodeImpl
