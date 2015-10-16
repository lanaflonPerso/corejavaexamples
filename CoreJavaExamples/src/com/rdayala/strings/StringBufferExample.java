package com.rdayala.strings;

// StringBuffer - mutable, thread safe class
// the initial capacity of 16

// Every string buffer has a capacity. As long as the length of the character sequence contained in 
// the string buffer does not exceed the capacity, it is not necessary to allocate a new 
// internal buffer array. If the internal buffer overflows, it is automatically made larger.

//(oldcapacity*2)+2

//When we use toString() method, a new String object is allocated and initialized to contain 
//the character sequence currently represented by StringBuffer/StringBuilder object, that means 
//the subsequent changes to the StringBuffer/StringBuilder object do not affect the contents of 
//the String object.

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer sbObj = new StringBuffer();
		System.out.println("Defaut StringBuffer capacity : " + sbObj.capacity()); // initial capacity is 16

		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java
		System.out.println(sb.capacity()); // capacity : 22
		System.out.println(sb.length()); // length : 10
		
		// reverse() method
		
		System.out.println(sb.reverse());

		// Insert() method
		// inserts the given string with this string at the given position

		StringBuffer sbStr = new StringBuffer("Java!");
		sbStr.insert(0, "Welcome, ");
		System.out.println(sbStr);
		
		// replace() method

		sbStr.replace(0, 9, "Hello "); // endIndex is excluded
		System.out.println(sbStr);
		
		//StringBuffer comparison
		
		StringBuffer s1= new StringBuffer("Test");
		StringBuffer s2 = new StringBuffer("Test");
		
		// if(s1.equals(s2)) { // this will not work. 
		// StringBuffer does not override the Object.equals method
		
		if(s1.toString().equals(s2.toString())) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		/*
		 * 
		 * Ensures that the capacity is at least equal to the specified minimum.
		 * If the current capacity is less than the argument, then a new
		 * internal array is allocated with greater capacity.
		 * 
		 * The new capacity is the larger of: The minimumCapacity argument.
		 * Twice the old capacity, plus 2. If the minimumCapacity argument is
		 * nonpositive, this method takes no action and simply returns.
		 */

		sb = new StringBuffer();
		System.out.println(sb.capacity()); // default 16
		sb.append("Hello");
		System.out.println(sb.capacity());// now 16
		sb.append("java is my favourite language");
		System.out.println(sb.capacity()); // now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb.ensureCapacity(10); // now no change
		System.out.println(sb.capacity()); // now 34
		sb.ensureCapacity(50); // now (34*2)+2
		System.out.println(sb.capacity()); // now 70
		
		// *************** [NOTE] ****
		
		sb = new StringBuffer("beginnersbook");
	    String str = sb.toString();
	    System.out.println("***Before append***");
	    System.out.println("StringBuffer contains: "+sb);
	    System.out.println("String object contains: "+str);
		    
	    sb.append(".com");
		    
	    System.out.println("***After append***");
	    System.out.println("StringBuffer contains: "+sb);
	    System.out.println("String object contains: "+str);
	    
	}

}
