package com.course.hello.api.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	private Logger log = LoggerFactory.getLogger(HelloWorld.class);

	@GetMapping("/hello")
	public String hello() {
		log.info("Add log");
		return "hello world asds";
	}
}
