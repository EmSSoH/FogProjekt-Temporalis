<%-- 
    Document   : order
    Created on : 03-05-2018, 13:57:45
    Author     : Juste
--%>


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
                    <th>Order ID</th>
                    <th>status</th>
                    <th>carport length</th>
                    <th>carport Width</th>
                    <th>incline</th>
                    <th>rooftype</th>
                    <th>shed Length</th>
                    <th>shed Width</th>
                    <th>comment</th>
                    <th>price</th>
                    <th>user id</th>
                    <th>delivery</th>
                    <th>date</th>
            
                </tr>
            </thead>
            <tbody>
                //skal redigeres væk fra session.
                 <tr>
                     <td> <% out.print(session.getAttribute("orderId")); %></td>
                     <td> <% out.print(session.getAttribute("status")); %></td>
                     <td> <% out.print(session.getAttribute("CPL")); %></td>
                     <td> <% out.print(session.getAttribute("CPW")); %></td>
                     <td> <% out.print(session.getAttribute("incline")); %></td>
                     <td> <% out.print(session.getAttribute("Rtype")); %></td>
                     <td> <% out.print(session.getAttribute("slength")); %></td>
                     <td> <% out.print(session.getAttribute("swidth")); %></td>
                     <td> <% out.print(session.getAttribute("comment")); %></td>
                     <td> <% out.print(session.getAttribute("price")); %></td>
                     <td> <% out.print(session.getAttribute("userid")); %></td>
                     <td> <% out.print(session.getAttribute("delivery")); %></td>
                     <td> <% out.print(session.getAttribute("date")); %></td>
                 </tr>
                       
            </tbody>
        </table>       

     </div>   
    </body>
</html>
