package com.rdayala.basics;

public class ForLoopExample {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			System.out.println("the value is : " + i);
		}
		
		int[] a={1,2,3,4,5,6,7,8,9,0};
		  for(int i : a){
		    System.out.println(i);
		  }
		  
		// Enhanced for loop with String Array
		
		String[] names = {"Raghu", "Ramya", "Srinath", "Veda"};
		for (String name : names) {
			System.out.println(name);
		}

	}

}
