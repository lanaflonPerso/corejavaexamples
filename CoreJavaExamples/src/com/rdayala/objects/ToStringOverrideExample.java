package com.rdayala.objects;

class Person
{
    String firstName;
 
    String lastName;
 
    Address address;
 
    public Person(String firstName, String lastName, Address address)
    {
        this.firstName = firstName;
 
        this.lastName = lastName;
 
        this.address = address;
    }
 
    @Override
    public String toString()
    {
        String s = "First Name = "+firstName+", Last Name = "+lastName+", "+address;
 
        return s;
    }
}
 
class Address
{
    String streetName;
 
    String city;
 
    String country;
 
    public Address(String streetName, String city, String country)
    {
        this.streetName = streetName;
 
        this.city = city;
 
        this.country = country;
    }
 
    @Override
    public String toString()
    {
        String s = "Street Name = "+streetName+", City = "+city+", Country = "+country;
 
        return s;
    }
}
 
// You can see here, Address is automatically converted to toString() when you are printing Person object

// Without toString() in Address: Output: First Name = John, Last Name = Thomas, com.rdayala.objects.Address@7852e922

public class ToStringOverrideExample
{
   public static void main(String[] args)
   {
      Address address = new Address("Victoria Road" ,"Bangalore", "India");
 
      Person person = new Person("John", "Thomas", address);
 
      System.out.println(person);
 
      // Output : First Name = John, Last Name = Thomas, Street Name = Victoria Road, City = Bangalore, Country = India
   }
}
