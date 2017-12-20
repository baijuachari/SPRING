package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoreTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
		
		System.out.println("Container Activated.....`");
		
		
		HelloBean bean = (HelloBean) context.getBean("helloBean");
		System.out.println("Message: " + bean.sayHello());
	}

}
