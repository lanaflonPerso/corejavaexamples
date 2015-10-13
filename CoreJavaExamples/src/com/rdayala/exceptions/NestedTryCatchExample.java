package com.rdayala.exceptions;

// If nested try-catch block is not handling the exception correctly, the control 
// will jump to parent try-catch block.

// Whenever the child try-catch blocks are not handling any exception, 
// the control comes back to the parent try-catch block. 
// If the exception is not handled there also, then the program will terminate abruptly.

public class NestedTryCatchExample {
	
	public static void main(String args[]) {
	
		// Parent try block
		try {
		
			// Child try block1
			try {
				System.out.println("Inside nested block1");
				int b = 45 / 0;
				System.out.println(b);
			} 
			catch (ArithmeticException e1) {
				System.out.println("Exception caught in nested block: e1");
			}
			
			
			// Child try block2 - no appropriate catch blocks, so it will go to parent catch block	
			try {
				System.out.println("Inside nested block2");
				int b = 45 / 0;
				System.out.println(b);
			} 
			catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Exception: e2");
			}
			
			System.out.println("Just other statement"); // this is not executed
		} 
		catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Inside parent try catch block");
		} 
		catch (ArithmeticException e3) {
			System.out.println("Exception caught in parent try catch block");
			System.out.println("Arithmetic Exception e3");		
		} 
		catch (Exception e5) {
			System.out.println("Exception");
			System.out.println("Inside parent try catch block");
		}
		
		System.out.println("Next statement..");
	}
}