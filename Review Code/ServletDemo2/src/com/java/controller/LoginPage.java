package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginPage extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer=res.getWriter();
		writer.println("<form method=\"post\" action=\"validate\">");
		if(req.getAttribute("message")!= null ) {
		writer.println("<span style='color:red'>"+req.getAttribute("message")+"</span>");
		}
		writer.println("Username: <input type=\"text\" name=\"name\" pattern=\"[A-Za-z]{3,30}\" required />");
		writer.print("Password: <input type=\"password\" name=\"password\" required />");
		writer.println("<input type=\"submit\" /></form>");
	}

}
