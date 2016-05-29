package com.elobanova.mbdg.model.ui;

import java.io.FileNotFoundException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.importer.ImporterPlugin;
import org.eclipse.emf.importer.ModelImporter;
import org.eclipse.emf.importer.ui.contribution.base.ModelImporterDetailPage;

public class ModelInitializationPage extends ModelImporterDetailPage {

	public ModelInitializationPage(ModelImporter modelImporter, String pageName) {
		super(modelImporter, pageName);
		showGenModel = false;
	}

	protected void refreshModel(Monitor monitor) throws Exception {
		Diagnostic diagnostic = null;
		try {
			diagnostic = getModelImporter().computeEPackages(monitor);
			getModelImporter().adjustEPackages(monitor);
		} catch (WrappedException wrappedException) {
			if (wrappedException.exception() instanceof FileNotFoundException) {
				setMessage(null);
				setErrorMessage(ImporterPlugin.INSTANCE.getString("_UI_SpecifyAValidModel_message")); //$NON-NLS-1$
				return;
			} else {
				throw wrappedException.exception();
			}
		}

		handleDiagnostic(diagnostic);
	}
}
