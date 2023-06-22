package com.ting.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/filter_test")
public class NumberFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {

	
		int num1 = Integer.parseInt(req.getParameter("num1"));
		
		int num2 = Integer.parseInt(req.getParameter("num2"));
		

		if (!(num1 > 0) ) {
			System.out.println("num1 is not > 0");
		} 
		
		if (!(num2 < 100)) {
			System.out.println("num2 is not < 100");
		}
	
		if (( num1 > 0 ) && ( num2 < 100 )) chain.doFilter(req, res);
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
