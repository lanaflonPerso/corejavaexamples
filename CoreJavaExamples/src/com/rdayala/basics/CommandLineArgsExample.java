package com.rdayala.basics;

public class CommandLineArgsExample {

	public static void main(String[] args) {

		// to display each of its command-line arguments on a line by itself

		for (String s : args) {
			System.out.println(s);
		}

		// parsing numeric command-line arguments
		
		// All of the Number classes — Integer, Float, Double, and so on — have 
		// parseXXX methods that convert a String representing a number to an object of their type.

		int firstArg;
		
		if (args.length > 0) {
			try {
				
				firstArg = Integer.parseInt(args[0]); // parse String to get integer value
			} 
			catch (NumberFormatException e) {
				System.err.println("Argument" + args[0]
						+ " must be an integer.");
				System.exit(1);
			}
		}

	}

}
