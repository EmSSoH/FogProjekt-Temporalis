<%-- 
    Document   : orderList
    Created on : 01-05-2018, 10:32:09
    Author     : Juste
--%>

<%@page import="java.util.List"%>
<%@page import="FunctionLayer.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="LegoStyle.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        <table id="table">
            <thead>
                <tr>
                    <th>Order ID, Date and Status</th>
                </tr>
            </thead>
            <tbody>
                //skal redigeres væk fra session.
                 <%  List<Order> order = (ArrayList<Order>) session.getAttribute("allOrders");
                 for (Order o : order){ %>
                 <tr>
                     <td>
                         <form action="FrontController" method="POST">
                         <input type="hidden" name="command" value="send">
                         <input type="hidden" name="id" value="<%out.print(o.getOrderId());%>">
                         <input type="submit" name="orderId" value="Id:<%out.print(o.getOrderId());%> --- Date:<%out.print(o.getDate());%>  --- Status:<%out.print(o.getStatus());%>">
                         
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
