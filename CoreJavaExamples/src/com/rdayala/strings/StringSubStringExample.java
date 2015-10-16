package com.rdayala.strings;

// index starts from 0
// public String substring(int startIndex)
// public String substring(int startIndex, int endIndex)

// startIndex: inclusive
// endIndex: exclusive 

public class StringSubStringExample {

	public static void main(String[] args) {

		String s = "Sachin Tendulkar";
		System.out.println(s.substring(7));// Tendulkar
		System.out.println(s.substring(0, 6));// Sachin , endIndex is excluded

	}

}
