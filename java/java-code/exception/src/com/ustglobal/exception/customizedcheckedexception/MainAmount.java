package com.ustglobal.exception.customizedcheckedexception;

public class MainAmount {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		ValidateAmount va = new ValidateAmount();
		try {
			va.checkAmount(20000);
			System.out.println("withdraw your cash");
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println("Main ended");
	}

}
