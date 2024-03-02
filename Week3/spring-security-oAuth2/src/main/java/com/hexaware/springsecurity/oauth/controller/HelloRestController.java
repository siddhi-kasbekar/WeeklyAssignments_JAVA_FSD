package com.hexaware.springsecurity.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/")
	public String sayHello() {
		return "hello friends !!";
	}

	@GetMapping("/secure")
	public String secureResource() {
		return "This is a secured resource access using app login / github credential";
	}
	
	
}
