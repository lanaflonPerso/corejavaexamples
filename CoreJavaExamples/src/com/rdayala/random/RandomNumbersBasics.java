package com.rdayala.random;

import java.util.Random;

public class RandomNumbersBasics {

	public static void main(String[] args) {

		// Creates a new random number generator. This constructor sets the seed
		// of the random number generator to a value very likely to be distinct
		// from any other invocation of this constructor.
		Random rand = new Random();

		System.out.println("Random Integers:");
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());

		System.out.println("Random Double Numbers:");
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextDouble());

		System.out.println("Random Long Numbers:");
		System.out.println(rand.nextLong());
		System.out.println(rand.nextLong());
		System.out.println(rand.nextLong());
		
		// to generate random numbers below certain value
		
		System.out.println("Random Integers below 50:");
		
		Random rnd = new Random();
		
		// nextInt(int n) - Returns a pseudorandom, uniformly distributed int value 
		// between 0 (inclusive) and the specified value (exclusive), drawn from this 
		// random number generator's sequence. 
        
		System.out.println(rnd.nextInt(50));
        System.out.println(rnd.nextInt(50));
        System.out.println(rnd.nextInt(50));
        System.out.println(rnd.nextInt(50));
        System.out.println(rnd.nextInt(50));
        System.out.println(rnd.nextInt(50));
       		
	}

}
