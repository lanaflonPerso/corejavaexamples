package com.rdayala.basics;

// In general, for Singleton usage, we declare a constructor as private.

class MySingleTon {

    private static MySingleTon myObj;
    
    /**
     * Create private constructor
     */
    private MySingleTon(){

    }
    
    /**
     * Create a static method to get instance.
     */
    public static MySingleTon getInstance(){
        if(myObj == null){
            myObj = new MySingleTon();
        }
        return myObj;
    }

    public void getSomeThing(){
        // do something here
        System.out.println("I am here....");
    }
}

public class ConstructorDeclaredPrivate {

    public static void main(String a[]){
    	
    	// We cannot create an object, as the constructor is defined private.
    	// MySingleTon obj = new MySingleTon(); // Compiler Error : The constructor is not visible.
    	
    	MySingleTon st1 = MySingleTon.getInstance();
    	MySingleTon st2 = MySingleTon.getInstance();
    	
    	if(st1 == st2) {
    		System.out.println("Both objects refer the same object!! Singleton returns one object only!");
    	}
    	
        st1.getSomeThing();
    }

}
