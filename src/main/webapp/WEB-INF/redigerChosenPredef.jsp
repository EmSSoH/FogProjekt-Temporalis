<%-- 
    Document   : redigerChosenPredef
    Created on : 22-05-2018, 12:41:26
    Author     : Juste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Table.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        <form name="rediger" action="FrontController" method="POST">
       <input type="hidden" name="command" value="updatePredef">
        <table id="table">
            <thead>
                <tr>
                    <th>Carport Længde</th>
                    <th>Carport Brede</th>
                    <th>Tag type</th>
                    <th>TagHæld</th> 
                    <th>Skur Længde</th>
                    <th>Skur Brede</th>  
               
                </tr>
            </thead>
            <tbody>
                 <tr> 
                     <td> <% out.print(request.getAttribute("clength")); %></td>
                     <td> <% out.print(request.getAttribute("cwidth")); %></td>
                     <td> <% out.print(request.getAttribute("Rtype")); %></td>
                     <td> <% out.print(request.getAttribute("incline")); %></td>
                     <td> <% out.print(request.getAttribute("slength")); %></td>
                     <td> <% out.print(request.getAttribute("swidth")); %></td>
                  
                 </tr>
              
                 <tr>
                     
                     <td><input class="table" type="number" name="nCPL" value="<% out.print(request.getAttribute("clength")); %>"></td>
                     <td><input class="table" type="number" name="nCPW" value="<% out.print(request.getAttribute("cwidth")); %>"></td>
                     <td><input class="table" type="number" name="nincline" value="<% out.print(request.getAttribute("Rtype")); %>"></td>
                     <td><input class="table" type="number" name="nRtype" value="<% out.print(request.getAttribute("incline")); %>"></td>
                     <td><input class="table" type="number" name="nslength" value="<% out.print(request.getAttribute("slength")); %>"></td>
                     <td><input class="table" type="number" name="nswidth" value="<% out.print(request.getAttribute("swidth")); %>"></td>
                    
                 </tr>  
              
            </tbody>
            
        </table>       
             <input type="hidden" name="id" value="<%out.print(request.getAttribute("id")); %>">   
             <input class="nonTable" type="submit" value="Submit changes">
            </form>
        </div>
    </body>
</html>
