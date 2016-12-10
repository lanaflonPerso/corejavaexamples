package com.rdayala.strings;

public class StringClassDemo {
	
	public static void main(String[] args) {
		String s1 = "Hello"; // the string literal value is cached in string pool
		String s2 = "Hello"; // now s2 will also point to the same string object in string pool
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		String s5 = new String("Hello").intern(); // now it is interned, it will check in string pool
		String s6 = new String("World").intern();
		
		System.out.println("are the strings point to same ref? " + (s1 == s2)); // true
		System.out.println("Is s1 and s3 equal : " + (s1 == s3)); // false
		System.out.println("Is s1 and s4 equal : " + (s1 == s4)); // false
		System.out.println("Is s1 and s5 equal : " + (s1 == s5)); // true
		System.out.println(s6);
		
	}

}
