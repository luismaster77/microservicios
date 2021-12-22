package com.aprende.rest.webservice.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

	@GetMapping(path = "/hello-word")
	public String saludar() {
		return "Hola papu";
	}
	
	@GetMapping(path = "/hello-word-bean")
	public SaludarBean saludarBean() {
		return new SaludarBean("Hola papu");
	}
	
	@GetMapping(path = "/hello-word-bean/path-variable/{name}")
	public SaludarBean saludarConParameter(@PathVariable String name) {
		return new SaludarBean(String.format("Hola papu %s", name));
	}
}
