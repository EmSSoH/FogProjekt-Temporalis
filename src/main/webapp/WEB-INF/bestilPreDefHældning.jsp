<%-- 
    Document   : bestilPreDefHældning
    Created on : 16-05-2018, 10:53:11
    Author     : Juste
--%>
<%@page import="java.util.List"%>
<%@page import="FunctionLayer.Carport"%>
<%@page import="java.util.ArrayList"%>
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
                    <th>Billed</th>
                    <th>Carport Længde</th>
                    <th>Carport Brede</th>
                    <th>Tag type</th>
                    <th>TagHæld</th> 
                    <th>Skur Længde</th>
                    <th>Skur Brede</th>
                    <th>Choose</th>
                </tr>
            </thead>
            <tbody>
                 <%  ArrayList<Carport> carports = (ArrayList<Carport>)request.getAttribute("allPredefHæld");
                 for (Carport o : carports){ %>
                 <tr>
                     
                     <td>BILLED</td>
                     <td><%out.print(o.getCarL());%></td>
                     <td><%out.print(o.getCarB());%></td>
                     <td><%out.print(o.getTagtype());%></td>
                     <td><%out.print(o.getTaghæld());%></td>
                     <td><%out.print(o.getRedL());%></td>
                     <td><%out.print(o.getRedB());%></td>
                     <td>
                         <form action="FrontController" method="POST">
                         <input type="hidden" name="command" value="send">
                         <input type="hidden" name="id" value="<%out.print(o.getOrderId());%>">
                         <input type="submit" name="BuyThisCarport" value="Bestil">
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