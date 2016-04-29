package fixtures.notes;
import javax.ws.rs.*;
import javax.ws.rs.core.*;


/**
 * The NotesResource represents a jaxrs resource for testing custom response models
 * @version $Id$
 * @author conor.roche
 */
@Path("/notes")
public class NotesResource {
	
	/**
	 * Summary.
	 * 
	 * Notes with linebreak
	 * data after line break.
	 */
	@GET
	public void notesWithUnintendedLineBreak() {
		
	}
	
	/**
	 * Summary.
	 *
	 * First paragraph.
	 *
	 * SecondParagraph.
	 */
	@GET
	public void notesWithIntendedLineBreak() {
		
	}

	/**
	 * Summary.
	 *
	 * First paragraph.<br>
	 * SecondParagraph.
	 */
	@GET
	public void notesWithBr() {
		
	}
}