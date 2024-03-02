package com.hexaware.codingchallenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler({PlayerNotFoundException.class})
	public ResponseEntity<String> handleException(){
		return new ResponseEntity<String>("Player with given id not found", HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler({InvalidRangeException.class})
	public ResponseEntity<String> invalidRangeException(){
		return new ResponseEntity<String>("Invalid range , first value should be less than second", HttpStatus.BAD_REQUEST);
		
	}
	


}
