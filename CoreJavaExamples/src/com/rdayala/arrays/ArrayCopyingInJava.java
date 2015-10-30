package com.rdayala.arrays;

import java.util.Arrays;

public class ArrayCopyingInJava {
	
	public static void ArrayCopyUsingForLoop()
    {
        int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
 
        int[] b = new int[a.length];             //Declaring and instantiating another array of ints with same length
 
        for (int i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }
        
        // Printing elements of array 'b'
        
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
 
        //Now changing values of one array will not reflect in another array
 
        a[2] = 56;       //Changing value of 3rd element in array 'a'
 
        System.out.println(b[2]);    //value of 3rd element in array 'b' will not change
 
        b[4] = 100;     //Changing value of 5th element in array 'b'
 
        System.out.println(a[4]);    //value of 5th element in array 'a' will not change
        
        System.out.println("------------------------------------------------");
    }
	
	public static void ArrayCopyUsingCopyOfMethod() {
		int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
		 
        //creating a copy of array 'a' using copyOf() method of java.util.Arrays class
 
        int[] b = Arrays.copyOf(a, a.length);  
 
        //Printing elements of array 'b'
 
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
 
        //Now changing values of one array will not reflect in other array
 
        a[2] = 56;       //Changing value of 3rd element in array 'a'
 
        System.out.println(b[2]);    //value of 3rd element in array 'b' will not change
 
        b[4] = 100;     //Changing value of 5th element in array 'b'
 
        System.out.println(a[4]);    //value of 5th element in array 'a' will not change
        
        System.out.println("------------------------------------------------");
	}
	
	public static void ArrayCopyUsingCloneMethod() {
		int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
		 
        //creating a copy of array 'a' using clone() method
 
        int[] b = a.clone();  
 
        //Printing elements of array 'b'
 
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
 
        //Now changing values of one array will not reflect in other array
 
        a[2] = 56;       //Changing value of 3rd element in array 'a'
 
        System.out.println(b[2]);    //value of 3rd element in array 'b' will not change
 
        b[4] = 100;     //Changing value of 5th element in array 'b'
 
        System.out.println(a[4]);    //value of 5th element in array 'a' will not change
        
        System.out.println("------------------------------------------------");
	}
	
	public static void ArrayCopyUsingArrayCopyMethod() {
		int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
		 
        //Creating an array object of same length as array 'a'
 
        int[] b = new int[a.length];
 
        //creating a copy of array 'a' using arraycopy() method of System class
 
        System.arraycopy(a, 0, b, 0, a.length);
 
        //Printing elements of array 'b'
 
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
 
        //Now changing values of one array will not reflect in other array
 
        a[2] = 56;       //Changing value of 3rd element in array 'a'
 
        System.out.println(b[2]);    //value of 3rd element in array 'b' will not change
 
        b[4] = 100;     //Changing value of 5th element in array 'b'
 
        System.out.println(a[4]);    //value of 5th element in array 'a' will not change
	}

	public static void main(String[] args) {
		
		ArrayCopyUsingForLoop();
		ArrayCopyUsingCopyOfMethod();
		ArrayCopyUsingCloneMethod();
		ArrayCopyUsingArrayCopyMethod();

	}

}
