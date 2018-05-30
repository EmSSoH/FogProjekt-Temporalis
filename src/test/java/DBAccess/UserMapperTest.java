/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.Carport;
import FunctionLayer.Customer;
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
    

        @Test
        public void testCreateUpdateOrder() throws UniversalException {   
            Order order = new Order(1, 300, 300, 10, 1, 300, 300, "what what", 2, 1, 1);
            OrderMapper.createOrder(order, 1);
            int  id = order.getOrderId();
            order = OrderMapper.getOrder(id);
            assertEquals(order.getUserId(),1);
            assertEquals(order.getIncline(),10);
            assertEquals(order.getRoofType(),1);
            assertEquals(order.getCarportLength(),300);
            assertEquals(order.getCarportWidth(),300);
            assertEquals(order.getShedLength(),300);
            assertEquals(order.getShedWidth(),300);
            assertEquals(order.getStatus(),0);
            assertEquals(order.getPrice(),300);
            assertEquals(order.getDelivery(),2);
            assertEquals(order.getComment(),"what what");
            
            Order nOrder = new Order(1, 400, 400, 10, 1, 400, 400, "what what sup", 2, 1, 1);
            nOrder.setOrderId(id);
            OrderMapper.updateOrder(nOrder);
            Order torder = OrderMapper.getOrder(id);
            
            assertEquals(torder.getUserId(),1);
            assertEquals(torder.getIncline(),10);
            assertEquals(torder.getRoofType(),1);
            assertEquals(torder.getCarportLength(),400);
            assertEquals(torder.getCarportWidth(),400);
            assertEquals(torder.getShedLength(),400);
            assertEquals(torder.getShedWidth(),400);
            assertEquals(torder.getStatus(),1);
            assertEquals(torder.getPrice(),2);
            assertEquals(torder.getDelivery(),1);
            assertEquals(torder.getComment(),"what what sup");
            
        }
        
    @Test
    public void testCreateUpdatePredef() throws UniversalException {
            Carport carport = new Carport(700, 620, 1, 10, 210, 300);
            OrderMapper.createPredef(carport);
            int id = carport.getPredef_id();
            carport = OrderMapper.getPredef(id);
            assertEquals(carport.getCarL(),700);
            assertEquals(carport.getCarB(),620);
            assertEquals(carport.getTaghæld(),10);
            assertEquals(carport.getTagtype(),1);
            assertEquals(carport.getRedL(),210);
            assertEquals(carport.getRedB(),300);
            assertEquals(carport.getPredef_id(),id);
            
            carport = new Carport(id,720,600,1,20,240,300);
            OrderMapper.updatePredef(carport);
            carport = OrderMapper.getPredef(id);
            assertEquals(carport.getCarL(),720);
            assertEquals(carport.getCarB(),600);
            assertEquals(carport.getTaghæld(),20);
            assertEquals(carport.getTagtype(),1);
            assertEquals(carport.getRedL(),240);
            assertEquals(carport.getRedB(),300);
            assertEquals(carport.getPredef_id(),id);
            
            
            
            
    }
    
    @Test
    public void testCreateGetAddCustomer() throws UniversalException {
        int cus_id = OrderMapper.createCustomer("Magnus", "herogder 2", 54848475, "mail@her.com");
        Order order = new Order(1, 300, 300, 10, 1, 300, 300, "what what", 2, 1, 1);
        OrderMapper.createOrder(order, 1);
            int  id = order.getOrderId();
            order = OrderMapper.getOrder(id);
            Customer customer = order.getCustomer();
        assertEquals(customer.getId(),1);
        OrderMapper.addCustomer(id, cus_id);
        order = OrderMapper.getOrder(id);
        customer = order.getCustomer();
        assertEquals(customer.getId(),cus_id);
       
    }   
     
/*
   
    
    public static List<Components> getAllComp() throws UniversalException {

    }
    
     public static Components getComp(int id) throws UniversalException {

    }
 
    public static void createComponent(String name, int price) throws UniversalException {

    }

    public static void updateComponent(int id, String name, int price) throws UniversalException {
  
    }


    public static void createItemList(Stykliste stk) throws UniversalException {

    }

    public static Stykliste getItemList(int orderId) throws UniversalException {

    }

    public static List<String> getComponentNames() throws UniversalException {

    }

    public static List<Integer> getPrices() throws UniversalException {

    }


    


    public static List<Carport> getAllPredefhæld() throws UniversalException {

    }
    
    public static List<Carport> getAllPredef() throws UniversalException {

    }


    public static List<Carport> getAllPredefUhæld() throws UniversalException {

    }
*/
}

    
    
    

