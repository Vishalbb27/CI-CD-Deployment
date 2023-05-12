package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {
	
	@RequestMapping("/")
	public String root() {
		return "<h2>Click here to start Spring Boot: </h2><ol><li>Home : <a href='/home'>/home</a></li></ol>";
	}
	
	@RequestMapping("/home")
	public String hello() {
		return "Welcome to Spring Boot";
	}
	
	
}
