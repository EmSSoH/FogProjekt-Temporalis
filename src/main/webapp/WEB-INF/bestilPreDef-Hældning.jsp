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
        <title>Bestil uden hældning</title>
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
                         <input class="table" id="table1" type="hidden" name="command" value="customer">
                         <input class="table" id="table1" type="hidden" name="clength" value="<%out.print(o.getCarL());%>">
                         <input class="table" id="table1" type="hidden" name="cwidth" value="<%out.print(o.getCarB());%>">
                         <input class="table" id="table1" type="hidden" name="Rtype" value="<%out.print(o.getTagtype());%>">
                         <input class="table" id="table1" type="hidden" name="incline" value="<%out.print(o.getTaghæld());%>">
                         <input class="table" id="table1" type="hidden" name="slength" value="<%out.print(o.getRedL());%>">
                         <input class="table" id="table1" type="hidden" name="swidth" value="<%out.print(o.getRedB());%>">
                         <input class="table" id="table1" type="submit" name="BuyThisCarport" value="Bestil">
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
