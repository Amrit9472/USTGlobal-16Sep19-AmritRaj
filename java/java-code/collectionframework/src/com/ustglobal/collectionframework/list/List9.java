package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class List9 {
	public static void main(String[] args) {
		Stack li = new Stack();
		li.add(12);
		li.add(34.5);
		li.add("more");
		li.add(true);
		li.add(null);
		
		System.out.println("=====Using for Loop=========");
		for(int i = 0 ; i < li.size(); i++) {
			Object o = li.get(i);
			System.out.println(o);
		}
		
		System.out.println("=======Using Iterator=======");
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("======Using list iterator========");
		 ListIterator l = li.listIterator();
		 while(l.hasNext()) {
			 Object o2 = l.next();
			 System.out.println(o2);
			 
			 
			 
		 }
	}

}
