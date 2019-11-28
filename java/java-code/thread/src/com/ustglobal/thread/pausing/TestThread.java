package com.ustglobal.thread.pausing;

public class TestThread {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		MyThread my = new MyThread();
		my.start();
		for(int i=0 ; i < 10; i++) {
			 System.out.println("child thread");
		}
		System.out.println("main end");
	}

}
