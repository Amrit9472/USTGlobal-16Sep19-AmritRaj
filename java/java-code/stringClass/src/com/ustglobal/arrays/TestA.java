package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums = new int [5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i = 0; i <nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("For each loops");
		
		for (int i : nums) {
			
			System.out.println(i);
		}
		
		System.out.println("===========================");
		char [] ch = {'a','b','c','d'};
		for(int i = 0 ;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println("================================");
		for(int c : ch) {
			System.out.println(c);
		}
		System.out.println("==============================");
		boolean [] b = {true,false,true,false,true,};
		
		double [] d = {2.3,4.5,5.5,6.5,7.8};
		for(int i = 0;i <d.length;i++) {
			System.out.println(d[i]);
		}
		for(double e :d ) {
			
			System.out.println(e+"");
		}
		
		byte [] e = {1,2,3,4,5};
		for(int i = 0;i<e.length;i++) {
			System.out.println(e[i]);
		}
		
		for(byte b1 : e) {
			System.out.println(b1+" ");
		}
		
		String [] names= {"amrit","kavya","divya","priya"};
		for(int i =0; i<names.length;i++ )
		{
			System.out.println(names[i]);
		}
	}

}
