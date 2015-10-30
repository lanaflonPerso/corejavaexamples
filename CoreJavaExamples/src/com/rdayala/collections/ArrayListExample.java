package com.rdayala.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		// http://beginnersbook.com/2013/12/java-arraylist/
		/*
		 * Creation of ArrayList: I'm going to add String elements so I made it
		 * of string type
		 */
		ArrayList<String> obj = new ArrayList<String>();

		/* This is how elements should be added to the array list */
		obj.add("Ajeet");
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");

		/* Displaying array list elements */
		System.out.println("Currently the array list has elements:" + obj);

		/* Add element at the given index */
		obj.add(0, "Rahul");
		obj.add(1, "Justin");

		System.out.println("Currently the array list has elements:" + obj);

		// Replace or update element at given index
		obj.set(2, "Raghu");
		System.out.println("Currently the array list has elements:" + obj);

		// Shallow copy an array list or clone an array list
		Object alist = obj.clone();
		System.out.println("Clone : " + alist);

		// Number of elements or Size of the array List
		System.out.println(obj.size());

		// Is contains an element
		System.out.println(obj.contains("Raghu"));

		// Index of a given element
		System.out.println(obj.indexOf("Raghu"));

		// Get a particular element at a given index
		String str = obj.get(2);
		System.out.println(str);

		// Sublist to List
		// startIndex - inclusive, endIndex - excluded
		List<String> list = obj.subList(1, 4);
		System.out.println("SubList stored in List: " + list);

		/* Remove elements from array list like this */
		obj.remove("Chaitanya");
		obj.remove("Harry");

		System.out.println("Current array list is:" + obj);

		/* Remove element from the given index */
		obj.remove(1);

		System.out.println("Current array list is:" + obj);

		// Removing all the elements of the array list
		obj.clear();
		System.out.println(obj);

		// Join two ArrayLists

		// First ArrayList
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("AL1: E1");
		arraylist1.add("AL1: E2");
		arraylist1.add("AL1: E3");

		// Second ArrayList
		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("AL2: E1");
		arraylist2.add("AL2: E2");
		arraylist2.add("AL2: E3");

		// New ArrayList
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(arraylist1);
		al.addAll(arraylist2);

		// Displaying elements of the joined ArrayList
		for (String temp : al) {
			System.out.println(temp);
		}

		// array to arraylist conversion
		// Array Declaration and initialization
		String citynames[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };

		// Array to ArrayList conversion using Arrays.asList()
		ArrayList<String> citylist = new ArrayList<String>(
				Arrays.asList(citynames));
		System.out.println(citylist);

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

		Object[] oNames = friendsnames.toArray();
		for (Object oName : oNames) {
			System.out.println(oName);
		}

	}

}
