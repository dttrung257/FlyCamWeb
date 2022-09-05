package com.trg.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trg.model.Cart;
import com.trg.model.CartItem;
import com.trg.service.ItfCartService;
import com.trg.service.imp.CartService;

@WebServlet(urlPatterns = { "/add-to-cart" })
public class AddToCartController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1720211129268890099L;
	private ItfCartService cartService = CartService.getInstance();

	@SuppressWarnings("unchecked")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		Cart.itemList = (List<CartItem>) session.getAttribute("itemList");
		int id = Integer.parseInt(req.getParameter("id"));
		session.setAttribute("itemList", cartService.addToCart(Cart.itemList, id));
		session.setMaxInactiveInterval(24 * 60 * 60);
		
;		resp.sendRedirect("cart");
	}

}
