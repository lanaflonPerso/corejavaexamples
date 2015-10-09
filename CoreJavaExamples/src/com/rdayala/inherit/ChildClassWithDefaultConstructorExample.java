package com.rdayala.inherit;

class Parent {
	
	// default constructor
	Parent() {
		System.out.println("Parent class default constructor called!");
	}
}

// child class default constructor internally calls
// parent class default constructor automatically

class ChildClass extends Parent{
	
	ChildClass() {
		System.out.println("Child class default cosntructor called!");
	}
}

public class ChildClassWithDefaultConstructorExample {

	public static void main(String[] args) {
		ChildClass c1 = new ChildClass();		

	}

}
