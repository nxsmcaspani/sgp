<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <table class="table">
        <thead class="thead-dark">
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Nom</th>
                <th scope="col">Prenom</th>
                <th scope="col">Adresse</th>
                <th scope="col">Photo</th>
            </tr>
        </thead>
        <tbody>
    <c:forEach items="${listeNoms}" var="collab">
        <tr>
            <td><c:out value = "${collab.matricule}"/></td>
            <td><c:out value = "${collab.nom}"/></td>
            <td><c:out value = "${collab.prenom}"/></td>
            <td><c:out value = "${collab.adresse}"/></td>
            <td><img src="<c:out value = "${collab.photo}"/>" alt="photo_de_profil" width="128" height="128"/></td>
        </tr>
    </c:forEach>
        </tbody>
    </table>
</body>
</html>
