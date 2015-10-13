package com.rdayala.basics;

/*
 * Can we overload static methods?
 * 
 * The answer is ‘Yes’. We can have two ore more static methods with same name, 
 * but differences in input parameters.
 */

public class StaticMethodsOverload {

	public static void foo() {
        System.out.println("StaticMethodsOverload.foo() called ");
    }
    public static void foo(int a) { 
        System.out.println("StaticMethodsOverload.foo(int) called ");
    }
    
    /*
     * Can we overload methods that differ only by static keyword?
     * 
     * No, We cannot overload two methods in Java if they differ only 
     * by static keyword (number of parameters and types of parameters is same).
     */
    
    public static void bar() {
        System.out.println("StaticMethodsOverload.bar() called ");
    }
    
//    public void bar () { // Compiler Error: Duplicate method bar()
//        System.out.println("Test.foo(int) called ");
//    }
    
    public static void main(String args[])
    { 
    	StaticMethodsOverload.foo();
    	StaticMethodsOverload.foo(10);
    	StaticMethodsOverload.bar();
    }
}
