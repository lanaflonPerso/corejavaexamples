package com.rdayala.strings;

// Once string object is created its data or state can't be changed but a new string object is created.

public class StringImmutableExample {

	public static void main(String[] args) {

		String s = "Sachin";
		String str = s.concat(" Tendulkar");// concat() method appends the string at the end
		
		// Sachin is not changed but a new object is created with sachintendulkar.
		System.out.println(s);// will print Sachin because strings are immutable objects
		System.out.println(str);

	}

}

// Two objects are created but s reference variable still refers to "Sachin" not to "Sachin Tendulkar".

// But if we explicitly assign it to the reference variable, it will refer to "Sachin Tendulkar" object.
