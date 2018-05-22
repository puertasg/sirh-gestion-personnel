<%@ page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.1.1-dist/css/bootstrap.css">
</head>
<body>
	<h1>Les collaborateurs</h1>
	<ul>
	<%
		List<String> listeNoms = (List<String>) request.getAttribute("listeNoms");
		for(String nom : listeNoms)
		{
			%>
				<li><%= nom %></li>
			<%
		}
	%>
	</ul>
	
	<script src="<%=request.getContextPath() %>/bootstrap-4.1.1-dist/js/jquery-3.3.1.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap-4.1.1-dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>