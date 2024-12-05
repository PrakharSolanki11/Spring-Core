package com.rays.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBeanAnnotation {
	
public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle2.xml");
		
		MyBeanAnnotation bean=(MyBeanAnnotation)context.getBean("mybeanAnnotation");
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
