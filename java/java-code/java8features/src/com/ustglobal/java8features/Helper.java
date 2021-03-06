package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	void displayAllStudent(ArrayList<Student> al) {

		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {

			Student s = it.next();
			System.out.println("Id is"+s.id);
			System.out.println("name is "+s.name);
			System.out.println("Percentage is"+s.percentage);
			System.out.println("============================");
		}
	}

	void displayFailedStduent(ArrayList<Student> al) {
		List<Student> l =
				al.stream().filter(student -> student.percentage < 40 ).collect(Collectors.toList());
		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {

			Student s = it.next();
			System.out.println("Id is"+s.id);
			System.out.println("name is "+s.name);
			System.out.println("Percentage is"+s.percentage);
			System.out.println("============================");
		}
	}

	void displayPassStduent(ArrayList<Student> al) {
		List<Student> l =
				al.stream().filter(student -> student.percentage > 40 ).collect(Collectors.toList());
		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {

			Student s = it.next();
			System.out.println("Id is"+s.id);
			System.out.println("name is "+s.name);
			System.out.println("Percentage is"+s.percentage);
			System.out.println("============================");
		}
	}
}


