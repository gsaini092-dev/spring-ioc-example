package net.javaguides.spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean("helloworld_1")
	public HelloWorld helloWorld() {
		HelloWorld helloWorld = new HelloWorld("I am in a constroctor", 12313242);
		//helloWorld.setMessage("Hello World!");
		return helloWorld;
	}
}
