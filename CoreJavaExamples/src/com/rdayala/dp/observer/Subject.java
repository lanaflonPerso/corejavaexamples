package com.rdayala.dp.observer;

public interface Subject {
	
	//methods to register and unregister observers
    public void register(Observer obj);
    public void unregister(Observer obj);
     
    //method to notify observers of change
    public void notifyAllObservers();
     
    //method to get updates from subject
    public Object getState();
    
    // method to change state of the subject
    public void setState(String msg);
}
