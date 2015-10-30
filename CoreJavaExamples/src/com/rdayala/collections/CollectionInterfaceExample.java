package com.rdayala.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionInterfaceExample {

	public static void main(String[] args) {

		// Add elements to a collection

		Collection collection = new ArrayList();
		collection.add("Raghu");

		System.out.println(collection);

		// Compare two collections
		Collection collection1 = new ArrayList();
		collection1.add("Raghu");

		System.out.println(collection.equals(collection1));

		// Is it contained in the collection

		collection.add("Ramya");
		collection.add("Veda");
		collection.add("Srinath");
		System.out.println(collection);

		System.out.println("Contains : " + collection.contains("Ramya"));

		// Iterating over Collection elements
		// Using iterator, we can remove the collection elements as well

		Iterator itr = collection.iterator();
		while (itr.hasNext()) {
			String strElement = (String) itr.next();
			System.out.println(strElement);
		}

		for (Object o : collection) {
			System.out.println((String) o);
		}

		// Convert collection to Array

		Object[] array = collection.toArray();
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));

		// Size of a collection

		System.out.println("Collection size : " + collection.size());

		// Is collection empty

		System.out.println("Is Collection empty : " + collection.isEmpty());

		// Remove elements from a collection

		collection.remove("j a v a 2 s . com");
		System.out.println(collection);

		collection.removeAll(collection1);
		System.out.println(collection);

		// Clear a collection

		collection.clear();

		System.out.println(collection);
	}

}
