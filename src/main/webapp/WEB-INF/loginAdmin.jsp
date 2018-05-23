<%-- 
    Document   : loginAdmin
    Created on : 16-05-2018, 10:55:02
    Author     : Juste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Table.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
         <div>
               <form name="orderlist" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="orderlist">
                        <input type="submit" value="Check Order">
                </form> 
             
             
                 <form name="register" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="register">
                        Email:<br>
                        <input type="text" name="email" value="someone@nowhere.com">
                        <br>
                        Name:<br>
                        <input type="text" name="name" value="bob">
                        <br>
                        Password:<br>
                        <input type="password" name="password1" value="sesam">
                        <br>
                        Retype Password:<br>
                        <input type="password" name="password2" value="sesam">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
             
             
             
             <form name="Nyt Komponenet" action="FrontController" method="post">
                 <input type="hidden" name="command" value="newComp">
                 <input type="submit" value="Nyt Komponenet">
             </form>
             
             <form name="Ny Predef" action="FrontController" method="post">
                 <input type="hidden" name="command" value="newPredef">
                 <input type="submit" value="Ny Predef">
             </form>
             
                <form name="Komponent redigering" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="kredigering">
                        <input type="submit" value="Komponent redigering">
                </form> 
             
              <form name="Predef redigering" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="predigering">
                        <input type="submit" value="Predef redigering">
              </form> 
          
        </div>    
    </body>
</html>
