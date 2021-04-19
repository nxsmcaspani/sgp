<%@page import="java.util.List"%>
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
<h1>Nouveau Collaborateur</h1>

  <form action="${pageContext.request.contextPath}/collaborateurs/lister" method="post">
    <table>
      <tr>
        <td>Nom</td>
        <td><input type="text" name="nom" id="nom" required></td>
      </tr>
      <tr>
        <td>Prenom</td>
        <td><input type="text" name="prenom" id="prenom" required></td>
      </tr>
      <tr>
        <td>Date de Naissance</td>
        <td><input type="date" name="date_de_naissance" id="date_de_naissance" required></td>
      </tr>
      <tr>
        <td>Adresse</td>
        <td><textarea name="adresse" id="adresse" rows="5" cols="50" required></textarea></td>
      </tr>
      <tr>
        <td>Numero de securite sociale</td>
        <td><input type="text" name="numeroSecu" id="numeroSecu" required></td>
      </tr>
    </table>
    <input type="submit" value="Creer" id="form_button" />
  </form>

</body>
</html>
