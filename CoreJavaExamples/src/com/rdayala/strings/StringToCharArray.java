package com.rdayala.strings;

import java.util.Arrays;

public class StringToCharArray {
	
	public static Character[] toCharacterArray(String s) {

		if (s == null) {
			return null;
		}

		int len = s.length();
		Character[] array = new Character[len];
		for (int i = 0; i < len; i++) {
			array[i] = new Character(s.charAt(i));
		}

		return array;
	}

	public static void main(String[] args) {

		// String to char[] array
		String s = "Welcome to Java Programming";
		char arr[] = s.toCharArray();
		for (char c : arr) {
			System.out.print(c);
		}

		System.out.println();

		// String to Character array [Wrapper Character]

		String st = "something Put Here";
		Character[] c = toCharacterArray(st);

		for (int i = 0; i < c.length; i++) {			
			System.out.print(c[i]);
		}

		System.out.println();

		// /

		String str = "Copy chars from this string";
		
		char[] ch = new char[5];
		/**
		 * The getChars() method accepts 4 parameters first one is the start
		 * index from string second one is the end index from string third one
		 * is the destination char array forth one is the start index to append
		 * in the char array.
		 */
		str.getChars(5, 10, ch, 0);
		System.out.println(ch);

	}

}
