package com.rdayala.arrays;

// Anonymous array is an array without reference.

// Can you change the size of the array once you define it? OR 
// Can you insert or delete the elements after creating an array?

// No. You can’t change the size of the array once you define it. 
// You can not insert or delete the elements after creating an array. 
// Only you can do is change the value of the elements.

public class AnonymousArrayExample {

	public static void main(String[] args) {
		
		// Creating anonymous arrays

		System.out.println(new int[] { 1, 2, 3, 4, 5 }.length); // Output : 5

		System.out.println(new int[] { 21, 14, 65, 24, 21 }[1]); // Output : 14

	}

}
