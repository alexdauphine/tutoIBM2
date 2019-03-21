package com.example;

import java.io.IOException;
import java.util.Set;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import com.model.BDDCOMMENTS;


@Path("/comments")
public class GetCommentsServlet {
	 
	EntityManager entityManager = EntityManagerUtil.getEntityManager();
		
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getInformation() throws Exception, IOException {
        //return "Hello World";
	String s;
	entityManager.getTransaction().begin();
     	@SuppressWarnings("unchecked")
      	List<BDDCOMMENTS> liste = entityManager.createQuery("from BDDCOMMENTS").getResultList();
      	for (Iterator<BDDCOMMENTS> iterator = BDDCOMMENTS.iterator(); iterator.hasNext();)
      		{
        		BDDCOMMENTS c = (BDDCOMMENTS) iterator.next();
        		//System.out.println(BDDCOMMENTS.getDate() + "\t" + BDDCOMMENTS.getComment() + "\n");
			s = BDDCOMMENTS.getDate() + "\t" + BDDCOMMENTS.getComment() + "\n";
      		}
      	entityManager.getTransaction().commit();
	return s;
	}
}
