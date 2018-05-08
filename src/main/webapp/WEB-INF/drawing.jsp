<%-- 
    Document   : drawing
    Created on : 03-05-2018, 17:36:19
    Author     : Juste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% int length = (int)session.getAttribute("length");
   int width = (int)session.getAttribute("width");
   int slength = (int)session.getAttribute("slength");
   int swidth = (int)session.getAttribute("swidth");
%>   
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <SVG height= 900 width="900">
          <rect x="0" y="0" height = "<%=width+1%>" width= "<%=length+1%>"
           style="stroke:#000000; fill: #ffffff"/>  
          
          <rect x="0" y="35" height="10" width= "<%=length+1%>" style=" fill: #313131" />
          <rect x="0" y="<%=width-45%>" height="10" width= "<%=length+1%>" style=" fill: #313131" />
          
          <rect x="30" y="35" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="<%=length-410%>" y="35" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="<%=length-100%>" y="35" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          
          <rect x="30" y="<%=width-45%>" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="<%=length-410%>" y="<%=width-45%>" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="<%=length-100%>" y="<%=width-45%>" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          
          <% int temp = length;
          while(temp > 55){ %>
          <rect x="<%= length - temp%>" y="0" height="<%=width%>" width= "55" style=" stroke:#000000; fill: #dddddd" fill-opacity="0.4" />
          <% temp -= 55; }%>
          <rect x="<%= length - temp%>" y="0" height="<%=width%>" width= "<%=temp%>" style=" stroke:#000000; fill: #dddddd" fill-opacity="0.4" />
          
          <rect x="30" y="35" height="<%=swidth%>" width= "<%=slength%>" style=" stroke:#000000; fill: #b9ffd6" fill-opacity="0.4" />
          <text x="140" y="<%= width - (width/2) %>" font-size="30" >Skur</text>
          
          
          
        </SVG>
    </body>
</html>
