package com.rays.autowire.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-byconstructor.xml");
		
		UserService user = context.getBean(UserService.class);
		
		user.testAdd();
				
	}

}
