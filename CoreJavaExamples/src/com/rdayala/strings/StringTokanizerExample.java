package com.rdayala.strings;

import java.util.StringTokenizer;

// java.util.StringTokenizer class allows you to break a string into tokens.

// StringTokenizer class is deprecated now. *******
// It is recommended to use split() method of String class or regex (Regular Expression).

public class StringTokanizerExample {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("my name is khan", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		StringTokenizer st1 = new StringTokenizer("my,name,is,khan");

		// printing next token
		System.out.println("Next token is : " + st1.nextToken(","));

	}

}
