package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@GetMapping("/get/{id}")
	public String getCategory(@PathVariable int id) {
		if (id <= 0) {
			throw new IllegalArgumentException("Invalid category id");
		}
		return "Category found";
	}
	
	@PostMapping("/create/{name}") 
	public String createCategory(@PathVariable String name) {
		return "Category Created";
	}
	
}
