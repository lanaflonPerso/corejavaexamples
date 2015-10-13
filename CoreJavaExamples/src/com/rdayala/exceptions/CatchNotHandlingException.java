package com.rdayala.exceptions;

// Catch block is not handling the exception thrown in try block.
// So finally block is executed and the exception is passed to main thread.
// Note: The statements after finally block are not executed.

public class CatchNotHandlingException {

	public static void main(String args[]) {
	
		try {
			System.out.println("First statement of try block");
			int num = 45 / 0;
			System.out.println(num);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} 
		finally {
			System.out.println("finally block");
		}
		
		System.out.println("Out of try-catch-finally block"); // this is not executed
	}
}
