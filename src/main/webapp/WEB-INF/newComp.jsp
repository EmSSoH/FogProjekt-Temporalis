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
        <link href="Table.css" rel="stylesheet" type="text/css"/>
        <title>Nyt Komponent</title>
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
                        <td><input class="table" type="text" name="name" value="navn"></td>
                        <td><input class="table" type="text" name="price" value="pris"></td>     
                     </tr>        
                    </tbody>
                    </table>
                 <input class="nonTable"  type="submit" value="Lav Komponent">
            </form>
        </div>
    </body>
</html>
