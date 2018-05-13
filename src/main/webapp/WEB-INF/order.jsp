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
       <form name="rediger" action="FrontController" method="POST">
       <input type="hidden" name="command" value="rediger">
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
                 <tr>
                     <td> <% out.print(request.getAttribute("orderId")); %></td>
                     <td> <% out.print(request.getAttribute("status")); %></td>
                     <td> <% out.print(request.getAttribute("CPL")); %></td>
                     <td> <% out.print(request.getAttribute("CPW")); %></td>
                     <td> <% out.print(request.getAttribute("incline")); %></td>
                     <td> <% out.print(request.getAttribute("Rtype")); %></td>
                     <td> <% out.print(request.getAttribute("slength")); %></td>
                     <td> <% out.print(request.getAttribute("swidth")); %></td>
                     <td> <% out.print(request.getAttribute("comment")); %></td>
                     <td> <% out.print(request.getAttribute("price")); %></td>
                     <td> <% out.print(request.getAttribute("userid")); %></td>
                     <td> <% out.print(request.getAttribute("delivery")); %></td>
                     <td> <% out.print(request.getAttribute("date")); %></td>
                 </tr>
              
                 <tr>
                     <td><input type="text" name="oid" value=""></td>
                     <td><input type="text" name="status" value=""></td>
                     <td><input type="text" name="CPL" value=""></td>
                     <td><input type="text" name="CPW" value=""></td>
                     <td><input type="text" name="incline" value=""></td>
                     <td><input type="text" name="Rtype" value=""></td>
                     <td><input type="text" name="slength" value=""></td>
                     <td><input type="text" name="swidth" value=""></td>
                     <td><input type="text" name="comment" value=""></td>
                     <td><input type="text" name="price" value=""></td>
                     <td><input type="text" name="uid" value=""></td>
                     <td><input type="text" name="delivery" value=""></td>
                 </tr>  
              
            </tbody>
            
        </table>       
                
             <input type="submit" value="Submit changes">
            </form>
     </div>   
    </body>
</html>
