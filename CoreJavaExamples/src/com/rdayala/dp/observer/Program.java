package com.rdayala.dp.observer;

public class Program {

	public static void main(String[] args) {
		
		Subject subject = new MyTopic();
		
		Observer observer1 = new User1();
		Observer observer2 = new User2();

		// instead of registering here, the observer internally
		// registers with Subject when setSubject is called 
//		subject.register(observer1);
//		subject.register(observer2);
		
		observer1.setSubject(subject);
		observer2.setSubject(subject);
		
		subject.setState("new Article");
		
		

	}

}
