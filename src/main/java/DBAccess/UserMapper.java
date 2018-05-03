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

    public static void createUser( User user ) throws UniversalException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO employees (name, email, password) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setString( 1, user.getName() );
            ps.setString( 2, user.getEmail() );
            ps.setString( 3, user.getPassword() );
           // ps.setString( 4, user.getRole() );
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt( 1 );
            user.setId( id );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new UniversalException( ex.getMessage() );
        }
    }

    public static User login( String username, String password ) throws UniversalException {
        try {
            Connection con = Connector.connection();
            
            String SQL = "SELECT id, email, role FROM employees "
                    + "WHERE name=? AND password=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setString( 1, username );
            ps.setString( 2, password );
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                int id = rs.getInt( "id" );
                String email = rs.getString( "email" );
                String role = rs.getString( "role" );


                User user = new User(id, username, email, password, role );
                
                
                
                return user;
            } else {
                throw new UniversalException( "Could not validate user" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new UniversalException(ex.getMessage());
        }
    }

}
