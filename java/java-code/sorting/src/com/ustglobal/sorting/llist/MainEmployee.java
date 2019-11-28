package com.ustglobal.sorting.llist;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MainEmployee {
	public static void main(String[] args) {

		Comparator<Employee> comp = (e1,e2)->{
			if(e1.height > e2.height) {
				return 1;
			}else if (e1.height < e2.height) {
				return -1;
			}else {
				return 0;
			}
		};

		TreeSet<Employee> ts = new TreeSet<Employee>(comp);

		Employee e1 = new Employee(4,"Amrit",5.8);
		Employee e2 = new Employee(2,"Ranjit",5.9);
		Employee e3 = new Employee(3,"kriti",5.6);
		Employee e4 = new Employee(1,"guru",4.6);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println("*******useing iterator*********");
		Iterator<Employee> it = ts.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Id id "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("=========================");
		}




	}

}
