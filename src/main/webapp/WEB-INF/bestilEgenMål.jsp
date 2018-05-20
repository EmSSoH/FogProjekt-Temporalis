<%-- 
    Document   : bestilEgenMål
    Created on : 16-05-2018, 10:53:42
    Author     : Juste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form name="customer" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="customer">
                        Carport Længden:<br>
                        <input type="text" name="clength" value="600">
                        <br>
                        Carport Bredde:<br>
                        <input type="text" name="cwidth" value="720">
                        <br>
                        Shed Længden:<br>
                        <input type="text" name="slength" value="530">
                        <br>
                        Shed Bredde:<br>
                        <input type="text" name="swidth" value="220">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
    </body>
</html>
