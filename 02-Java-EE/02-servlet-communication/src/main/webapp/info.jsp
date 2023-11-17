<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Information</title>
<link rel="stylesheet" href="style.css"></link>
</head>
<body>

	<div class="container">
		<div class="alert">
			<%= request.getAttribute("info") %>
		</div>
		<a href="./">Home</a>
		<a href="redirect">Hero form</a>
		<a href="hero-list">Hero List</a>
	</div>

</body>
</html>