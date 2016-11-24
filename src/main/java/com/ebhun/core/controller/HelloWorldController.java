package com.ebhun.core.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> sayHello() {

		String hello = "Hello World!!";
		return new ResponseEntity<String>(hello, HttpStatus.OK);
	}

}
