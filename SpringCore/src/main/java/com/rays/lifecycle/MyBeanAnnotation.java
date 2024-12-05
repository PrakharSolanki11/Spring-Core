package com.rays.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBeanAnnotation {
	
	@PostConstruct
	public void init() {
		System.out.println("Init Method Called...!!!");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Method Called...!!!");
	}

}
