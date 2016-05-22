/**
 */
package intermediate.provider;


import intermediate.IntermediatePackage;
import intermediate.TemplateAttributeElement;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link intermediate.TemplateAttributeElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateAttributeElementItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateAttributeElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPatternPropertyDescriptor(object);
			addMinPropertyDescriptor(object);
			addMaxPropertyDescriptor(object);
			addGeneratorPropertyDescriptor(object);
			addValidatorPropertyDescriptor(object);
			addConverterPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addDistributionPropertyDescriptor(object);
			addFilterPropertyDescriptor(object);
			addTemplateNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IAttributeElement_pattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IAttributeElement_pattern_feature", "_UI_IAttributeElement_type"),
				 IntermediatePackage.Literals.IATTRIBUTE_ELEMENT__PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IAttributeElement_min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IAttributeElement_min_feature", "_UI_IAttributeElement_type"),
				 IntermediatePackage.Literals.IATTRIBUTE_ELEMENT__MIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IAttributeElement_max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IAttributeElement_max_feature", "_UI_IAttributeElement_type"),
				 IntermediatePackage.Literals.IATTRIBUTE_ELEMENT__MAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IAttributeElement_generator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IAttributeElement_generator_feature", "_UI_IAttributeElement_type"),
				 IntermediatePackage.Literals.IATTRIBUTE_ELEMENT__GENERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IAttributeElement_validator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IAttributeElement_validator_feature", "_UI_IAttributeElement_type"),
				 IntermediatePackage.Literals.IATTRIBUTE_ELEMENT__VALIDATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Converter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConverterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IAttributeElement_converter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IAttributeElement_converter_feature", "_UI_IAttributeElement_type"),
				 IntermediatePackage.Literals.IATTRIBUTE_ELEMENT__CONVERTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IAttributeElement_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IAttributeElement_source_feature", "_UI_IAttributeElement_type"),
				 IntermediatePackage.Literals.IATTRIBUTE_ELEMENT__SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistributionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IAttributeElement_distribution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IAttributeElement_distribution_feature", "_UI_IAttributeElement_type"),
				 IntermediatePackage.Literals.IATTRIBUTE_ELEMENT__DISTRIBUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IAttributeElement_filter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IAttributeElement_filter_feature", "_UI_IAttributeElement_type"),
				 IntermediatePackage.Literals.IATTRIBUTE_ELEMENT__FILTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Template Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplateNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateAttributeElement_templateName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateAttributeElement_templateName_feature", "_UI_TemplateAttributeElement_type"),
				 IntermediatePackage.Literals.TEMPLATE_ATTRIBUTE_ELEMENT__TEMPLATE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TemplateAttributeElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TemplateAttributeElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TemplateAttributeElement)object).getTemplateName();
		return label == null || label.length() == 0 ?
			getString("_UI_TemplateAttributeElement_type") :
			getString("_UI_TemplateAttributeElement_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TemplateAttributeElement.class)) {
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__PATTERN:
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__MIN:
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__MAX:
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__GENERATOR:
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__VALIDATOR:
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__CONVERTER:
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__SOURCE:
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__DISTRIBUTION:
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__FILTER:
			case IntermediatePackage.TEMPLATE_ATTRIBUTE_ELEMENT__TEMPLATE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GeneratorIntermediateModelEditPlugin.INSTANCE;
	}

}
