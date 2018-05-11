package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.UniversalException;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 The purpose of Login is to...

 @author kasper
 */
public class Login extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws UniversalException {
        String username = request.getParameter( "username" );
        String password = request.getParameter( "password" );
        User user = LogicFacade.login( username, password );


        return "LoginNonAdmin";

    }

}
