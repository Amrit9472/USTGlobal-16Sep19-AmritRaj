package com.ustglobal.maps;

import java.util.Hashtable;

public class MapHashTable {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(500,"ajay");
		ht.put(102,"vijay");
		ht.put(103,"sonu");
		ht.put(25,"jay");
		ht.put(105,"monu");
		ht.put(106,"sriram");
//		ht.put(null,"dugu");  NullPointException
//		ht.put(108, null); NullPointerException
		
		System.out.println("Data"+ht);
		
	}

}
