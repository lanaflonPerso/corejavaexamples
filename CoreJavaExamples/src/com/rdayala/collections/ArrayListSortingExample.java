package com.rdayala.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingExample {

	public static void main(String[] args) {

		ArrayList<String> listofcountries = new ArrayList<String>();
		listofcountries.add("India");
		listofcountries.add("US");
		listofcountries.add("China");
		listofcountries.add("Denmark");

		/* Unsorted List */
		System.out.println("Before Sorting:");
		for (String counter : listofcountries) {
			System.out.println(counter);
		}

		/* Sort statements in ascending order */
		Collections.sort(listofcountries);

		/* Sorted List */
		System.out.println("Sorting in ascending order:");
		for (String counter : listofcountries) {
			System.out.println(counter);
		}
		
		/* Sort statements in descending order */		
		Collections.sort(listofcountries, Collections.reverseOrder());

		/* Sorted List */
		System.out.println("Sorting in descending order:");
		for (String counter : listofcountries) {
			System.out.println(counter);
		}

	}

}
