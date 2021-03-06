<%-- 
    Document   : drawing
    Created on : 03-05-2018, 17:36:19
    Author     : Juste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% int length = (int)request.getAttribute("length");
   int width = (int)request.getAttribute("width");
   int slength = (int)request.getAttribute("slength");
   int swidth = (int)request.getAttribute("swidth");
   
    int hOffset = 50;
    int roofOffset = 5;

%>   
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <SVG height= 900 width="900" viewBox="0 0 1400 1400">
          <rect x="0" y="0" height = "<%=width+1%>" width= "<%=length+1%>"
           style="stroke:#000000; fill: #ffffff"/>  
          
          <rect x="0" y="35" height="10" width= "<%=length+1%>" style=" fill: #313131" />
          <rect x="0" y="<%=width-45%>" height="10" width= "<%=length+1%>" style=" fill: #313131" />
          
          <rect x="30" y="35" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="<%=length/2%>" y="35" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="<%=length-100%>" y="35" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          
          <rect x="30" y="<%=width-45%>" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="<%=length/2%>" y="<%=width-45%>" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="<%=length-100%>" y="<%=width-45%>" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          
          <% int temp = length;
          while(temp > 55){ %>
          <rect x="<%= length - temp%>" y="0" height="<%=width%>" width= "55" style=" stroke:#000000; fill: #dddddd" fill-opacity="0.4" />
          <% temp -= 55; }%>
          <rect x="<%= length - temp%>" y="0" height="<%=width%>" width= "<%=temp%>" style=" stroke:#000000; fill: #dddddd" fill-opacity="0.4" />
          
          
          <% if(swidth >= 150 && slength >= 210){ %>
          
          <rect x="30" y="<%=(swidth/2) + 25%>" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="30" y="<%=swidth + 25%>" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="<%=slength + 20%>" y="35" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="<%=slength + 20%>" y="<%=(swidth/2) + 25%>" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          <rect x="<%=slength + 20%>" y="<%=swidth + 25%>" height="10" width= "10" style=" stroke:#000000; fill: #dddddd" />
          
          <rect x="30" y="35" height="<%=swidth%>" width= "<%=slength%>" style=" stroke:#000000; fill: #b9ffd6" fill-opacity="0.4" />
          
          <text x="140" y="<%= width - (width/2) %>" font-size="30" >Skur</text>

          
          <%}%>
          
          
          
        </SVG>
        
        <SVG height= 900 width="900" viewBox="0 0 1000 1000">
        
        <rect x="30" y="<%=hOffset%>" height="220" width= "10" style=" fill: #313131" />
        <rect x="<%=length/2%>" y="<%=hOffset%>" height="220" width= "10" style=" fill: #313131" />
        <rect x="<%=length - 100%>" y="<%=hOffset%>" height="220" width= "10" style=" fill: #313131" />
        
        omrids <rect x="0" y="<%=hOffset%>" height="220" width= "<%=length%>" style=" stroke:#000000; fill: #dddddd" fill-opacity="0.0"   />
        
        <rect x="0" y="<%=hOffset - roofOffset%>"  height="30" width="<%=length%>" style="stroke:#000000; fill: #dddddd" transform="skewY(<%=Math.atan(-length/10)%>)" />
        <%if(swidth >= 150 && slength >= 210){ %>
        skur <rect x="30" y="<%=hOffset + 10%>" height="210" width="<%=slength%>" style=" stroke:#000000; fill: #b9ffd6" fill-opacity="0.4" />
        <%}%>
        <rect x="0" y="<%=hOffset - roofOffset%>"  height="15" width="<%=length%>" style="stroke:#000000; fill: #eddddd" fill-opacity="0.4" transform="skewY(<%=Math.atan(-length/10)%>)" />
        
        
        
        transform="skewY(<%=Math.atan(-length/10)%>)"
        
        210 x 150 minimum skur størelse.
        
        </SVG>
        

    </body>
</html>
