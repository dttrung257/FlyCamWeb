package com.trg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trg.service.ItfProductService;
import com.trg.service.imp.ProductService;

@WebServlet(urlPatterns = {"/home"})
public class HomeController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7437982671715005499L;
	private ItfProductService productService = ProductService.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("listProduct", productService.findAll("price", "DESC", 6));
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, resp);
	}
	
	public static void main(String[] args) {
		System.out.println("FlyCamWeb");
	}
}
