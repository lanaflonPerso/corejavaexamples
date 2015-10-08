package com.rdayala.basics;

public class WrapperClassesExample {

	public static void main(String[] args) {
		
	// boolean -- Boolean
		
		boolean b = true;
		   
	    //1. using constructor
	    Boolean blnObj1 = new Boolean(b);
	   
	    //2. using valueOf method of Boolean class. This is a static method.
	    Boolean blnObj2 = Boolean.valueOf(b);
	    
	// Boolean -- boolean
	    
	    Boolean blnObj = new Boolean("true");
	    
	    //use booleanValue() of Boolean class to convert it into boolean primitive
	    boolean bool = blnObj.booleanValue();
	    
	// String -- Boolean
	    
	    //construct String object
	    String str = "false";
	   
	    //1. Convert using constructor
	    Boolean blnObj3 = new Boolean(str);
	    System.out.println(blnObj3);
	   
	    //2. Use valueOf method of Boolean class. This is a static method.
	    Boolean blnObj4 = Boolean.valueOf(str);
	    System.out.println(blnObj4);
	    
    // Boolean -- String
	    
	    //construct Boolean object
	    Boolean blnObj5 = new Boolean("true");
	   
	    //use toString method of Boolean class to convert it into String
	    String str5 = blnObj5.toString();
	    System.out.println(str5);	       
	    
	// int -- Integer
	    
	    int i = 10;
	    
	    Integer intObj = new Integer(i); // using constructor
	    
	    Integer intObja = Integer.valueOf(i); // Alternative way
	    
	// Integer -- int
	    
	    int number = intObj.intValue();	    	    
	    
	    System.out.println(number);
	    
	// String -- Integer
	    
	    //1. Construct Integer using constructor.
	    Integer intObj1 = new Integer("100");
	    System.out.println(intObj1);
	   
	    //2. Use valueOf method of Integer class. This method is static.
	    String strNumber = "100";
	    Integer intObj2 = Integer.valueOf(strNumber);
	    System.out.println(intObj2);
	
	// Integer -- String
	    
	    System.out.println(intObj.toString());
	    
	 // Similarly for other wrapper classes also, we have constructors and methods
	    
	}

}
