package com.rdayala.exceptions;

// this is my user-defined exception
// When we do need to write our own exceptions, we should follow the naming convention 
// of always ending all our classes with "Exception"
// Our fields should be final, which is a good rule for most classes to make concurrency easier. 
// Our own exception classes should contain more information than just a simple String.

class OutOfRangeException extends IllegalArgumentException {
	
	private final long value, min, max;

	public OutOfRangeException(long value, long min, long max) {
		super("Value " + value + " out of range " + "[" + min + ".." + max
				+ "]");
		this.value = value;
		this.min = min;
		this.max = max;
	}

	public long getValue() {
		return value;
	}

	public long getMin() {
		return min;
	}

	public long getMax() {
		return max;
	}
	
//	@Override
//	public String toString() {
//		return "Value " + value + " out of range " + "[" + min + ".." + max	+ "]";
//	}
	
}

class Person {
	public static final int MIN_AGE = 0;
	public static final int MAX_AGE = 150;

	private final int age;
	private final String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		if (this.age < MIN_AGE || this.age > MAX_AGE) {
			throw new OutOfRangeException(this.age, MIN_AGE, MAX_AGE);
		}
	}

	public String toString() {
		return "Person " + name + " is " + age + " years old";
	}
}

public class UserDefinedException {
	public static void main(String[] args) {
//		try{
			Person p1 = new Person(200, "ABC");
//		}
//		catch(OutOfRangeException ex) {
//			System.out.println(ex);
//			ex.printStackTrace();
//		}
	}
}
