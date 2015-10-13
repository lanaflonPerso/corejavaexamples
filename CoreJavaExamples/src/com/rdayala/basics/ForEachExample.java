package com.rdayala.basics;

import java.util.ArrayList;
import java.util.List;

// This is also called, Enhanced For loop

public class ForEachExample {
	
	public static void main(String a[]){
		
        List<String> al = new ArrayList<String>();
        al.add("Simple");
        al.add("for each");
        al.add("example");
        al.add("for understanding");

        /**
         * during each iteration, the object in the sequence
         * will be assigned to string reference str.
         */
        for(String str:al){
            System.out.println(str);
        }
    }
}
