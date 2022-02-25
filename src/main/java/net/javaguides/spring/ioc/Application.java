package net.javaguides.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		/*
		 * Use applicationContext to create beans in Spring IOC contrainer.
		 */
	    
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld_2");
		obj.getMessage();
		obj.getRollNo();
		
	    /*
	     * Use annotation based configuration 
	     * to create beans in Spring IOC contrainer
	     */
		
		/*AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld obj = (HelloWorld) context.getBean("helloworld_1");
		obj.getMessage();
		obj.getRollNo();
		context.close();*/
	}
}
