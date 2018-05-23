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
        <link href="Frontpage.css" rel="stylesheet" type="text/css"/>
        <title>Welcome page</title>
    </head>
    <body>

        
        
        <div class="grid-container">
            <div class="header">
            <h2>Fog Projekt</h2>
            </div>
        <div class="left" style="background-color:#aaa;">
                        <form name="CPH" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="CPH">
                        <input type="submit" value="Carport med Hældning">
                        <img src="Hældning.JPG" width="580" height="280"/>  
                </form></div>
        <div class="middle" style="background-color:#bbb;">
                        <form name="CPF" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="CPF">
                        <input type="submit" value="Carport uden Hældning">
                        <img src="Flad.jpg" width="580" height="280"/>  
                </form>   </div>  
        <div class="right" style="background-color:#ccc;">
                        <form name="EM" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="EM">
                        <input type="submit" value="Carport efter egen mål">
                </form> </div>
        <div class="footer">
                <form name="login" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="gtlogin">
                        <input type="submit" value="login">  
                </form>
        </div>
</div>
    </body>
</html>
