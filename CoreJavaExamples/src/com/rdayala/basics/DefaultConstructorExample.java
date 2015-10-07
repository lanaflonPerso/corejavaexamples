package com.rdayala.basics;

/**
 * A constructor is a special method whose task is to initialize the object of its class.
 * 
 */

/**
 * If a class defined by the code contains no constructor declarations, compiler will 
 * automatically provide one no-parameter-constructor (default-constructor) for the class
 * 
 * if the class is declared public, then the default constructor 
 * is implicitly given the access modifier public;
 * 
 * if the class is declared protected, then the default constructor 
 * is implicitly given the access modifier protected;
 * 
 * if the class is declared private, then the default constructor 
 * is implicitly given the access modifier private; otherwise,
 * the default constructor has the default access implied by no access modifier.
 * 
 */

public class DefaultConstructorExample {
	
	// instance variables will have default values when an object gets created.
	
	// for numbers - the default value 0
	// for String - the default value null
	
	int number;
	String name;
	
	/**
	 * If a class defined by the code does not have any constructor, 
	 * compiler will automatically provide one no-parameter-constructor 
	 * (default-constructor) for the class. 
	 */

	public static void main(String[] args) {
		
		// default constructor is called here..
		// default constructor initializes the instance variables with default values
		DefaultConstructorExample defaultConstructor = new DefaultConstructorExample();
		
		System.out.println(defaultConstructor.number); // prints default value : 0
		System.out.println(defaultConstructor.name); // prints default value : null

	}

}
