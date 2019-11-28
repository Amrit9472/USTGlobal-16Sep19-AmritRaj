package com.ustglobal.exception.customizeduncheckedexception;

public class InvalidAgeException extends RuntimeException {
	String message = "Invalid age below 18year not allowed";

	@Override
	public String getMessage() {
		return message;

	}
	public InvalidAgeException() {

	}
	public InvalidAgeException(String message) {
		this.message =message;

	}



}
