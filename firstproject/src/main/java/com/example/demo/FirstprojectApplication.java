package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
 ConfigurableApplicationContext  context = SpringApplication.run(FirstprojectApplication.class, args);
		
		Anish a = context.getBean(Anish.class);
		
		a.show();
		
		
       	
		
	}

}
