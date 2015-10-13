package com.rdayala.inherit;

/*

Can we Override static methods in java?
No, We can declare static methods with same signature in subclass, but it is 
not considered overriding as there won’t be any run-time polymorphism.

If a derived class defines a static method with same signature as a static method in base class, 
the method in the derived class hides the method in the base class. 

Following are some important points for method overriding and static methods in Java.
1) For class (or static) methods, the method according to the type of reference is called, 
not according to the object being referred, which means method call is decided at compile time.

2) For instance (or non-static) methods, the method is called according to the 
type of object being referred, not according to the type of reference, 
which means method calls is decided at run time.

3) In a subclass (or Derived Class), we can overload the methods inherited from the superclass. 
Such overloaded methods neither hide nor override the superclass methods 
— they are new methods, unique to the subclass.

*/

//Superclass
class Base1 {

	// Static method in base class which will be hidden in subclass
	public static void display() {
		System.out.println("Static or class method from Base");
	}

	// Non-static method which will be overridden in derived class
	public void print() {
		System.out.println("Non-static or Instance method from Base");
	}
}

// Subclass
class Derived extends Base1 {

	// This method hides display() in Base, this is not overriding, instead shallowing base class method
	public static void display() {
		System.out.println("Static or class method from Derived");
	}

	// This method overrides print() in Base
	public void print() {
		System.out.println("Non-static or Instance method from Derived");
	}
}

public class StaticMethodsOverrideExample {
	public static void main(String args[]) {
		Base1 obj1 = new Derived();

		// As per overriding rules this should call to class Derive's static
		// overridden method. Since static method can not be overridden, it
		// calls Base's display()
		obj1.display();

		// Here overriding works and Derive's print() is called
		obj1.print();
	}
}
