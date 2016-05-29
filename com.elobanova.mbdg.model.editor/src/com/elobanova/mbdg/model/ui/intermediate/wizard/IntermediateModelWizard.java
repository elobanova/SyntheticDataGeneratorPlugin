package com.elobanova.mbdg.model.ui.intermediate.wizard;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.elobanova.mbdg.model.ui.AbstractFileCreationPage;
import com.elobanova.mbdg.model.ui.AbstractModelWizard;
import com.elobanova.mbdg.model.ui.ModelInitializationPage;

import intermediate.ModelRoot;
import intermediate.presentation.GeneratorIntermediateModelEditorPlugin;
import intermediate.provider.IntermediateModelProvider;

public class IntermediateModelWizard extends AbstractModelWizard {
	public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(
			Arrays.asList(GeneratorIntermediateModelEditorPlugin.INSTANCE.getString("_UI_IntermediateEditorFilenameExtensions").split("\\s*,\\s*")));

	public static final String DEFAULT_INTERMEDIATE_MODEL_FILENAME = "Intermediate"; //$NON-NLS-1$
	public static final String DEFAULT_INTERMEDIATE_MODEL_PATH = DEFAULT_INTERMEDIATE_MODEL_FILENAME + "." + FILE_EXTENSIONS.get(0); //$NON-NLS-1$

	public IntermediateModelWizard() {
		super();
	}

	protected ModelRoot createIntermediateModel() {
		List<EPackage> packages = importer.getEPackages();
		IntermediateModelProvider intermediateModelProvider = new IntermediateModelProvider(packages);
		return intermediateModelProvider.createIntermediateModel();
	}

	@Override
	protected void createModel(IFile modelFile) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
		Resource resource = resourceSet.createResource(fileURI);
		ModelRoot modelRoot = createIntermediateModel();
		if (modelRoot != null) {
			resource.getContents().add(modelRoot);
		}

		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		resource.save(options);
	}

	@Override
	protected AbstractFileCreationPage getFileCreationPage() {
		return new IntermediateModelFileCreationPage(Messages.IntermediateWizard_Intermediate_File_Creation_Page_Name, this.selection);
	}

	@Override
	protected String getDefaultFilePath() {
		return DEFAULT_INTERMEDIATE_MODEL_PATH;
	}

	@Override
	protected String getUniqueModelName(IResource selectedResource) {
		String modelFilename = DEFAULT_INTERMEDIATE_MODEL_PATH;
		for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; i++) {
			modelFilename = DEFAULT_INTERMEDIATE_MODEL_FILENAME + i + "." + FILE_EXTENSIONS.get(0); //$NON-NLS-1$
		}
		return modelFilename;
	}

	@Override
	protected ModelInitializationPage getModelInitPage() {
		return new ModelInitializationPage(this.importer, "com.elobanova.mbdg.model.ui.init.page.ID");
	}

}
