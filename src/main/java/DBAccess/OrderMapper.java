/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.Carport;
import FunctionLayer.Components;
import FunctionLayer.Order;
import FunctionLayer.UniversalException;
import FunctionLayer.Customer;
import FunctionLayer.Stykliste;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * The order mapper is used for any things that are related to both database and
 * placing orders. This is actions such as added new orders, adding customers,
 * looking up predefs and looking up components
 *
 * @author Temporalis
 */
public class OrderMapper {

    /**
     * This is used to update orders that exist in the database. It changes the
     * order in the database to match with the order object which is supplied
     * when called.
     *
     * @param order the order object with the variables changed
     * @return boolean. True if succeeded or false if failed.
     * @throws UniversalException
     */
    public static boolean updateOrder(Order order) throws UniversalException {
        try {
            Connection con = Connector.connection();

            String SQL = "UPDATE orders SET employee_id = ?, incline = ?, roof_type= ?, length= ?, width= ?, toolshed_length= ?, toolshed_width= ?, status= ?, price= ?, delivery= ?, comment= ? WHERE order_id= ? ";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, order.getUserId());
            ps.setInt(2, order.getIncline());
            ps.setInt(3, order.getRoofType());
            ps.setInt(4, order.getCarportLength());
            ps.setInt(5, order.getCarportWidth());
            ps.setInt(6, order.getShedLength());
            ps.setInt(7, order.getShedWidth());
            ps.setInt(8, order.getStatus());
            ps.setInt(9, order.getPrice());
            ps.setInt(10, order.getDelivery());
            ps.setString(11, order.getComment());
            ps.setInt(12, order.getOrderId());
            ps.executeUpdate();

            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new UniversalException(ex.getMessage());
        }
    }

    /**
     * This method is used to place the information from an order object into
     * the database with a customer id matching the int given to the method
     *
     * @param order This is the order object which is added to the database
     * @param customerid This is the id in the database of the customer, who has
     * placed this specific order
     * @return This returns a boolean, true if it succeeded or false if it
     * failed. Reasons for failure might be an incorrect order or an invalid
     * customer ID.
     * @throws UniversalException
     */
    public static boolean createOrder(Order order, int customerid) throws UniversalException {
        try {
            Connection con = Connector.connection();

            String SQL = "INSERT INTO orders (customer_id, incline, roof_type, length, width, toolshed_length, toolshed_width, price, comment, date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, customerid);
            ps.setInt(2, order.getIncline());
            ps.setInt(3, order.getRoofType());
            ps.setInt(4, order.getCarportLength());
            ps.setInt(5, order.getCarportWidth());
            ps.setInt(6, order.getShedLength());
            ps.setInt(7, order.getShedWidth());
            ps.setInt(8, order.getShedWidth());
            ps.setString(9, order.getComment());
            ps.setDate(10, order.getDate());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                order.setOrderId(rs.getInt(1));
            } else {
                throw new SQLException("no generated key found");
            }
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new UniversalException(ex.getMessage());
        }
    }

    /**
     * This is used for getting a list of all orders placed by a customer with
     * the id supplied
     *
     * @param id is the id of the customer
     * @return a list of all order objects
     * @throws UniversalException
     */
    public static List<Order> getCustomerOrders(int id) throws UniversalException {
        List<Order> orders = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders WHERE customer_id=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                orders.add(new Order(rs.getInt("order_id"), rs.getInt("status"), rs.getInt("length"), rs.getInt("width"), rs.getInt("incline"), rs.getInt("roof_type"), rs.getInt("toolshed_length"), rs.getInt("toolshed_width"), rs.getString("comment"), rs.getInt("price"), rs.getInt("employee_id"), rs.getInt("delivery"), rs.getDate("date"), getCustomer(rs.getInt("customer_id"))));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return orders;
    }

    /**
     * This is for getting all orders with a specific status. For example
     * getting all non-assigned orders, which is status 0 in the database.
     *
     * @param status is the int marking what status we want all orders with
     * @return a list of all the orders in a list
     * @throws UniversalException
     */
    public static List<Order> getOrderWithStatus(int status) throws UniversalException {
        List<Order> orders = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders WHERE status=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, status);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                orders.add(new Order(rs.getInt("order_id"), rs.getInt("status"), rs.getInt("length"), rs.getInt("width"), rs.getInt("incline"), rs.getInt("roof_type"), rs.getInt("toolshed_length"), rs.getInt("toolshed_width"), rs.getString("comment"), rs.getInt("price"), rs.getInt("employee_id"), rs.getInt("delivery"), rs.getDate("date"), getCustomer(rs.getInt("customer_id"))));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return orders;
    }

    /**
     * This is for getting all orders assigned to a specific employee, this is
     * good as the employee will not have to look through a massive list of all
     * orders to find which is his / hers
     *
     * @param id the id of the employee
     * @return a list of order objects
     * @throws UniversalException
     */
    public static List<Order> getEmployeeOrders(int id) throws UniversalException {
        List<Order> orders = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders WHERE employee_id=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                orders.add(new Order(rs.getInt("order_id"), rs.getInt("status"), rs.getInt("length"), rs.getInt("width"), rs.getInt("incline"), rs.getInt("roof_type"), rs.getInt("toolshed_length"), rs.getInt("toolshed_width"), rs.getString("comment"), rs.getInt("price"), rs.getInt("employee_id"), rs.getInt("delivery"), rs.getDate("date"), getCustomer(rs.getInt("customer_id"))));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return orders;
    }

    /**
     * This gets a specific order with the order_id matching the id
     *
     * @param id is the id of the order which is to be fetched from the db
     * @return an order object
     * @throws UniversalException
     */
    public static Order getOrder(int id) throws UniversalException {
        Order order = null;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders WHERE order_id=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                order = new Order(rs.getInt("order_id"), rs.getInt("status"), rs.getInt("length"), rs.getInt("width"), rs.getInt("incline"), rs.getInt("roof_type"), rs.getInt("toolshed_length"), rs.getInt("toolshed_width"), rs.getString("comment"), rs.getInt("price"), rs.getInt("employee_id"), rs.getInt("delivery"), rs.getDate("date"), getCustomer(rs.getInt("customer_id")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return order;
    }

    /**
     * This gets all orders that haven't been marked as completed / archived.
     *
     * @return a list of all order objects that are incomplete
     * @throws UniversalException
     */
    public static List<Order> getAllOrdersLight() throws UniversalException {
        List<Order> orders = new ArrayList<>();
        try {
            int completedOrder = 999;
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders where status != " + completedOrder;
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                orders.add(new Order(rs.getInt("order_id"), rs.getInt("status"), rs.getInt("length"), rs.getInt("width"), rs.getInt("incline"), rs.getInt("roof_type"), rs.getInt("toolshed_length"), rs.getInt("toolshed_width"), rs.getString("comment"), rs.getInt("price"), rs.getInt("employee_id"), rs.getInt("delivery"), rs.getDate("date"), getCustomer(rs.getInt("customer_id"))));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return orders;
    }

    /**
     * This gets all orders from the DB
     *
     * @return a list of all order objects in the DB
     * @throws UniversalException
     */
    public static List<Order> getAllOrders() throws UniversalException {
        List<Order> orders = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                orders.add(new Order(rs.getInt("order_id"), rs.getInt("status"), rs.getInt("length"), rs.getInt("width"), rs.getInt("incline"), rs.getInt("roof_type"), rs.getInt("toolshed_length"), rs.getInt("toolshed_width"), rs.getString("comment"), rs.getInt("price"), rs.getInt("employee_id"), rs.getInt("delivery"), rs.getDate("date"), getCustomer(rs.getInt("customer_id"))));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return orders;
    }

    /**
     * This is used to update the status of an order object. Technically should
     * be doable with the updateOrder.
     *
     * @param orderId the id of the order
     * @param newStatus the new status which it should be given
     * @return a boolean to say if it succeeded or not
     * @throws UniversalException
     */
    public static boolean updateStatus(int orderId, int newStatus) throws UniversalException {
        boolean changedLines;
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE orders SET status=? WHERE order_id=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, newStatus);
            ps.setInt(2, orderId);
            changedLines = ps.executeUpdate() > 0;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return changedLines;
    }

    /**
     * This is used to add a predefined carport to the database
     *
     * @param incline the incline of the roof
     * @param roof_type the roof type
     * @param length length of the carport
     * @param width width of the carport
     * @param toolshed_length length of the toolshed
     * @param toolshed_width width of the toolshed
     * @param price price of this construction
     * @throws UniversalException
     */
    public static void createPredef(int incline, int roof_type, int length, int width, int toolshed_length, int toolshed_width) throws UniversalException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO predef (incline_amount, roof_type, length, width, toolshed_length, toolshed_width) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, incline);
            ps.setInt(2, roof_type);
            ps.setInt(3, length);
            ps.setInt(4, width);
            ps.setInt(5, toolshed_length);
            ps.setInt(6, toolshed_width);
            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            throw new UniversalException(ex.getMessage());
        }
    }

    /**
     * This is used to update the predefs already in the database
     *
     * @param id is the id of the predef which is getting updated
     * @param incline the incline of the roof
     * @param roof_type the roof type
     * @param length length of the carport
     * @param width width of the carport
     * @param toolshed_length length of the toolshed
     * @param toolshed_width width of the toolshed
     * @param price price of this construction
     * @throws UniversalException
     */
    public static void updatePredef(int id, int incline, int roof_type, int length, int width, int toolshed_length, int toolshed_width) throws UniversalException {
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE predef SET incline_amount = ?, roof_type = ?, length = ?, width = ?, toolshed_length = ?, toolshed_width = ? WHERE predef_id = ? ";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, incline);
            ps.setInt(2, roof_type);
            ps.setInt(3, length);
            ps.setInt(4, width);
            ps.setInt(5, toolshed_length);
            ps.setInt(6, toolshed_width);
            ps.setInt(7, id);
            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            throw new UniversalException(ex.getMessage());
        }
    }

    /**
     * This is used to get a specific customer from the database with their
     * information
     *
     * @param customerid the id of the customer
     * @return a customer object
     * @throws UniversalException
     */
    public static Customer getCustomer(int customerid) throws UniversalException {
        Customer customer = null;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM customer WHERE id=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, customerid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                customer = new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("address"), rs.getInt("phone"), rs.getString("email"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return customer;
    }
    
    public static List<Components> getAllComp() throws UniversalException {
        List<Components> comp = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM components";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                comp.add(new Components(rs.getInt("id"),rs.getString("component_name"), rs.getInt("price")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return comp;
    }
    
     public static Components getComp(int id) throws UniversalException {
        Components comp = null;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM components WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                comp = new Components(rs.getInt("id"),rs.getString("component_name"), rs.getInt("price"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return comp;
    }
    /**
     * This is used to add a new component to the database matching the price 
     * and name which is supplied
     *
     * @param name the name of the component
     * @param price the price of the component
     * @throws UniversalException
     */
    public static void createComponent(String name, int price) throws UniversalException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO components (component_name, price) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            ps.setInt(2, price);
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new UniversalException(ex.getMessage());
        }
    }

    /**
     * This is used to update an already existing component in the database so 
     * it will match the price and name which is supplied
     * 
     * @param id is the id of the component in the database
     * @param name is the updated name of the component
     * @param price is the updated price of the component
     * @throws UniversalException
     */
    public static void updateComponent(int id, String name, int price) throws UniversalException {
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE components SET component_name = ?, price = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            ps.setInt(2, price);
            ps.setInt(3, id);
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new UniversalException(ex.getMessage());
        }
    }

    /**
     * This is used to insert an itemlist of the Stykliste object type into the
     * database
     *
     * @param stk is the itemlist which is to be added to the database
     * @throws UniversalException
     */
    public static void createItemList(Stykliste stk) throws UniversalException {
        Connection con = null;
        try {
            try {
                con = Connector.connection();
                con.setAutoCommit(false);
                List<Integer> intArray = new ArrayList<>();
                intArray = stk.toIntArray();
                String SQL = "INSERT INTO `itemlist` VALUES (?, ?, ?)";
                PreparedStatement ps;
                for (int i = 0; i < 45; i++) {

                    ps = con.prepareStatement(SQL);

                    ps.setInt(1, intArray.get(i));
                    ps.setInt(2, stk.getId());
                    ps.setInt(3, i + 1);
                    ps.executeUpdate();
                }

                con.commit();
            } catch (SQLException | ClassNotFoundException ex) {
                con.rollback();
                throw new UniversalException(ex.getMessage());
            }
        } catch (SQLException | UniversalException ex) {
            throw new UniversalException(ex.getMessage());
        }
    }

    /**
     * This is used to get an itemlist from the DB for the order matching the
     * orderId
     *
     * @param orderId is the order whose itemlist we want
     * @return an itemlist as a Stykliste object
     * @throws UniversalException
     */
    public static Stykliste getItemList(int orderId) throws UniversalException {
        List<Integer> intArray = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM itemlist WHERE order_id=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, orderId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                intArray.add(rs.getInt("amount"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return new Stykliste(orderId, intArray);
    }

    /**
     * This is used to get a list of components as an array with the length of
     * 45. This is because we currently have 45 components. The position in the
     * array matches the id in the database minus 1
     *
     * @return a StringArray with names of the components
     * @throws UniversalException
     */
    public static List<String> getComponentNames() throws UniversalException {
        List<String> StringArray = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM components";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                StringArray.add(rs.getString("componenet_name"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return StringArray;
    }

    /**
     * This gets an intArray with the prices of the components with a position
     * matching the id in the db minus 1
     *
     * @return an intArray with the prices
     * @throws UniversalException
     */

    public static List<Integer> getPrices() throws UniversalException {
        List<Integer> intArray = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM components";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                intArray.add(rs.getInt("price"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return intArray;
    }

    /**
     * This is used to set customer id on a specific order
     *
     * @param oid order id
     * @param cid customer id
     * @throws UniversalException
     */
    public static void addCustomer(int oid, int cid) throws UniversalException {
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE orders SET customer_id = ? WHERE order_id = ? ";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, cid);
            ps.setInt(2, oid);
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();

        } catch (SQLException | ClassNotFoundException ex) {
            throw new UniversalException(ex.getMessage());
        }
    }

    /**
     * This is used to add a customer to the database
     *
     * @param name customer name
     * @param address customer address
     * @param phone customer phone
     * @param email customer email
     * @return an int of the id which was generated in the db
     * @throws UniversalException
     */
    public static int createCustomer(String name, String address, int phone, String email) throws UniversalException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO customer (name, address, phone, email) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            ps.setString(2, address);
            ps.setInt(3, phone);
            ps.setString(4, email);
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            return id;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new UniversalException(ex.getMessage());
        }
    }

    /**
     *
     * @return @throws UniversalException
     */
    public static List<Carport> getAllPredefhæld() throws UniversalException {
        List<Carport> carports = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM predef WHERE incline_amount>?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, 0);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                carports.add(new Carport(rs.getInt("predef_id"), rs.getInt("length"), rs.getInt("width"), rs.getInt("roof_type"), rs.getInt("incline_amount"), rs.getInt("toolshed_length"), rs.getInt("toolshed_width")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return carports;
    }
    
    public static List<Carport> getAllPredef() throws UniversalException {
        List<Carport> carports = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM predef";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                carports.add(new Carport(rs.getInt("predef_id"), rs.getInt("length"), rs.getInt("width"), rs.getInt("roof_type"), rs.getInt("incline_amount"), rs.getInt("toolshed_length"), rs.getInt("toolshed_width")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return carports;
    }

    /**
     *
     * @return @throws UniversalException
     */
    public static List<Carport> getAllPredefUhæld() throws UniversalException {
        List<Carport> carports = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM predef WHERE incline_amount=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, 0);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                carports.add(new Carport(rs.getInt("predef_id"), rs.getInt("length"), rs.getInt("width"), rs.getInt("roof_type"), rs.getInt("incline_amount"), rs.getInt("toolshed_length"), rs.getInt("toolshed_width")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return carports;
    }

    public static Carport getPredef(int id) throws UniversalException {
          Carport carport = null;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM predef WHERE predef_id = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                carport = new Carport(rs.getInt("predef_id"), rs.getInt("length"), rs.getInt("width"), rs.getInt("roof_type"), rs.getInt("incline_amount"), rs.getInt("toolshed_length"), rs.getInt("toolshed_width"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return carport;
    }
}
