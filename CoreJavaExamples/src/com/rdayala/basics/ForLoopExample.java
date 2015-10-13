package com.rdayala.basics;

public class ForLoopExample {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        
        /**
         * another example to increment by 2 steps
         */
        for(int i=1;i<=10;i=i+2){
            System.out.print(i+" ");
        }
        System.out.println();
        
        /**
         * Below loop prints the numbers in reverse order
         */
        for(int i=10;i>0;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        
        // Enhanced for loop with integer array
		
		int[] a={0, 1,2,3,4,5,6,7,8,9};
		for(int i : a){
			System.out.print(i + " ");
		}
		System.out.println();
		  
		// Enhanced for loop with String Array
		
		String[] names = {"Raghu", "Ramya", "Srinath", "Veda"};
		for (String name : names) {
			System.out.println(name);
		}

	}

}
