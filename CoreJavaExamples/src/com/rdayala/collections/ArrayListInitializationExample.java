package com.rdayala.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListInitializationExample {

	public static void main(String[] args) {

		// Array Declaration and initialization
		String citynames[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };

		// Array to ArrayList conversion using Arrays.asList()
		ArrayList<String> citylist = new ArrayList<String>(
				Arrays.asList(citynames));
		System.out.println(citylist);

		// Array to ArrayList conversion using Collections.addAll() method
		ArrayList<String> townlist = new ArrayList<>();
		Collections.addAll(townlist, citynames);
		System.out.println(townlist);

		// arraylist to array conversion

		/* ArrayList declaration and initialization */
		ArrayList<String> friendsnames = new ArrayList<String>();
		friendsnames.add("Ankur");
		friendsnames.add("Ajeet");
		friendsnames.add("Harsh");
		friendsnames.add("John");

		/* ArrayList to Array Conversion */
		String frnames[] = friendsnames
				.toArray(new String[friendsnames.size()]);

		/* Displaying Array elements */
		for (String k : frnames) {
			System.out.println(k);
		}

		// Method 1: Initialization using Arrays.asList

		ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Pratap",
				"Peter", "Harsh"));
		System.out.println("Elements are:" + obj);

		// Method 2: Anonymous inner class method to
		// initialize ArrayList

		ArrayList<String> cities = new ArrayList<String>() {
			{
				add("Delhi");
				add("Agra");
				add("Chennai");
			}
		};
		System.out.println("Content of Array list cities:" + cities);

		// Method 3: Normal way of ArrayList initialization

		ArrayList<String> books = new ArrayList<String>();
		books.add("Java Book1");
		books.add("Java Book2");
		books.add("Java Book3");
		System.out.println("Books stored in array list are: " + books);

		// Method 4: Use Collections.ncopies

		ArrayList<Integer> intlist = new ArrayList<Integer>(
				Collections.nCopies(10, 5));
		System.out.println("ArrayList items: " + intlist);

	}
}
