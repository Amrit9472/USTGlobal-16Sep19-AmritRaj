package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class JPQlName {
	public static void main(String[] args) {

	
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager em = emf.createEntityManager();
			
		    String jpql = "select pname from ProductInfo";
		    Query query = em.createQuery(jpql);
		    
		    List<String> productInfo = query.getResultList();
		    
		    for(String productInfo1 :productInfo) {
		    	System.out.println(productInfo1);
		    	System.out.println("************************");
		    }
		    
		    em.close();


	
	}

}
