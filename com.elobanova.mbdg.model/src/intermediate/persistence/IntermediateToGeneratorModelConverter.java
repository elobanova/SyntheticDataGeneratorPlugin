package intermediate.persistence;

import com.elobanova.mbdg.model.domain.IGeneratorModel;
import com.elobanova.mbdg.model.factory.BeneratorModelFactory;
import com.elobanova.mbdg.model.factory.IGeneratorModelFactory;

import intermediate.EntitiesContainer;
import intermediate.ModelRoot;

public class IntermediateToGeneratorModelConverter {
	private IGeneratorModelFactory factory;
	private final ModelRoot modelRoot;

	public IntermediateToGeneratorModelConverter(ModelRoot modelRoot) {
		this.modelRoot = modelRoot;
		if (this.modelRoot != null) {
			EntitiesContainer entitiesContainer = this.modelRoot.getEntitiesContainer();
			this.factory = new BeneratorModelFactory(entitiesContainer);
		}
	}

	public IGeneratorModel convert() {
		if (this.factory != null) {
			IGeneratorModel xmlModel = this.factory.createModel();
			return xmlModel;
		}
		return null;
	}

}
