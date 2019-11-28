package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MainStudent {
	public static void main(String[] args) {

		Student s1 = new Student(2,"divya",67.89);
		Student s2 = new Student(3,"Ashu",57.89);
		Student s3 = new Student(4,"Ranjeet",77.8);
		Student s4 = new Student(5,"Gaju",87.89);
		Student s5 = new Student(1,"guru",97.89);
		Student s6 = new Student(78,"Abhi",37.8);
		Student s7 = new Student(8,"shivam",47.89);
		Student s8 = new Student(78,"Abhinav",37.8);
		Student s9 = new Student(55,"dugu",47.89);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);

		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);


		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("third",al2);
		
		ArrayList<Student> first = hm.get("second");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			System.out.println("=====================");
			
		}
		




	}

}
