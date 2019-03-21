package com.example;

import java.io.IOException;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/comments")
public class GetCommentsServlet {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getInformation() throws Exception, IOException {
        return "Hello World";
	}
}
