package com.rdayala.basics;

import java.util.ArrayList;

public class ForEachLoop {
	
	public static void main(String[] args)
    {
		
		//An ArrayList of strings
        ArrayList<String> list = new ArrayList<String>();
 
        //Adding elements to ArrayList
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
 
        //iterating every element of list using for-each loop
        for (String s : list)
        {
            System.out.println(s);
        }
		
		// Nested for-each loop
		
        //Two Dimensional Array
        int[][] twoDArray = { {1, 2, 3, 4}, {5, 6, 7, 8} };
 
        //iterating every element of twoDArray using for-each loop
        for (int[] oneDArray : twoDArray)
        {
            System.out.print("[");
 
            //iterating every element of oneDArray using for-each loop
            for (int i : oneDArray)
            {
                System.out.print(i+"\t");
            }
            System.out.println("]");
        }
    }

}
