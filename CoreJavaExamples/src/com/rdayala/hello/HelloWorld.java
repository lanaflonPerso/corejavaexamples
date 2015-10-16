package com.rdayala.hello;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		// to get platform independent line separator
		// System.getProperty("line.separator");
		System.out.println(System.getProperty("file.separator"));
		
		StringBuilder newLine=new StringBuilder();
		newLine.append("abc");
		newLine.append(System.getProperty("line.separator"));
		newLine.append("def");
		String output=newLine.toString();
		System.out.println(output);
		
		// Reverse a string without using split() or related methods

//		Scanner sc = new Scanner(System.in);
//		String word = sc.nextLine();
//
//		stringReverse(word);
	}

	static void stringReverse(String word) {
		char words[] = word.toCharArray();
		StringBuffer sb = new StringBuffer();

		for (int i = words.length - 1; i >= 0; i--) {			
			if (words[i] != ' ') {
				sb.append(words[i]);
			} else {
				System.out.print(sb.reverse() + " ");
				sb = new StringBuffer();
			}
			if (i == 0) {
				System.out.print(sb.reverse());
				sb = null;
			}
		}
	}
}