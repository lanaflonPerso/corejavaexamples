package com.rdayala.basics;

public class LineSeparatorExample {

	public static void main(String[] args) {

		// to get platform independent line separator
		// System.getProperty("line.separator");
		
		// to get platform independent file separator
		//System.out.println(System.getProperty("file.separator"));

		StringBuilder newLine = new StringBuilder();
		newLine.append("abc");
		newLine.append(System.getProperty("line.separator"));
		newLine.append("def");
		String output = newLine.toString();
		System.out.println(output);

	}

}
