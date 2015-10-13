package com.rdayala.basics;

public class BreakExample {
	
	public static void main(String a[]){
		
        //the for loop suppose to iterate 10 times.
        //but when i reaches to 5, the loop is going to
        //break
        
		for(int i=0;i<10;i++){
            if(i==5){
                System.out.println("breaking the for loop...");
                break;
            }
            System.out.println(i);
        }
    }

}
