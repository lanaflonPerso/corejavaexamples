package com.rdayala.arrays;

public class ArrayRandomShuffleElements {
	
	public static void shuffle(Object[] array) {
		int noOfElements = array.length;
		
		for(int i = 0; i < noOfElements; i++) {
			int s = i + (int)(Math.random() * (noOfElements - i));			
			
			Object temp = array[s];
			array[s] = array[i];
			array[i] = temp;
		}
	}

	public static void main(String[] args) {
		
		String[] strOfCharacters = {"A", "B", "C", "D", "E" };
		System.out.println("Before Shuffle : ");
		for(String str : strOfCharacters) {
			System.out.print(str + " ");
		}		
		
		ArrayRandomShuffleElements.shuffle(strOfCharacters);
		
		System.out.println("\nAfter Shufftle : ");
		for(String str : strOfCharacters) {
			System.out.print(str + " ");
		}

	}

}
