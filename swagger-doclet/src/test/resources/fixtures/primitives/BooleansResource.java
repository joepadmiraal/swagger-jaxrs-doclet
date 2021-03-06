package fixtures.primitives;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @priority 1
 */
@Path("/primitives/booleans")
@SuppressWarnings("javadoc")
public class BooleansResource {

	@GET
	public boolean get() {
		return false;
	}

	@POST
	public Response create(boolean value) {
		return Response.ok().build();
	}
}
