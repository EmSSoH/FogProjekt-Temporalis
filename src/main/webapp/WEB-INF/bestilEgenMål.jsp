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
         <form name="bestil" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="bestil">
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
                        Name:<br>
                        <input type="text" name="name" value="mads">
                        <br>
                        Phone:<br>
                        <input type="text" name="phone" value="21844131">
                        <br>
                        email:<br>
                        <input type="text" name="email" value="minmail@mail.com">
                        <br>
                        address:<br>
                        <input type="text" name="address" value="herehvorjeger">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
    </body>
</html>
