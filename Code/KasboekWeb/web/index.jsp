<%-- 
    Document   : index
    Created on : 24-Jan-2015, 15:50:46
    Author     : Andy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    
    <body>
        
        <div>
        <a href="Kasboeken">bla</a>
        <a href="Register.jsp">reg</a>
        </div>
        <div class="col-md-8">
        <form method="POST" action="Login" class="form-horizontal">
            
                <div class="form-group">
                
                <label class="col-sm-2 control-label" for="email">Email</label>
                <div class="col-sm-10">
                
                <input class="form-control" id="inputEmail3" placeholder="Email" type="text" name="email"/>
                <br>
                </div>
                </div>
                <div class="form-group">
                
                <label class="col-sm-2 control-label" for="password">wachtwoord</label>
                <div class="col-sm-10">
                
                <input class="form-control" id="inputPassword3" placeholder="wachtwoord" type="password" name="paswoord"/>
                <br>
                </div>
                </div>
                <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
                <input class="btn btn-default" type="submit" value="login"/>
                <br></div></div>
            
        </div></form>
    </body>
</html>
