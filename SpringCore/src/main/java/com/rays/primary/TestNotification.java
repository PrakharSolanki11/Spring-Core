package com.rays.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNotification {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("primary.xml");
		
		NotificationService service = (NotificationService) context.getBean("messageService");
		
		service.sendNotification("Hello From Prakhar !!!");
	}

}
