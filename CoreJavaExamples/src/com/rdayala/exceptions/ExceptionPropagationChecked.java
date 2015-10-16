package com.rdayala.exceptions;

import java.io.IOException;

// By default, Checked Exceptions are not forwarded in calling chain (propagated).
// Use throws clause in method declaration

public class ExceptionPropagationChecked {

	// compile time error : Unhandled exception
	// To avoid compile time error, added throws clause
	// Now the exception will be propagated to call stack
	
	void m() throws IOException{
		throw new java.io.IOException("device error"); // checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception handeled! : " + e.getMessage());
		}
	}

	public static void main(String args[]) {
		ExceptionPropagationChecked obj = new ExceptionPropagationChecked();
		obj.p();
		System.out.println("normal flow");
	}

}
