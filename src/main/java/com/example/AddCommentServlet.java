package com.example;

import java.io.IOException;
import java.util.Set;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/comments")
public class AddCommentServlet {
	@POST
	//@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public String getInformation() throws Exception, IOException {
        return "ok";
	}
}
