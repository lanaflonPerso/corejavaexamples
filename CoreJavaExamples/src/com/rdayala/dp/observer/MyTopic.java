package com.rdayala.dp.observer;

import java.util.ArrayList;
import java.util.List;

// full example, check these links:
// http://www.journaldev.com/1739/observer-design-pattern-in-java-example-tutorial
// http://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 
public class MyTopic implements Subject {
 
    private List<Observer> observers = new ArrayList<>();
    private String message;    
     
    public MyTopic(){
        
    }
    
    @Override
    public void register(Observer obj) {
        observers.add(obj);       
    }
 
    @Override
    public void unregister(Observer obj) {       
        observers.remove(obj);       
    }
 
    @Override
    public void notifyAllObservers() {
    	for (Observer observer : observers) {
            observer.update();
         }
 
    }
 
    @Override
    public Object getState() {
        return message;
    }
     
    //method to change state of Subject
    @Override
    public void setState(String msg){
        System.out.println("Changing the state of the Subject!");
        message=msg;        
        notifyAllObservers();
    }
 
}