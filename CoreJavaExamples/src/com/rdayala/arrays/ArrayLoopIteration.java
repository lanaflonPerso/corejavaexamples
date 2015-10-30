package com.rdayala.arrays;

//Can you change the size of the array once you define it? OR 
//Can you insert or delete the elements after creating an array?

//No. You can’t change the size of the array once you define it. 
//You can not insert or delete the elements after creating an array. 
//Only you can do is change the value of the elements.

public class ArrayLoopIteration {

	public static void main(String[] args) {

		// Method 1: Iterating over an array using normal for loop
		
		int[] a = new int[] { 45, 12, 78, 34, 89, 21 };
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// Method 2: Iterating over an array using extended for loop
		
		int[] numbers = new int[] { 45, 12, 78, 34, 89, 21 };

		for (int i : numbers) {
			System.out.println(i);
		}

	}

}
