package com.rdayala.random;


//To generate random numbers between 5 to 10 and both inclusive
//For reference: http://www.mkyong.com/java/java-generate-random-integers-in-a-range/

import java.util.Random;

public class RandomNumbersExample {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(getRandomNumberInRange(5, 10));
		}

	}

	// the function to generate random numbers in the range 
	// between min (inclusive) and max (inclusive).
	
	// [WHAT IS THIS FORMULAR ((max - min) + 1) + min
	
	// Random().nextInt(int bound) = Random integer from 0 (inclusive) to bound (exclusive)
	// To include the last value (max value) = ((max - min) + 1)
	// To define a start value (min value) in a range : ((max - min) + 1) + min
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}