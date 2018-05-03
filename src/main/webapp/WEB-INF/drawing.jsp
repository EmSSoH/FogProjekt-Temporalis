<%-- 
    Document   : drawing
    Created on : 03-05-2018, 17:36:19
    Author     : Juste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% int length = (int)session.getAttribute("length");
   int width = (int)session.getAttribute("width");
%>   
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <SVG height= 900 width="900">
          <rect x="0" y="0" height = "<%=length+1%>" width= "<%=width+1%>"
           style="stroke:#000000; fill: #846f6f"/>  
        </SVG>
    </body>
</html>
