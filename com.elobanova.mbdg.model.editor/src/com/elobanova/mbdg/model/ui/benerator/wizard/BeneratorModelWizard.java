package com.elobanova.mbdg.model.ui.benerator.wizard;

import java.io.IOException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.elobanova.mbdg.model.domain.GeneratorXMLModel;
import com.elobanova.mbdg.model.ui.AbstractFileCreationPage;
import com.elobanova.mbdg.model.ui.AbstractModelWizard;
import com.elobanova.mbdg.model.ui.ModelInitializationPage;

import intermediate.ModelRoot;

public class BeneratorModelWizard extends AbstractModelWizard {
	public static final String DEFAULT_GENERATOR_MODEL_FILENAME = "benerator"; //$NON-NLS-1$
	public static final String DEFAULT_GENERATOR_MODEL_PATH = DEFAULT_GENERATOR_MODEL_FILENAME + "." + GeneratorXMLModel.FILE_EXTENSION; //$NON-NLS-1$

	public BeneratorModelWizard() {
		super();
	}

	@Override
	protected void createModel(IFile modelFile) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(importer.getFirstModelLocationURI(true), true);
		EList<EObject> contents = resource.getContents();
		if (contents != null && contents.size() > 0) {
			EObject root = contents.get(0);
			if (root instanceof ModelRoot) {
				// TODO
			}
		}
	}

	@Override
	protected AbstractFileCreationPage getFileCreationPage() {
		return new BeneratorFileCreationPage(Messages.BeneratorModelWizard_CreationPageName, this.selection);
	}

	@Override
	protected String getDefaultFilePath() {
		return DEFAULT_GENERATOR_MODEL_PATH;
	}

	@Override
	protected String getUniqueModelName(IResource selectedResource) {
		String modelFilename = DEFAULT_GENERATOR_MODEL_PATH;
		for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; i++) {
			modelFilename = DEFAULT_GENERATOR_MODEL_FILENAME + i + "." + GeneratorXMLModel.FILE_EXTENSION; //$NON-NLS-1$
		}
		return modelFilename;
	}

	@Override
	protected ModelInitializationPage getModelInitPage() {
		return new ModelInitializationPage(this.importer, Messages.BeneratorModelWizard_InitPageName) {

			@Override
			public boolean isPageComplete() {
				return !getModelImporter().getModelLocationURIs().isEmpty();
			}
		};
	}
}
