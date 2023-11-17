package com.jdc.commu.redirect;

import java.io.IOException;

import com.jdc.commu.redirect.Hero.Role;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/redirect", "/hero-list"})
public class RedirectServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private HeroService service;
	
	@Override
	public void init() throws ServletException {
		service = new HeroService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var page = switch(req.getServletPath()) {
			case "/redirect" -> "/hero-form.jsp";
			case "/hero-list" -> {
				req.setAttribute("heroList", service.getAll());
				yield "/hero-list.jsp";
			}
			default -> throw new RuntimeException();
		};
		
		getServletContext().getRequestDispatcher(page).forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var id = req.getParameter("id");
		var name = req.getParameter("name");
		var role = req.getParameter("role");
		var skill = req.getParameter("skill");
		var difficulty = req.getParameter("difficulty");
		
		var hero = new Hero();
		hero.setId(Integer.parseInt(id));
		hero.setName(name);
		hero.setRole(Role.valueOf(role));
		hero.setSkill(Integer.parseInt(skill));
		hero.setDifficulty(null == difficulty ? false : true);
		
		var saveResult = service.save(hero);
		
		req.setAttribute("info", saveResult == true ? "Hero saved successfully." : "Didn't save hero.");
		
		resp.sendRedirect("info.jsp");
//		System.out.println("""
//				id: %s
//				name: %s
//				role: %s
//				skill: %s
//				difficulty: %s
//				""".formatted(id, name, role, skill, difficulty));
	}

}