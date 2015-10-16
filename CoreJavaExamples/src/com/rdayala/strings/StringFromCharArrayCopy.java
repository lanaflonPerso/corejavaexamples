package com.rdayala.strings;

public class StringFromCharArrayCopy {

	public static void main(String[] args) {
		
		char ch[] = {'M','y',' ','J','a','v','a',' ','e','x','a','m','p','l','e'};
		
		String str = new String(ch);
		System.out.println(str);
		
		
        /**
         * We can copy a char array to a string by using
         * copyValueOf() method.
         */
        String chStr = String.copyValueOf(ch);
        System.out.println(chStr);
        
        /**
         * We can also copy only range of characters in a
         * char array by copyValueOf() method.
         */
        String subStr = String.copyValueOf(ch,3,4);
        System.out.println(subStr);

	}

}
