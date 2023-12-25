package com.test.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome to the app";
	}
}
