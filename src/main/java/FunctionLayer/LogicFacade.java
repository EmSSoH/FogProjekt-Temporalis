package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String username, String password ) throws UniversalException {
        return UserMapper.login(username, password );
    } 

    public static User createUser( String email, String password ) throws UniversalException {
        User user = new User(email, password, "customer");
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

    public static Order getOrder(int id) throws UniversalException {
        return OrderMapper.getOrder(id);
        
    }

    public static int newOrder(int clength, int cwidth) throws UniversalException {  
        return OrderMapper.createOrder(clength, cwidth);
    }

    public static int newOrder(int clength, int cwidth, int slength, int swidth) throws UniversalException {
       return OrderMapper.createOrderShed(clength, cwidth, slength, swidth);
    }

    public static void addCustomer(int oid, int cid) throws UniversalException {
        OrderMapper.addCustomer(oid, cid);
    }

    public static int createCustomer(String name, String address, int phone, String email) throws UniversalException {
        return OrderMapper.createCustomer(name, address, phone, email);
    }
    
    
    
}
