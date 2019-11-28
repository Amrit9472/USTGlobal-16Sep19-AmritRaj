package com.ustglobal.stringClass;

public class TestA {
	public static void main(String[] args) {

		String s1 = "Anshu";
		String s2 = "shubhi";

		String s3 = new String("Anshu");
		String s4 = new String("Anshu");
		String s5 = "Anshu";

		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));

		String s6 = s1.toLowerCase();
		System.out.println(s6);
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		char c = s1.charAt(0);
		System.out.println(c);

		boolean b = s1.equalsIgnoreCase("Anshu");
		System.out.println(b);
        System.out.println("======================");
        
        StringBuffer sb1 = new StringBuffer("Amrit ");
        sb1.append("raj");
        System.out.println(sb1);
        System.out.println(s1.length());
        

	}

}
