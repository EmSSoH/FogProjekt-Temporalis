<%-- 
    Document   : komponentRedigering
    Created on : 22-05-2018, 12:20:44
    Author     : Juste
--%>

<%@page import="FunctionLayer.Components"%>
<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Carport"%>
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
        <table id="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Komponent</th>
                    <th>Pris</th>
                </tr>
            </thead>
            <tbody>
                 <%  ArrayList<Components> comp = (ArrayList<Components>)request.getAttribute("allComp");
                 for (Components o : comp){ %>
                 <tr>
                     <td><%out.print(o.getId());%></td>
                     <td><%out.print(o.getCompName());%></td>
                     <td><%out.print(o.getPrice());%></td>
                     <td>
                         <form action="FrontController" method="POST">
                         <input type="hidden" name="command" value="redigercomponent">
                         <input type="hidden" name="id" value="<%out.print(o.getId());%>">
                         <input type="hidden" name="name" value="<%out.print(o.getCompName());%>">
                         <input type="hidden" name="price" value="<%out.print(o.getPrice());%>">
                         <input type="submit" name="redigercomponent" value="Rediger">
                         </form>
                         <br>
                     </td>
                 </tr>
                 <%}%>            
            </tbody>
        </table>
        </div>
    </body>
</html>
