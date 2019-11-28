package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicQuery {
	public static void main(String[] args) {
		EntityManager em=null;
		EntityTransaction  et=null;

		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();

			String jpql = " update ProductInfo set pname = :name where pid = :id";
			Query query = em.createQuery(jpql);

			query.setParameter("name", "Book");
			query.setParameter("id", 102);
			
			int result = query.executeUpdate();


			System.out.println(result);
			et.commit();

		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}finally {
			em.close();
		}


		em.close();





	}

	}
	


