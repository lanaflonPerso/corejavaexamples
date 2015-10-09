package com.rdayala.objects;

import java.util.HashSet;

// [GO THROUGH THIS BELOW LINK FOR EXPLANATION]
// http://www.jusfortechies.com/java/core-java/equals.php

// Override together, hashCode() and equals(). 
// Note that equal objects must have the same hashcode 
// but again note that unequal objects can have same hashcode too.

class Circle {

    private final int centerX;
    private final int centerY;

    public Circle(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }
    
    // this syntax of overriding equals method is wrong.
    // the parameter must be of Object type, not Circle type.
    
//    public boolean equals(Circle other) {
//    	  return (this.getCenterX() == other.getCenterX() 
//    		&& this.getCenterY() == other.getCenterY());
//    	}
    
    @Override
    public boolean equals(Object other) { // the parameter must be type Object
    	boolean result = false;
    	
    	// If the reference to this object is the same as the argument object, return true.
    	if(this == other){ // we comparing self, just return true
            return true; 
        }
    	
    	// If the argument is null, return false.
    	// If the objects are not from the same class, return false.
    	if (other == null || other.getClass() != this.getClass()) {
            return false;
        }
       
    	if (other instanceof Circle) {        		
    		Circle that = (Circle) other;
        	result = (this.getCenterX() == that.getCenterX() 
        		&& this.getCenterY() == that.getCenterY());
        	
        }
        return result;
    }
    
    @Override
    public int hashCode() {
    	final int seed = 37;
    	int result = 1;
    	result = seed * (result + this.getCenterX() + this.getCenterY());
    	return result;
    }
}


public class EqualsMethodOverrideExample {

	public static void main(String[] args) {
		Circle c1 = new Circle(100, 200);
		Circle c2 = new Circle(100, 200);

		HashSet coll = new HashSet();
		coll.add(c1);		
				
		System.out.println(c1.equals(c2));
		
		System.out.println(coll.contains(c2));

	}

}
