package com.rdayala.exceptions;

// All the sub classes of RunTimeException and 
// All sub classes of Error class are unchecked exceptions.



public class RuntimeException {

	public static void main(String args[]) {
		int num[] = { 1, 2, 3, 4 };		
		System.out.println(num[5]); // java.lang.ArrayIndexOutOfBoundsException: 5
		
		// Integer i = new Integer("abc"); // java.lang.NumberFormatException: For input string: "abc"
		
	}

}
