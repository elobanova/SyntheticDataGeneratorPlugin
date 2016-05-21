package com.elobanova.mbdg.model.test.util;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XMLEqualizer {

	public static boolean equals(File expectedFile, File actualFile) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		documentBuilderFactory.setNamespaceAware(false);
		documentBuilderFactory.setCoalescing(true);
		documentBuilderFactory.setIgnoringElementContentWhitespace(true);
		documentBuilderFactory.setIgnoringComments(true);
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document expectedDocument = parse(expectedFile, documentBuilder);
		Document actualDocument = parse(actualFile, documentBuilder);
		return expectedDocument.isEqualNode(actualDocument);
	}

	private static Document parse(File expectedFile, DocumentBuilder documentBuilder) throws SAXException, IOException {
		Document document = documentBuilder.parse(expectedFile);
		document.normalizeDocument();
		return document;
	}
}
