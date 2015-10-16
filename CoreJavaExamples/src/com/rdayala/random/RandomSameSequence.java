package com.rdayala.random;

import java.util.Random;

/* Some times we need to generate same random number sequence every time
 * we call the sequence generator method on every call. We cannot achieve
 * this if we use simple Random() class constructor. We need to
 * pass seed to the Random() constructor to generate same random sequence.
 * */

public class RandomSameSequence {

	public void generateSequence() {
		Random rnd = new Random(40);
		for (int i = 0; i < 5; i++) {
			System.out.println(rnd.nextInt(100));
		}
	}

	public static void main(String a[]) {
		
		RandomSameSequence mss = new RandomSameSequence();
		mss.generateSequence();
		System.out.println("====================");
		mss.generateSequence();
	}
}
