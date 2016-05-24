package intermediate.persistence;

import java.io.File;

import com.elobanova.mbdg.model.domain.IGeneratorModel;

public class PersistenceHandler {
	private IntermediateToGeneratorModelConverter converter;

	public PersistenceHandler(IntermediateToGeneratorModelConverter converter) {
		this.converter = converter;
	}

	public void save(File generatorFile) {
		if (this.converter != null) {
			IGeneratorModel generatorModel = this.converter.convert();

			if (generatorModel != null) {
				generatorModel.setFinalFile(generatorFile);
				generatorModel.save();
			}
		}
	}
}
