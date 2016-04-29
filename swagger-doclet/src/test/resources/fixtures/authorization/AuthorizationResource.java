package fixtures.authorization;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import com.tenxerconsulting.swagger.doclet.Restricted;


/**
 * The NotesResource represents a jaxrs resource for testing authorization information
 * @version $Id$
 * @author conor.roche
 */
@Restricted("EDITOR")
@Path("/authorization")
public class AuthorizationResource {
	
	/**
	 * Summary.
	 * 
	 * Notes.
	 */
	@GET
	@Restricted("SUPERVISOR")
	public void supervisorMethod() {
		
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
}