package com.rdayala.basics;

// We cannot use 'this' in a static method or context

// you can access all static as well as non static variables/methods of a class through it's object

// You can call the static member (variable or method) using object of that class. 
// Compiler is smart enough to resolve the type of the class to call the method. 

// A static method must only access static data.
// A static method can only call other static methods.

public class StaticMethodsExample {
	
	public static String name = "ABC";	
	
	public static void StaticMethod() {
		System.out.println("this is static method!");
		System.out.println("this is static variable value : " + name);
	}
	
	public void printSomething() {
		System.out.println("PrintSomething method : " + this.name);
		this.name = "XYZ";
		this.StaticMethod(); // calling static method
	}

	public static void main(String[] args) {
		StaticMethodsExample stEx = new StaticMethodsExample();
		stEx.StaticMethod(); // Note here that, we can call static method using instance object
		stEx.printSomething();
		
		System.out.println(stEx.name); // accessing static variable using object
		
		StaticMethodsExample.StaticMethod(); // calling static method using Class name [preferred way]			

	}

}
