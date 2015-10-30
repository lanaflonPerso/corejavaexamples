package com.rdayala.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListIterationExample {

	public static void main(String[] args) {

		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(14);
		arrlist.add(7);
		arrlist.add(39);
		arrlist.add(40);

		// Method 1: Using Iterator

		System.out.println("Iterator");
		Iterator iter = arrlist.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// Method 2: Enhaned for loop / foreach loop / for-each

		System.out.println("For each Loop");
		for (int number : arrlist) {
			System.out.println(number);
		}

		// Method 3: for loop

		System.out.println("For Loop");
		for (int counter = 0; counter < arrlist.size(); counter++) {
			System.out.println(arrlist.get(counter));
		}

		// Method 4: while loop

		System.out.println("While Loop");
		int count = 0;
		while (arrlist.size() > count) {
			System.out.println(arrlist.get(count));
			count++;
		}

		// Method 5: Enumeration
		// Enumeration is read-only

		System.out.println("Enumeration");
		Enumeration<Integer> e = Collections.enumeration(arrlist);		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
