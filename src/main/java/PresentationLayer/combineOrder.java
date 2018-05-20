/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.UniversalException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juste
 */
public class combineOrder extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
        
        String temp = request.getParameter( "clength" );
        int clength = Integer.parseInt(temp);
         request.setAttribute("clength", clength);
        temp = request.getParameter( "cwidth" );
        int cwidth = Integer.parseInt(temp);
         request.setAttribute("cwidth", cwidth);
        temp = request.getParameter("slength");
        int slength = Integer.parseInt(temp);
         request.setAttribute("slength", slength);
        temp = request.getParameter("swidth");
        int swidth = Integer.parseInt(temp);
         request.setAttribute("swidth", swidth);
        if(request.getParameter("Rtype") != null){
        temp = request.getParameter("Rtype");
        int Rtype = Integer.parseInt(temp);
         request.setAttribute("Rtype", Rtype);
        }
        if(request.getParameter("incline") != null){
            temp = request.getParameter("incline");
            int incline = Integer.parseInt(temp);
             request.setAttribute("incline", incline);
        }
        
        
        
        return "CustomerInfo";
    }
    
}
