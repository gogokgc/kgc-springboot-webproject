package com.kgc.webprj.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice // Exception 연결
@RestController
public class GlobalExcetionHandler {

	@ExceptionHandler(value = Exception.class)
	public String handleArgumentException(Exception e) {
		return e.getMessage();
		
	}
	
}
