<%-- 
    Document   : index
    Created on : Aug 22, 2017, 2:01:06 PM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="LegoStyle.css" rel="stylesheet" type="text/css"/>
        <title>Welcome page</title>
    </head>
    <body>
        <h1>Welcome to Sem 2</h1>
        <div>
      
               <form name="PreDefHældning" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="CarportHæld">
                        <input type="submit" value="Carport med Hældning">
                </form>
                 <form name="PreDef-Hældning" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="CarportUHæld">
                        <input type="submit" value="Carport uden Hældning">
                </form>   
                <form name="egenMål" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="Carport efter egen mål">
                        <input type="submit" value="Carport efter egen mål">
                </form>    
              
                   
             
              
           
        
        <% String error = (String) request.getAttribute( "error");
           if ( error != null) { %>
           <H2>Error!!</h2>
           <p><%= error %>
        <% }
        %>
        </div>
        
        
        
         <ul>
        <li><a href="login">Login</a></li>
        </ul>
    </body>
</html>
