<%-- 
    Document   : login
    Created on : 16-05-2018, 10:55:40
    Author     : Juste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Table.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="login">
         <form name="login" action="FrontController" method="POST">
                        <input class="nonTable" type="hidden" name="command" value="login">
                        Username:<br>
                        <input class="nonTable" type="text" name="name" value="user">
                        <br>
                        Password:<br>
                        <input class="nonTable" type="password" name="password" value="password">
                        <br>
                        <input class="nonTable" type="submit" value="Submit">
          </form>
            
        </div>
    </body>
</html>
