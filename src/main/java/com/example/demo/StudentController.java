package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/greetings")
	public String getMessage()
	{
		
		return "Welcome All!!!";
	}
}
