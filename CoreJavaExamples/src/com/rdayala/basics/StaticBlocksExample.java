package com.rdayala.basics;

// Static blocks are also called Static initialization blocks.
// A class can have any number of static initialization blocks, 
// and they can appear anywhere in the class body.

// The runtime system guarantees that static initialization blocks are called in the order 
// that they appear in the source code. And don't forget, this code will be executed 
// when JVM loads the class. JVM combines all these blocks into one single static block and then executes.

// If you have executable statements in the static block, JVM will automatically execute 
// these statements when the class is loaded into JVM.

public class StaticBlocksExample {
	
	static {
        System.out.println("This is first static block");
    }

    public StaticBlocksExample(){
        System.out.println("This is constructor");
    }

    public static String staticString = "Static Variable";

    static {
        System.out.println("This is second static block and "
		                                        + staticString);
    }

    public static void main(String[] args){
    	StaticBlocksExample statEx = new StaticBlocksExample();
    	StaticBlocksExample.staticMethod2();
    }

    static {
        staticMethod();
        System.out.println("This is third static block");
    }
    
    static {
    	System.out.println("Another static block!!");
    }

    public static void staticMethod() {
        System.out.println("This is static method");
    }

    public static void staticMethod2() {
        System.out.println("This is static method2");
    }

}
