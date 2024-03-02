package com.hexaware.springrestexception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {
	
	@GetMapping("/div/{num1}/{num2}")
	public String divNumber(@PathVariable int num1 , @PathVariable int num2) {
		int result = num1/num2;
		return "div is "+result;
		
	}
	
	//@ResponseStatus(value=HttpStatus.EXPECTATION_FAILED , reason= "Can't divide by 0 ")
//	@ExceptionHandler({ArithmeticException.class,NullPointerException.class})
//	public ResponseEntity<String> exceptionHandler() {
//		System.out.println("exception handled");
//		return new ResponseEntity<String>("can't divide by 0", HttpStatus.EXPECTATION_FAILED);
//		
//	}

}
