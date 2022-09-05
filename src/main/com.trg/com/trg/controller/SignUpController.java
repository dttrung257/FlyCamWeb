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
	private static final long serialVersionUID = -1224864450251679694L;
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
		if (accountService.findAccount(req.getParameter("email")) != null) {
			accountService.save(new Account(req.getParameter("fullName"), req.getParameter("email"), req.getParameter("password"), 
					"", 0, "", "", "", AccountStatus.ACTIVE, Role.ROLE_USER));
			resp.sendRedirect("sign-up");
		} else {
			resp.sendRedirect("sign-in");
		}
	}
}