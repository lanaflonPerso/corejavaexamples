package com.rdayala.strings;

// In Java, string is basically an object that represents sequence of char values.

public class StringCreationExample {

	public static void main(String[] args) {
		
		// Create String from char array
		
		char[] ch={'j','a','v','a','t','p','o','i','n','t'}; 
		String s=new String(ch);
		System.out.println(s);
		
		// Create String : other ways
		
		// 1. String Literal - uses String pool concept
		
		String s1="Welcome";  
		String s2="Welcome";//will not create new instance
		
		// 2. Using new keyword - String object
		
		// Creates two objects and one reference variable
		// JVM will create a new string object in normal(non pool) heap memory and 
		// the literal "Welcome" will be placed in the string constant pool. 
		// The variable s will refer to the object in heap(non pool). 
		
		String str = new String("Welcome");  
		System.out.println(str);

	}

}
