<%-- 
    Document   : orderList
    Created on : 01-05-2018, 10:32:09
    Author     : Juste
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        <table id="table">
            <thead>
                <tr>
                    <td>Order ID</td>
                </tr>
            </thead>
            <tbody>
                 <% ArrayList order = (ArrayList)session.getAttribute("list");
                 for (int i = 0; i < order.size(); i++){ %>
                 <tr>
                    <td> <%=order.get(i)%> </td>
                    <br>
                 </tr>
                 <tr>
                     <td><%=order.get(++i)%></td>
                    <br>
                 </tr>
                 <%  } %>              
            </tbody>
        </table>
        </div>
    </body>
</html>
