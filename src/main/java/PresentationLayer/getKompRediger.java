/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.Carport;
import FunctionLayer.Components;
import FunctionLayer.LogicFacade;
import FunctionLayer.UniversalException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juste
 */
public class getKompRediger extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
        String tempid = request.getParameter("id");
        int id = Integer.parseInt(tempid);
        Components comp = LogicFacade.getComp(id);
        
      
        request.setAttribute( "id", comp.getId());
        request.setAttribute( "name", comp.getCompName());
        request.setAttribute( "price", comp.getPrice());

       
         return "redigerChosenKomp";
    }
    
}
