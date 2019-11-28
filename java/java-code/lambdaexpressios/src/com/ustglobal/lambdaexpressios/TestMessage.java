package com.ustglobal.lambdaexpressios;

public class TestMessage {
	public static void main(String[] args) {
		  
		  MessageInterface mes = (message)->{
			  System.out.println("hello");
			  System.out.println(message);
			  return message;
		  };
		String message =  mes.message("hi");
		System.out.println(message);
	}

}
