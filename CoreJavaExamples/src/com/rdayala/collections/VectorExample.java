package com.rdayala.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		/* Vector of initial capacity(size) of 2 */
		Vector<String> vec = new Vector<String>(2);

		/* Adding elements to a vector */
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Fig");				

		/* check size and capacityIncrement */
		System.out.println("Size is: " + vec.size());
		System.out.println("Default capacity increment is: " + vec.capacity());

		vec.addElement("fruit1");
		vec.addElement("fruit2");
		vec.addElement("fruit3");

		/* size and capacityIncrement after two insertions */
		System.out.println("Size after addition: " + vec.size());
		System.out.println("Capacity after increment is: " + vec.capacity());
		System.out.println(vec);
		
		// Is it contains an element
		System.out.println("Contains : " + vec.contains("Orange"));
		
		// Get first element, last element
		
		System.out.println("First Element : " + vec.firstElement());
		System.out.println("Last Element : " + vec.lastElement());
		System.out.println("Element at index 2 : " + vec.get(2));
		
		// Vector isEmpty
		System.out.println("Is Empty : " + vec.isEmpty()); 
		
		// Remove Element
		System.out.println(vec.remove("Fig"));
		System.out.println(vec.remove(3));
		System.out.println(vec);
		
		// Set or update an element at index
		vec.setElementAt("Fruit1", 3);

		/* Display Vector elements */
		Enumeration en = vec.elements();
		System.out.println("Elements are:");
		while (en.hasMoreElements())
			System.out.print(en.nextElement() + " ");

	}

}
