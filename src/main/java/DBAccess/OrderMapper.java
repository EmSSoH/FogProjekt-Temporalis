/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.Order;
import FunctionLayer.UniversalException;
import FunctionLayer.Customer;
import FunctionLayer.Stykliste;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Types.DATE;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Temporalis
 */
public class OrderMapper {

    public static boolean updateOrder(Order order) throws UniversalException {
        try {
            Connection con = Connector.connection();

            String SQL = "UPDATE orders (employee_id, incline, roof_type, length, width, toolshed_length, toolshed_width, status, price, delivery, comment) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) WHERE order_id= ? ";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, order.getUserId());
            ps.setInt(2, order.getIncline());
            ps.setInt(3, order.getRoofType());
            ps.setInt(4, order.getCarportLength());
            ps.setInt(5, order.getCarportWidth());
            ps.setInt(6, order.getShedLength());
            ps.setInt(7, order.getStatus());
            ps.setInt(8, order.getPrice());
            ps.setInt(9, order.getShedWidth());
            ps.setInt(10, order.getDelivery());
            ps.setString(11, order.getComment());
            ps.setInt(12, order.getOrderId());
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

    public static boolean createOrder(Order order, int customerid) throws UniversalException {
        try {
            Connection con = Connector.connection();

            String SQL = "INSERT INTO orders (customer_id, incline, roof_type, length, width, toolshed_length, toolshed_width, comment, date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, customerid);
            ps.setInt(2, order.getIncline());
            ps.setInt(3, order.getRoofType());
            ps.setInt(4, order.getCarportLength());
            ps.setInt(5, order.getCarportWidth());
            ps.setInt(6, order.getShedLength());
            ps.setInt(7, order.getShedWidth());
            ps.setString(8, order.getComment());
            ps.setDate(9, order.getDate());
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

    public static void createPredef(int incline, int roof_type, int length, int width, int toolshed_length, int toolshed_width, int price) throws UniversalException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO predef (incline, roof_type, length, width, toolshed_length, toolshed_width, price) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, incline);
            ps.setInt(2, roof_type);
            ps.setInt(3, length);
            ps.setInt(4, width);
            ps.setInt(5, toolshed_length);
            ps.setInt(6, toolshed_width);
            ps.setInt(7, price);
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new UniversalException(ex.getMessage());
        }
    }

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

    public void createComponent() throws UniversalException {
        throw new UniversalException("Not yet implemented");

    }

    public void createItemList(Stykliste stk) throws UniversalException {
        Connection con = null;
        try {
            try {
                con = Connector.connection();
                con.setAutoCommit(false);
                int[] intArray = stk.toIntArray();
                String SQL = "INSERT INTO `order_components` VALUES (?, ?, ?)";
                PreparedStatement ps;
                for (int i = 0; i < 45; i++) {
                    

                    ps = con.prepareStatement(SQL);

                    ps.setInt(1, intArray[i]);
                    ps.setInt(2, stk.getId());
                    ps.setInt(3, i + 1);
                    ps.executeUpdate();
                }
                
                con.commit();
            } catch (SQLException | ClassNotFoundException ex) {
                con.rollback();
                throw new UniversalException(ex.getMessage());
            } finally {
                if (con != null) {
                    con.close();
                }
            }
        } catch (SQLException | UniversalException ex) {
            throw new UniversalException(ex.getMessage());
        }
    }
    
    public static Stykliste getItemList(int orderId) throws UniversalException {
        int[] intArray = new int[45];
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM itemlist WHERE order_id=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, orderId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                intArray[rs.getInt("component_id")-1] = rs.getInt("amount");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return new Stykliste(orderId, intArray);
    }

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
}
