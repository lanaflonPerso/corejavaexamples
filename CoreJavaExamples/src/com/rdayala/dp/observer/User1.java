package com.rdayala.dp.observer;

public class User1 implements Observer {
	Subject subject;

	public User1() {
		
	}
	
	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
		this.subject.register(this);
	}

	@Override
	public void update() {
		System.out.println("User1 got data from Subject : " + subject.getState());
	}
}