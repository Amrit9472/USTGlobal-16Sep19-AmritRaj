package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLUpdateDemo {
	public static void main(String[] args) {
		EntityManager em=null;
		EntityTransaction  et=null;

		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();

			String jpql = " update ProductInfo set pname='watch'where pid =101";
			Query query = em.createQuery(jpql);

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
