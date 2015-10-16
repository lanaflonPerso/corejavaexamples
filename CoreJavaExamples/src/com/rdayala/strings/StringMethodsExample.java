package com.rdayala.strings;

public class StringMethodsExample {

	public static void main(String[] args) {
		
		// String is an array of characters
				char[] arrSample = { 'R', 'O', 'S', 'E' };
				String strSample_1 = new String(arrSample);

				// the newly created string is a copy of the argument string
				String oneStr = new String("one");
				String twoStr = new String(oneStr);

				if (oneStr != twoStr) {
					System.out
							.println("two string objects are not refer to same memory!");
				}

				// boolean equals(Object anObject)
				if (oneStr.equals(twoStr)) {
					System.out.println("two string objects contents are equal");
				}

				if (oneStr.contentEquals("one")) {
					System.out.println("content is equal!");
				}
				
				String emptyString = "";
				if(emptyString.isEmpty()) {
					System.out.println("String is empty!");
				}

				// String(StringBuffer buffer)
				// String(StringBuilder builder)

				// Representation of String
				String strSample_2 = "ROSE";

				// String Concatenation
				String str1 = "Rock";
				String str2 = "Star";

				// Method 1 : Using concat
				String str3 = str1.concat(str2);
				System.out.println(str3);

				// Method 2 : Using "+" operator
				String str4 = str1 + str2;
				System.out.println(str4);

				String str_Sample = "RockStar";
				String str_long = "RockStar is a super Star";

				// Length of a String
				System.out.println("Length of String: " + str_Sample.length());

				// Character at a given index
				System.out.println("Character at position 5: " + str_Sample.charAt(5));

				// Index of a given character
				System.out
						.println("Index of character 'S': " + str_Sample.indexOf('S'));

				// Index of a substring within this string
				System.out.println("Index of string Star : "
						+ str_Sample.indexOf("Star"));

				// Index of last occurrence of a substring within a string
				System.out.println("Last index of string Star : "
						+ str_long.lastIndexOf("Star"));

				// Compare to a string - 0 for equals, < 0, if current string is
				// lexicographically less than string argument
				// int compareTo(String anotherString)
				System.out.println("Compare To 'ROCKSTAR': "
						+ str_Sample.compareTo("rockstar"));

				// Compare to - Ignore case
				System.out.println("Compare To 'ROCKSTAR' - Case Ignored: "
						+ str_Sample.compareToIgnoreCase("ROCKSTAR"));

				// String contains a sequence of characters
				// boolean contains(CharSequence s)
				System.out.println("Contains sequence 'tar': "
						+ str_Sample.contains("tar"));

				// Check if String ends with a particular character
				System.out.println("EndsWith character 'r': "
						+ str_Sample.endsWith("r"));

				// replace part of a string with a new string
				System.out.println("Replace 'Rock' with 'Duke': "
						+ str_Sample.replace("Rock", "Duke"));

				// Convert string to lowercase
				System.out.println("Convert to LowerCase: " + str_Sample.toLowerCase());

				// Returning a substring
				System.out.println("Substring : " + str_long.substring(4));
				System.out.println("Substring with bounds : "
						+ str_long.substring(4, 15)); // endIndex is exclusive

				// Convert to UpperCase
				System.out.println("Convert to UpperCase: " + str_Sample.toUpperCase());

				// Remove leading and trailing whitespaces trim()
				String str_with_spaces = "         this is a string         ";
				System.out.println("trimmed string : " + str_with_spaces.trim());

				// Split examples
				String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
				String[] arrSplit = strMain.split(", ");
				for (int i = 0; i < arrSplit.length; i++) {
					System.out.println(arrSplit[i]);
				}
				
				 // If the limit n is greater than zero then the pattern will be applied at most n - 1 times
				String[] arrSplit_2 = strMain.split(", ", 3);
				for (int i = 0; i < arrSplit_2.length; i++) {
					System.out.println(arrSplit_2[i]);
				}

	}

}
