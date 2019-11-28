package com.ustglobal.sorting.llist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainMarker {
	public static void main(String[] args) {
		
		ArrayList<Marker> al = new ArrayList<Marker>();
		al.add(new Marker(50,"blue"));
		al.add(new Marker(70,"red"));
		al.add(new Marker(80,"green"));
		al.add(new Marker(40,"black"));
		
		System.out.println("Befor Sorting-------------------");
		display(al);
		SortByPrice sb = new SortByPrice();
		SortByColor sc = new SortByColor();
		Collections.sort(al,sb);
		System.out.println("after ----------------------");
		display(al);
		
		
	}
	static void display(ArrayList<Marker> a) {
		Iterator<Marker> i = a.iterator();
		while(i.hasNext()) {
			Marker m = i.next();
			System.out.println("price is "+m.price);
			System.out.println("color is "+m.color);
			System.out.println("====================");
		}
		
	}

}
