package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testController")
public class TestController {
	
	@GetMapping("/test")
	public String greet() {
		return "Hello, from TestController!";
	}

}
