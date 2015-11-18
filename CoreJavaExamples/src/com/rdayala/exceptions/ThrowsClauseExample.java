package com.rdayala.exceptions;

import java.io.IOException;

// The throws keyword is used in method declaration, in order to explicitly 
// specify the exceptions that a particular method might throw.

// When a method declaration has one or more exceptions defined 
// using throws clause then the method-call must handle all the defined exceptions.

// If a method is using throws clause along with few exceptions then this implicitly 
// tells other methods that – “ If you call me, you must handle these exceptions that I throw”.

// For a method throwing checked type of exceptions, you must declare it 
// with throws keyword or enclose the statement which is throwing an exception in try-catch block.

class ThrowExample {
	
	// method declaration with throws clause
	void mymethod(int num) throws IOException, ClassNotFoundException {
		if (num == 1)
			throw new IOException("Exception Message1");
		else
			throw new ClassNotFoundException("Exception Message2");
	}
}

// [HOW TO HANDLE] 2 ways :
// a. Using throws clause at main() method to indicate that am using a method which throws exceptions
// b. Enclosing the method call in try-catch block

public class ThrowsClauseExample {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		// calling method mymethod() which throws exceptions 
		ThrowExample obj = new ThrowExample();
		obj.mymethod(1);
		
		// b. handle the exception which mymethod() throws, using try-catch block
		try {
			ThrowExample obj2 = new ThrowExample();
			obj2.mymethod(3);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
	}
}
