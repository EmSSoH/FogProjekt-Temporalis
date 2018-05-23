/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.UniversalException;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juste
 */
public class komponentRedigere extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
      
      /*  List<> orders = LogicFacade.getAllOrders();
        Collections.reverse(orders);
        request.setAttribute("allOrders", orders);
        
            if (orders == null) {
                throw new UniversalException("Could not fetch orders");
            } else {*/
              return"komponentRedigering";
        //}
        
      
    }
    
}
