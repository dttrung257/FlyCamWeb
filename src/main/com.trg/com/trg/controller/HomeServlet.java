package com.trg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trg.service.IProductService;
import com.trg.service.imp.ProductService;

@WebServlet(urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IProductService productService;
	
	public HomeServlet() {
		productService = new ProductService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setAttribute("listProduct", productService.findAll("price", "DESC", 6));
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/index.jsp");
		dispatcher.forward(req, resp);
	}

}
