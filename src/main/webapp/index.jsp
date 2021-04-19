<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String redirectURL = request.getContextPath()+"/collaborateurs/lister";
    response.sendRedirect(redirectURL);
%>