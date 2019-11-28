package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class List12 {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("jay");
		al.add("ranjeet");
		al.add("gajender");
		al.add("kiriti");
		
		System.out.println("Befor sort----------->"+al);
		Collections.sort(al);
		System.out.println("After sorting----------"+al);
		
		
	}

}
