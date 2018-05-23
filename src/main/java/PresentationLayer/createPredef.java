/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.UniversalException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juste
 */
public class createPredef extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
        
        String temp = request.getParameter( "clength" );
        int clength = Integer.parseInt(temp);
        temp = request.getParameter( "cwidth" );
        int cwidth = Integer.parseInt(temp);
        temp = request.getParameter("slength");
        int slength = Integer.parseInt(temp);
        temp = request.getParameter("swidth");
        int swidth = Integer.parseInt(temp);
        temp = request.getParameter("incline");
        int incline = Integer.parseInt(temp);
        temp = request.getParameter("Rtype");
        int Rtype = Integer.parseInt(temp);
        temp = request.getParameter("price");
        int price = Integer.parseInt(temp);
        
        LogicFacade.createPredef(incline, Rtype, clength, cwidth, slength, swidth);
        
        
        return "loginAdmin";
    }

    
          
}
