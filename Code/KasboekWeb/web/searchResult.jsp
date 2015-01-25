<%--  
    Document   : searchResult
    Created on : 24-Jan-2015, 18:28:34
    Author     : Andy
--%>

<%@page import="BLL.Kasboek"%>
<%@page import="ViewModel.KasboekList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="/header.jsp" %>
<%
    KasboekList kasboeken =(KasboekList) session.getAttribute("searchResult");
    int jaar = (Integer)session.getAttribute("jaar");
    int maand =(Integer)session.getAttribute("maand");
    
    String error;
    if(kasboeken == null){
        error ="Er zijn geen kasboeken.";
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%= maand%>/<%= jaar%></title>
    </head>
    <body>
        <h1>kasboeken <%= maand%>/<%= jaar%> </h1>
        
        <table>
            <tr>
                <th>Datum</th>
                <th>Av</th>
                <th>Commentaar</th>
                <th>Omzet</th>
                <th></th>
                
            </tr>
            <%for(Kasboek kasboek : kasboeken.getKasboeken()){%>
            <td><%= kasboek.getDatum()%></td>
            <td><%= kasboek.getAv()%></td>
            <td><%= kasboek.getCommentaar()%></td>
            <td><%= kasboek.omzet()%></td>
            <td><a href="KasboekDetails?kasboekId=<%=kasboek.getId()%>">Details</a></td>
        </table>
    </body>
</html>
