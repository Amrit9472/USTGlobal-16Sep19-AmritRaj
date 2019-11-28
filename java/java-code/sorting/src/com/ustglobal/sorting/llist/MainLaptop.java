package com.ustglobal.sorting.llist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MainLaptop {
	public static void main(String[] args) {
		
		LinkedList<Laptop> ll = new LinkedList<Laptop>();
		Laptop lp1 = new Laptop(25000, 4, "HP");
		Laptop lp2 = new Laptop(35000, 6, "Dell");
		Laptop lp3 = new Laptop(100000, 14, "Mac");
		Laptop lp4 = new Laptop(50000, 8, "Asus");
		
		ll.add(lp1);
		ll.add(lp2);
		ll.add(lp3);
		ll.add(lp4);
		ll.add(new Laptop(20000,2,"acer"));
		
		System.out.println("Befor sorting----------->");
		displayLaptopDetails(ll);
		
		System.out.println("After sorting----------->");
		Collections.sort(ll);
		displayLaptopDetails(ll);
	}
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator <Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("Brand is "+lp.name);
			System.out.println("price is "+lp.price);
			System.out.println("Ram is "+lp.ram);
			System.out.println("===================");
		}
		
		
		


		
		
	}

}
