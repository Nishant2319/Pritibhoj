package com.Blackpool;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest re, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) re;
		HttpServletResponse resp = (HttpServletResponse) res;

		HttpSession sess = req.getSession();
		
		
//		if (sess.getAttribute("name") != null) {
//			if(sess.getAttribute("password") != null) {
//				if()
//				resp.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
//				chain.doFilter(re, res);
//			}
//			
//		}
//
//		else {
//			resp.sendRedirect("/");
//		}
		
		resp.sendRedirect("/index");
	}

}
