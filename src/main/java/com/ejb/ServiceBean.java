package com.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
 
import com.model.BDDCOMMENTS;

@Stateless
public class ServiceBean{
    @PersistenceContext
    private EntityManager em;
    
    public void put(BDDCOMMENTS c){
        em.persist(c);
    }
 
    public List<BDDCOMMENTS> findAll(){
        Query query = em.createQuery("FROM BDDCOMMENTS");
        List <BDDCOMMENTS> list = query.getResultList();
        return list;
    }
}
