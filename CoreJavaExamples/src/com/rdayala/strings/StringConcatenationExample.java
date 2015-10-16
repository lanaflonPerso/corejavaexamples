package com.rdayala.strings;

// 2 ways
// By + (string concatenation) operator
// By concat() method

public class StringConcatenationExample {

	public static void main(String[] args) {

		// Internally : String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();
		String s = "Sachin" + " Tendulkar";
		System.out.println(s);// Sachin Tendulkar

		// After a string literal, all the + will be treated as string concatenation operator.
		String str = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(str);// 80Sachin4040

		String s1 = "Sachin ";
		String s2 = "Tendulkar";
		String s3 = s1.concat(s2);
		System.out.println(s3);// Sachin Tendulkar

	}

}
