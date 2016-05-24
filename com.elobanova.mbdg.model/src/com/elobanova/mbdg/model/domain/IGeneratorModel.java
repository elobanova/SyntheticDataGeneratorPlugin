package com.elobanova.mbdg.model.domain;

import java.io.File;

public interface IGeneratorModel {

	/**
	 * Specifies a file where the final model will be stored.
	 * 
	 * @param finalFile
	 *            a file for flushing a final model
	 */
	public void setFinalFile(File finalFile);

	/**
	 * Performs persistence for a final model.
	 */
	void save();
}
