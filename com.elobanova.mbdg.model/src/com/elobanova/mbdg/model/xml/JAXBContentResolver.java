package com.elobanova.mbdg.model.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBContentResolver<T> {
	@SuppressWarnings("unchecked")
	public T loadRoot(File file, Class<T> clazz) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(clazz);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return (T) unmarshaller.unmarshal(file);
	}

	public void saveRoot(T setup, File file, Class<T> clazz) throws JAXBException {
		Marshaller marshaller = initMarschaller(clazz);
		marshaller.marshal(setup, file);
	}

	public void saveWithParameters(T setup, File file, Class<T> clazz, RootProperty rootProperty) throws JAXBException {
		Marshaller marshaller = initMarschaller(clazz);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, rootProperty.getEncoding());
		marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, rootProperty.getSchemaLocation());
		marshaller.marshal(setup, file);
	}

	private Marshaller initMarschaller(Class<T> clazz) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(clazz);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		return marshaller;
	}
}
