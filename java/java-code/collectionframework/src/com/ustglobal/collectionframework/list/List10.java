package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class List10 {
	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.5);
		al.add(23.5);
		al.add(87.5);
		al.add(12.3);
		al.add(34.5);
		al.add(null);
		al.add(null);

		System.out.println(al);
		al.add(2,54.6);
		System.out.println("After add in 2nd index "+al);
		al.remove(0);
		System.out.println("After removid 0th index "+al);
		al.remove(null);
		System.out.println("After removid null "+al);
		Double val = al.get(4);
		System.out.println("Object at 4th index "+val);
		al.set(2, 77.6);
		System.out.println("Ater replacing 2nd index "+al);
		al.clear();
		System.out.println("After clear method "+al);
		al.contains(54.6);


		List<Double> all = new ArrayList<>();
		all.add(12.3);
		all.add(23.4);
		all.add(34.5);

		al.addAll(all);
		System.out.println("After add all"+al);

		boolean contain = al.containsAll(all);
		System.out.println("contain All "+contain);

		boolean res = al.removeAll(all);
		System.out.println("Remove all the ele "+res);
		System.out.println("after remove "+al);









	}
}
