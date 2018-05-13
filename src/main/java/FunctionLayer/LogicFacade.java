package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 *
 * @author kasper
 */
public class LogicFacade {

    public static User login(String username, String password) throws UniversalException {
        return UserMapper.login(username, password);
    }

    public static User createUser(String name, String email, String password) throws UniversalException {
        User user = new User(name, email, password);
        UserMapper.createEmployee(user);
        return user;
    }

    public static boolean newOrder(Order order, int id) throws UniversalException {
        return OrderMapper.createOrder(order, id);
    }

    public static List<Order> getUsersOrders(int customerid) throws UniversalException {
        return OrderMapper.getCustomerOrders(customerid);
    }

    public static List<Order> getAllOrders() throws UniversalException {
        return OrderMapper.getAllOrders();
    }

    public static boolean updateStatus(int orderId, int newStatus) throws UniversalException {
        return OrderMapper.updateStatus(orderId, newStatus);
    }

    public static Order getOrder(int id) throws UniversalException {
        return OrderMapper.getOrder(id);

    }

    public static void addCustomer(int oid, int cid) throws UniversalException {
        OrderMapper.addCustomer(oid, cid);
    }

    public static int createCustomer(String name, String address, int phone, String email) throws UniversalException {
        return OrderMapper.createCustomer(name, address, phone, email);
    }

    public static void updateOrder(Order order) throws UniversalException {
        OrderMapper.updateOrder(order);
    }

    public static void createItemList(Stykliste stykliste) throws UniversalException {
        OrderMapper.createItemList(stykliste);
    }

    public static int[] getPrices() throws UniversalException {
        return OrderMapper.getPrices();
    }


    public static Stykliste getItemList(int oid) throws UniversalException {
       return OrderMapper.getItemList(oid);
    }
    

}
