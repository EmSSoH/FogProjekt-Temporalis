package FunctionLayer;

/**
 * The purpose of User is to...
 * @author kasper
 */
public class User {

    public User( int id, String name, String email, String password, int role ) {
        this.id = id;
        this.Name = name;
        this.Email = email;
        this.password = password;
        this.Role = role;
    }
    public User( String name, String email, String password, int role ) {
        this.Name = name;
        this.Email = email;
        this.password = password;
        this.Role = role;
    }
    public User( String name, String email, String password ) {
        this.Name = name;
        this.Email = email;
        this.password = password;
    }

    private int id; 
    private String Name;
    private String Email;
    private String password; 
    private int Role;

    public void setId(int id) {
        this.id = id;
    }

    public int getRole() {
        return Role;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return password;
    }

    public int getUsertype() {
        return Role;
    }

    public String getEmail() {
        return Email;
    }

   
    
    

}
