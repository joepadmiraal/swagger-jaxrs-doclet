package com.tenxerconsulting.swagger.doclet.apidocs;

import static com.tenxerconsulting.swagger.doclet.apidocs.FixtureLoader.loadFixture;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.sun.javadoc.RootDoc;
import com.tenxerconsulting.swagger.doclet.DocletOptions;
import com.tenxerconsulting.swagger.doclet.Recorder;
import com.tenxerconsulting.swagger.doclet.model.ApiDeclaration;
import com.tenxerconsulting.swagger.doclet.parser.JaxRsAnnotationParser;


@SuppressWarnings("javadoc")
public class NotesTest {

	private Recorder recorderMock;
	private DocletOptions options;

	@Before
	public void setup() {

		recorderMock = mock(Recorder.class);
		options = new DocletOptions().setRecorder(recorderMock).setIncludeSwaggerUi(false);
	}

	@Test
	public void testStart() throws IOException {

		final RootDoc rootDoc = RootDocLoader.fromPath("src/test/resources", "fixtures.notes");
		new JaxRsAnnotationParser(options, rootDoc).run();

		final ApiDeclaration api = loadFixture("/fixtures/notes/notes.json", ApiDeclaration.class);
		verify(recorderMock).record(any(File.class), eq(api));
	}

}