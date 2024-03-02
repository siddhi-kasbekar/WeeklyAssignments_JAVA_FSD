package com.hexaware.springrestjpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptionHandler {
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Employee not found")
	@ExceptionHandler({EmployeeNotFoundException.class})
	public void handler() {
		
	}

}
