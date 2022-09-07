package com.trg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trg.service.ItfProductService;
import com.trg.service.imp.ProductService;

@WebServlet("/manage-product")
public class ManageProductController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4352085007012855967L;
	private ItfProductService productService = ProductService.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("listProduct", productService.findAll());
		req.getRequestDispatcher("manage-product.jsp").forward(req, resp);
	}
}
