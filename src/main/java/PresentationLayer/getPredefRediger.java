/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.Carport;
import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.Stykliste;
import FunctionLayer.UniversalException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juste
 */
public class getPredefRediger extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
        String tempid = request.getParameter("id");
        int id = Integer.parseInt(tempid);
        Carport carport = LogicFacade.getPredef(id);
        
      
        request.setAttribute( "id", carport.getPredef_id());
        request.setAttribute( "clength", carport.getCarL());
        request.setAttribute( "cwidth", carport.getCarB());
        request.setAttribute( "incline", carport.getTaghæld());
        request.setAttribute( "Rtype", carport.getTagtype());
        request.setAttribute( "slength", carport.getRedL());
        request.setAttribute( "swidth", carport.getRedB());

       
         return "redigerChosenPredef";
    }
    
}
