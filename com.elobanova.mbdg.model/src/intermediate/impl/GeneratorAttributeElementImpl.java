/**
 */
package intermediate.impl;

import intermediate.GeneratorAttributeElement;
import intermediate.IGeneratorTypedElement;
import intermediate.IntermediatePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Attribute Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link intermediate.impl.GeneratorAttributeElementImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorAttributeElementImpl#getMin <em>Min</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorAttributeElementImpl#getMax <em>Max</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorAttributeElementImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorAttributeElementImpl#getValidator <em>Validator</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorAttributeElementImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorAttributeElementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorAttributeElementImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorAttributeElementImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorAttributeElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorAttributeElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link intermediate.impl.GeneratorAttributeElementImpl#getUseTemplate <em>Use Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorAttributeElementImpl extends MinimalEObjectImpl.Container implements GeneratorAttributeElement {
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
	 * The default value of the '{@link #getUseTemplate() <em>Use Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseTemplate() <em>Use Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTemplate()
	 * @generated
	 * @ordered
	 */
	protected String useTemplate = USE_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorAttributeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.GENERATOR_ATTRIBUTE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__PATTERN, oldPattern, pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__MIN, oldMin, min));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__MAX, oldMax, max));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__GENERATOR, oldGenerator, generator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__VALIDATOR, oldValidator, validator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__CONVERTER, oldConverter, converter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__DISTRIBUTION, oldDistribution, distribution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__FILTER, oldFilter, filter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseTemplate() {
		return useTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseTemplate(String newUseTemplate) {
		String oldUseTemplate = useTemplate;
		useTemplate = newUseTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__USE_TEMPLATE, oldUseTemplate, useTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__PATTERN:
				return getPattern();
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__MIN:
				return getMin();
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__MAX:
				return getMax();
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__GENERATOR:
				return getGenerator();
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__VALIDATOR:
				return getValidator();
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__CONVERTER:
				return getConverter();
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__SOURCE:
				return getSource();
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__DISTRIBUTION:
				return getDistribution();
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__FILTER:
				return getFilter();
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__NAME:
				return getName();
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__TYPE:
				return getType();
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__USE_TEMPLATE:
				return getUseTemplate();
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
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__PATTERN:
				setPattern((String)newValue);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__MIN:
				setMin((String)newValue);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__MAX:
				setMax((String)newValue);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__GENERATOR:
				setGenerator((String)newValue);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__VALIDATOR:
				setValidator((String)newValue);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__CONVERTER:
				setConverter((String)newValue);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__SOURCE:
				setSource((String)newValue);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__DISTRIBUTION:
				setDistribution((String)newValue);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__FILTER:
				setFilter((String)newValue);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__TYPE:
				setType((String)newValue);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__USE_TEMPLATE:
				setUseTemplate((String)newValue);
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
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__VALIDATOR:
				setValidator(VALIDATOR_EDEFAULT);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__CONVERTER:
				setConverter(CONVERTER_EDEFAULT);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__DISTRIBUTION:
				setDistribution(DISTRIBUTION_EDEFAULT);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__USE_TEMPLATE:
				setUseTemplate(USE_TEMPLATE_EDEFAULT);
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
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__GENERATOR:
				return GENERATOR_EDEFAULT == null ? generator != null : !GENERATOR_EDEFAULT.equals(generator);
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__VALIDATOR:
				return VALIDATOR_EDEFAULT == null ? validator != null : !VALIDATOR_EDEFAULT.equals(validator);
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__CONVERTER:
				return CONVERTER_EDEFAULT == null ? converter != null : !CONVERTER_EDEFAULT.equals(converter);
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__DISTRIBUTION:
				return DISTRIBUTION_EDEFAULT == null ? distribution != null : !DISTRIBUTION_EDEFAULT.equals(distribution);
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__USE_TEMPLATE:
				return USE_TEMPLATE_EDEFAULT == null ? useTemplate != null : !USE_TEMPLATE_EDEFAULT.equals(useTemplate);
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
		if (baseClass == IGeneratorTypedElement.class) {
			switch (derivedFeatureID) {
				case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__NAME: return IntermediatePackage.IGENERATOR_TYPED_ELEMENT__NAME;
				case IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__TYPE: return IntermediatePackage.IGENERATOR_TYPED_ELEMENT__TYPE;
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
		if (baseClass == IGeneratorTypedElement.class) {
			switch (baseFeatureID) {
				case IntermediatePackage.IGENERATOR_TYPED_ELEMENT__NAME: return IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__NAME;
				case IntermediatePackage.IGENERATOR_TYPED_ELEMENT__TYPE: return IntermediatePackage.GENERATOR_ATTRIBUTE_ELEMENT__TYPE;
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
		result.append(" (pattern: ");
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
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", useTemplate: ");
		result.append(useTemplate);
		result.append(')');
		return result.toString();
	}

} //GeneratorAttributeElementImpl
