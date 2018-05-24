/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.UniversalException;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class UserMapperTest {
    private static Connection testConnection;
    private static String USER = "Juste";
    private static String USERPW = "admin";
    private static String DBNAME = "carportTest";
    private static String HOST = "159.89.99.105";

    @Before
    public void setUp() {
        try {
            // avoid making a new connection for each test
            if ( testConnection == null ) {
                String url = String.format( "jdbc:mysql://%s:3306/%s", HOST, DBNAME );
                Class.forName( "com.mysql.jdbc.Driver" );

                testConnection = DriverManager.getConnection( url, USER, USERPW );
                // Make mappers use test 
                Connector.setConnection( testConnection );
            }
         

        } catch ( ClassNotFoundException | SQLException ex ) {
            testConnection = null;
            System.out.println( "Could not open connection to database: " + ex.getMessage() );
        }
    }
 
    @Test
    public void testSetUpOK() {
        assertNotNull( testConnection );
    }

    @Test
    public void testAllOrders() throws UniversalException{
        List<Order> orders = new ArrayList<>();
        orders = OrderMapper.getAllOrders();
        
        assertNotNull(orders);
    }
    
    @Test
    public void testOrders() throws UniversalException{
        Order order = OrderMapper.getOrder(1);
        assertEquals(order.getUserId(),1);
        assertEquals(order.getIncline(),0);
        assertEquals(order.getRoofType(),1);
        assertEquals(order.getCarportLength(),2);
        assertEquals(order.getCarportWidth(),3);
        assertEquals(order.getShedLength(),4);
        assertEquals(order.getShedWidth(),5);
        assertEquals(order.getStatus(),0);
        assertEquals(order.getPrice(),0);
        assertEquals(order.getDelivery(),2);
        assertEquals(order.getComment(),"test");
    }
    
    
    
}
