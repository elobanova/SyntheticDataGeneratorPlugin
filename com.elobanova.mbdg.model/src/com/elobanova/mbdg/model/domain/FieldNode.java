package com.elobanova.mbdg.model.domain;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * A filed node defines the information for an entity's attribute to be
 * generated.
 * 
 * @author elobanova
 *
 */
public class FieldNode extends TypedNode {

	@XmlAttribute
	private String pattern;

	@XmlAttribute
	private String distribution;

	@XmlAttribute
	private String generator;

	@XmlAttribute
	private String validator;

	@XmlAttribute
	private String converter;

	@XmlAttribute
	private String source;

	@XmlAttribute
	private String min;

	@XmlAttribute
	private String max;

	public String getDistribution() {
		return this.distribution;
	}

	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}

	public String getGenerator() {
		return this.generator;
	}

	public void setGenerator(String generator) {
		this.generator = generator;
	}

	public String getValidator() {
		return this.validator;
	}

	public void setValidator(String validator) {
		this.validator = validator;
	}

	public String getConverter() {
		return this.converter;
	}

	public void setConverter(String converter) {
		this.converter = converter;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getPattern() {
		return this.pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getMin() {
		return this.min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getMax() {
		return this.max;
	}

	public void setMax(String max) {
		this.max = max;
	}
}
