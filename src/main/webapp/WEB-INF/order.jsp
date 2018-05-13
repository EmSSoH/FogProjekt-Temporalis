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
                     <td><input type="text" name="nemployeeId" value=""></td>
                     <td><input type="text" name="nstatus" value=""></td>
                     <td><input type="text" name="nCPL" value=""></td>
                     <td><input type="text" name="nCPW" value=""></td>
                     <td><input type="text" name="nincline" value=""></td>
                     <td><input type="text" name="nRtype" value=""></td>
                     <td><input type="text" name="nslength" value=""></td>
                     <td><input type="text" name="nswidth" value=""></td>
                     <td><input type="text" name="ncomment" value=""></td>
                     <td><input type="text" name="nprice" value=""></td>
                     <td><input type="text" name="ndelivery" value=""></td>
                 </tr>  
              
            </tbody>
            
        </table>       
                
             <input type="submit" value="Submit changes">
            </form>
                     
                  <%  Stykliste stykliste = (Stykliste)request.getAttribute("stykliste");
                    %>

        TrykimpBrædt25x200mm360        = <% out.print(stykliste.getTrykimpBrædt25x200mm360());%>
        TrykimpBrædt25x200mm540        = <% out.print(stykliste.getTrykimpBrædt25x200mm540());%>
        trykimpbrædt25x125mm360        = <% out.print(stykliste.getTrykimpbrædt25x125mm360());%>
        trykimpbrædt25x125mm540        = <% out.print(stykliste.getTrykimpbrædt25x125mm540());%>
        lægteubh38x73mm420             = <% out.print(stykliste.getLægteubh38x73mm420());%>
        regulærub45x95mm240            = <% out.print(stykliste.getRegulærub45x95mm240());%>
        regulærub45x95mm270            = <% out.print(stykliste.getRegulærub45x95mm270());%>
        regulærub45x95mm360            = <% out.print(stykliste.getRegulærub45x95mm360());%>
        spærtræubh45x195mm600          = <% out.print(stykliste.getSpærtræubh45x195mm600());%>
        spærtræubh45x195mm480          = <% out.print(stykliste.getSpærtræubh45x195mm480());%>
        trykimpstolpe97x97mm300        = <% out.print(stykliste.getTrykimpstolpe97x97mm300());%>
        trykimpbrædt19x100mm210        = <% out.print(stykliste.getTrykimpbrædt19x100mm210());%>
        trykimpbrædt19x100mm540        = <% out.print(stykliste.getTrykimpbrædt19x100mm540());%>
        trykimpbrædt19x100mm360        = <% out.print(stykliste.getTrykimpbrædt19x100mm360());%>
        trykimpbrædt19x100mm480        = <% out.print(stykliste.getTrykimpbrædt19x100mm480());%>
        trykimpbrædt19x100mm240        = <% out.print(stykliste.getTrykimpbrædt19x100mm240());%>
        trykimpbrædt25x150mm480        = <% out.print(stykliste.getTrykimpbrædt25x150mm480());%>
        trykimpbrædt25x150mm600        = <% out.print(stykliste.getTrykimpbrædt25x150mm600());%>
        trykimpbrædt25x150mm540        = <% out.print(stykliste.getTrykimpbrædt25x150mm540());%>
        færdigskåret                   = <% out.print(stykliste.getFærdigskåret());%>
        trykimpbræt25x50mm540          = <% out.print(stykliste.getTrykimpbræt25x50mm540());%>
        taglægteTI38x73mm540           = <% out.print(stykliste.getTaglægteTI38x73mm540());%>
        taglægteTI38x73mm420           = <% out.print(stykliste.getTaglægteTI38x73mm420());%>
        BCdobbeltssort                 = <% out.print(stykliste.getBCdobbeltssort());%>
        BCrygstensort                  = <% out.print(stykliste.getBCrygstensort());%>
        BCtoplægterholder              = <% out.print(stykliste.getBCtoplægterholder());%>
        BCrygstensbeslag               =<% out.print(stykliste.getBCrygstensbeslag());%>
        BCtagstensbindereognakkekroge  = <% out.print(stykliste.getBCtagstensbindereognakkekroge());%>
        Plastmoecoliteblåtonet600      =<% out.print(stykliste.getPlastmoecoliteblåtonet600());%>
        Plastmoecoliteblåtonet360      = <% out.print(stykliste.getPlastmoecoliteblåtonet360());%>
        Plastmobundskruer50stk         = <% out.print(stykliste.getPlastmobundskruer50stk());%>
        Hulbånd1x20mm10mtr             = <% out.print(stykliste.getHulbånd1x20mm10mtr());%>
        Universal190mmhøjre            = <% out.print(stykliste.getUniversal190mmhøjre());%>
        Universal190mmvenstre          = <% out.print(stykliste.getUniversal190mmvenstre());%>
        skruer4komma5x60mm50stk        =<% out.print(stykliste.getSkruer4komma5x60mm50stk());%>
        beslagskruer4x50mm50stk        = <% out.print(stykliste.getBeslagskruer4x50mm50stk());%>
        Bræddebolt10x120mm             =<% out.print(stykliste.getBræddebolt10x120mm());%>
        Firkantsskiver40x40x11mm       =<% out.print(stykliste.getFirkantsskiver40x40x11mm());%>
        skruer4komma5x70mm50stk        = <% out.print(stykliste.getSkruer4komma5x70mm50stk());%>
        skruer4komma5x50mm50stk        =<% out.print(stykliste.getSkruer4komma5x50mm50stk());%>
        Stalddørsgreb50x75             = <% out.print(stykliste.getStalddørsgreb50x75());%>
        Thængsel390mm                  = <% out.print(stykliste.getThængsel390mm());%>
        Vinkelbeslag35                 = <% out.print(stykliste.getVinkelbeslag35());%>
        beslagskruer5x40mm50stk        = <% out.print(stykliste.getBeslagskruer5x40mm50stk());%>
        skruer5x100mm50stk             = <% out.print(stykliste.getSkruer5x100mm50stk());%>
                   
          
     </div>   
    </body>
</html>
