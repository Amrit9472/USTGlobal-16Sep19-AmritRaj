package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set3 {
	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(34);
		ls.add("nikitha");
		ls.add(89.9);
		ls.add(34);
		ls.add("Amrit");
		ls.add(null);
		ls.add(null);
		
		System.out.println("*********useing for each*********");
		for(Object s : ls) {
			System.out.println(s);
		}
		
		System.out.println("**********Using Iterator******");
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
		
		
	}

}
