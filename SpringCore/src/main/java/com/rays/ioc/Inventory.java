package com.rays.ioc;

import org.springframework.beans.factory.annotation.Value;

public class Inventory {
	
	@Value(value ="100")
	private int stock;
	
	public Inventory() {
		
	}
	public Inventory(int stock) {
		this.stock=stock;
		
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int sold(int qty) {
		
		stock -= qty; //stock = stock - qty ;
		return stock;
		
	}
	
	

}
