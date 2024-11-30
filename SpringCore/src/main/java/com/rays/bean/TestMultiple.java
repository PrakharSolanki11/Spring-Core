package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultiple {
	
public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"UserBean.xml", "PersonBean.xml"});
		
		UserBean user = (UserBean)context.getBean("user");
		System.out.println("User Login is : "+user.getLogin());
		System.out.println("User Password is : "+user.getPassword());
		
		PersonBean person = (PersonBean)context.getBean("person");
		System.out.println("FirstName is : "+person.getFirstName());
		System.out.println("LastName is :"+person.getLastName());
		
	}

}
