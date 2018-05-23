<%@ page import="java.util.List, dev.sgp.entite.Collaborateur"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet" href="<c:out value="${pageContext.servletContext.contextPath}" />/bootstrap-4.1.1-dist/css/bootstrap.css">
</head>
<body>
	<h1>Les collaborateurs</h1>
	<ul>
	<%
		List<Collaborateur> listeCollabs = (List<Collaborateur>) request.getAttribute("listeCollabs");
		for(Collaborateur collab : listeCollabs)
		{
			%>
				<li><%= collab.getNom() %></li>
			<%
		}
	%>
	</ul>
	
	<script src="<c:out value="${pageContext.servletContext.contextPath}" />/bootstrap-4.1.1-dist/js/jquery-3.3.1.min.js"></script>
	<script src="<c:out value="${pageContext.servletContext.contextPath}" />/bootstrap-4.1.1-dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>