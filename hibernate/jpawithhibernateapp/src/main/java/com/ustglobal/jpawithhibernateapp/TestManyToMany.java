package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {
	public static void main(String[] args) {
		
		
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		

		Student student1 = new Student();
		student1.setSid(104);
		student1.setSname("Ranjeet");
	
		
		Course course = new Course();
		course.setCid(205);
		course.setCname("java");
		

		Course course1= new Course();
		course1.setCid(206);
		course1.setCname("sql");
		ArrayList<Course> alCourses = new ArrayList<Course>();
		alCourses.add(course1);
		alCourses.add(course);
		student1.setCourse(alCourses);
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			
			System.out.println("record saved");

			entityManager.persist(student1);
			entityTransaction.commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
			entityManager.close();
			
		}
		
	}

}
