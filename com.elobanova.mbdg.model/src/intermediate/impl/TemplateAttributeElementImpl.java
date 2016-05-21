/**
 */
package intermediate.impl;

import intermediate.IntermediatePackage;
import intermediate.TemplateAttributeElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Attribute Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link intermediate.impl.TemplateAttributeElementImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link intermediate.impl.TemplateAttributeElementImpl#getMin <em>Min</em>}</li>
 *   <li>{@link intermediate.impl.TemplateAttributeElementImpl#getMax <em>Max</em>}</li>
 *   <li>{@link intermediate.impl.TemplateAttributeElementImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link intermediate.impl.TemplateAttributeElementImpl#getValidator <em>Validator</em>}</li>
 *   <li>{@link intermediate.impl.TemplateAttributeElementImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link intermediate.impl.TemplateAttributeElementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link intermediate.impl.TemplateAttributeElementImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link intermediate.impl.TemplateAttributeElementImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link intermediate.impl.TemplateAttributeElementImpl#getTemplateName <em>Template Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateAttributeElementImpl extends MinimalEObjectImpl.Container implements TemplateAttributeElement {
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
	 * The default value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateName()
	 * @generated
	 * @ordered
	 */
	protected String templateName = TEMPLATE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateAttributeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.TEMPLATE_ATTRIBUTE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__PATTERN, oldPattern, pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__MIN, oldMin, min));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__MAX, oldMax, max));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__GENERATOR, oldGenerator, generator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__VALIDATOR, oldValidator, validator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__CONVERTER, oldConverter, converter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__DISTRIBUTION, oldDistribution, distribution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateName(String newTemplateName) {
		String oldTemplateName = templateName;
		templateName = newTemplateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__TEMPLATE_NAME, oldTemplateName, templateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__PATTERN:
				return getPattern();
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__MIN:
				return getMin();
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__MAX:
				return getMax();
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__GENERATOR:
				return getGenerator();
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__VALIDATOR:
				return getValidator();
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__CONVERTER:
				return getConverter();
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__SOURCE:
				return getSource();
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__DISTRIBUTION:
				return getDistribution();
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__FILTER:
				return getFilter();
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__TEMPLATE_NAME:
				return getTemplateName();
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
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__PATTERN:
				setPattern((String)newValue);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__MIN:
				setMin((String)newValue);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__MAX:
				setMax((String)newValue);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__GENERATOR:
				setGenerator((String)newValue);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__VALIDATOR:
				setValidator((String)newValue);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__CONVERTER:
				setConverter((String)newValue);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__SOURCE:
				setSource((String)newValue);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__DISTRIBUTION:
				setDistribution((String)newValue);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__FILTER:
				setFilter((String)newValue);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__TEMPLATE_NAME:
				setTemplateName((String)newValue);
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
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__VALIDATOR:
				setValidator(VALIDATOR_EDEFAULT);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__CONVERTER:
				setConverter(CONVERTER_EDEFAULT);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__DISTRIBUTION:
				setDistribution(DISTRIBUTION_EDEFAULT);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__TEMPLATE_NAME:
				setTemplateName(TEMPLATE_NAME_EDEFAULT);
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
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__GENERATOR:
				return GENERATOR_EDEFAULT == null ? generator != null : !GENERATOR_EDEFAULT.equals(generator);
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__VALIDATOR:
				return VALIDATOR_EDEFAULT == null ? validator != null : !VALIDATOR_EDEFAULT.equals(validator);
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__CONVERTER:
				return CONVERTER_EDEFAULT == null ? converter != null : !CONVERTER_EDEFAULT.equals(converter);
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__DISTRIBUTION:
				return DISTRIBUTION_EDEFAULT == null ? distribution != null : !DISTRIBUTION_EDEFAULT.equals(distribution);
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__TEMPLATE_NAME:
				return TEMPLATE_NAME_EDEFAULT == null ? templateName != null : !TEMPLATE_NAME_EDEFAULT.equals(templateName);
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
		result.append(", templateName: ");
		result.append(templateName);
		result.append(')');
		return result.toString();
	}

} //TemplateAttributeElementImpl
