package com.rdayala.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
In case super class is not Serializable than to serialize the subclass’s object,
we must implement Serializable interface in subclass explicitly. 
In this case the superclass must have a no-argument constructor in it.

If superclass is not Serializable then all values of the instance variables inherited 
from super class will be initialized by calling constructor of Non-Serializable Super class 
during deserialization process. 

As we can see in the output of this program, ‘Gender’ and ‘Color’ is getting null 
because of no default value set. 
 */

class Human {
	String gender;
	String color;

	Human() {
	}

	Human(String gender, String color) {
		this.gender = gender;
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

class Man extends Human implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String address;

	Man(String gender, String color, String name, String address) {
		super(gender, color);
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

public class SuperClassNotSerializedButSubClass {

	public static void main(String[] args) {

		Man man = new Man("Male", "Black", "Anderw", "Delhi");

		// Serializing Man's instance
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("serialObject.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(man);

		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException ioe) {			
			ioe.printStackTrace();
		}

		 // De-serializing Man's instance
		Man manout = null;

		try {
			FileInputStream fileInputStream = new FileInputStream("serialobject.ser");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			manout = (Man) inputStream.readObject();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {			
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnf) {		
			cnf.printStackTrace();
		}

		/*
		 * Printing values from de-serialized Man's object
		 */
		System.out.println("Printing value of Deserailized Man's instance :");
		System.out.println("Gender: " + manout.getGender()); // super class instance variables will have default values
		System.out.println("Color: " + manout.getColor());
		System.out.println("Name: " + manout.getName());
		System.out.println("Address: " + manout.getAddress());

	}
}
