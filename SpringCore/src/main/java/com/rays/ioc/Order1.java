package com.rays.ioc;

public class Order1 {

	private Payment payment;
	private Inventory inventory;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public void bookTicket(int quantity) {

		int price = 50;

		double amount = price * quantity;

		double updatedBalance = payment.makePayment(amount);

		int updatedStock = inventory.sold(quantity);

		System.out.println("Ticket are booked");
		System.out.println("Total amount of ticket : " + amount);
		System.out.println("Remaining Balance : " + updatedBalance);
		System.out.println("Updated Stock : " + updatedStock);

	}

}
