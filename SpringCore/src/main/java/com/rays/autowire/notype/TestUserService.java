package com.rays.autowire.notype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService { 
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-notype.xml");
		
		UserService user = (UserService)context.getBean("userService");
		
		user.testAdd();
	}

}
