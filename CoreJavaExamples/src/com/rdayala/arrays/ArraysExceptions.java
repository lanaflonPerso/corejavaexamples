package com.rdayala.arrays;

public class ArraysExceptions {

	public static void main(String[] args) {

		Object[] stringArray = new String[5]; // No compile time error : String[] is auto-upcasted to Object[]

		stringArray[1] = "JAVA";

		// stringArray[2] = 100; // Runtime exception : java.lang.ArrayStoreException: java.lang.Integer

		// int[] array = new int[-5]; // Runtime exception : Exception in thread "main" java.lang.NegativeArraySizeException
		
		
		// this gives compilation error
		// Cannot define dimension expressions when an array initializer is provided
		// int a[] = new int[3]{1, 2, 3};
	}

}
