package com.trg.service.imp;

import java.util.ArrayList;
import java.util.List;

import com.trg.model.CartItem;
import com.trg.model.Product;
import com.trg.service.ItfCartService;
import com.trg.service.ItfProductService;

public class CartService implements ItfCartService {
	private ItfProductService productService = ProductService.getInstance();
	private static CartService cartService = null;
	
	private CartService() {
	}
	
	public static CartService getInstance() {
		return cartService == null ? new CartService() : cartService;
	}

	@Override
	public List<CartItem> load(List<CartItem> listItem) {
		if (listItem == null) {
			listItem = new ArrayList<>();
		}
		return listItem;
	}

	@Override
	public List<CartItem> addToCart(List<CartItem> listItem, int id) {
		// TODO Auto-generated method stub
		CartItem item = new CartItem();
		Product p = productService.findByProductId(id);
		if (p != null) {
			item.setProductId(id);
			item.setProductName(p.getProductName());
			item.setPrice(p.getPrice());
			item.setImageUrl(p.getImageUrl());
			item.setQuantity(1);
			item.setItemPrice(p.getPrice());
		}
		if (listItem == null) {
			listItem = new ArrayList<>();
			listItem.add(item);
		} else {
			boolean exist = false;
			for (CartItem it : listItem) {
				if (it.getProductId() == id) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				listItem.add(item);
			}
		}
		return listItem;
	}

	@Override
	public List<CartItem> reduceQuantity(List<CartItem> listItem, int id) {
		// TODO Auto-generated method stub
		int index = -1;
		for (int i = 0; i < listItem.size(); i++) {
			if (listItem.get(i).getProductId() == id) {
				index = i;
				break;
			}
		}
		CartItem item = listItem.get(index);
		if (index == -1) {
			return null;
		}
		if (item.getQuantity() <= 1) {
			listItem.remove(item);
		} else {
			item.setQuantity(item.getQuantity() - 1);
			item.setItemPrice(item.getItemPrice() - item.getPrice());
		}
		return listItem;
	}

	@Override
	public List<CartItem> addQuantity(List<CartItem> listItem, int id) {
		// TODO Auto-generated method stub
		int index = -1;
		for (int i = 0; i < listItem.size(); i++) {
			if (listItem.get(i).getProductId() == id) {
				index = i;
				break;
			}
		}
		CartItem item = listItem.get(index);
		if (index == -1) {
			return null;
		}
		item.setQuantity(item.getQuantity() + 1);
		item.setItemPrice(item.getItemPrice() + item.getPrice());
		return listItem;
	}

	@Override
	public List<CartItem> remove(List<CartItem> listItem, int id) {
		// TODO Auto-generated method stub
		for (CartItem item : listItem) {
			if (item.getProductId() == id) {
				listItem.remove(item);
				break;
			}
		}
		return listItem;
	}

	@Override
	public int countQuantity(List<CartItem> listItem) {
		// TODO Auto-generated method stub
		int result = 0;
		for (CartItem item : listItem) {
			result += item.getQuantity();
		}
		return result;
	}

	@Override
	public double totalPrice(List<CartItem> listItem) {
		double result = 0;
		for (CartItem item : listItem) {
			result += item.getItemPrice();
		}
		return result;
	}

}
