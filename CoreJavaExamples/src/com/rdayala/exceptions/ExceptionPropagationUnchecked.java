package com.rdayala.exceptions;

// By default Unchecked Exceptions are forwarded in calling chain (propagated).

// 

public class ExceptionPropagationUnchecked {

	// Exception occurred in this method
	void m() {
		int data = 50 / 0;
	}

	// propagated to here..
	void n() {
		m();
	}

	// propagated to here and it is handled here..
	void p() {
		try {
			n();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception handled! : " + e.getMessage());
		}
	}

	public static void main(String args[]) {
		ExceptionPropagationUnchecked obj = new ExceptionPropagationUnchecked();
		obj.p();
		System.out.println("normal flow...");
	}

}
