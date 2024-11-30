package com.rays.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestPerson {
	
	public static void main(String[] args) {
		
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("PersonBean.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("PersonBean.xml");
		
		PersonBean bean = (PersonBean)context.getBean("person");    //context.getBean(PersonBean.class);
		
		System.out.println("FirstName : "+bean.getFirstName());
		System.out.println("LastName : "+bean.getLastName());
	}

}
