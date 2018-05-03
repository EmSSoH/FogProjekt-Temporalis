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
            String SQL = "INSERT INTO users (name, email, password, role) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setString( 1, user.getName() );
            ps.setString( 2, user.getEmail() );
            ps.setString( 3, user.getPassword() );
            ps.setInt( 4, user.getRole() );
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

    public static User login( String email, String password ) throws UniversalException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT id, name, role FROM users "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setString( 1, email );
            ps.setString( 2, password );
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                User user = new User(rs.getString("name"), email, password, rs.getInt("role"));
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
