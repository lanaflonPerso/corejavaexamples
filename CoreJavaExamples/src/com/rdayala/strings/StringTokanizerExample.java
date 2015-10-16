package com.rdayala.strings;

import java.util.StringTokenizer;

// java.util.StringTokenizer class allows you to break a string into tokens.

// StringTokenizer class is deprecated now. *******
// It is recommended to use split() method of String class or regex (Regular Expression).

public class StringTokanizerExample {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("my name is khan", " ");
		System.out.println("Count: "+st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String msg = "http://10.123.43.67:80/";
        StringTokenizer st2 = new StringTokenizer(msg,"://.");
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }

		StringTokenizer st1 = new StringTokenizer("my,name,is,khan");

		// printing next token
		System.out.println("Next token is : " + st1.nextToken(","));
		
		// tokens with delimiters
		// delimiters are also included as tokens
		// output: my	:	name	/	is	.	khan
		
		StringTokenizer st3 = new StringTokenizer("my:name/is.khan","://.",true);
        while(st3.hasMoreTokens()){
            System.out.print(st3.nextToken()+ "\t");
        }

	}

}
