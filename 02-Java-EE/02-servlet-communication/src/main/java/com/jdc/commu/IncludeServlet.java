package com.jdc.commu;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/include")
public class IncludeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		var writer = resp.getWriter();
		
		writer.append("""
				<!DOCTYPE html>
				<html>
					<head>
						<title>Include Servlet</title>
					</head>
					<body>
				""");
		
		var requestDispatcher = req.getRequestDispatcher("header");
		// header servlet include
		requestDispatcher.include(req, resp);
		
		// IncludeServlet
		writer.append("<p>This is body of include servlet</p>");
		
		// footer servlet include
		requestDispatcher = getServletContext().getRequestDispatcher("/footer");
		
		requestDispatcher.include(req, resp);
		
		writer.append("""
					</body>
					</html>
				""");
	}
	
}








