package com.example.MyFirstbootApp;
  

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstbootAppApplication {

	public static void main(String[] args) {
		
	ApplicationContext con =SpringApplication.run(MyFirstbootAppApplication.class, args);
	}

}
