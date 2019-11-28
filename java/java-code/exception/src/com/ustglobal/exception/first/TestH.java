package com.ustglobal.exception.first;

public class TestH {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		Paytm p = new Paytm();
		try {
		p.book();
		}catch(ArithmeticException ae) {
			
			System.out.println("Exception caught in main");
		}finally {
			System.out.println("excuting finally");
		}
		System.out.println("main ended");
	}

}
