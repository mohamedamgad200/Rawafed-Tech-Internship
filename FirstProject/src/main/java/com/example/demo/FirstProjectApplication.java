package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FirstProjectApplication.class, args);
		SpringApplicationBuilder builder=new SpringApplicationBuilder(FirstProjectApplication.class);
		builder.run(args);
	}

}
