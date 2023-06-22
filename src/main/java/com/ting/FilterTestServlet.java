package com.ting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/filter_test")
public class FilterTestServlet extends HttpServlet {
	
	@Override
	public void service( HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
				
		System.out.println("num1: " + num1);

		System.out.println("num2: " + num2);
		
		PrintWriter out = res.getWriter();
		
		out.append("num1: " + num1);
		out.append("<br/>");
		out.append("num2: " + num2);

			
	}
	
	

}
