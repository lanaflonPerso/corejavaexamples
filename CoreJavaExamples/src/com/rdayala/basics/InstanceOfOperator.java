package com.rdayala.basics;

class Subject
{
    void methodOfSubject()
    {
        System.out.println("From Subject");
    }
}
 
class Physics extends Subject
{
    @Override
    void methodOfSubject()
    {
        System.out.println("From Physics");
    }
}
 
class Biology extends Subject
{
    @Override
    void methodOfSubject()
    {
        System.out.println("From Biology");
    }
}
 
class Botany extends Biology
{
    @Override
    void methodOfSubject()
    {
        System.out.println("From Botany");
    }
}
 
class Zoology extends Biology
{
    @Override
    void methodOfSubject()
    {
        System.out.println("From Zoology");
    }
}

public class InstanceOfOperator {

	public static void main(String[] args) {
		
		//An array of Subjects
        Subject[] subjects = {new Biology(), new Botany(), new Zoology(), new Subject(), new Physics()};
 
        for (int i = 0; i < subjects.length; i++)
        {
            // Checking whether the object is a type of Biology using instanceof operator
        	// Checking whether the object is a type of Biology or it’s sub types(Botany and Zoology)
        	 
            if(subjects[i] instanceof Biology)
            {
            	Biology biology = (Biology) subjects[i];
            	biology.methodOfSubject();
            }
        }

	}

}
