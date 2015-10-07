package com.rdayala.basics;

/**
 * Like method overloading we can overload constructors also.
 * 
 * Along with default constructor, we can have constructors with parameters. 
 * The number of parameters can be same, but should have different data types. 
 * 
 */

class MyOverloading {
    
    public MyOverloading(){
        System.out.println("Inside default constructor");
    }
    
    public MyOverloading(int i){
        System.out.println("Inside single parameter constructor with int value");
    }
    
    public MyOverloading(String str){
        System.out.println("Inside single parameter constructor with String object");
    }
    
    public MyOverloading(int i, int j){
        System.out.println("Inside double parameter constructor");
    }
}

public class ConstructorOverloadingExample {

	public static void main(String[] args) {
		MyOverloading mco = new MyOverloading();
        MyOverloading spmco = new MyOverloading(10);
        MyOverloading dpmco = new MyOverloading(10,20);
        MyOverloading strpmco = new MyOverloading("java2novice");

	}

}
