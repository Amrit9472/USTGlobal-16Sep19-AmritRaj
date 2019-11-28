package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MainEmployee {
	public static void main(String[] args) {

		Employee e1 = new Employee(1,"Ranjeet",25000);
		Employee e2 = new Employee(2,"Gajender",27000);
		Employee e3 = new Employee(3,"Kriti",30000);
		Employee e4 = new Employee(4,"Guru",10000);
		Employee e5 = new Employee(5,"Nishad",15000);
		Employee e6 = new Employee(6,"Amrit",26000);
		Employee e7 = new Employee(7,"Sumit",35000);
		Employee e8 = new Employee(8,"Rahul",5000);
		Employee e9 = new Employee(9,"Raju",45000);


		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);

		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);


		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("third",al2);

		ArrayList<Employee> first = hm.get("second");

		Iterator<Employee> it = first.iterator();
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Salary is "+s.salary);
			System.out.println("=====================");

		}



	}

}
