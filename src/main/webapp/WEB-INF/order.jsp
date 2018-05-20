<%-- 
    Document   : order
    Created on : 03-05-2018, 13:57:45
    Author     : Juste
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Stykliste"%>
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
       <form name="rediger" action="FrontController" method="POST">
       <input type="hidden" name="command" value="rediger">
        <table id="table">
            <thead>
                <tr>
                    <th>Order ID</th>
                    <th>employee id</th>
                    <th>status</th>
                    <th>carport length</th>
                    <th>carport Width</th>
                    <th>incline</th>
                    <th>rooftype</th>
                    <th>shed Length</th>
                    <th>shed Width</th>
                    <th>comment</th>
                    <th>price</th>
                    <th>delivery</th>
                    <th>date</th>
            
                </tr>
            </thead>
            <tbody>
                 <tr>
                     <td> <% out.print(request.getAttribute("orderId")); %></td>
                     <td> <% out.print(request.getAttribute("employeeId")); %></td>
                     <td> <% out.print(request.getAttribute("status")); %></td>
                     <td> <% out.print(request.getAttribute("CPL")); %></td>
                     <td> <% out.print(request.getAttribute("CPW")); %></td>
                     <td> <% out.print(request.getAttribute("incline")); %></td>
                     <td> <% out.print(request.getAttribute("Rtype")); %></td>
                     <td> <% out.print(request.getAttribute("slength")); %></td>
                     <td> <% out.print(request.getAttribute("swidth")); %></td>
                     <td> <% out.print(request.getAttribute("comment")); %></td>
                     <td> <% out.print(request.getAttribute("price")); %></td>
                     <td> <% out.print(request.getAttribute("delivery")); %></td>
                     <td> <% out.print(request.getAttribute("date")); %></td>
                 </tr>
              
                 <tr>
                     <td><input type="hidden" name="orderId" value="<% out.print(request.getAttribute("orderId")); %>"></td>
                     <td><input type="text" name="nemployeeId" value="<% out.print(request.getAttribute("employeeId")); %>"></td>
                     <td><input type="text" name="nstatus" value="<% out.print(request.getAttribute("status")); %>"></td>
                     <td><input type="text" name="nCPL" value=" <% out.print(request.getAttribute("CPL")); %>"></td>
                     <td><input type="text" name="nCPW" value="<% out.print(request.getAttribute("CPW")); %>"></td>
                     <td><input type="text" name="nincline" value="<% out.print(request.getAttribute("incline")); %>"></td>
                     <td><input type="text" name="nRtype" value="<% out.print(request.getAttribute("Rtype")); %>"></td>
                     <td><input type="text" name="nslength" value="<% out.print(request.getAttribute("slength")); %>"></td>
                     <td><input type="text" name="nswidth" value="<% out.print(request.getAttribute("swidth")); %>"></td>
                     <td><input type="text" name="ncomment" value="<% out.print(request.getAttribute("comment")); %>"></td>
                     <td><input type="text" name="nprice" value="<% out.print(request.getAttribute("price")); %>"></td>
                     <td><input type="text" name="ndelivery" value="<% out.print(request.getAttribute("date")); %>"></td>
                 </tr>  
              
            </tbody>
            
        </table>       
                
             <input type="submit" value="Submit changes">
            </form>
                     
                  <%  Stykliste stykliste = (Stykliste)request.getAttribute("stykliste");
                    %>
        <%if(stykliste.getTrykimpBrædt25x200mm360()!= 0){%>
        TrykimpBrædt25x200mm360        = <% out.print(stykliste.getTrykimpBrædt25x200mm360());%> <br>
        <%} if(stykliste.getTrykimpBrædt25x200mm540()!= 0){%>
        TrykimpBrædt25x200mm540        = <% out.print(stykliste.getTrykimpBrædt25x200mm540());%><br>
         <%} if(stykliste.getTrykimpbrædt25x125mm360()!= 0){%>
        trykimpbrædt25x125mm360        = <% out.print(stykliste.getTrykimpbrædt25x125mm360());%><br>
         <%} if(stykliste.getTrykimpbrædt25x125mm540()!= 0){%>
        trykimpbrædt25x125mm540        = <% out.print(stykliste.getTrykimpbrædt25x125mm540());%><br>
         <%} if(stykliste.getLægteubh38x73mm420()!= 0){%>
        lægteubh38x73mm420             = <% out.print(stykliste.getLægteubh38x73mm420());%><br>
         <%} if(stykliste.getRegulærub45x95mm240()!= 0){%>
        regulærub45x95mm240            = <% out.print(stykliste.getRegulærub45x95mm240());%><br>
         <%} if(stykliste.getRegulærub45x95mm270()!= 0){%>
        regulærub45x95mm270            = <% out.print(stykliste.getRegulærub45x95mm270());%><br>
         <%} if(stykliste.getRegulærub45x95mm360()!= 0){%>
        regulærub45x95mm360            = <% out.print(stykliste.getRegulærub45x95mm360());%><br>
         <%} if(stykliste.getSpærtræubh45x195mm600()!= 0){%>
        spærtræubh45x195mm600          = <% out.print(stykliste.getSpærtræubh45x195mm600());%><br>
         <%} if(stykliste.getSpærtræubh45x195mm480()!= 0){%>
        spærtræubh45x195mm480          = <% out.print(stykliste.getSpærtræubh45x195mm480());%><br>
         <%} if(stykliste.getTrykimpstolpe97x97mm300()!= 0){%>
        trykimpstolpe97x97mm300        = <% out.print(stykliste.getTrykimpstolpe97x97mm300());%><br>
         <%} if(stykliste.getTrykimpbrædt19x100mm210()!= 0){%>
        trykimpbrædt19x100mm210        = <% out.print(stykliste.getTrykimpbrædt19x100mm210());%><br>
         <%} if(stykliste.getTrykimpbrædt19x100mm540()!= 0){%>
        trykimpbrædt19x100mm540        = <% out.print(stykliste.getTrykimpbrædt19x100mm540());%><br>
         <%} if(stykliste.getTrykimpbrædt19x100mm360()!= 0){%>
        trykimpbrædt19x100mm360        = <% out.print(stykliste.getTrykimpbrædt19x100mm360());%><br>
         <%} if(stykliste.getTrykimpbrædt19x100mm480()!= 0){%>
        trykimpbrædt19x100mm480        = <% out.print(stykliste.getTrykimpbrædt19x100mm480());%><br>
         <%} if(stykliste.getTrykimpbrædt19x100mm240()!= 0){%>
        trykimpbrædt19x100mm240        = <% out.print(stykliste.getTrykimpbrædt19x100mm240());%><br>
         <%} if(stykliste.getTrykimpbrædt25x150mm480()!= 0){%>
        trykimpbrædt25x150mm480        = <% out.print(stykliste.getTrykimpbrædt25x150mm480());%><br>
         <%} if(stykliste.getTrykimpbrædt25x150mm600()!= 0){%>
        trykimpbrædt25x150mm600        = <% out.print(stykliste.getTrykimpbrædt25x150mm600());%><br>
         <%} if(stykliste.getTrykimpbrædt25x150mm540()!= 0){%>
        trykimpbrædt25x150mm540        = <% out.print(stykliste.getTrykimpbrædt25x150mm540());%><br>
         <%} if(stykliste.getFærdigskåret()!= 0){%>
        færdigskåret                   = <% out.print(stykliste.getFærdigskåret());%><br>
         <%} if(stykliste.getTrykimpbræt25x50mm540()!= 0){%>
        trykimpbræt25x50mm540          = <% out.print(stykliste.getTrykimpbræt25x50mm540());%><br>
         <%} if(stykliste.getTaglægteTI38x73mm540()!= 0){%>
        taglægteTI38x73mm540           = <% out.print(stykliste.getTaglægteTI38x73mm540());%><br>
         <%} if(stykliste.getTaglægteTI38x73mm420()!= 0){%>
        taglægteTI38x73mm420           = <% out.print(stykliste.getTaglægteTI38x73mm420());%><br>
         <%} if(stykliste.getBCdobbeltssort()!= 0){%>
        BCdobbeltssort                 = <% out.print(stykliste.getBCdobbeltssort());%><br>
         <%} if(stykliste.getBCrygstensort()!= 0){%>
        BCrygstensort                  = <% out.print(stykliste.getBCrygstensort());%><br>
         <%} if(stykliste.getBCtoplægterholder()!= 0){%>
        BCtoplægterholder              = <% out.print(stykliste.getBCtoplægterholder());%><br>
         <%} if(stykliste.getBCrygstensbeslag()!= 0){%>
        BCrygstensbeslag               = <% out.print(stykliste.getBCrygstensbeslag());%><br>
         <%} if(stykliste.getBCtagstensbindereognakkekroge()!= 0){%>
        BCtagstensbindereognakkekroge  = <% out.print(stykliste.getBCtagstensbindereognakkekroge());%><br>
         <%} if(stykliste.getPlastmoecoliteblåtonet600()!= 0){%>
        Plastmoecoliteblåtonet600      = <% out.print(stykliste.getPlastmoecoliteblåtonet600());%><br>
         <%} if(stykliste.getPlastmoecoliteblåtonet360()!= 0){%>
        Plastmoecoliteblåtonet360      = <% out.print(stykliste.getPlastmoecoliteblåtonet360());%><br>
         <%} if(stykliste.getPlastmobundskruer200stk()!= 0){%>
        Plastmobundskruer50stk         = <% out.print(stykliste.getPlastmobundskruer200stk());%><br>
         <%} if(stykliste.getHulbånd1x20mm10mtr()!= 0){%>
        Hulbånd1x20mm10mtr             = <% out.print(stykliste.getHulbånd1x20mm10mtr());%><br>
         <%} if(stykliste.getUniversal190mmhøjre()!= 0){%>
        Universal190mmhøjre            = <% out.print(stykliste.getUniversal190mmhøjre());%><br>
         <%} if(stykliste.getUniversal190mmvenstre()!= 0){%>
        Universal190mmvenstre          = <% out.print(stykliste.getUniversal190mmvenstre());%><br>
         <%} if(stykliste.getSkruer4komma5x60mm200stk()!= 0){%>
        skruer4komma5x60mm50stk        = <% out.print(stykliste.getSkruer4komma5x60mm200stk());%><br>
         <%} if(stykliste.getBeslagskruer4x50mm250stk()!= 0){%>
        beslagskruer4x50mm50stk        = <% out.print(stykliste.getBeslagskruer4x50mm250stk());%><br>
         <%} if(stykliste.getBræddebolt10x120mm()!= 0){%>
        Bræddebolt10x120mm             = <% out.print(stykliste.getBræddebolt10x120mm());%><br>
         <%} if(stykliste.getFirkantsskiver40x40x11mm()!= 0){%>
        Firkantsskiver40x40x11mm       = <% out.print(stykliste.getFirkantsskiver40x40x11mm());%><br>
         <%} if(stykliste.getSkruer4komma5x70mm400stk()!= 0){%>
        skruer4komma5x70mm50stk        = <% out.print(stykliste.getSkruer4komma5x70mm400stk());%><br>
         <%} if(stykliste.getSkruer4komma5x50mm300stk()!= 0){%>
        skruer4komma5x50mm50stk        = <% out.print(stykliste.getSkruer4komma5x50mm300stk());%><br>
         <%} if(stykliste.getStalddørsgreb50x75()!= 0){%>
        Stalddørsgreb50x75             = <% out.print(stykliste.getStalddørsgreb50x75());%><br>
         <%} if(stykliste.getThængsel390mm()!= 0){%>
        Thængsel390mm                  = <% out.print(stykliste.getThængsel390mm());%><br>
         <%} if(stykliste.getVinkelbeslag35()!= 0){%>
        Vinkelbeslag35                 = <% out.print(stykliste.getVinkelbeslag35());%><br>
         <%} if(stykliste.getBeslagskruer5x40mm250stk()!= 0){%>
        beslagskruer5x40mm50stk        = <% out.print(stykliste.getBeslagskruer5x40mm250stk());%><br>
         <%} if(stykliste.getSkruer5x100mm100stk()!= 0){%>
        skruer5x100mm50stk             = <% out.print(stykliste.getSkruer5x100mm100stk());%><br>
         <%}%>
                   
           <form name="draw" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="draw">
                        
                        <input type="hidden" name="length" value="<% out.print(request.getAttribute("CPW")); %>">
                     
                        <input type="hidden" name="width" value="<% out.print(request.getAttribute("CPL")); %>">
                        
                        <input type="hidden" name="slength" value="<% out.print(request.getAttribute("swidth")); %>">
                       
                        <input type="hidden" name="swidth" value="<% out.print(request.getAttribute("slength")); %>">
                        <br>
                        <input type="submit" value="Draw">
                    </form>
     </div>   
    </body>
</html>
