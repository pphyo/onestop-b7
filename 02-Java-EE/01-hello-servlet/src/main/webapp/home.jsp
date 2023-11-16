<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Annotation Servlet</title>
</head>
<body>
	<h2>
		<% 
			String message = (String)request.getAttribute("message");
			out.append(message);
		%>
	</h2>
</body>
</html>











