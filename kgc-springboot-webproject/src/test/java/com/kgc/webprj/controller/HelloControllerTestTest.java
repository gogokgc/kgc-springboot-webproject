package com.kgc.webprj.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = HelloControllerTestTest.class)
public class HelloControllerTestTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void returnHello() throws Exception{
		String hello = "hello";
		
		mvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string(hello));
		
	}
	
}
