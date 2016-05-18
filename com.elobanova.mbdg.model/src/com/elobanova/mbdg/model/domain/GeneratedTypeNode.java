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
public class GeneratedTypeNode {
	@XmlAttribute
	private int count;

	@XmlAttribute
	private String type;

	@XmlAttribute
	private String consumer;

	@XmlElement(name = "id")
	private TypedNode idNode;

	@XmlElement(name = "attribute")
	private List<FieldNode> attributes;

	public int getCount() {
		return this.count;
	}

	public void setCount(int i) {
		this.count = i;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getConsumer() {
		return this.consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	public TypedNode getIdNode() {
		return idNode;
	}

	public void setIdNode(TypedNode idNode) {
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
}
