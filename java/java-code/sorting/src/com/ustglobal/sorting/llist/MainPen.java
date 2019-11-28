package com.ustglobal.sorting.llist;

import java.util.ArrayList;
import java.util.Iterator;

public class MainPen {
	public static void main(String[] args) {
		ArrayList<Pen> pp = new ArrayList<Pen>();
		Pen p1 = new Pen(5 ,"cello");
		Pen p2 = new Pen( 200,"parker");
		Pen p3 = new Pen(140,"writemeter");
		Pen p4 = new Pen(20 ,"montex");
		
		pp.add(p1);
		pp.add(p2);
		pp.add(p3);
		pp.add(p4);
		pp.add(100,"ball");
		
		

	}
	static void displayPenDetails(ArrayList<Pen>l) {
		Iterator<Pen> i = l.iterator();
		while (i.hasNext()) {
			Pen p = i.next();
			System.out.println("Price of pen"+);
		}
		
		
	}

}
