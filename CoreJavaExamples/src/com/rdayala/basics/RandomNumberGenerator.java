package com.rdayala.basics;

import java.util.Random;

// 2 ways
// Using Random class (in package java.util)
// Using Math.random class (however this will generate double in the range of 0.0 to 1.0 and not integers).

public class RandomNumberGenerator {

	public static void main(String[] args) {

		Random objGenerator = new Random();
		for (int iCount = 0; iCount < 5; iCount++) {
			// 100 is the upper limit and excluded. Lower limit is 0
			int randomNumber = objGenerator.nextInt(100);
			System.out.println("Random No : " + randomNumber);
		}
		
		for (int xCount = 0; xCount < 5; xCount++) {
			System.out.println(Math.random());
		}

		// Random numbers between 0 to 5
		for (int xCount = 0; xCount < 5; xCount++) {
			System.out.println((int)(Math.random()*5));
		}

	}

}
