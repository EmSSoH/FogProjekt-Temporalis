<%-- 
    Document   : newPredef
    Created on : 23-05-2018, 12:26:12
    Author     : Juste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Indsæt Predef data</h1>
       
         <div>
             <form name="newPredef" action="FrontController" method="POST">
                 <input type="hidden" name="command" value="createPredef">
                    <table id="table">
                    <thead>
                        <tr>
                        <th>incline</th>
                        <th>roof type</th>
                        <th>Length</th>
                        <th>Width</th>
                        <th>Shed Length</th>
                        <th>Shed Width</th>
                        <th>Pris</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>           
                        <td><input type="text" name="incline" value="incline"></td>
                        <td><input type="text" name="Rtype" value="Roof Type"></td> 
                        <td><input type="text" name="clength" value="Length"></td>     
                        <td><input type="text" name="cwidth" value="Width"></td>     
                        <td><input type="text" name="slength" value="Shed length"></td>     
                        <td><input type="text" name="swidth" value="Shed Width"></td>     
                        <td><input type="text" name="price" value="pris"></td>     
                     </tr>        
                    </tbody>
                    </table>
                 <input type="submit" value="Lav Predef">
            </form>
        </div>
    </body>
</html>
