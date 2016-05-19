package com.elobanova.mbdg.model.xml;

public class RootProperty {
	private String encoding;
	private String schemaLocation;

	private RootProperty(PropertyBuilder propertyBuilder) {
		this.encoding = propertyBuilder.nestedEncoding;
		this.schemaLocation = propertyBuilder.nestedSchemaLocation;
	}

	public String getEncoding() {
		return this.encoding;
	}

	public String getSchemaLocation() {
		return this.schemaLocation;
	}

	public static class PropertyBuilder {
		private String nestedEncoding;
		private String nestedSchemaLocation;

		public PropertyBuilder setEncoding(String newEncoding) {
			this.nestedEncoding = newEncoding;
			return this;
		}

		public PropertyBuilder setSchemaLocation(String newSchemaLocation) {
			this.nestedSchemaLocation = newSchemaLocation;
			return this;
		}

		public RootProperty build() {
			return new RootProperty(this);
		}

	}

}
