package com.rdayala.exceptions;

import java.io.*;

// Checked Exceptions - A checked exception is an exception that occurs at the compile time.
// Also called as compile time exceptions.

// These exceptions cannot simply be ignored at the time of compilation, 
// the Programmer should take care of (handle) these exceptions.

// If we remove, throws FileNotFoundException , the below program gives compile error.
// [NOTE] Checked exception - a method which specifies that it throws an exception. make sure
// you handle the exception in try-catch block or include throws clause at your method declaration.
//If not handled properly, they will give compile time error.

// ClassNotFoundException
// IllegalAccessException
// NoSuchFieldException 

// All sub classes of java.lang.Exception except sub classes of RunTimeException are checked exceptions.

public class CheckedExceptionCompileError {

	public static void main(String args[]) throws FileNotFoundException {		
	      File file=new File("E://file.txt");
	      FileReader fr = new FileReader(file); 
	      
	   }

}
