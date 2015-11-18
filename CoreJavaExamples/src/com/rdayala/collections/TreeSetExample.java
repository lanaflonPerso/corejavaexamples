package com.rdayala.collections;

import java.util.TreeSet;

// TreeSet sorts the elements in the ascending order while HashSet doesn’t maintain any order.
// TreeSet doesn't allow null elements, if so it throws NullPointerException
// Like HashSet, TreeSet doesn’t allow duplicate values

// TreeSet with custom classes must implement Comparable interface or
// Comparator to allow sorting.
// TreeSet is not synchronized. To make it, use
// SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));

public class TreeSetExample {

	public static void main(String[] args) {

		// TreeSet of String Type
		TreeSet<String> tset = new TreeSet<String>();

		// Adding elements to TreeSet<String>
		tset.add("ABC");
		tset.add("String");
		tset.add("Test");
		tset.add("Pen");
		tset.add("Ink");
		tset.add("Jack");
		tset.add("Jack");
		tset.add("Pen");				
		// tset.add(null); // throws NullPointerException
		
		// display first element in the treeset
		System.out.println(tset.first());
		
		// display last element in the treeset
	    System.out.println(tset.last());
	    
	    // headSet(toElement) -  portion of this set whose elements are strictly less than toElement
	    System.out.println("Head set : " + tset.headSet("Jack"));
	    
	    // tailSet(fromElement) - portion of this set whose elements are greater than or equal to fromElement.	    
	    System.out.println("Tail set : " + tset.tailSet("Jack"));	    	    
		
		// Displaying TreeSet
		System.out.println(tset);
		
		// size of treeset
		System.out.println("Size : " + tset.size());
		
		// subset from this treeset
		// Returns a view of the portion of this set whose elements 
		// range from fromElement, inclusive, to toElement, exclusive.
		System.out.println(tset.subSet("Ink", "String"));
		
		// Remove element from treeset
		tset.remove("String");
		System.out.println(tset);

		// TreeSet of Integer Type
		TreeSet<Integer> tset2 = new TreeSet<Integer>();

		// Adding elements to TreeSet<Integer>
		tset2.add(88);
		tset2.add(7);
		tset2.add(101);
		tset2.add(0);
		tset2.add(3);
		tset2.add(222);
		System.out.println(tset2);

	}

}
