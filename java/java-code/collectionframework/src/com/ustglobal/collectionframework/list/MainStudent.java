package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class MainStudent {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101,"Ankita",45.55);
		Student s2 = new Student(102,"Ankit",56.55);
		Student s3 = new Student(103,"jay",78.55);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i = 0; i<al.size(); i++) {
			Student s = al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is"+s.name);
			System.out.println("perc is "+s.perc);
			
		}
		System.out.println("===for each======");
		for(Student s : al){
			System.out.println(s);
		}
		
	}

}
