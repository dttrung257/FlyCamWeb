package com.trg.service;

import java.util.List;

import com.trg.model.CartItem;

public interface ItfCartService {
	List<CartItem> load(List<CartItem> listItem);
	
	List<CartItem> addToCart(List<CartItem> listItem, int id);

	List<CartItem> reduceQuantity(List<CartItem> listItem, int id);

	List<CartItem> addQuantity(List<CartItem> listItem, int id);
	
	List<CartItem> remove(List<CartItem> listItem, int id);
	
	int countQuantity(List<CartItem> listItem);
	
	double totalPrice(List<CartItem> listItem);
}
