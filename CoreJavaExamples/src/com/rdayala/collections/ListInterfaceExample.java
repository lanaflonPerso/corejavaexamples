package com.rdayala.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListInterfaceExample {

	public static void main(String[] args) {

		// Creating a list

		List<String> listWithSameElements = Collections.nCopies(5, "Raghu");
		System.out.println(listWithSameElements);
		// [output] : [Raghu, Raghu, Raghu, Raghu, Raghu]

		// Iterating

		Iterator itr = listWithSameElements.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		for (String str : listWithSameElements) {
			System.out.println(str);
		}

		//

		List list = new ArrayList();

		list.add("1");

		System.out.println("List has:" + list);

		// Compare two Lists

		List list1 = new ArrayList();
		list1.add("1");

		System.out.println("List1 has:" + list1);

		System.out.println("Lists are equal : " + list.equals(list1));

		list.add("2");
		list.add("3");

		list.add("java2s.com");

		System.out.println("List has:" + list);

		// Sub list from a list - sublist
		// startIndex - inclusive, endIndex - exclusive

		List subList = list.subList(1, 3);

		System.out.println(subList);

		// List to Array

		Object[] array = list.toArray();

		System.out.println(Arrays.toString(array));

		// Is it contains an element

		System.out.println("Contains : " + list.contains("java2s.com"));

		// Get and Set an element

		System.out.println("Element at index 3 : " + list.get(3));

		list.set(2, "4");
		System.out.println(list);

		// Get the index of an element

		System.out.println(list.indexOf("java2s.com"));

		// Remove element from List

		list.remove("java2s.com");
		System.out.println(list);

		// List size and check for IsEmpty

		System.out.println("List isEmpty : " + list.isEmpty());
		System.out.println("List Size : " + list.size());

		// Clear a List

		list.clear();

		System.out.println("List has:" + list);

	}

}
