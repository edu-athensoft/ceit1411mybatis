package com.athensoft.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyTestController {
	
	@GetMapping("/spring")
	public void testSpring() {
		System.out.println("testSpring");
		
	}
}
