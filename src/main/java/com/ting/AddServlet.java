package com.ting;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	
	public void service( HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum = num1 + num2;
		
		System.out.print("service: " + sum);
		
		PrintWriter out = res.getWriter();
		
		out.append("service: The sum is " + sum);
		
	}
	
	public void doGet( HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum = num1 + num2;
		
		System.out.print("doGet: " + sum);
		
		PrintWriter out = res.getWriter();
		
		out.append("doGet: The sum is " + sum);
		
	}
	
	
	public void doPost( HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum = num1 + num2;
		
		System.out.print("doPost: " + sum);
		
		PrintWriter out = res.getWriter();
		
		out.append("The sum is " + sum);
		
	}

}
