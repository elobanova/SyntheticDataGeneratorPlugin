package com.elobanova.mbdg.model.setup;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SetupRootNode {

	@XmlElement(name = "domain")
	private DomainModelNode domainModelNode;

	public void setDomainModel(DomainModelNode domainModelNode) {
		this.domainModelNode = domainModelNode;
	}

	public DomainModelNode getDomainModelNode() {
		return this.domainModelNode;
	}
}
