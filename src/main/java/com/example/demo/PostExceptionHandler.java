package com.example.demo;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class PostExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(HttpClientErrorException.class)
	public String handleException(Exception e) {
		e.printStackTrace();
		return "Some problem.......new......"+e.getMessage();
	}
	

}
