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
//    Test date in the UsersTest table
//    INSERT INTO `UsersTest` VALUES 
//    (1,'jens@somewhere.com','jensen','customer'),
//    (2,'ken@somewhere.com','kensen','customer'),
//    (3,'robin@somewhere.com','batman','employee'),
//    (4,'someone@nowhere.com','sesam','customer');

    private static Connection testConnection;
    private static String USER = "Juste";
    private static String USERPW = "admin";
    private static String DBNAME = "carport";
    private static String HOST = "159.89.99.105";

    @Before
    public void setUp() {
        try {
            // awoid making a new connection for each test
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
 /*
    @Test
    public void testSetUpOK() {
        // Just check that we have a connection.
        assertNotNull( testConnection );
    }

    @Test
    public void testLogin01() throws UniversalException {
        // Can we log in
        User user = UserMapper.login( "jens@somewhere.com", "jensen" );
        assertTrue( user != null );
    }

    @Test( expected = UniversalException.class )
    public void testLogin02() throws UniversalException {
        // We should get an exception if we use the wrong password
        User user = UserMapper.login( "jens@somewhere.com", "larsen" );
    }

    @Test
    public void testLogin03() throws UniversalException {
        // Jens is supposed to be a customer
        User user = UserMapper.login( "jens@somewhere.com", "jensen" );
        assertEquals( "customer", user.getRole() );
    }

    @Test
    public void testCreateUser01() throws UniversalException {
        // Can we create a new user - Notice, if login fails, this will fail
        // but so would login01, so this is OK
        User original = new User( "king@kong.com", "uhahvorhemmeligt", "konge" );
        UserMapper.createUser( original );
        User retrieved = UserMapper.login( "king@kong.com", "uhahvorhemmeligt" );
        assertEquals( "konge", retrieved.getRole() );
    }
  */  
    @Test
    public void testAllOrders() throws UniversalException{
        List<Order> orders = new ArrayList<>();
        orders = OrderMapper.getAllOrders();
        
        for(Order o: orders){
            System.out.println("id:" + o.getOrderId() + "  date:" + o.getDate() +"   status:" + o.getStatus());
        }
    }
}
