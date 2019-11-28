package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class MainBank {
	public static void main(String[] args) {
		
		SortByName sb = new SortByName();
		SortByPincode sp = new SortByPincode();
		SortByMir sm = new SortByMir();
		
		
		
//		TreeSet<Bank> ts = new TreeSet<Bank>(sb);
//		TreeSet<Bank> ts = new TreeSet<Bank>(sp);
		TreeSet<Bank> ts = new TreeSet<Bank>(sm);


		Bank b1 = new Bank("HDFC",577878,998989);
		Bank b2 = new Bank("SBI",5770008,998999);
		Bank b3 = new Bank("CITY",599908,999000);
		Bank b4 = new Bank("CANARA",57007,922298);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		System.out.println("**********Using Iterator******");
		Iterator <Bank>it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Name is"+b.name);
			System.out.println("Pincode is "+b.pincode);
			System.out.println("MICR is "+b.micr);
			System.out.println("======================");
		}


		

		
		
	}

}
