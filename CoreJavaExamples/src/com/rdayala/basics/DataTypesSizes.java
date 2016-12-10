package com.rdayala.basics;

// Note: In Java, there is no sizeof operator like in C

// The char data type is a single 16-bit Unicode character. 
// Min value '\u0000' (or 0) and a maximum value '\uffff' (or 65,535 inclusive).

// The boolean data type has only two possible values: true and false.
// boolean represents one bit of information, but its "size" isn't something that's precisely defined.

public class DataTypesSizes {

	public static void main(String[] args) {
		System.out.println("Character size (bits):  " + Character.SIZE);
		System.out.println("Byte Size (bits): " + Byte.SIZE);
		System.out.println("Short size (bits): " + Short.SIZE);
		System.out.println("Integer size (bits): " + Integer.SIZE);
		System.out.println("Long Size (bits): " + Long.SIZE);
		System.out.println("Float Size (bits): " + Float.SIZE);
		System.out.println("Double Size (bits): " + Double.SIZE);		
		
		// since Java 8, primitive wrapper classes support BYTES constant
		
		System.out.println("Character size (bytes):  " + Character.BYTES);
		System.out.println("Byte Size (bytes): " + Byte.BYTES);
		System.out.println("Short size (bytes): " + Short.BYTES);
		System.out.println("Integer size (bytes): " + Integer.BYTES);
		System.out.println("Long Size (bytes): " + Long.BYTES);
		System.out.println("Float Size (bytes): " + Float.BYTES);
		System.out.println("Double Size (bytes): " + Double.BYTES);
	}

}
