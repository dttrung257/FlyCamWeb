package com.trg.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trg.model.Account;
import com.trg.model.Role;

public class AuthorizationFilter implements Filter {
	private ServletContext context;

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String url = request.getRequestURI();
		if (url.startsWith("/FlyCamWeb/manage-product")) {
			Account account = (Account) request.getSession().getAttribute("accountInfo");
			if (account != null) {
				if (account.getRole().equals(Role.ROLE_ADMIN)) {
					filterChain.doFilter(request, response);
				} else if (account.getRole().equals(Role.ROLE_USER)) {
					response.sendError(404);
				}
			} else {
				response.sendError(404);
			}
		} else {
			filterChain.doFilter(request, response);
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		this.context = arg0.getServletContext();
	}

}
