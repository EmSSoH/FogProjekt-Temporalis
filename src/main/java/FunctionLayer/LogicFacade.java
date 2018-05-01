package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws UniversalException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String name, String email, String password ) throws UniversalException {
        User user = new User(name, email, password );
        UserMapper.createUser( user );
        return user;
    }

    
    public static boolean newOrder(Order order) throws UniversalException {
        return OrderMapper.createOrder(order);
    }

    public static List<Order> getUsersOrders(User user) throws UniversalException {
        return OrderMapper.getUsersOrders(user);
    }

    public static List<Order> getAllOrders() throws UniversalException {
        return OrderMapper.getAllOrders();
    }

    public static boolean send(int orderId) throws UniversalException {
        boolean success = OrderMapper.send(orderId);
        return success;
    }
    
    
    
}
