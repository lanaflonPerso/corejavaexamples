package com.rdayala.exceptions;

import java.io.IOException;

// Scenario : Superclass method DOES NOT DECLARE AN EXCEPTOIN

// Rule 1: If the superclass method does not declare an exception, subclass overridden method 
// cannot declare the checked exception.

// Rule 2: If the superclass method does not declare an exception, subclass overridden method 
// can declare unchecked exception. 

class Parent {

	// Super class method is not declaring any exceptions.
	void msg() {
		System.out.println("parent");
	}
}

class ExceptionInheritance1 extends Parent {

	// Rule 1: Child class overridden method should not declare checked exception
	// Compiler Error : Exception IOException is not compatible with throws clause in Parent.msg()

//	void msg() throws IOException {
//		System.out.println("TestExceptionChild");
//	}
	
	// Rule 2: Child class overridden method can declare un-checked exception
	// It is allowed

	void msg() throws ArithmeticException {
		System.out.println("child class method throwing unchecked exception!");
	}

	public static void main(String args[]) {
		Parent p = new ExceptionInheritance1();
		p.msg();
	}
}
