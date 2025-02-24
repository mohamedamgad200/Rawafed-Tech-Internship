package com.example.demo.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

//	@ExceptionHandler(IllegalArgumentException.class)
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	public String handleException1(Exception ex)
//	{
//		return String.format("%s%s, %s%n", "Error: ", ex.getClass().getName(), ex.getMessage());
//	}
	@ExceptionHandler(IllegalArgumentException.class)
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<Object> handleException1(Exception ex)
	{
		Map<String ,String>error=new HashMap<>();
		error.put("error", ex.getClass().getSimpleName());
		error.put("message", ex.getMessage());
		return new ResponseEntity<Object>(error, HttpStatus.BAD_REQUEST);
	}
}
