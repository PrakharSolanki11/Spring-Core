package com.rays.exclude;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExcludeAutomatic {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("exclude.xml");

		Autowire auto = context.getBean(Autowire.class);

		auto.performOperation();
	}

}
