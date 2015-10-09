package com.rdayala.inherit;

// Parent class with no constructors.
// Compiler automatically creates a default constructor

class B {
	
}

// Child class with no constructors defined.
// Compiler automatically creates a default constructor.
// Inside the child class default constructor, which is created by compiler, 
// it calls super class default constructor as the first statement.

class C extends B {
	
	public void printSomething() {
		System.out.println("C object is created");		
		
	}
}

public class ChildClassBasicExample {

	public static void main(String[] args) {
		
		/**
		 * If your child class doesn't contain any constructors,
		 * the compiler automatically generates a default constructor. 
		 * This child class default constructor internally
		 * calls super class default constructor, super(), as the first statement.
		 */
		C cObj = new C();
		cObj.printSomething();

	}

}
