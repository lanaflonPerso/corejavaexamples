package com.rdayala.basics;

public class IntegerNumberConversion {

	public static void main(String[] args) {
		
		//declare string containing binary number
        String strBinaryNumber = "111000";
        
        /*
         * to convert binary number to decimal number use,
         * int parseInt method of Integer wrapper class.
         *
         * Pass 2 as radix for the second argument.
         */
         
         int decimalNumber = Integer.parseInt(strBinaryNumber,2);
         
         System.out.println("Binary number : " + strBinaryNumber + " - Decimal number : " + decimalNumber);
         
         int i = 56;        
         
         String strBinaryNumber1 = Integer.toBinaryString(i);                  
                 
         System.out.println("Decimal number : " + i + " - Binary number : " + strBinaryNumber1);
         
       //declare string containing hexadecimal number
         String strHexNumber = "20";
        
         /*
          * to convert hexadecimal number to decimal number use,
          * int parseInt method of Integer wrapper class.
          *
          * Pass 16 as radix for the second argument.
          */
          
          int hexDecimalNumber = Integer.parseInt(strHexNumber, 16);          
          System.out.println("Hex number : " + strHexNumber + " - Decimal number : " + hexDecimalNumber);
          
          Integer intObj1 = new Integer(10);
          Integer intObj2 = new Integer(10);
          
          int result =  intObj1.compareTo(intObj2); // Integer.compare(intObj1.intValue(), intObj2.intValue());
          if(result == 0) {
        	  System.out.println("Both integer object values are equal");
          }

	}

}
