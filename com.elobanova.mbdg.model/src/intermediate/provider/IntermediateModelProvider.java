package intermediate.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import intermediate.EntitiesContainer;
import intermediate.ModelRoot;
import intermediate.impl.IntermediateFactoryImpl;

public class IntermediateModelProvider {
	private List<EPackage> packages;
	private EntitiesContainer entitiesContainer;

	public IntermediateModelProvider(List<EPackage> packages) {
		this.packages = new ArrayList<>(packages);
		this.entitiesContainer = IntermediateFactoryImpl.eINSTANCE.createEntitiesContainer();
	}

	public ModelRoot createIntermediateModel() {
		if (packages != null) {
			packages.stream().forEach(packageItem -> createIntermediateNodes(packageItem));
		}

		ModelRoot modelRoot = IntermediateFactoryImpl.eINSTANCE.createModelRoot();
		modelRoot.setEntitiesContainer(entitiesContainer);
		return modelRoot;
	}

	private void createIntermediateNodes(EPackage packageItem) {
		// TODO
	}
}