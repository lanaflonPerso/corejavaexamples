package com.rdayala.hello;

// on this file, run UCDetector
// Right click on the file --> select UCDetector --> Detect unnecessary code
class Sample {
    
    public int a;
 
    public int getA() {
        return a;
    }
 
    public void setA(int a) {
        this.a = a;
    }
}


public class UCDetectorExample {

	public static void main(String[] args) {
		
		Sample sample = new Sample();
		sample.setA(5);
		System.out.println(sample.getA());

	}

}
