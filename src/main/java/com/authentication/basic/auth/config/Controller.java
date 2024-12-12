package com.authentication.basic.auth.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/get")
	public void getString() {
		
		System.out.println("Pooja Hatpaki Hello");
	}
}
