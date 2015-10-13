package com.rdayala.basics;

public class ContinueExample {
	
	public static void main(String a[]){

        for(int i=1;i<=10;i++){
        	
            /**
             * here this loop prints only odd numbers.
             * if below condition returns true, the current
             * iteration will be skipped and continues to next iteration
             */
            
        	if(i%2 == 0){
                continue;
            }
            
        	System.out.println(i);
        }
    }

}
