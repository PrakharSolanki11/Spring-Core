package com.rays.ioc;

public class Order2 {

	private Payment payment;
	private Inventory inventory;

	public Order2() {

	}

	public Order2(Inventory inventory, Payment payment) {
		this.inventory = inventory;
		this.payment = payment;
	}

	public void bookTicket(int quantity) {

		int price = 50;

		double amount = price * quantity;

		double updatedBalance = payment.makePayment(amount);

		int updatedStock = inventory.sold(quantity);

		System.out.println("Ticket are booked");
		System.out.println("Total amount of ticket : " + amount);
		System.out.println("Remaining Balance : " + updatedBalance);
		System.out.println("Updated Stocks : " + updatedStock);

	}

}
