package com.rdayala.basics;

public class FinalVariableExample {
	 
    public static void main(String[] args) {
           
            /*
             * Final variables can be declared using final keyword.
             * Once created and initialized, its value can not be changed.
             */
            final int hoursInDay=24;
           
            //This statement will not compile. Value can't be changed.
            //hoursInDay=12;
           
            System.out.println("Hours in 5 days = " + hoursInDay * 5);
           
    }
}
