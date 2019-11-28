package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Scanner classs");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("Name is " +name);
		
		System.out.println("enter your salary");
		double sal = sc.nextDouble();
		System.out.println("Salary is " +sal);
		
		System.out.println("Are you male?");
		boolean a = sc.nextBoolean();
		System.out.println(a);
	}

}
