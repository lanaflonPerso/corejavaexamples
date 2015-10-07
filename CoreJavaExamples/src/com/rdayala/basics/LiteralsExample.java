package com.rdayala.basics;

public class LiteralsExample {

	public static void main(String[] args) {
		
		// All primitive types using literals
		
		byte bLit = 100; // byte literal
		
		short shLit = 15; // short literal
		
		int octLit = 0400; //octal equivalent of decimal 256
		int hexLit = 0x100; //hexadecimal equivalent of decimal 256
		int decLit = 256; // decimal 256		
		int binVal = 0b11010; // The number 26, in binary. Should only used with 1.7 or higher versions
		
		// float f = 89.0; // ERROR - Type mismatch: cannot convert from double to float
		float ff = 89.0f; //OK, use suffix 'f' to indicate Float
		 
		double dou = 89.0D; //OK
		double doub = 89.0d; //OK
		double doubl = 89.0; //OK, by default floating point literal is double in Java 
		
		boolean boolFalse = false;
		boolean boolTrue = true;
		
		char charLit = 'a';
		String strLit = "String Literal";
		
		Class cls = String.class; // output: class java.lang.String
		
		System.out.println("Class Literal : " + cls);
		System.out.println("All literals in Java");
		
		

	}

}
