package com.rdayala.inherit;

// When Base class has no constructor, the child class constructors
// automatically calls the super class default constructor generated 
// by compiler. So, the child objects can be created.

// When a base class has a parameterized constructor, of course
// you have to define a default constructor as well and also
// refer to base class constructor from within child class constructors.
// If you do not call super class constructor from within child class constructor,
// the compiler automatically calls base class default constructor.

// If you want to refer to base class constructor, the super() statement must 
// be the first statement inside child class constructor.

class Base {
	
	Base () {
		System.out.println("Base class default constructor called!");
	}
	
	Base(int a) {
		System.out.println("Base class parameter constructor called!");
	}
	
}

class Child extends Base {
	
	Child() {
		System.out.println("Child class default constructor called!");
	}
	
	Child(int a, int b) {
		super(a); // this must be first statement
		System.out.println("Child class parameter constructor called!");
	}
}

public class ChildClassWithConstructors {

	public static void main(String[] args) {
		Child cObj = new Child();
		Child cObj1 = new Child(1, 2);
		

	}

}
