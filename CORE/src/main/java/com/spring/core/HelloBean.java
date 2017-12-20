package com.spring.core;

public class HelloBean {
	
	private String message;

	
	private HelloBean() {
		System.out.println("private constructor...");
	}

	public void setMessage(String message) {
		System.out.println("Hello Bean Setter message...");
		this.message = message;
	}
	
	public String sayHello() {
		System.out.println("sayHelloCalled...");
		return message;
	}
}
