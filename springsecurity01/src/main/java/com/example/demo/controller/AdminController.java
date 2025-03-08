package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/admin")
public class AdminController {
	@GetMapping("/get")
	public String get() {
		return "Admin get request";
	}
	@PostMapping("/post")
	public String post() {
		return "Admin get request";
	}
}
