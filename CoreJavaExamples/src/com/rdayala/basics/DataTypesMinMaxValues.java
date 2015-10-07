package com.rdayala.basics;

// Wrapper classes contain the constants, MIN_VALUE and MAX_VALUE

// Java does not support unsigned types. All int variants are signed. 
// But char is an exception; it is unsigned and consumes 2 bytes in memory. 
// It stores 16-bit Unicode UTF-16 character. Type char to be unsigned seems logical 
// because there are no negative characters.

public class DataTypesMinMaxValues {

	public static void main(String[] args) {
		System.out.println("Character Min Value : " + (int)Character.MIN_VALUE);
		System.out.println("Character Max Value : " + (int)Character.MAX_VALUE);
		
		System.out.println("Byte Min Value : " + Byte.MIN_VALUE);
		System.out.println("Byte Max Value : " + Byte.MAX_VALUE);
		
		System.out.println("Short Min Value : " + Short.MIN_VALUE);
		System.out.println("Short Max Value : " + Short.MAX_VALUE);
		
		System.out.println("Integer Min Value : " + Integer.MIN_VALUE);
		System.out.println("Integer Max Value : " + Integer.MAX_VALUE);
		
		System.out.println("Long Min Value : " + Long.MIN_VALUE);
		System.out.println("Long Max Value : " + Long.MAX_VALUE);
		
		System.out.println("Float Min Value : " + Float.MIN_VALUE);
		System.out.println("Float Max Value : " + Float.MAX_VALUE);
		
		System.out.println("Double Min Value : " + Double.MIN_VALUE);
		System.out.println("Double Max Value : " + Double.MAX_VALUE);
		
		System.out.println("Boolean True value : " + Boolean.TRUE);
		System.out.println("Boolean False Value : " + Boolean.FALSE);
		

	}

}
