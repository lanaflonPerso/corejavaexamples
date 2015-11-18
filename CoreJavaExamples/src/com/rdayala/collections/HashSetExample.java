package com.rdayala.collections;

import java.util.HashSet;

//HashSet doesn’t maintain any order, the elements would be returned in any random order.
//HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
//HashSet allows null values however if you insert more than one nulls it would still return only one null value.
//HashSet is non-synchronized.

//To get synchronized HashSet, use Collections.synchronizedSet() method

public class HashSetExample {

	public static void main(String[] args) {

		// HashSet declaration
		HashSet<String> hset = new HashSet<String>();

		// Adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");

		// Addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");

		// Addition of null values
		hset.add(null);
		hset.add(null);

		// Displaying HashSet elements
		System.out.println(hset);

		// [Output] : [null, Apple, Grapes, Fig, Mango, Orange]

	}

}
