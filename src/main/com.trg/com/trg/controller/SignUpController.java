package com.trg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trg.model.Account;
import com.trg.model.AccountStatus;
import com.trg.model.Role;
import com.trg.service.ItfAccountService;
import com.trg.service.imp.AccountService;

@WebServlet(urlPatterns = { "/sign-up" })
public class SignUpController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ItfAccountService accountService = AccountService.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = req.getRequestDispatcher("sign-up.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (accountService.findAccount(req.getParameter("email")) == null && req.getParameter("password").length() >= 8
				&& req.getParameter("password").length() <= 20 && req.getParameter("fullName").length() <= 50) {
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			String fullName = req.getParameter("fullName");
			Account account = new Account(email, password, fullName, "", "", AccountStatus.ACTIVE, Role.ROLE_USER);
			accountService.save(account);
			resp.sendRedirect("sign-in");
		} else if (req.getParameter("password").length() > 20 || req.getParameter("password").length() < 8) {
			resp.sendRedirect("sign-up");
		} else {
			resp.sendRedirect("home");
		}
	}
}