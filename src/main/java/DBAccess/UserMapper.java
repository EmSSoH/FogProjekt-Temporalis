package DBAccess;

import FunctionLayer.UniversalException;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 The purpose of UserMapper is to...

 @author kasper
 */
public class UserMapper {
    
    public static int createCustomer(String name, String adress, int phone, String email) throws UniversalException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO customer (name, adress, phone, email) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setString(1, name);
            ps.setString(2, adress);
            ps.setInt(3, phone);
            ps.setString(4, email);
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            return id;
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new UniversalException( ex.getMessage() );
        }
    }
    
    public static void createEmployee(User user) throws UniversalException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO employees (name, email, password) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setString( 1, user.getName() );
            ps.setString( 2, user.getEmail() );
            ps.setString( 3, user.getPassword() ); 
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt( 1 );
            user.setId( id );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new UniversalException( ex.getMessage() );
        }
    }
    
    public static void createDeliverer(String email, int phone, String name) throws UniversalException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO delivery (email, phone, name) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setString(1, email);
            ps.setInt(2, phone);
            ps.setString(3, name);
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new UniversalException( ex.getMessage() );
        }
    }

    public static User login( String username, String password ) throws UniversalException {
        try {
            Connection con = Connector.connection();

<<<<<<< HEAD
            String SQL = "SELECT id, role FROM employees "
                    + "WHERE name=? AND password=?";
=======
            String SQL = "SELECT id, email, role FROM employees "
                    + "WHERE name= ? AND password= ?";

>>>>>>> f74111eb57c43030addb677a3c6a39763ace3aa6
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setString( 1, username );
            ps.setString( 2, password );
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {

                int id = rs.getInt( "id" );
                String email = rs.getString( "email" );
                int role = rs.getInt( "role" );
                User user = new User(id, username, email, password, role);
                user.setId(rs.getInt("id"));

                return user;
            } else {
                throw new UniversalException( "Could not validate user" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new UniversalException(ex.getMessage());
        }
    }

}
