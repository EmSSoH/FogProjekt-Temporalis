/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.Stykliste;
import FunctionLayer.UniversalException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juste
 */
public class NewOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
        int cid;
        
        String temp = request.getParameter( "clength" );
        int clength = Integer.parseInt(temp);
        temp = request.getParameter( "cwidth" );
        int cwidth = Integer.parseInt(temp);
        temp = request.getParameter("slength");
        int slength = Integer.parseInt(temp);
        temp = request.getParameter("swidth");
        int swidth = Integer.parseInt(temp);
        String name = request.getParameter( "name" );
        String email = request.getParameter( "email" );
        String address = request.getParameter( "address" );
        temp = request.getParameter("phone");
        int phone = 0;
        if(temp.matches("\\d+")){
        phone = Integer.parseInt(temp);
        } else {
            throw new UniversalException("Phone number contained a nondigit Char.");
        }
        
        Order order = new Order(0, clength, cwidth, 0, 0,
            slength, swidth, "hej", 12345, 4, 1);
        cid = LogicFacade.createCustomer(name, address, phone, email);    
        
        Stykliste stykliste;
        if(slength < 210 && swidth < 150){
         stykliste = new Stykliste(cwidth, clength);      
        }else{
         stykliste = new Stykliste(cwidth, clength,swidth,slength);       
        }
        int[] amounts = stykliste.toIntArray();
        int[] prices = LogicFacade.getPrices();
        
        amounts = stykliste.toIntArray();
        prices = LogicFacade.getPrices();
        int pris = 0;
        for(int i = 0; i < amounts.length-1; i++){
            if(amounts[i] != 0){
                pris+= amounts[i] * prices[i];
            }
        }
        order.setPrice(pris);
        
        LogicFacade.newOrder(order, cid);
        
        stykliste.setId(order.getOrderId());
        LogicFacade.createItemList(stykliste); 
        return "ordreConfirmed";
    }
    
}
