<%-- 
    Document   : index
    Created on : Aug 22, 2017, 2:01:06 PM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="LegoStyle.css" rel="stylesheet" type="text/css"/>
        <title>Welcome page</title>
    </head>
    <body>
        <h1>Welcome to Sem 2</h1>
        <div>
      
                    <form name="login" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="login">
                        Username:<br>
                        <input type="text" name="name" value="user">
                        <br>
                        Password:<br>
                        <input type="password" name="password" value="password">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
              
                    <form name="register" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="register">
                        Email:<br>
                        <input type="text" name="email" value="someone@nowhere.com">
                        <br>
                        Name:<br>
                        <input type="text" name="name" value="bob">
                        <br>
                        Password:<br>
                        <input type="password" name="password1" value="sesam">
                        <br>
                        Retype Password:<br>
                        <input type="password" name="password2" value="sesam">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
          
                    <form name="orderlist" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="orderlist">
                        <input type="submit" value="Check Order">
                    </form> 
            
             <form name="draw" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="draw">
                        Length in cm:<br>
                        <input type="text" name="length" value="length">
                        <br>
                        Width in cm:<br>
                        <input type="text" name="width" value="width">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
              
        
        <% String error = (String) request.getAttribute( "error");
           if ( error != null) { %>
           <H2>Error!!</h2>
           <p><%= error %>
        <% }
        %>
        </div>
    </body>
</html>
