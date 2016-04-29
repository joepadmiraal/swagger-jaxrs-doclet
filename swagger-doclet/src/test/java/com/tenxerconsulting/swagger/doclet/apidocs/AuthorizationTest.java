package com.tenxerconsulting.swagger.doclet.apidocs;

import static com.tenxerconsulting.swagger.doclet.apidocs.FixtureLoader.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.io.*;

import org.junit.*;

import com.sun.javadoc.*;
import com.tenxerconsulting.swagger.doclet.*;
import com.tenxerconsulting.swagger.doclet.model.*;
import com.tenxerconsulting.swagger.doclet.parser.*;

@Ignore
@SuppressWarnings("javadoc")
public class AuthorizationTest {
	private Recorder recorderMock;
	private DocletOptions options;
	
	@Before
	public void setup() {
		
		recorderMock = mock(Recorder.class);
		options = new DocletOptions().setRecorder(recorderMock).setIncludeSwaggerUi(false);
	}
	
	@Test
	public void testStart() throws IOException {

		final RootDoc rootDoc = RootDocLoader.fromPath("src/test/resources", "fixtures.authorization");
		new JaxRsAnnotationParser(options, rootDoc).run();

		final ApiDeclaration api = loadFixture("/fixtures/authorization/authorization.json", ApiDeclaration.class);
		verify(recorderMock).record(any(File.class), eq(api));
	}
}
