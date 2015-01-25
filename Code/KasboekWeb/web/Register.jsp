<%-- 
    Document   : Register
    Created on : 25-Jan-2015, 15:18:35
    Author     : Andy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%//@include file="/header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>nieuwe gebruiker</h1>
        <form method="POST" action="Register">
            <label for="email">Email:</label> <input type="text"  name="email"/><br>
            <label for="username">Gebruiker naam:</label> <input class="form-control" id="inputEmail3" placeholder="Email" type="text" name="username"/><br>
            <label for="password">Wachtwoord:</label> <input class="form-control" id="inputEmail3" placeholder="Wachtwoord" type="password"  name="password"/><br>
            <label for="check">Bevestig wachtwoord:</label> <input class="form-control" id="inputEmail3" placeholder="Bevestig wachtwoord"  type="password" name="check"/><br>
            <label for="admin">Administrator:</label><br>
            <input name="optionsRadios" id="optionsRadios1" type="radio" id="admintrue"  name="admin" value="true"> <label>Ja</label><br>
            <input name="optionsRadios" id="optionsRadios1" type="radio" id="adminfalse" name="admin" value="false"> <label>Nee</label>
            <input type="submit" value="Registreren"/>
            
        </form>
    </body>
</html>
