package com.rdayala.collections;

import java.util.HashSet;
import java.util.Set;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hashcode='" + this.hashCode() + '\'' +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!name.equals(person.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class HashSetTest {

	public static void main(String[] args) {
		
		Set<Person>  personSet = new HashSet<Person>();
        Person p1 = new Person("raghu", 12);
        Person p2 = new Person("rimmu", 21);               

        personSet.add(p1);
        personSet.add(p2);
        
        // 2: -938490489 : true
        System.out.println(personSet.size() + ": "+ p1.hashCode()+" : "+personSet.contains(p1));       
              
       // output : 2: 971569119 : false
       // Because p1.hashCode() changes when you modify p1, 
       // so it can't be found at its original index in the hash table anymore.
       
       // Just remember that you've got to remove such an object, modify it and add anew to the set.
        
//        personSet.remove(p1);
        
        p1.setName("raghus");
        p1.setAge(13);
        
//        personSet.add(p1);
        
       System.out.println(personSet.size() + ": "+ p1.hashCode()+" : "+personSet.contains(p1));
       
       for(Person p:personSet){
         System.out.println(p.getName() +"\t" + p.getAge());      
       }
              
	}

}
