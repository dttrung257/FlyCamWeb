package com.trg.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trg.model.Cart;
import com.trg.model.CartItem;
import com.trg.service.ICartService;
import com.trg.service.imp.CartService;

@WebServlet(urlPatterns = {"/cart"})
public class CartServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ICartService cartService;
	
	public CartServlet() {
		cartService = new CartService();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		Cart.itemList = (List<CartItem>) session.getAttribute("item-list");
		
		Cart.itemList = cartService.load(Cart.itemList);
		req.setAttribute("listCartItem", Cart.itemList);
		req.setAttribute("numberProduct", cartService.countQuantity(Cart.itemList));
		req.setAttribute("totalPrice", cartService.totalPrice(Cart.itemList));
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("view/cart.jsp");
		dispatcher.forward(req, resp);
	}

}
