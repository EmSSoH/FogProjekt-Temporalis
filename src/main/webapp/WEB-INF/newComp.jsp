<%-- 
    Document   : newComp
    Created on : 23-05-2018, 12:09:31
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
        <h1>Indsæt Komponent data</h1>
        
         <div>
             <form name="newComp" action="FrontController" method="POST">
                 <input type="hidden" name="command" value="createKomp">
                    <table id="table">
                    <thead>
                        <tr>
                        <th>Navn</th>
                        <th>Pris</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>           
                        <td><input type="text" name="name" value="navn"></td>
                        <td><input type="text" name="price" value="pris"></td>     
                     </tr>        
                    </tbody>
                    </table>
                 <input type="submit" value="Lav Komponent">
            </form>
        </div>
    </body>
</html>
