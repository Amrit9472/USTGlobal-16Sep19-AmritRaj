package com.ustglobal.thread.derfining;

public class TestThread {
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		MyThread t1 = new MyThread();
		/*
		 * dont call run() method ,it behaves like normal program
		 * all code will be excuted inside main thread only
		 */
		//t1.run
		
		t1.start();
		//t1.start(); IllegalThreadStateException
		
		
		for(int i = 0; i<10; i++) {
			System.out.println("main thread");
		}
		System.out.println("main ended");
	}

}
