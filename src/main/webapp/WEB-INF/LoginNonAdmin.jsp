<%-- 
    Document   : LoginNonAdmin
    Created on : 11-05-2018, 11:19:19
    Author     : Juste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="LegoStyle.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
               <form name="orderlist" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="orderlist">
                        <input type="submit" value="Check Order">
                    </form> 
            
          
    </body>
</html>
