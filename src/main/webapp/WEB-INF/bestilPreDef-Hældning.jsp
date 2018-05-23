<%-- 
    Document   : bestilPreDef-Hældning
    Created on : 16-05-2018, 10:53:29
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
                 <%  ArrayList<Carport> carports = (ArrayList<Carport>)request.getAttribute("allPredefUHæld");
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
                         <input type="submit" name="BuyThisCarport" value="Bestil"> ikke lavet endnu
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
