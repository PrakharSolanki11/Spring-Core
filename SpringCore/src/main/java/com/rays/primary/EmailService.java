package com.rays.primary;

public class EmailService implements MessageService {

	public void sendMessage(String message) {
		System.out.println("Email Message send : " + message);

	}

}
