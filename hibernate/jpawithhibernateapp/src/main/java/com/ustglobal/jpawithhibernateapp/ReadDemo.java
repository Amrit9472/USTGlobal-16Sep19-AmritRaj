package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ProductInfo productDetail = entityManager.getReference(ProductInfo.class, 103);
//		ProductInfo productDetail = entityManager.find(ProductInfo.class, 101);
		System.out.println("ID---------"+productDetail.getPid());
		System.out.println("Name---------"+productDetail.getPname());
		System.out.println("ID---------"+productDetail.getQuantity());
		entityManager.close();
	
	}// end of the main method
	
}//end of class
