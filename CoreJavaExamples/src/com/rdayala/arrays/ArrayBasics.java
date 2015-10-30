package com.rdayala.arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		
		// declaring arrays
		
		int[] arrayOfInts;    //Declaring an array of ints
		 
        double arrayOfDoubles[];   //Declaring an array of doubles
 
        char[] arrayOfChars;     //Declaring an array of characters
 
        boolean arrayOfBooleans[];   //Declaring an array of booleans
        
        
        // Instantiating arrays
        // Note : When you create an array object of specified type and length with new operator, 
        // by default all array elements in the array object are initialized with default values.
        
        int[] arrayOfNumbers;      // Declaring an array of int
        
        arrayOfNumbers = new int[10];   // Instantiating an array of int using new operator
        
        // Initializing array elements
        
        int[] arrayOfIds;      // Declaring an array of int
        
        arrayOfIds = new int[10];   //Instantiating an array of int using new operator
 
        arrayOfIds[2] = 12;         //Initializing 3rd element
 
        arrayOfIds[5] = 56;         //Initializing 6th element
        
        // Declaring, instantiating and Initializing an array in one statement
        
        double[] arrayOfDoubleValues = new double[] {12.56, 45.87, 14.85};
 
        // This is also ok. 
 
        int[] arrayOfIntValues = {12, 21, 0, 5, 7};
        
        // Accessing array elements
        
        System.out.println(arrayOfIntValues[0]);   //accessing 1st element
        
        System.out.println(arrayOfIntValues[3]);   //accessing 4th element
 
        System.out.println(arrayOfIntValues[2]);   //accessing 3rd element

	}

}
