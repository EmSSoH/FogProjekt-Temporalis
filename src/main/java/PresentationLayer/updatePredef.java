/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.Carport;
import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.UniversalException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Juste
 */
public class updatePredef extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
      HttpSession session = request.getSession();
        
        String temp = request.getParameter( "id" );
        int id = Integer.parseInt(temp);
        temp = request.getParameter( "nCPL" );
        int cpl = Integer.parseInt(temp);
        temp = request.getParameter("nCPW");
        int cpw = Integer.parseInt(temp);
        temp = request.getParameter( "nincline" );
        int incline = Integer.parseInt(temp);
        temp = request.getParameter("nRtype");
        int Rtype = Integer.parseInt(temp);
        temp = request.getParameter( "nslength" );
        int slength = Integer.parseInt(temp);
        temp = request.getParameter( "nswidth" );
        int swidth = Integer.parseInt(temp);
        Carport carport = new Carport(id, cpl, cpw, Rtype, incline, slength, swidth);
        LogicFacade.updatePredef(carport);

        
        int tempi = (int) session.getAttribute("role");
        if(tempi == 1){
            return "loginAdmin";
        }else{
        return "LoginNonAdmin";
        }
    }
    
}
