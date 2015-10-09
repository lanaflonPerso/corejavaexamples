package com.rdayala.inherit;

//Parent class with a default constructor.

class B1 {
	
	// default Constructor
	B1 () {
		System.out.println("Parent class default constructor called!");
	}
	
}

//Child class with no constructors defined.
//Compiler automatically creates a default constructor.
//Inside the child class default constructor, which is created by compiler, 
//it calls super class default constructor super() as the first statement.

class C1 extends B1 {
	
	public void printSomething() {
		System.out.println("C object is created");
	}
}

public class ChildClassWithParentDefaultConstructorExample {

	public static void main(String[] args) {
		C1 cObj = new C1();
		cObj.printSomething();

	}

}
