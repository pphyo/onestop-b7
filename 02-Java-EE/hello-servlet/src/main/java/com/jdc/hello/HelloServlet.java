package com.jdc.hello;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet {
	
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