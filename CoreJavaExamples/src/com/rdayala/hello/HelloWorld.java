package com.rdayala.hello;

import java.util.Scanner;

public class HelloWorld {
	
	static void someMethod() {
		int x = 10;
		System.out.println(x);
	}

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		someMethod();
		
		// to get platform independent line separator
		// System.getProperty("line.separator");
		System.out.println(System.getProperty("file.separator"));
		
		StringBuilder newLine=new StringBuilder();
		newLine.append("abc");
		newLine.append(System.getProperty("line.separator"));
		newLine.append("def");
		String output=newLine.toString();
		System.out.println(output);

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