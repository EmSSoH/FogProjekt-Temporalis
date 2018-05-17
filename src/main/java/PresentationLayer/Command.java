package PresentationLayer;

import FunctionLayer.UniversalException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put("login", new Login() );
        commands.put("register", new Register() );
        commands.put("orderlist", new EmpOrder());
        commands.put("send", new getOrder());
        commands.put("draw", new draw());
        commands.put("bestil", new NewOrder());
        commands.put("rediger", new redigerOrder());
        commands.put("CarportUHæld", new getPredefUhæld());
        commands.put("CarportHæld", new getPredefhæld());
    

        
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws UniversalException;

}
