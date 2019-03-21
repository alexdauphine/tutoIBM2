package com.example;

import java.io.IOException;
import java.util.Set;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
 
import com.model.BDDCOMMENTS;


@Path("/comments")
public class GetCommentsServlet {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getInformation() throws Exception, IOException {
        return "Hello World";
	}
}
