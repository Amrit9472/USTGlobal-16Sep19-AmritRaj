package com.ustglobal.exception.customizeduncheckedexception;

public class MainCustom {
	public static void main(String[] args) {
		System.out.println("main stared");

		Validator v = new Validator();
		try {
			v.verify(20);
		}catch (InvalidAgeException ie) {
		 System.out.println("exception occured");
		}
		v.verify(13);
		System.out.println("main ended");
	}
}
