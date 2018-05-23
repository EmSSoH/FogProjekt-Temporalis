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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Juste
 */
public class updateKomp extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
       HttpSession session = request.getSession();
        
        String temp = request.getParameter( "nid" );
        int id = Integer.parseInt(temp);       
        String name = request.getParameter( "nname" );
        temp = request.getParameter("nprice");
        int price = Integer.parseInt(temp);
 
        LogicFacade.updateComp(id,name,price);

        
        int tempi = (int) session.getAttribute("role");
        if(tempi == 1){
            return "loginAdmin";
        }else{
        return "LoginNonAdmin";
        }
    }
    
    
}
