package com.kgc.webprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/joinMember")
	public String joinMemeber() {
		
		return "joinMember";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
}
