package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/api")
	public String show()
	{
		return "Welcome to Swagger Documentation";
	}
	@GetMapping("/api1")
	public String show1()
	{
		return "Welcome to Swagger Documentation...............!";
	}
}
