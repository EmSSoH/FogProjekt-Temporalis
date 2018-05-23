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
public class createKomp extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
        String name = request.getParameter( "price" );
        int price = Integer.parseInt(name);
        name = request.getParameter( "name" );
        
        LogicFacade.createComp(name,price);
        
        
        return "loginAdmin";
        
        
    }
    
}
