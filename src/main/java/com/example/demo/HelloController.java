package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(path="/hello")
	public String sayHello(@RequestParam(name="name") String name) {
		return "Hello "+name;
	}
	
	@RequestMapping(path="/signup",method=RequestMethod.POST)
	public String signup(@RequestBody(required=true) String name,String pass,String company) {
		return "The user "+name+" from "+company+" is signed into the system";
	}
	
}
