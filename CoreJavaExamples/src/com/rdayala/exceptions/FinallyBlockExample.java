package com.rdayala.exceptions;

// Java finally block is always executed whether exception is handled or not.
// Finally block is used to execute important code such as closing connection, stream etc.

// If you don't handle exception, before terminating the program, JVM executes finally block(if any).

// Even, if try or catch block has a return statement, even then finally block is executed.
// finally block overrides return values in try or catch block.

// Note: The finally block will not be executed if program exits
// (either by calling System.exit() or by causing a fatal error that causes the process to abort). 

public class FinallyBlockExample {

	public static void main(String[] args) {

		// case 1: no exception case
		try {
			int data = 25 / 5;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("no exception occurred!");
			System.out.println("finally block is always executed");
		}

		// case 2: exception occurred and handled

		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("exception occurred and handled");
			System.out.println("finally block is always executed");
		}
		
		// case 3: exception occurred, but not handled

		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("exception occurred and not handled");
			System.out.println("finally block is always executed");
		}		

	}

}
