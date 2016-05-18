package com.elobanova.mbdg.model.domain;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * A typed node represents any node with attributes name and type.
 * 
 * @author elobanova
 *
 */
public class TypedNode {
	@XmlAttribute
	private String name;

	@XmlAttribute
	private String type;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
