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
        
        HttpSession session = request.getSession();
        session.setAttribute( "orderId", order.getOrderId() );
        session.setAttribute( "CPL", order.getCarportLength() );
        session.setAttribute( "CPW", order.getCarportWidth() );
        session.setAttribute( "comment", order.getComment() );
        session.setAttribute( "date", order.getDate() );
        session.setAttribute( "delivery", order.getDelivery() );
        session.setAttribute( "incline", order.getIncline() );
        session.setAttribute( "price", order.getPrice() );
        session.setAttribute( "Rtype", order.getRoofType() );
        session.setAttribute( "slength", order.getShedLength() );
        session.setAttribute( "swidth", order.getShedWidth() );
        session.setAttribute( "status", order.getStatus() );
        session.setAttribute( "userid", order.getUserId() );
                   
            return "order";
       }
    
}
