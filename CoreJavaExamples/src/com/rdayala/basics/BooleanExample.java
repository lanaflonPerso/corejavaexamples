package com.rdayala.basics;

/*
 * boolean is simple Java type which can only have one of two values; true or false.
 * 
 * All relational expressions return boolean value.
 *
 * Declare boolean variable as below :
 * 
 * 		boolean <variable name> = <default value>;
 * 
 * here assigning default value is optional.
 * 
 */

public class BooleanExample {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = (10 > 20); // relational expressions return boolean value
		
		System.out.println("Boolean b1 : " + b1);
		System.out.println("Boolean b2 : " + b2);
		System.out.println("Boolean b3 : " + b3);

	}

}
