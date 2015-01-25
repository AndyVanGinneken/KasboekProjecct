<%-- 
    Document   : header
    Created on : 25-Jan-2015, 17:16:44
    Author     : Andy
--%>

<%@page import="BLL.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String username = null;
    Account ac =(Account) session.getAttribute("accountLogin");
    if(ac != null) {
     username = ac.getUsername();
    } else {
     //String message = "U bent niet ingelogd!";
     response.sendRedirect("index.jsp");
     return;
    }  
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">


<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
            <nav>
	<ul>
            <li><a href="Kasboeken">Kasboeken</a></li>
            <li><div class="search"><form method="POST" action="Search"><input type="text" name="maand" placeholder="maand bv. 01" required> <input type="text" name="jaar" placeholder="jaar bv. 2014" required> <input type="submit" value="Zoek" /></form></div></li>
            <li class="right"><a href="Logout">Log uit</a></li>
            <li class="right"><a href="account.jsp"><%=username%></a></li>
            
	</ul>
</nav>
    </body>
</html>
