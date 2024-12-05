package com.rays.exclude;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExcludeManual {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("exclude.xml");

		UserService user = context.getBean("userService",UserService.class);

		user.doSomething();

		AnotherService another = context.getBean("anotherService",AnotherService.class);

		another.greet();

		AnotherService anotherServiceToExclude = context.getBean("anotherServiceToExclude",AnotherService.class);

		anotherServiceToExclude.greet();

	}

}
