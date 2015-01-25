<%-- 
    Document   : kasboekDetails
    Created on : 24-Jan-2015, 18:05:42
    Author     : Andy
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="BLL.Kasboek"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%//@include file="/header.jsp" %>
<%
    Kasboek kasboek = (Kasboek)session.getAttribute("kasboekDetail");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    //double voor = kasboek.totaalBegin();
    //double na = kasboek.totaalEind();
    //double omzet = kasboek.omzet();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        Datum: <%= sdf.format(kasboek.getDatum())%><br>
        Av: <%= kasboek.getAv()%><br>
        Commentaar: <%= kasboek.getCommentaar()%><br>
        </div>
       <div>
            Beginkas <br>
            aantal 0,01 Centen: <%= kasboek.getBeginKas().getEenCenten()%><br>
            aantal 0,02 Centen: <%= kasboek.getBeginKas().getTweeCenten()%><br>
            aantal 0,05 Centen: <%= kasboek.getBeginKas().getVijfCenten()%><br>
            aantal 0,10 Centen: <%= kasboek.getBeginKas().getTienCenten()%><br>
            aantal 0,20 Centen: <%= kasboek.getBeginKas().getTwintigCenten()%><br>
            aantal 0,50 Centen: <%= kasboek.getBeginKas().getVijftigCenten()%><br>
            <br>
            aantal 1,00 Euro: <%= kasboek.getBeginKas().getEenEuros()%><br>
            aantal 2,00 Euro: <%= kasboek.getBeginKas().getTweeEuros()%><br>
            aantal 5,00 Euro: <%= kasboek.getBeginKas().getVijfEuros()%><br>
            aantal 10,00 Euro: <%= kasboek.getBeginKas().getTienEuros()%><br>
            aantal 20,00 Euro: <%= kasboek.getBeginKas().getTwintigEuros()%><br>
            aantal 50,00 Euro: <%= kasboek.getBeginKas().getVijftigEuro()%><br>
            aantal 100,00 Euro: <%= kasboek.getBeginKas().getHonderdEuros()%><br>
            <br>
            
        </div>
        <div>
            Eindkas <br>
            aantal 0,01 Centen: <%= kasboek.getEindKas().getEenCenten()%><br>
            aantal 0,02 Centen: <%= kasboek.getEindKas().getTweeCenten()%><br>
            aantal 0,05 Centen: <%= kasboek.getEindKas().getVijfCenten()%><br>
            aantal 0,10 Centen: <%= kasboek.getEindKas().getTienCenten()%><br>
            aantal 0,20 Centen: <%= kasboek.getEindKas().getTwintigCenten()%><br>
            aantal 0,50 Centen: <%= kasboek.getEindKas().getVijftigCenten()%><br>
            <br>
            aantal 1,00 Euro: <%= kasboek.getEindKas().getEenEuros()%><br>
            aantal 2,00 Euro: <%= kasboek.getEindKas().getTweeEuros()%><br>
            aantal 5,00 Euro: <%= kasboek.getEindKas().getVijfEuros()%><br>
            aantal 10,00 Euro: <%= kasboek.getEindKas().getTienEuros()%><br>
            aantal 20,00 Euro: <%= kasboek.getEindKas().getTwintigEuros()%><br>
            aantal 50,00 Euro: <%= kasboek.getEindKas().getVijftigEuro()%><br>
            aantal 100,00 Euro: <%= kasboek.getEindKas().getHonderdEuros()%><br>
            <br>
            
        </div>
            <%if(kasboek.getUitKas()!= null){%>
         <div>
            Uitkas <br>
            aantal 0,01 Centen: <%= kasboek.getUitKas().getEenCenten()%><br>
            aantal 0,02 Centen: <%= kasboek.getUitKas().getTweeCenten()%><br>
            aantal 0,05 Centen: <%= kasboek.getUitKas().getVijfCenten()%><br>
            aantal 0,10 Centen: <%= kasboek.getUitKas().getTienCenten()%><br>
            aantal 0,20 Centen: <%= kasboek.getUitKas().getTwintigCenten()%><br>
            aantal 0,50 Centen: <%= kasboek.getUitKas().getVijftigCenten()%><br>
            <br>
            aantal 1,00 Euro: <%= kasboek.getUitKas().getEenEuros()%><br>
            aantal 2,00 Euro: <%= kasboek.getUitKas().getTweeEuros()%><br>
            aantal 5,00 Euro: <%= kasboek.getUitKas().getVijfEuros()%><br>
            aantal 10,00 Euro: <%= kasboek.getUitKas().getTienEuros()%><br>
            aantal 20,00 Euro: <%= kasboek.getUitKas().getTwintigEuros()%><br>
            aantal 50,00 Euro: <%= kasboek.getUitKas().getVijftigEuro()%><br>
            aantal 100,00 Euro: <%= kasboek.getUitKas().getHonderdEuros()%><br>
            <br>
             <%
            }
             if(kasboek.getRolletjes()!= null){%>
        </div>
        <div>
            Rollen <br>
            aantal rollen van 0,01 Centen: <%= kasboek.getRolletjes().getEenCent()%><br>
            aantal rollen van 0,02 Centen: <%= kasboek.getRolletjes().getTweeCent()%><br>
            aantal rollen van 0,05 Centen: <%= kasboek.getRolletjes().getVijfCent()%><br>
            aantal rollen van 0,10 Centen: <%= kasboek.getRolletjes().getTienCent()%><br>
            aantal rollen van 0,20 Centen: <%= kasboek.getRolletjes().getTwintigCent()%><br>
            aantal rollen van 0,50 Centen: <%= kasboek.getRolletjes().getVijftigCent()%><br>
            aantal rollen van 1,00 Euro: <%= kasboek.getRolletjes().getEenEuro()%><br>
            aantal rollen van 2,00 Euro: <%= kasboek.getRolletjes().getTweeEuro()%><br>
            <br>
            
        </div>
            <%}%>
        
        
                
    </body>
</html>
