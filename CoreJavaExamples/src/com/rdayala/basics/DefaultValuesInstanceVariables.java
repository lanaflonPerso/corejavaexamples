package com.rdayala.basics;

public class DefaultValuesInstanceVariables {
	
	// Instances variables are initialized with default values
	// when an object gets created.
	
	boolean bool;	// Boolean : false
	char c;		// Character : '\u0000'	
	byte b;		// Byte : 0
	short s;	// Short : 0
	int i;		// Integer : 0
	long l;		// Long : 0
	float f;	// Float : 0.0
	double d;	// Double : 0.0
	String str;	// String : null
	
	public void printDefaultValues() {
		System.out.println("Boolean : " + bool);
		System.out.println("Character : " + (int)c);
		System.out.println("Byte : " + b);
		System.out.println("Short : " + s);
		System.out.println("Integer : " + i);
		System.out.println("Long : " + l);
		System.out.println("Float : " + f);
		System.out.println("Double : " + d);
		System.out.println("String : " + str);
		
	}
	
	public static void main(String[] args) {
		DefaultValuesInstanceVariables df = new DefaultValuesInstanceVariables();
		df.printDefaultValues();

	}

}
