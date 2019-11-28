package com.ustglobal.sorting.llist;

import java.util.LinkedList;

public class LinkListMethod {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(25);
		
		Integer peekElement = l.peek();
		System.out.println("Peek Element "+peekElement);
	    Integer pollFirstElement = l.pollFirst();
	    System.out.println("Poll Frist Element "+pollFirstElement);
	    Integer pollLastElement = l.pollLast();
	    System.out.println("Poll Last Element "+pollLastElement);
	    System.out.println("After poll ---------->"+l);
	    
	    l.push(12);
	    System.out.println("After Push-------->"+l);
	    Integer p = l.pop();
	    System.out.println(p);
	    System.out.println("After pop--------->"+l);
	    
	    
	    
	}

}
