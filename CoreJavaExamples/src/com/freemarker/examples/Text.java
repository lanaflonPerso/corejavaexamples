package com.freemarker.examples;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Text {
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader (new FileReader ("new13.txt"));
		String line = null;

		
		String patternStr = "\\[(.*?)\\]";
		
		while ((line = br.readLine()) != null) {
			
		    Pattern p = Pattern.compile(patternStr);
		    Matcher m = p.matcher("");		    
		    
		    m.reset(line);
		    int iter = 1;
		    int prevEnd = 0;
		    
		    while (m.find())
		    {
		    		    	
		    	if ( iter == 5 ) {		    	
		    		String var1=m.group(1);		     
		    		System.out.print("("+var1.toString()+")"+"\n");
		    	}
		    	iter++;
		    	prevEnd = m.end();
		    }			
		    
		    if ( iter == 5) {
		    	
		    	String str = line.substring(prevEnd);
		    	System.out.println(str);
		    }
		    
		    System.out.println();;
		}
	 
		br.close();
	}

}
