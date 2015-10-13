package com.rdayala.basics;

// Static block is executed only once
// constructor is executed for every object 

public class StaticBlockExample {
	
	static {
        System.out.println("I am in static block");
        System.out.println("Static block will be called first before constructor!!!");
        System.out.println("Static block will be called only once.");
    }

    public StaticBlockExample(){
        System.out.println("I am in constructor");
    }

    public static void main(String a[]){
    	StaticBlockExample ksv1 = new StaticBlockExample();
    	StaticBlockExample ksv2 = new StaticBlockExample();
    	StaticBlockExample ksv3 = new StaticBlockExample();    	
    }

    // [OUTPUT]
    // I am in static block
    // Static block will be called first before constructor!!!
    // Static block will be called only once.
    // I am in constructor
    // I am in constructor
    // I am in constructor
}
