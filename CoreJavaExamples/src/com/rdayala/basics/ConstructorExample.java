package com.rdayala.basics;


/**
 * A constructor is a special method whose task is to initialize the object of its class.
 */

/*
 * Constructors are the same as methods w.r.t access specifiers - 
 * if you don't give an explicit access specifier like, public,
 * private or protected then the constructor gets the default "package private" visibility.
 * It can be called from within the same class or from any other class in the same package,
 * but not from subclasses in a different package.
 * (so if a class has only package-visible constructors then any subclasses must be in the same package).
 * 
 * A private constructor prevents any other class from instantiating this one,
 * but you can have a public static factory method within the class
 * that calls its own private constructor. This is a common pattern for things like singletons.
 * 
*/

// [NOTE:]They cannot be inherited, though a derived class can call the base class constructor.

class Student {
	int studentId;
	String studentName;
	
	/**
	 * Constructor is special because its name is the same as the class name.
	 * You can't have constructors with different names. They must match the classname.
	 * They do not have return types, not even void and therefore they cannot return values.
	 * Constructor is invoked whenever an object of its associated class is created.
	 * 
	 */
	
	// NOTE: Method name - same as class name
	// No RETURN type, not even void
	// The access modifier of the constructor is the same as the class itself
	
	Student(int id, String name) {
		studentId = id;
		studentName = name;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}

public class ConstructorExample {

	public static void main(String[] args) {
		
		// Creating objects using constructor.
		// constructor internally initializes the instance variables
		
		Student s1 = new Student(12, "Raghu");
		Student s2 = new Student(13, "Rahul");
		
		// default constructor is not available. Why??
		// If you manually declare a constructor with arguments, the compiler
		// will not provide default constructor. You have to explicitly define
		// a default constructor.
		
		// Student s3 = new Student(); // ERROR 
		
		System.out.println("Student 1 : " + s1.getStudentId() + ", " + s1.getStudentName());
		System.out.println("Student 2 : " + s2.getStudentId() + ", " + s2.getStudentName());

	}

}
