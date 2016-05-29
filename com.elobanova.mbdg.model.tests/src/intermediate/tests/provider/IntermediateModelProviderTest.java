package intermediate.tests.provider;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.elobanova.mbdg.model.test.util.ResourceHandler;
import com.elobanova.mbdg.model.test.util.XMLEqualizer;

import intermediate.ModelRoot;
import intermediate.presentation.GeneratorIntermediateModelEditorPlugin;
import intermediate.provider.IntermediateModelProvider;

public class IntermediateModelProviderTest {
	private IntermediateModelProvider intermediateModelProvider;
	public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(
			Arrays.asList(GeneratorIntermediateModelEditorPlugin.INSTANCE.getString("_UI_IntermediateEditorFilenameExtensions").split("\\s*,\\s*")));

	@Before
	public void setUp() throws IOException, URISyntaxException {
		List<EPackage> packages = ResourceHandler.getEcoreResourcePackages("resources/bankmt.ecore");
		this.intermediateModelProvider = new IntermediateModelProvider(packages);
	}

	@Test
	public void testCreateIntermediateModel() throws IOException, URISyntaxException, SAXException, ParserConfigurationException {
		ModelRoot actualModelRoot = intermediateModelProvider.createIntermediateModel();

		ResourceSet resourceSet = new ResourceSetImpl();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		File actualFile = root.getRawLocation().append("intermodel").addFileExtension(FILE_EXTENSIONS.get(0)).toFile();
		actualFile.createNewFile();
		URI fileURI = URI.createFileURI(actualFile.getAbsolutePath());
		Resource resource = resourceSet.createResource(fileURI);
		resource.getContents().add(actualModelRoot);

		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		resource.save(options);

		File expectedFile = new File(ResourceHandler.getResolvedUri("resources/Intermediate.intermediate"));
		assertTrue(XMLEqualizer.equals(expectedFile, actualFile));
	}
}
