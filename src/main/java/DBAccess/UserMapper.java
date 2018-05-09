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
            String SQL = "INSERT INTO users (name, email, password, role) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setString( 1, user.getName() );
            ps.setString( 2, user.getEmail() );
            ps.setString( 3, user.getPassword() );
            ps.setString( 4, user.getRole() );
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

            String SQL = "SELECT id, role FROM employees "
                    + "WHERE name=? AND password=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setString( 1, username );
            ps.setString( 2, password );
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                String role = rs.getString( "role" );
                int id = rs.getInt( "id" );


                User user = new User( username, password, role );

                

                user.setId( id );
                return user;
            } else {
                throw new UniversalException( "Could not validate user" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new UniversalException(ex.getMessage());
        }
    }

}
