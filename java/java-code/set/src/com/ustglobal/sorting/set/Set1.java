package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;


public class Set1 {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(45);
		hs.add("Amrit");
		hs.add(56.7);
		
		System.out.println("*********useing for each*********");
		for(Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println("**********Using Iterator******");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
		
		
	}

}
