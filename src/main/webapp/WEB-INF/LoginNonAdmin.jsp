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
        <link href="Table.css" rel="stylesheet" type="text/css"/>
        <title>LoginNonAdmin</title>
    </head>
    <body>
        <div  class="center" style="background-color:#bbb;">
               <form name="orderlist" action="FrontController" method="POST">
                        <input class="table" type="hidden" name="command" value="orderlist">
                        <input class="table" type="submit" value="Check Order">
                </form> 
        </div>    
          
    </body>
</html>
