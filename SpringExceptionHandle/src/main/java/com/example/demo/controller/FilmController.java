package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.FilmNameLengthException;
import com.example.demo.exception.FilmNameNullException;

@RestController
@RequestMapping("/film")
public class FilmController {
	@GetMapping("/get/{id}")
	public String getFilm(@PathVariable int id) {
		if (id <= 0) {
			throw new IllegalArgumentException("Invalid film id");
		}
		return "Film found";
	}
	
	@PostMapping("/create/{name}") 
	public String createFilm(@PathVariable String name) throws FilmNameNullException {
		if (name == null) {
			throw new FilmNameNullException("Film name cannot be null");
		}
		if (name.length() < 3) {
			throw new FilmNameLengthException("Film name must be 3 characters or more");
		}
		return "Film Created";
	}
//	@ExceptionHandler(value= {IllegalArgumentException.class, 
//			FilmNameNullException.class})
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	public String handleException(Exception e)
//	{
//		return "Error: "+e.getMessage();
//	}
	@ExceptionHandler(value=FilmNameNullException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleException(Exception e)
	{
		return "Error: "+e.getMessage();
	}
	@ExceptionHandler(value = { 
			FilmNameLengthException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleException2(Exception ex) {
		return "Error: " + ex.getMessage();
	}

}
