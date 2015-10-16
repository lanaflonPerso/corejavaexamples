package com.rdayala.strings;

public class StringComparisonExample {

	public static void main(String[] args) {

		// 3 ways
		// Using equals() method -- the object to be compared should also be an instance of String class.
		// Using == operator -- reference matching
		// Using compareTo() method -- used for sorting. in collections classes

		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		String s5 = "SACHIN";
		String s6 = "Ratan";
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // false
		
		System.out.println(s1.equals(s5)); // false  
		System.out.println(s1.equalsIgnoreCase(s5)); // true
		
		System.out.println(s1==s2); // true (because both refer to same instance)  
		System.out.println(s1==s3); // false(because s3 refers to instance created in non-pool)
		
		System.out.println(s1.compareTo(s2)); // 0  
		System.out.println(s1.compareTo(s6)); // 1(because s1>s3)  
		System.out.println(s6.compareTo(s1)); // -1(because s3 < s1 )  

	}

}
