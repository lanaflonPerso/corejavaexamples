package com.rdayala.basics;

// Since Java 1.5 - 
// The automatic conversion of primitive data types into its equivalent Wrapper type is known as auto-boxing 
// and opposite operation is known as un-boxing.

public class AutoboxingExample {

	public static void main(String[] args) {
		
		// auto-boxing : automatic conversion of primitive data types into its equivalent Wrapper type
		
		Boolean boolObj = true;
		System.out.println(boolObj);
		
		Character cObj = 'c';
		System.out.println(cObj);
		
		Byte bObj = -127;
		System.out.println(bObj);
		
		Short sObj = 2500;
		System.out.println(sObj);
		
		Integer intObj = 10; 
		System.out.println(intObj);
		
		Long lObj = 150L;
		System.out.println(lObj);
		
		Float fObj = 2.456f;
		System.out.println(fObj);
		
		Double dObj = 23.35354;
		System.out.println(dObj);
		
		// un-boxing : automatic conversion of Wrapper type to primitive type
		
		int i = intObj;
		System.out.println(i);
		
		double d = dObj;
		System.out.println(d);
		
	}

}
