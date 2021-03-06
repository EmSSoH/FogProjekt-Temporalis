<%-- 
    Document   : predefRedigering
    Created on : 22-05-2018, 12:21:14
    Author     : Juste
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Carport"%>
<%@page import="FunctionLayer.Carport"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="Table.css" rel="stylesheet" type="text/css"/>
        <title>predef Redigering</title>
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
                 <%  ArrayList<Carport> carports = (ArrayList<Carport>)request.getAttribute("allPredef");
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
                         <input class="table" type="hidden" name="command" value="redigerpredef">
                         <input class="table" type="hidden" type="number" name="id" value="<%out.print(o.getPredef_id());%>">
                         <input class="table" type="hidden" type="number" name="clength" value="<%out.print(o.getCarL());%>">
                         <input class="table" type="hidden" type="number" name="cwidth" value="<%out.print(o.getCarB());%>">
                         <input class="table" type="hidden" type="number" name="Rtype" value="<%out.print(o.getTagtype());%>">
                         <input class="table" type="hidden" type="number" name="incline" value="<%out.print(o.getTaghæld());%>">
                         <input class="table" type="hidden" type="number" name="slength" value="<%out.print(o.getRedL());%>">
                         <input class="table" type="hidden" type="number" name="swidth" value="<%out.print(o.getRedB());%>">
                         <input class="table" type="submit" name="redigerpredef" value="Rediger">
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
