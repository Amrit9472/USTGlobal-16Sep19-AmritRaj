package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class InsertDemo {
	public static void main(String[] args) {
		ProductInfo productInfo = new ProductInfo();
		productInfo.setPid(102);
		productInfo.setPname("books");
		productInfo.setQuantity(12);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(productInfo);
		System.out.println("Record saved");
		entityTransaction.commit();
		entityManager.close();
		
	}// end of main method

}//end of class
