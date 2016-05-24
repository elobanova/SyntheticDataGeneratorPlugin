package com.elobanova.mbdg.model.factory;

import java.util.List;

import org.eclipse.emf.ecore.EClassifier;

import com.elobanova.mbdg.model.domain.IGeneratedType;
import com.elobanova.mbdg.model.domain.IGeneratorModel;

public interface IGeneratorModelFactory {

	/**
	 * Performs construction of a final model from an intermediate one
	 * 
	 * @return a final model
	 */
	public IGeneratorModel createModel();

	/**
	 * Creates generated type items based on the entities from an entity
	 * container
	 * 
	 * @return a collection of generated type items
	 */
	public List<? extends IGeneratedType> createGeneratedElements();

	/**
	 * Returns a string representation of a mapped type specific to generator
	 * 
	 * @param eType
	 *            a type of an Ecore intermediate model
	 * @return a string representation of a generator-specific type
	 */
	public String createGeneratorType(EClassifier eType);
}
