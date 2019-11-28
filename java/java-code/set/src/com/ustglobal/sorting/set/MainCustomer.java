package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MainCustomer {
	public static void main(String[] args) {
		
		SortByNameC sb = new SortByNameC();
		
		TreeSet<Customer> ts = new TreeSet<Customer>(sb);

		
		HashSet<Customer> hs = new HashSet<Customer>();
		Customer c1 = new Customer("Amrit",1,250000);
		Customer c2 = new Customer("Kiriti",2,150000);
		Customer c3 = new Customer("Ranjit",3,350000);
		Customer c4 = new Customer("Gajenter",4,250000);
		
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);
		
		System.out.println("**********Using Iterator******");
		Iterator <Customer> i = hs.iterator();
		while(i.hasNext()) {
			Customer c = i.next();
			System.out.println("Name is "+c.name);
			System.out.println("Pincode is "+c.id);
			System.out.println("MICR is "+c.salary);
			System.out.println("======================");
		}


		
	}

}
