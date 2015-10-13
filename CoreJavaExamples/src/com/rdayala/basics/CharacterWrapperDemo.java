package com.rdayala.basics;

public class CharacterWrapperDemo {
	public static void main(String[] args) {
		char a[] = {'s','h','4','%','V',' '};
		for(int i=0;i<a.length;i++){
			if(Character.isDigit(a[i]))
				System.out.println(a[i] + " is a digit ");
			if(Character.isLetter(a[i]))
				System.out.println(a[i] + " is a letter ");
			if(Character.isWhitespace(a[i]))
				System.out.println(a[i] + " is a White Space ");
			if(Character.isLowerCase(a[i]))
				System.out.println(a[i] + " is a lower case ");
			if(Character.isUpperCase(a[i]))
				System.out.println(a[i] + " is a upper case ");
		}
	}
}
