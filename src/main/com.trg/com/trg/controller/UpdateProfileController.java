package com.trg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trg.model.Account;
import com.trg.service.ItfAccountService;
import com.trg.service.imp.AccountService;

@WebServlet("/update-profile")
public class UpdateProfileController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8522475427082730350L;
	private ItfAccountService accountService = AccountService.getInstance();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Account account = (Account) req.getSession().getAttribute("accountInfo");
		account.setFullName(req.getParameter("fullName"));
		account.setGender(req.getParameter("gender"));
		if (req.getParameter("age") != "" && req.getParameter("age") != null) {
			account.setAge(Integer.parseInt(req.getParameter("age")));
		}
		account.setCountry(req.getParameter("country"));
		account.setPhoneNumber(req.getParameter("phoneNumber"));
		account.setAddress(req.getParameter("address"));
		if (accountService.update(account) != null) {
			req.getSession().setAttribute("accountInfo", account);
		}
		resp.sendRedirect("profile");
	}
}
