package com.example.MyFirstbootApp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//REst controller means you can have methods in the class which map to url request
@RestController 
public class HelloController {
	
	//request mapping takes url which method maps to
	@RequestMapping("/hello")
	public String sayhi()
	{
		return "HI";
	}

}
 