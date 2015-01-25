<%--  
    Document   : searchResult
    Created on : 24-Jan-2015, 18:28:34
    Author     : Andy
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="BLL.Kasboek"%>
<%@page import="ViewModel.KasboekList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%//@include file="/header.jsp" %>
<%
    List<Kasboek> kasboeken =(List<Kasboek>) session.getAttribute("searchResult");
    int jaar = (Integer)session.getAttribute("jaar");
    int maand =(Integer)session.getAttribute("maand");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
   
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%= maand%>/<%= jaar%></title>
    </head>
    <body>
        <h1>kasboeken <%= maand%>/<%= jaar%> </h1>
        
        <table class="table">
            <tr>
                <th>Datum</th>
                <th>Av</th>
                <th>Commentaar</th>
                
                <th></th>
                
            </tr>
            <%for(Kasboek kasboek : kasboeken){%>
            <tr>
            <td><%= sdf.format(kasboek.getDatum())%></td>
            <td><%= kasboek.getAv()%></td>
            <td><%= kasboek.getCommentaar()%></td>
            
            <td><a href="Kasboek?id=<%=kasboek.getId()%>">Details</a></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
