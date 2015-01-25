<%-- 
    Document   : kasboeken.jsp
    Created on : 24-Jan-2015, 17:06:08
    Author     : Andy
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="BLL.Kasboek"%>
<%@page import="ViewModel.KasboekList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%//@include file="/header.jsp" %>

<%
    List<Kasboek> kasboeken =(List<Kasboek>)session.getAttribute("kasboeken");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th>Datum</th>
                <th>Av</th>
                <th>Commentaar</th>
                <th>Omzet</th>
                <th></th>
                
            </tr>
            <%for(Kasboek kasboek : kasboeken){%>
            <tr>
            <td><%= sdf.format(kasboek.getDatum())%></td>
            <td><%= kasboek.getAv()%></td>
            <td><%= kasboek.getCommentaar()%></td>
            <td><a href="Kasboek?id=<%= kasboek.getId()%>" >Details</a></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
