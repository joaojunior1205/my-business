<%--
  Created by IntelliJ IDEA.
  User: joaoj
  Date: 03/07/2022
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    //scriplet
    String mensagem = (String)request.getAttribute("message");
    String title = (String)request.getAttribute("title");
%>

<html>
<head>
    <title><%= title %></title>
</head>
<body>
<h1><%= mensagem %></h1>
<h2><%= title %></h2>
</body>
</html>
