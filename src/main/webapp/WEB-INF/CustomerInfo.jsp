<%-- 
    Document   : CustomerInfo
    Created on : 17-05-2018, 21:27:36
    Author     : Juste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Frontpage.css" rel="stylesheet" type="text/css"/> 
    
    </head>
    <body>
        <div class="center" style="background-color:#bbb;">
                     <form name="bestil" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="bestil">    
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
                        <input type="hidden" name="clength" value="<%out.print(request.getAttribute("clength"));%>">
                        <input type="hidden" name="cwidth" value="<%out.print(request.getAttribute("cwidth"));%>">
                        <input type="hidden" name="slength" value="<%out.print(request.getAttribute("slength"));%>">
                        <input type="hidden" name="swidth" value="<%out.print(request.getAttribute("swidth"));%>">
                        <%if(request.getAttribute("Rtype") != null){ %>
                            <input type="hidden" name="Rtype" value="<%out.print(request.getAttribute("Rtype"));%>">
                        <%}%>
                        <%if(request.getAttribute("incline") != null){ %>
                            <input type="hidden" name="incline" value="<%out.print(request.getAttribute("incline"));%>">
                        <%}%>
                        <input type="submit" value="submit">
                     </form>
        </div>
    </body>
</html>
