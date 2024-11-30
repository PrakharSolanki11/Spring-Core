package com.rays.ioc;

import org.springframework.beans.factory.annotation.Value;

public class Payment {

	@Value(value = "1000")
    private double balance;

	public Payment() {

	}

	public Payment(int balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double makePayment(double amt) {
		balance -= amt; // balance = balance - amount ;
		return balance;

	}

	public double deposit(double amt) {

		balance += amt; // balance = balance + amount ;
		return balance;

	}

}
