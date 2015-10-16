package com.rdayala.basics;

public class LiteralsExample {

	public static void main(String[] args) {
		
		// All primitive types using literals
		
		byte bLit = 100; // byte literal
		
		short shLit = 15; // short literal
		
		int decLit = 256; // decimal literal 256
		int octLit = 0400; //octal literal equivalent of decimal 256
		int hexLit = 0x100; //hexadecimal literal equivalent of decimal 256
		int binLit = 0b11010; // binary literal. The number 26, in binary. Should only used with 1.7 or higher versions
		
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
		
		System.out.println("String Literal class type : " + cls);
		
		byte temperature = -28;
		System.out.println("Temperature(byte): " + temperature);
		
		char driversLicenseClass = 'A';
		System.out.println("Driver's License Class(char): " + driversLicenseClass);
		
		short numberOfStudents = 3428;
		System.out.println("Number of Students(short): " + numberOfStudents);
		
		int daysPassed = 468;
		System.out.println("Days Passed(int): " + daysPassed);
		
		long days = 245885475475L; // use suffix 'L'
		System.out.println("Days(long): " + days);
		
		float PI = 3.14F; // use suffix 'F'
		System.out.println("PI(float): " + PI);
		
		double dValue = 3.14159; // by default, floating value is of type double 
		System.out.println("PI(double): " + dValue);
		
		String firstName = "Raghunath";
		System.out.println("First name(String): " + firstName);
		
		boolean isSwitchOn = false;
		System.out.println("isSwitchOn(boolean): " + isSwitchOn);
		
		System.out.println("All literals in Java");
		
		

	}

}
