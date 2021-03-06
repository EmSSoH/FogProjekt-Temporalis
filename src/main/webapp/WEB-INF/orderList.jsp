<%-- 
    Document   : orderList
    Created on : 01-05-2018, 10:32:09
    Author     : Temporalis
--%>

<%@page import="java.util.List"%>
<%@page import="FunctionLayer.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Table.css" rel="stylesheet" type="text/css"/>
        <title>Ordre liste</title>
    </head>
    <body>
        <div>
        <table id="table">
            <thead>
                <tr>
                    <th>Order ID</th>
                    <th>Date</th>
                    <th>Status</th>
                    <th>Name</th>
                    <th>Phone</th>
                    <th>Email</th> 
                    <th>Choose</th>
                </tr>
            </thead>
            <tbody>
                 <%  ArrayList<Order> order = (ArrayList<Order>)request.getAttribute("allOrders");
                 for (Order o : order){ %>
                 <tr>
                     
                     <td><%out.print(o.getOrderId());%></td>
                     <td><%out.print(o.getDate());%></td>
                     <td><%out.print(o.getStatus());%></td>
                     <td><%out.print(o.getCustomer().getName());%></td>
                     <td><%out.print(o.getCustomer().getPhone());%></td>
                     <td><%out.print(o.getCustomer().getEmail());%></td>
                     <td>
                         <form action="FrontController" method="POST">
                         <input class="table" type="hidden" name="command" value="send">
                         <input class="table" type="hidden" name="id" value="<%out.print(o.getOrderId());%>">
                         <input class="table" type="submit" name="getThisOrder" value="More info">
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
