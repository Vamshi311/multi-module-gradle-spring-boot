package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HelloService;

@RequestMapping("/")
@RestController
public class HelloController {

	@Autowired
	public HelloService helloService;

	@GetMapping("/hello")
	public String sayHello() {
		return helloService.sayHello();
	}
}
