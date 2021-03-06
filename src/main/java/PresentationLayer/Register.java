package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.UniversalException;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Register extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws UniversalException {
        String email = request.getParameter( "email" );
        String password1 = request.getParameter( "password1" );
        String password2 = request.getParameter( "password2" );
        String name = request.getParameter( "name" );
        
        if ( password1.equals( password2 ) ) {

            User user = LogicFacade.createUser(name, email, password1 );
            HttpSession session = request.getSession();
            session.setAttribute( "user", user );
            session.setAttribute( "role", user.getRole() ); 
            
            return "LoginAdmin";

        } else {
            throw new UniversalException( "the two passwords did not match" );
        }
    }

}
