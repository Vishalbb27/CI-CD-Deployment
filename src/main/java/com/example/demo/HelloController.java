package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {
	
	@RequestMapping("/")
	public String root() {
		return "<h2>Endpoints avilable:</h2><ol><li>Hello: <a href='/hello'>/hello</a></li><li>Greet to Ip: <a href='/greeting'>/greeting</a></li></ol>";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello from spring boot";
	}
	
	@RequestMapping("/greeting")
	public String greet() {
		String ip = "";
		try {
			ip = InetAddress.getLocalHost().toString();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "<h3>Hello IP: "+ip+"</h3>";
	}
}
