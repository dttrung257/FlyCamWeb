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

@WebServlet(urlPatterns = { "/product" })
public class ProductServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IProductService  productService;

	public ProductServlet() {
		productService = new ProductService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setAttribute("listProduct", productService.findAll());
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/product.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String input = req.getParameter("input");
		req.setAttribute("listProduct", productService.findByProductName(input));
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/product.jsp");
		dispatcher.forward(req, resp);
	}
}
