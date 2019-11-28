package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {

		int nums[] = {10,20,30,40};
		//		System.out.println(nums[10]); Array index out of bound
		receive(nums);
		int[] values = getArray();
		
		for(int val : values) {
			System.out.println(val);
		}

	}
	static void receive(int[]numbers) {

		for(int num : numbers) {
			System.out.println(num);
		}
	}
	static int[ ]getArray(){
		int[] values = {20,30,40,50};
		return values;
		
		String jobs[]= {"hr","cleark","developer","tester","mger"};
		
		receive(jobs);
		
		static void receive(String job[]) {
			for(int i = 0;i<job.length;i++) {
				System.out.println(job[i]);
			}
		}
	}
	
	
	

}
