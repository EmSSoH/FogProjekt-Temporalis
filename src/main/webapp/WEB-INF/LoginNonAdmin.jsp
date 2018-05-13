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
            
             <form name="draw" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="draw">
                        Length in cm:<br>
                        <input type="text" name="length" value="780">
                        <br>
                        Width in cm:<br>
                        <input type="text" name="width" value="600">
                        <br>
                        Shed Længden in cm:<br>
                        <input type="text" name="slength" value="210">
                        <br>
                        Shed Bredde in cm:<br>
                        <input type="text" name="swidth" value="550">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
    </body>
</html>
