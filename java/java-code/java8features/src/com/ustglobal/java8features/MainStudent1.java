package com.ustglobal.java8features;

import java.util.ArrayList;

public class MainStudent1 {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(5,"vikram",56.7));
		al.add(new Student(3,"rajan",66.7));
		al.add(new Student(6,"jay",36.7));
		al.add(new Student(2,"arun",35.7));
		al.add(new Student(1,"asshi",76.7));
		
		Helper h = new Helper();
//		h.displayAllStudent(al);
//		h.displayFailedStduent(l);
		h.displayPassStduent(al);
		
		
	}

}
