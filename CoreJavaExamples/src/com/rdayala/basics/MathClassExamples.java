package com.rdayala.basics;

public class MathClassExamples {
	
	public static void main(String[] args) {
		int i1 = 27;
		int i2 = -45;
		
		double d1 = 84.6;
		double d2 = 0.45;
		
		System.out.println("Absolute value of i1: " + Math.abs(i1)); // Absolute value of i1: 27
		 
		System.out.println("Absolute value of i2: " + Math.abs(i2)); // Absolute value of i2: 45
		 
		System.out.println("Absolute value of d1: " + Math.abs(d1)); // Absolute value of d1: 84.6
		 
		System.out.println("Absolute value of d2: " + Math.abs(d2)); // Absolute value of d2: 0.45
		
		System.out.println("Round off for d1: " + Math.round(d1)); // Round off for d1 (84.6): 85
		 
		System.out.println("Round off for d2: " + Math.round(d2));  // Round off for d2 (0.45): 0
		
		System.out.println("Ceiling of '"+ d1 + "' = " + Math.ceil(d1)); // Ceiling of '84.6' = 85.0
		 
		System.out.println("Floor of '"+ d1 + "' = " + Math.floor(d1));  // Floor of '84.6' = 84.0
		 
		System.out.println("Ceiling of '"+ d2 + "' = " + Math.ceil(d2)); // Ceiling of '0.45' = 1.0
		 
		System.out.println("Floor of '"+ d2 + "' = " + Math.floor(d2));  // Floor of '0.45' = 0.0
		
		System.out.println("Minimum out of '"+ i1 +"' and '" + i2+"' = "+ Math.min(i1, i2)); // Minimum out of '27' and '-45' = -45
		 
		System.out.println("Maximum out of '"+ i1 +"' and '" + i2+"' = "+ Math.max(i1, i2)); // Maximum out of '27' and '-45' = 27
		 
		System.out.println("Minimum out of '"+ d1 +"' and '" + d2+"' = "+ Math.min(d1, d2)); // Minimum out of '84.6' and '0.45' = 0.45
		 
		System.out.println("Maximum out of '"+ d1 +"' and '" + d2+"' = "+ Math.max(d1, d2)); // Maximum out of '84.6' and '0.45' = 84.6
		
		double angle_30 = 30.0;
		double radian_30 = Math.toRadians(angle_30);
		 
		System.out.println("sin(30) = " + Math.sin(radian_30)); // sin(30) = 0.49999999999999994
		 
		System.out.println("cos(30) = " + Math.cos(radian_30)); // cos(30) = 0.8660254037844387
		 
		System.out.println("tan(30) = " + Math.tan(radian_30)); // tan(30) = 0.5773502691896257
		 
		System.out.println("Theta = " + Math.atan2(4, 2)); // Theta = 1.1071487177940904
	}

}
