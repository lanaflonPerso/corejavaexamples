package com.rdayala.random;

import java.util.Random;

public class RandomNumbersSeedChange {

	public static void main(String a[]) {
		
		// Creates a new random number generator using a single long seed. 
		// The seed is the initial value of the internal state of the 
		// pseudorandom number generator which is maintained by method next(int)
		
		// nextInt(int n) - Returns a pseudorandom, uniformly distributed int value 
		// between 0 (inclusive) and the specified value (exclusive), drawn from this 
		// random number generator's sequence.
		
		Random rnd = new Random(40);
		for (int i = 0; i < 5; i++) {
			System.out.println(rnd.nextInt(100));
		}
		
		System.out.println("Changing seed to change to sequence");
		rnd.setSeed(45);
		for (int i = 0; i < 5; i++) {
			System.out.println(rnd.nextInt(100));
		}
		
		System.out.println("Changing seed to change to sequence");
		rnd.setSeed(50);
		for (int i = 0; i < 5; i++) {
			System.out.println(rnd.nextInt(100));
		}
		
		System.out.println("Setting seed 40 to produce the original sequence");
		rnd.setSeed(40);
		for (int i = 0; i < 5; i++) {
			System.out.println(rnd.nextInt(100));
		}
	}

}
