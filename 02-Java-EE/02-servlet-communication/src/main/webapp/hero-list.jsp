<%@page import="com.jdc.commu.redirect.Hero"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hero List</title>
</head>
<body>

	<div class="container">
		<h2>Hero List</h2>
		
		<table>
			<thead>
				<tr>
					<td>ID</td>
					<td>Name</td>
					<td>Role</td>
					<td>Skill</td>
					<td>Difficulty</td>
				</tr>
			</thead>
			
			<tbody>
				<%
					@SuppressWarnings("unchecked")
					List<Hero> list = (List<Hero>)request.getAttribute("heroList");
				
					for(Hero hero : list) {
				%>
				<tr>
					<td><%= hero.getId() %></td>
					<td><%= hero.getName() %></td>
					<td><%= hero.getRole() %></td>
					<td><%= hero.getSkill() %></td>
					<td><%= hero.isDifficulty() == true ? "Difficult" : "Easy" %></td>
				</tr>
				
				<% } %>
			</tbody>
		</table>
	
	</div>

</body>
</html>









