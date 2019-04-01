package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.java.dto.LoginDetails;
import com.java.service.LoginService;
import com.java.service.LoginServiceImpl;

public class ValidateServlet implements Servlet {
	
	static LoginService service= new LoginServiceImpl();

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String password= req.getParameter("password");
		if(name.trim().length()>0 && password.trim().length()>0) {
			LoginDetails details= service.getDetails(name);
			PrintWriter writer=res.getWriter();
			if(details != null && details.getPassword().equals(password)) {
				
				writer.println("Welcome "+ name);
				
			}else {
				req.setAttribute("message", "Please enter valid username and password");
				req.getRequestDispatcher("login.html").forward(req, res);
			}
		}
		
	}

}
