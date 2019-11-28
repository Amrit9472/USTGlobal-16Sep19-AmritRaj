package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class MainEmp {
	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee(2 ,"amrit",30000);
		Employee e2 = new Employee(3,"shivam",50000);
		Employee e3 = new Employee(4,"Abhinav",540000);
		Employee e4 = new Employee(5,"gunnu",405000);
		Employee e5 = new Employee(5,"gunnu",405000);

		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println("**********Using Iterator******");
		Iterator<Employee> it = hs.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("salary is "+e.salary);
			System.out.println("======================");
		}
		
		
	}

}
