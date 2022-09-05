package com.trg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trg.service.ItfAccountService;
import com.trg.service.imp.AccountService;

@WebServlet(urlPatterns = {"/sign-in"})
public class SignInController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6440918524610894617L;
	private ItfAccountService accountService = AccountService.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = req.getRequestDispatcher("sign-in.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (accountService.findAccount(req.getParameter("email"), req.getParameter("password")) != null) {
			HttpSession session = req.getSession();
			session.setAttribute("accountInfo", accountService.findAccount(req.getParameter("email"), req.getParameter("password")));
			resp.sendRedirect("home");
		} else {
			resp.sendRedirect("sign-in");
		}
	}
}