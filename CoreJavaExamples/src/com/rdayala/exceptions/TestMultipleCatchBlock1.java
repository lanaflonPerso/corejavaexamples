package com.rdayala.exceptions;

// Uncomment the code - you will see compiler errors
// compiler errors - All catch blocks must be ordered from most specific to most general i.e. 
// catch for ArithmeticException must come before catch for Exception

// When catching exceptions, the more specific exceptions must be listed before 
// the more general (the subclasses must be caught before the superclasses)

class TestMultipleCatchBlock1 {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (Exception e) {
			System.out.println("Inside exception!! Common task completed");
		} 
//		catch (ArithmeticException e) {
//			System.out.println("task1 is completed");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("task 2 completed");
//		}

		System.out.println("rest of the code...");
	}
}
