package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEmployee {
	public static void main(String[] args) {

		TreeSet<Employee> ts = new TreeSet<>();
		Employee e1 = new Employee(2 ,"amrit",30000);
		Employee e2 = new Employee(3,"shivam",50000);
		Employee e3 = new Employee(4,"Abhinav",540000);
		Employee e4 = new Employee(5,"gunnu",405000);
		Employee e5 = new Employee(5,"gunnu",405000);


		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);

		System.out.println("**********Using Iterator******");
		Iterator<Employee> it = ts.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("salary is "+e.salary);
			System.out.println("======================");
		}
	}
}
