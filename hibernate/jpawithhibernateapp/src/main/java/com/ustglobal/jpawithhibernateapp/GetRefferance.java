package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class GetRefferance {
	public static void main(String[] args) {

		EntityTransaction entityTransaction = null;
		EntityManager entityManager =null;
		
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			ProductInfo productDetail = entityManager.find(ProductInfo.class, 101);
			System.out.println(productDetail.getPid());
			System.out.println(productDetail.getPname());
			System.out.println(productDetail.getQuantity());

	
		entityManager.close();




	}
}