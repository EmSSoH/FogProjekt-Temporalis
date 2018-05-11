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
public class NewOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
            int oid,cid;
        
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
        int phone = Integer.parseInt(temp);
        
        
        if(slength == 0 && swidth == 0){
          oid = LogicFacade.newOrder(clength,cwidth);
        }else{
          oid = LogicFacade.newOrder(clength, cwidth, slength, swidth);
        }
        cid = LogicFacade.createCustomer(name, address, phone, email);
        LogicFacade.addCustomer(oid,cid);
        
        
         
        return "ordreConfrimed";
    }
    
}
