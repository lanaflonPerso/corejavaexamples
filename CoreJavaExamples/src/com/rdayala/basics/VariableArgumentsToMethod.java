package com.rdayala.basics;

// A method can receive a variable number of arguments with the use of ellipsis (...)
// Only the last argument to the method can be declared as accepting a variable list

// The data type of the variable number of arguments which can be even a reference type 
// is stated followed by the ellipsis and an identifier. 

// This type can be used not more than once in a method header and should be the last of all parameters.

// public void meth ( int... a) // valid
// public void meth (double a, int... b) // valid
// public void meth ( int... a, int b) // invalid- Ellipsis may be used towards the end only
// public void meth ( int... a, double... b) // invalid - More than one variable length parameter list may not be used
// public void meth ( Student... a) // valid - Reference types are also allowed
// public void meth( int[]... a) // valid - reference types are also allowed

public class VariableArgumentsToMethod {
	
	// Method which accepts variable number of arguments
	
	public static void addVariable(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(a.length + " arguments received whose sum is " + sum);
    }
	
	// this method accepts variable number of String arguments
	public static void printGreeting(String... names) {
        for (String n : names) {
            System.out.println("Hello " + n + ". ");
        }
     }

	public static void main(String[] args) {
		addVariable();
        addVariable(1);
        addVariable(3, 4);
        
        printGreeting();
        printGreeting("Raghu");;
        printGreeting("Paul", "Sue", "John");

	}

}