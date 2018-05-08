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
           style="stroke:#000000; fill: #ffffff"/>  
          
          <rect x="0" y="35" height="10" width= "<%=width+1%>" style=" fill: #313131" />
          <rect x="0" y="<%=length-45%>" height="10" width= "<%=width+1%>" style=" fill: #313131" />
          
          <rect x="100" y="35" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="410" y="35" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="<%=width-30%>" y="35" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          
          <rect x="100" y="<%=length-45%>" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="410" y="<%=length-45%>" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="<%=width-30%>" y="<%=length-45%>" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          
          <% int temp = width;
          while(temp > 55){ %>
          <rect x="<%= width - temp%>" y="0" height="<%=length%>" width= "55" style=" stroke:#000000; fill: #dddddd" fill-opacity="0.4" />
          <% temp -= 55; }%>
          <rect x="<%= width - temp%>" y="0" height="<%=length%>" width= "<%=temp%>" style=" stroke:#000000; fill: #dddddd" fill-opacity="0.4" />
          
          <rect x="<%=width-240%>" y="35" height="<%=length-70%>" width= "220" style=" stroke:#000000; fill: #b9ffd6" fill-opacity="0.4" />
          <text x="<%=width-140%>" y="<%= length - (length/2) %>" font-size="30" >Skur</text>
          
          
          
        </SVG>
    </body>
</html>
