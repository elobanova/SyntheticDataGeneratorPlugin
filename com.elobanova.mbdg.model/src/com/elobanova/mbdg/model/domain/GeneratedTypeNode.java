package com.elobanova.mbdg.model.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * A generated type node encapsulates how many entities will be generated, where
 * the result will be flushed and other data production configurations.
 * 
 * @author elobanova
 *
 */
public class GeneratedTypeNode implements IGeneratedType {
	@XmlAttribute
	private int count;

	@XmlAttribute
	private String type;

	@XmlAttribute
	private String consumer;

	@XmlElement(name = "id")
	private FieldNode idNode;

	@XmlElement(name = "attribute")
	private List<FieldNode> attributes;

	@XmlTransient
	public int getCount() {
		return this.count;
	}

	public void setCount(int i) {
		this.count = i;
	}

	@XmlElement(name = "generate")
	private List<GeneratedTypeNode> nestedGenerateNodes;

	@XmlTransient
	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@XmlTransient
	public String getConsumer() {
		return this.consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	@XmlTransient
	public FieldNode getIdNode() {
		return idNode;
	}

	public void setIdNode(FieldNode idNode) {
		this.idNode = idNode;
	}

	@XmlTransient
	public List<FieldNode> getAttributes() {
		if (this.attributes == null) {
			this.attributes = new ArrayList<FieldNode>();
		}
		return this.attributes;
	}

	public boolean addAttribute(FieldNode attributeNode) {
		if (attributeNode.getName() != null && getAttributes().stream()
				.noneMatch(attribute -> attribute.getName() != null && attribute.getName().equals(attributeNode.getName()))) {
			return getAttributes().add(attributeNode);
		}
		return false;
	}

	@XmlTransient
	public List<GeneratedTypeNode> getNestedGeneratedTypes() {
		if (this.nestedGenerateNodes == null) {
			this.nestedGenerateNodes = new ArrayList<GeneratedTypeNode>();
		}
		return this.nestedGenerateNodes;
	}

	public boolean addNestedGeneratedType(GeneratedTypeNode generateNode) {
		if (generateNode.getType() != null && getNestedGeneratedTypes().stream()
				.noneMatch(generate -> generate.getType() != null && generate.getType().equals(generateNode.getType()))) {
			return getNestedGeneratedTypes().add(generateNode);
		}
		return false;
	}
}
