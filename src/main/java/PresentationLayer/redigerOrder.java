/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.UniversalException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juste
 */
public class redigerOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
        String temp = request.getParameter( "oid" );
        int oid = Integer.parseInt(temp);
        temp = request.getParameter( "CPL" );
        int cpl = Integer.parseInt(temp);
        temp = request.getParameter("CPW");
        int cpw = Integer.parseInt(temp);
        temp = request.getParameter( "delivery" );
        int delivery = Integer.parseInt(temp);
        temp = request.getParameter( "incline" );
        int incline = Integer.parseInt(temp);
        temp = request.getParameter("price");
        int price = Integer.parseInt(temp);
        temp = request.getParameter("Rtype");
        int Rtype = Integer.parseInt(temp);
        temp = request.getParameter( "slength" );
        int slength = Integer.parseInt(temp);
        temp = request.getParameter( "swidth" );
        int swidth = Integer.parseInt(temp);
        temp = request.getParameter("status");
        int status = Integer.parseInt(temp);
        temp = request.getParameter("uid");
        int uid = Integer.parseInt(temp); 
        temp = request.getParameter("comment");
       
        Order order = new Order(status,cpl,cpw,incline,Rtype,slength,swidth,temp,price,uid,delivery);
        LogicFacade.updateOrder(order);
        
        
        
        return "hej";
        
      
    }
    
}
