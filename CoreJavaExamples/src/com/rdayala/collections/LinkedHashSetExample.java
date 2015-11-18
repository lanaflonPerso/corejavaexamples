package com.rdayala.collections;

import java.util.LinkedHashSet;

// LinkedHashSet - preserves the insertion order
// LinkedHashSet - extends HashSet class
// It doesn't allow duplicates.
// null elements are allowed. But only one element, even if you add multiple null elements.

public class LinkedHashSetExample {

	public static void main(String[] args) {

		// LinkedHashSet of String Type
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();

		// Adding elements to the LinkedHashSet
		lhset.add(null);
		lhset.add("Z");
		lhset.add("PQ");
		lhset.add("N");
		lhset.add("O");
		lhset.add("PQ");
		lhset.add("KK");
		lhset.add("Z");
		lhset.add("FGH");
		lhset.add(null);
		lhset.add(null);
		
		System.out.println(lhset);

	}

}
