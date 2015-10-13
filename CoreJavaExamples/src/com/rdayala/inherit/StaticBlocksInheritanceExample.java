package com.rdayala.inherit;

// When you are creating an object of child class,
// the parent class static block is executed before executing
// child class constructor.

// All the instances of a class or it's sub-classes share 
// the same static fields for a given class loader.

class StaticDemo{
	public static String name = "Base class";
    static{
        System.out.println("static block of parent class");
    }
}

public class StaticBlocksInheritanceExample extends StaticDemo{
    
	static{
        System.out.println("static block of child class");
    }
    
    StaticBlocksInheritanceExample() {
    	System.out.println("Child class constructor called!");
    }
    
    public void display()
    {
        System.out.println("Just a method of child class");
    }
    
    public static void main(String args[])
    {
    	StaticBlocksInheritanceExample obj = new StaticBlocksInheritanceExample();
        obj.display();
    }
}

// [OUTPUT]
/*
static block of parent class
static block of child class
Child class constructor called!
Just a method of child class
*/