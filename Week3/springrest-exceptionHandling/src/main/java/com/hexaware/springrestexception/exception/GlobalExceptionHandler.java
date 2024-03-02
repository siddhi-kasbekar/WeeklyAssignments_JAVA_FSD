package com.hexaware.springrestexception.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	//@ResponseStatus(value=HttpStatus.EXPECTATION_FAILED , reason= "Can't divide by 0 ")
	@ExceptionHandler({ArithmeticException.class})
	public ResponseEntity<String> handleException() {
		return new ResponseEntity<String>("can't divide by 0", HttpStatus.EXPECTATION_FAILED);
		
	}

}
