package com.rdayala.exceptions;

// Scenario : Superclass method DECLARES an EXCEPTION

// Rule: If the superclass method declares an exception, subclass overridden method 
// can declare same, subclass exception or no exception but cannot declare parent exception.

// -----------------------------------------------------------------------

// Example in case : subclass overridden method declares parent exception

class ParentOne {

	// Superclass method throws an exception
	void msg() throws ArithmeticException {
		System.out.println("parent");
	}
}

class TestExceptionChild2 extends ParentOne {

	// Compile time error
	// Breaks Rule. Here, subclass overridden method declares parent Exception.
	// Not accepted!
	// ArithmeticException is a subclass of Exception

	// void msg() throws Exception {
	// System.out.println("child");
	// }
}

// ----------------------------------------------------------------------

// Example in case subclass overridden method declares same exception

class ParentTwo {
	// superclass method declares an exception of type Exception
	void msg() throws Exception {
		System.out.println("parent");
	}
}

class TestExceptionChild3 extends ParentTwo {

	// child class overridden method declares same exception type Exception as
	// thrown by superclass method.
	void msg() throws Exception {
		System.out.println("child");
	}
}

// ---------------------------------------------------------------------

// Example in case subclass overridden method declares subclass exception

class ParentThree {

	// superclass method throws an exception of type Exception
	void msg() throws Exception {
		System.out.println("parent");
	}
}

class TestExceptionChild4 extends ParentThree {

	// child class overridden method declares an exception which is
	// sub-class of exception thrown by superclass method

	void msg() throws ArithmeticException {
		System.out.println("child");
	}
}

// ---------------------------------------------------------------------

// Example in case subclass overridden method declares no exception

class ParentFour {

	// superclass method throws an exception
	void msg() throws Exception {
		System.out.println("parent");
	}
}

class TestExceptionChild5 extends ParentFour {

	// child class overridden method declares no exception.
	// this is Accepted!!

	void msg() {
		System.out.println("child");
	}
}

public class ExceptionInheritance2 {

	public static void main(String[] args) {
		ParentFour p = new TestExceptionChild5();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
