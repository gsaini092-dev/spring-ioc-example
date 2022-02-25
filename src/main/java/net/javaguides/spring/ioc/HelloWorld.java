package net.javaguides.spring.ioc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {
	private String message;
	private int rollno;
	
	public HelloWorld() {}
	
	public void initialise() {
		System.out.println("I have initialise your stuffs.");
	}
	
	public HelloWorld(String msg, int rollNumber) {
		this.message = msg;
		this.rollno = rollNumber;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("My Message : " + message);
	}
	
	public void getRollNo() {
		System.out.println("My Rollno is: "+ this.rollno);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("i am under afterPropertiesSet");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("I have been destroyed the concerned objects before destoying this bean");
	}
}
