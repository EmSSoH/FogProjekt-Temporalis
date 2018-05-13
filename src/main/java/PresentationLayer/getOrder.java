/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.UniversalException;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Juste
 */
public class getOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
        String tempid = request.getParameter("id");
        int id = Integer.parseInt(tempid);
        Order order = LogicFacade.getOrder(id);
        
        
        request.setAttribute( "employeeId", order.getUserId());
        request.setAttribute( "orderId", order.getOrderId() );
        request.setAttribute( "CPL", order.getCarportLength() );
        request.setAttribute( "CPW", order.getCarportWidth() );
        request.setAttribute( "comment", order.getComment() );
        request.setAttribute( "date", order.getDate() );
        request.setAttribute( "delivery", order.getDelivery() );
        request.setAttribute( "incline", order.getIncline() );
        request.setAttribute( "price", order.getPrice() );
        request.setAttribute( "Rtype", order.getRoofType() );
        request.setAttribute( "slength", order.getShedLength() );
        request.setAttribute( "swidth", order.getShedWidth() );
        request.setAttribute( "status", order.getStatus() );
        request.setAttribute( "userid", order.getUserId() );
                   
            return "order";
       }
    
}
