package com.rdayala.basics;

/**
 * I want to execute multiple constructor, while creating a single object?
 * Is it possible to call a constructor from another constructor within the same class??
 * 
 * For example, I have a class definition like this -
 * 
 * In Java another constructor of the same class can be called 
 * from a constructor via this(). 
 * 
 * Note however that 'this' has to be the first statement. 
 * 
 * Note that you can only chain to one constructor, 
 * and it has to be the first statement in your constructor body.
 *
 */

class Prg
{
    public Prg()
    {
        System.out.println("In default constructor");
    }
    public Prg(int a)
    {
        //  Prg(); // ERROR : compiler error, instead use this() to refer to another constructor
    	
        this();
        System.out.println("In single parameter constructor");
    }
    public Prg(int b, int c)
    {
        // Prg(b); // ERROR : compiler error
    	
    	this(b);
        System.out.println("In multiple parameter constructor");
    }
}

public class ConstructorMultipleExample {

	public static void main(String s[])
    {
        Prg obj = new Prg(10, 20);
    }

}
