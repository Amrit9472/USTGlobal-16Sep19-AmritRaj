package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ustglobal.jpawithhibernateapp.onetomany.Pencil;
import com.ustglobal.jpawithhibernateapp.onetomany.PencilBox;

public class TestManyToOne {
	public static void main(String[] args) {
		PencilBox peBox = new PencilBox();
		peBox.setBid(1201);
		peBox.setBname("cello");
		
		Pencil p = new Pencil();
		p.setPid(1);
		p.setColor("yellow");
		p.setPencilBox(peBox);
		
		Pencil p1 = new Pencil();
		p1.setPid(2);
		p1.setColor("red");
		p1.setPencilBox(peBox);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			
			entityManager.persist(p);
			entityManager.persist(p1);
			entityTransaction.commit();
			
			System.out.println("record saved");
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
			entityManager.close();
			
		}
				
	}

}
