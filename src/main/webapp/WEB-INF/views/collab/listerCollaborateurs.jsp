<%@page import="java.util.List"%>
<%@ page import="com.example.sgp.Collaborateur" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css">
    <title>SGP - App</title>
</head>
<body>
<h1>Les collaborateurs</h1>
<ul>
    <%
        List<Collaborateur> listeNoms =(List<Collaborateur>)request.getAttribute("listeNoms");
        for (Collaborateur collab : listeNoms) {
            String nom = collab.getNom();
    %>
    <li><%= nom %></li>
    <%
        }
    %>
</ul>
</body>
</html>
