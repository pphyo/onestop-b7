package com.jdc.hello;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class XmlServlet extends HttpServlet {
	
	public XmlServlet() {
		System.out.println("servlet constructor");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init servlet");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy servlet");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append("""
				<!DOCTYPE html>
				<html>
					<head>
						<title>Hello Servlet</title>
					</head>
					
					<body>
						<h2>Welcome from Hello Servlet</h2>
					</body>
				</html>
				""").flush();
	}

}