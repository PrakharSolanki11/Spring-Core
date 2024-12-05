package com.rays.exclude;

public class Autowire {
	
	private AnotherService anotherService;
	private UserService userService;
	
	public void setAnotherService(AnotherService anotherService) {
		this.anotherService=anotherService;
	}
	
	public void setUserService(UserService userService) {
		this.userService=userService;
	}
	
	public void performOperation() {
		userService.doSomething();
		anotherService.greet();
	}
	

}
