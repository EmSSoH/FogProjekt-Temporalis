/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.UniversalException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Juste
 */
public class draw extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
         String temp = request.getParameter("length");
         int length = Integer.parseInt(temp);
         temp = request.getParameter("width");
         int width = Integer.parseInt(temp);
         temp = request.getParameter("slength");
         int slength = Integer.parseInt(temp);
         temp = request.getParameter("swidth");
         int swidth = Integer.parseInt(temp);
         
        HttpSession session = request.getSession();
        session.setAttribute( "length", length);
        session.setAttribute( "width", width );
        session.setAttribute( "slength", slength);
        session.setAttribute( "swidth", swidth );
         
         
         return "drawing";
    }
    
}
