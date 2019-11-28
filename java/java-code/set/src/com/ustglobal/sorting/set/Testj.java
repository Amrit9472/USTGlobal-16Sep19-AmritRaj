package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;


public class Testj {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(24);
		pq.add(34);
		pq.add(78);
		pq.offer(1);
		
		System.out.println("Before poll "+pq);
		System.out.println("************* using Itertor*********");
		Iterator<Integer> it = pq.iterator();
		
		
		
	}

}
