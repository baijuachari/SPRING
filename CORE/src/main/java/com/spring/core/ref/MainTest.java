package com.spring.core.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employee-setter.xml");
		Employee employee = (Employee) context.getBean("employeeBean");
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
		System.out.println(employee.getSalary());
		
		System.out.println("Getting address object from the Employee");
		Address address = employee.getAddress();
		
		System.out.println(address.getHouseno());
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println(address.getZipcode());

	}

}
