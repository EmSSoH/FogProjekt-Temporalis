<%-- 
    Document   : redigerChosenKomp
    Created on : 22-05-2018, 12:41:48
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
       <input type="hidden" name="command" value="updateKomp">
        <table id="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Komponent</th>
                    <th>Pris</th>           
                </tr>
            </thead>
            <tbody>
                 <tr> 
                     <td> <% out.print(request.getAttribute("id")); %></td>
                     <td> <% out.print(request.getAttribute("name")); %></td>
                     <td> <% out.print(request.getAttribute("price")); %></td>
                 </tr>
              
                 <tr>           
                     <td><input class="table" type="hidden" name="nid" value="<% out.print(request.getAttribute("id")); %>"></td>
                     <td><input class="table" type="text" name="nname" value="<% out.print(request.getAttribute("name")); %>"></td>
                     <td><input class="table" type="number" name="nprice" value="<% out.print(request.getAttribute("price")); %>"></td>     
                 </tr>  
              
            </tbody>
            
        </table>         
             <input class="nonTable" type="submit" value="Submit changes">
            </form>
        </div>
    </body>
</html>
