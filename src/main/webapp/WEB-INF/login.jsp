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
    </body>
</html>
