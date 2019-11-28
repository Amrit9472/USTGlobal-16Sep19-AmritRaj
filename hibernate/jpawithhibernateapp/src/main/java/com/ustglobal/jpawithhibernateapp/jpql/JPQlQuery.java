package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class JPQlQuery {
	public static void main(String[] args) {

		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager em = emf.createEntityManager();
			
		    String jpql = "from ProductInfo";
		    Query query = em.createQuery(jpql);
		    
		    query.getResultList();
		    List<ProductInfo> productInfo = query.getResultList();
		    
		    for(ProductInfo productInfo1 :productInfo) {
		    	System.out.println(productInfo1.getPid());
		    	System.out.println(productInfo1.getPname());
		    	System.out.println(productInfo1.getQuantity());
		    	System.out.println("************************");
		    }
		    
		    em.close();


		}catch(Exception e) {


		}


	}// end of main method

}// end of class
