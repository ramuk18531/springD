package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {

	
	@RequestMapping("/")
	public String password(){
		return "Hello world";
	}
	
	
	
}
