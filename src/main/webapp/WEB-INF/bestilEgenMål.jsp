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
        <link href="Table.css" rel="stylesheet" type="text/css"/> 
        <title>Bestil egen mål</title>
    </head>
    <body>
        <div class="login" style="background-color:#bbb;">
         <form name="customer" action="FrontController" method="POST">
                        <input class="table" type="hidden" name="command" value="customer">
                        Carport Længden:<br>
                        <input class="table" type="text" name="clength" value="600">
                        <br>
                        Carport Bredde:<br>
                        <input class="table" type="text" name="cwidth" value="720">
                        <br>
                        Shed Længden:<br>
                        <input class="table" type="text" name="slength" value="530">
                        <br>
                        Shed Bredde:<br>
                        <input class="table" type="text" name="swidth" value="220">
                        <br>
                        <input class="table" type="submit" value="Submit">
                    </form>
            </div>
    </body>
</html>
