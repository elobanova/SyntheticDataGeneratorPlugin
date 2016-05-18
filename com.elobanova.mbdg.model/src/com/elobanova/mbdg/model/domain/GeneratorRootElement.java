package com.elobanova.mbdg.model.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "setup")
public class GeneratorRootElement {

	@XmlElement(name = "generate")
	private List<GeneratedTypeNode> generateNodes;

	@XmlAttribute
	protected String defaultDataset = "EN";

	@XmlAttribute
	protected String defaultLocale = "en_EN";

	@XmlAttribute
	protected String defaultLineSeparator = "\\r\\n";

	@XmlElement
	private String comment;

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@XmlTransient
	public List<GeneratedTypeNode> getGeneratedTypes() {
		if (this.generateNodes == null) {
			this.generateNodes = new ArrayList<GeneratedTypeNode>();
		}
		return this.generateNodes;
	}

	public boolean addGeneratedType(GeneratedTypeNode generateNode) {
		if (generateNode.getType() != null && getGeneratedTypes().stream()
				.noneMatch(generate -> generate.getType() != null && generate.getType().equals(generateNode.getType()))) {
			return getGeneratedTypes().add(generateNode);
		}
		return false;
	}

}
