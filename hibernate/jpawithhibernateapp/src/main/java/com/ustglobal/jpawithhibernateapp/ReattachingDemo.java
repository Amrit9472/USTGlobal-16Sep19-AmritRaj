package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class ReattachingDemo {
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			ProductInfo productInfo = entityManager.find(ProductInfo.class, 102);
			System.out.println(entityManager.contains(productInfo));
			entityManager.detach(productInfo);
			System.out.println(entityManager.contains(productInfo));
			ProductInfo productInfo2 = entityManager.merge(productInfo);
			productInfo2.setPname("KEY");
			System.out.println("update Record");
			entityTransaction.commit();
			
		}catch(Exception e){
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		entityManager.close();
		
		
		
	}//end of the main method

}//end of class
