package com.ting;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	
	
	public void service( HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
//		res.getWriter().append("This is SqServlet.service!");
		
		System.out.println("This is SqServlet.service!");
		
		System.out.println("Method: " + req.getMethod());
		
		res.getWriter().println("This is SqServlet.service!");
		
		
	}
	

}
