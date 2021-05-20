package com.kgc.webprj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerTest {

	@GetMapping("/test/hello")
	public String hello() {
		
		return "hello2";
	}
	
}