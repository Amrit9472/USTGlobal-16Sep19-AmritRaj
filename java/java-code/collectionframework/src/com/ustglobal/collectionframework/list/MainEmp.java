package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class MainEmp {
public static void main(String[] args) {
		
		ArrayList<Emp> al = new ArrayList<Emp>();
		Emp s1 = new Emp(101,"Ankita",45.55);
		Emp s2 = new Emp(102,"Ankit",56.55);
		Emp s3 = new Emp(103,"jay",78.55);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i = 0; i<al.size(); i++) {
			Emp s = al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is"+s.name);
			System.out.println("salary is "+s.salary);
			
		}
		System.out.println("===for each======");
		for(Emp s : al){
			System.out.println(s);
		}
		
	}

}



