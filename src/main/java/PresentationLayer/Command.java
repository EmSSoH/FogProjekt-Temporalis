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
        commands.put("EM", new getEgenMål());
        commands.put("CPF", new getPredefUhæld());
        commands.put("CPH", new getPredefhæld());
        commands.put("customer", new combineOrder());
        commands.put("predigering", new predefRedigering());
        commands.put("kredigering", new komponentRedigere());
        commands.put("gtlogin", new gotoLogin());
        commands.put("redigerpredef", new getPredefRediger());
        commands.put("updatePredef", new updatePredef());
        commands.put("redigercomponent", new getKompRediger());
        commands.put("updateKomp", new updateKomp());
        commands.put("newComp", new goToCreateKomp());
        commands.put("createKomp", new createKomp());
        commands.put("newPredef", new goToCreatePredef());
    

        
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
