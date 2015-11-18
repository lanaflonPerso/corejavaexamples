package com.rdayala.exceptions;

// User-defined exception class is so common that it will be used in every project.

/*
 1. Extend the Exception class.
 2. Provide parameterize constructor
 3. Override toString() method.
 */

class MyException extends Exception {

	String msg;

	MyException() {

	}

	MyException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String toString() {
		return this.msg;
	}

}

public class UserDefinedExceptionExample {
	
	public static void main(String[] args) throws Exception {

		try {
			/**
			 * Throw user defined exception with custom message
			 */
			throw new MyException(
					"Custom Message From User-defined Exception Class!");

		} catch (Exception e) {
			System.out.println(e);
			//e.printStackTrace();
		}
	}
}
