/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.Order;
import FunctionLayer.UniversalException;
import FunctionLayer.User;
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
 * @author Magnus West Madsen
 */
public class OrderMapper {
    
    public static boolean createOrder(Order order) throws UniversalException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orders (length, width, height, user_id) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
               /*here you put the prepaired statement for the sql*/
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            order.setOrderId(id);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new UniversalException(ex.getMessage());
        }
    }

    public static List<Order> getUsersOrders(User user) throws UniversalException {
        List<Order> orders = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders WHERE user_id=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, user.getId());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
               // orders.add(new Order());
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
                int oId = rs.getInt("order_id");
                Date date = rs.getDate("date");
                int status = rs.getInt("status");
                orders.add(new Order(oId,date,status));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return orders;
    }

    public static boolean send(int orderId) throws UniversalException {
        boolean changedLines;
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE orders SET status='Sent' WHERE id= ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, orderId);
            changedLines = ps.executeUpdate() > 0;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return changedLines;
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
                order = new Order(rs.getInt("order_id"), rs.getInt("status"), rs.getInt("length"), rs.getInt("width"), rs.getInt("incline"), rs.getInt("roof_type"), rs.getInt("toolshed_length"), rs.getInt("toolshed_width"), rs.getString("comment"), rs.getInt("price"), rs.getInt("employee_id"), rs.getInt("delivery"), rs.getDate("date"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new UniversalException(ex.getMessage());
        }
        return order;
    }
    }
