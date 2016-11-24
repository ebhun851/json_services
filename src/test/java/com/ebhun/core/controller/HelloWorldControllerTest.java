package com.ebhun.core.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldControllerTest {
	
	private HelloWorldController helloWorldController = new HelloWorldController();

	@Test
	public void sayHello(){
		ResponseEntity<String> response = helloWorldController.sayHello();
		
		assertEquals( response.getBody().toString(), "Hello World!!");
		
		assertEquals( response.getStatusCode(), HttpStatus.OK);
	}
}
