package com.springboot.first.app;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController   //combination of @controller and @ResponseBody annotation

public class HelloWorldController {
	//get
	//post
	//put    all are this are rest api written in json or xml format
	//delete
	
	//GET HTTP METHOD
	//http://localhost:8080/hello-world
	
	@GetMapping("/hello-world")  //"/hello-world is URL FOR THIS REST API
public String helloWorld() {
	return "Hello World!";  // in order to make this method restapi we use @GetMapping annotation
	
}
	

}
