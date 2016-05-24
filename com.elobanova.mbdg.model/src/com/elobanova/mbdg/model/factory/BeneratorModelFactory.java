package com.elobanova.mbdg.model.factory;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;

import com.elobanova.mbdg.model.domain.GeneratedTypeNode;
import com.elobanova.mbdg.model.domain.GeneratorXMLModel;

import intermediate.EntitiesContainer;

public class BeneratorModelFactory implements IGeneratorModelFactory {
	private final EntitiesContainer entitiesContainer;

	public BeneratorModelFactory(EntitiesContainer entitiesContainer) {
		this.entitiesContainer = entitiesContainer;
	}

	@Override
	public List<GeneratedTypeNode> createGeneratedElements() {
		List<GeneratedTypeNode> generatedTypeNodes = new ArrayList<>();
		if (this.entitiesContainer != null) {
			//
		}
		return generatedTypeNodes;
	}

	@Override
	public String createGeneratorType(EClassifier eType) {
		// TODO
		return null;
	}

	@Override
	public GeneratorXMLModel createModel() {
		GeneratorXMLModel xmlModel = new GeneratorXMLModel();
		// TODO
		return xmlModel;
	}
}
