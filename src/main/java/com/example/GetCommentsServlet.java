package com.example;

import java.io.IOException;
import java.util.Set;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.model.BDDCOMMENTS;


@Path("/comments")
public class GetCommentsServlet {
	 
	final EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("test");
	final EntityManager em = emFactory.createEntityManager();
		
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getInformation() throws Exception, IOException {
        //return "Hello World";
	String s;
	em.getTransaction().begin();
     	@SuppressWarnings("unchecked")
      	List<BDDCOMMENTS> liste = em.createQuery("from BDDCOMMENTS").getResultList();
      	for (Iterator<BDDCOMMENTS> iterator = liste.iterator(); iterator.hasNext();)
      		{
        		BDDCOMMENTS c = (BDDCOMMENTS) iterator.next();
        		//System.out.println(c.getDate() + "\t" + c.getComment() + "\n");
			s = c.getDate() + "\t" + c.getComment() + "\n";
      		}
      	em.getTransaction().commit();
	return s;
	}
}
