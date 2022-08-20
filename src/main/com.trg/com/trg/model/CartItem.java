package com.trg.model;

public class CartItem extends Product {
	private int quantity;
	private double itemPrice;
	
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartItem(int quantity, double itemPrice) {
		super();
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	
}
