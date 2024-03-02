package com.hexaware.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/webapp")
public class DemoController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "Hello friends!!";
	}
	
	

}
