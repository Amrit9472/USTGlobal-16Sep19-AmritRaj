package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Set4 {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(9);
		ts.add(39);
//		ts.add("deepika"); ClassCastException
//		ts.add(null);  nullPointerException
		
		System.out.println("*********useing for each*********");
		for(Object s : ts) {
			System.out.println(s);
		}
		
		System.out.println("**********Using Iterator******");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
		
	}

}
