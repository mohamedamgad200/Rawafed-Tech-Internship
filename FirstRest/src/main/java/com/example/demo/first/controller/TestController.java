package com.example.demo.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class TestController {
	
	@GetMapping("/greetings")
	public String hello()
	{
		return "Hello world from Springboot";
	}
	@GetMapping("/see_you")
	public String goodBye() {
		return "Good Bye";
	}
	@GetMapping()
	public String version()
	{
		return "3.4.2";
	}
	

}
