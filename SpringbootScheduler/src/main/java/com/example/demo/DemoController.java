package com.example.demo;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	private static AtomicInteger atomicInteger=new AtomicInteger();

	@GetMapping("/welcome")
	public String getMethod() {
		atomicInteger.incrementAndGet();
		return "Hi welcome to count of Number Request";
	}
	
	
	@GetMapping("/hello")
	public String getHello() {
		atomicInteger.incrementAndGet();
		return "Hi hello to count of Number Request";
	}
	
	
	@GetMapping("/noofrequest")
	public int getNumberOfRequest() {
		return atomicInteger.get();
	}
}
