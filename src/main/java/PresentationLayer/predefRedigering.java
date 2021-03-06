/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.Carport;
import FunctionLayer.LogicFacade;
import FunctionLayer.UniversalException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juste
 */
public class predefRedigering extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws UniversalException {
      
        List<Carport> carports = LogicFacade.getAllPredef();
        request.setAttribute("allPredef", carports);
        
            if (carports == null) {
                throw new UniversalException("Could not fetch preDef Carports");
            } else {
                return "predefRedigering";
            }
    }
    
}
