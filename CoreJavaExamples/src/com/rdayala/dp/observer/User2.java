package com.rdayala.dp.observer;

public class User2 implements Observer {
	Subject subject;

	public User2() {
		
	}
	
	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
		this.subject.register(this);
	}

	@Override
	public void update() {
		System.out.println("User2 got data from Subject : " + subject.getState());
	}
}