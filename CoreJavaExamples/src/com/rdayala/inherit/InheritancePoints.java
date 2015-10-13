package com.rdayala.inherit;

/*
Constructors, SIB – Static Initialization Block and IIB – Instance Initialization Block 
of super class will not be inheriting to its sub class. 
But they are executed while creating an object to sub class
*/

class ABC
{
    int i;
 
    static
    {
        System.out.println("Class A SIB");
    }
 
    {
        System.out.println("Class A IIB");
    }
 
    ABC()
    {
        System.out.println("Class A Constructor");
    }
}
 
class BBC extends ABC
{
    int j;
}
 
public class InheritancePoints
{
    public static void main(String[] args)
    {
        BBC b = new BBC();
    }
}
