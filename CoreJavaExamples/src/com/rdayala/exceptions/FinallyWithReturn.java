package com.rdayala.exceptions;

// Even though, you have a return statement in try or catch block,
// the finally block is always executed.

// Finally block overrides the value returned from either try or catch block

public class FinallyWithReturn {
	
	public static int tryReturn() {
		try {
			System.out.println("Try block returning something!");
			return 5;
		}
		finally {
			System.out.println("Finally is always executed!");
			// finally block overrides the return value
			// if you uncomment the below line, this method returns value 10
			// return 10;
		}
		
	}
	
	public static int catchReturn() {
		try {
			System.out.println("Inside try block!");
			int result = 45/0;
			System.out.println("Result : " + result);
		}
		catch(ArithmeticException e) {
			System.out.println("Caught Arithmetic Exception : " + e.getMessage());
			return 0;
		}
		finally {
			System.out.println("Finally is always executed!");
			// finally block overrides the return value
			// if you uncomment the below line, this method returns value 10
			// return 10; 
		}		
		return -1;
	}

	public static void main(String[] args) {
		
		int tryVal = tryReturn();
		System.out.println("Value returned from try block : " + tryVal);
		
		int catchVal = catchReturn();
		System.out.println("Value returned from catch block : " + catchVal);
				

	}

}
