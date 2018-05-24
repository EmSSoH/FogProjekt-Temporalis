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
        <title>Login admin</title>
    </head>
    <body>
         <div class="login" style="background-color:#bbb;">
               <form name="orderlist" action="FrontController" method="POST">
                        <input class="table" type="hidden" name="command" value="orderlist">
                        <input class="table" type="submit" value="Check Order">
                </form> 
             
             
                 <form name="register" action="FrontController" method="POST">
                        <input class="table" type="hidden" name="command" value="register">
                        Email:<br>
                        <input class="table" type="text" name="email" value="someone@nowhere.com">
                        <br>
                        Name:<br>
                        <input class="table" type="text" name="name" value="bob">
                        <br>
                        Password:<br>
                        <input class="table" type="password" name="password1" value="sesam">
                        <br>
                        Retype Password:<br>
                        <input class="table" type="password" name="password2" value="sesam">
                        <br>
                        <input class="table" type="submit" value="Submit">
                    </form>
             
             
             
             <form name="Nyt Komponenet" action="FrontController" method="post">
                 <input class="table" type="hidden" name="command" value="newComp">
                 <input class="table" type="submit" value="Nyt Komponenet">
             </form>
             
             <form name="Ny Predef" action="FrontController" method="post">
                 <input class="table" type="hidden" name="command" value="newPredef">
                 <input class="table" type="submit" value="Ny Predef">
             </form>
             
                <form name="Komponent redigering" action="FrontController" method="POST">
                        <input class="table" type="hidden" name="command" value="kredigering">
                        <input class="table" type="submit" value="Komponent redigering">
                </form> 
             
              <form name="Predef redigering" action="FrontController" method="POST">
                        <input class="table" type="hidden" name="command" value="predigering">
                        <input class="table" type="submit" value="Predef redigering">
              </form> 
          
        </div>    
    </body>
</html>
