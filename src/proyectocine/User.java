package proyectocine;

import java.io.*;

/**
 *
 * @author Juan Diego Suarez Londoño
 */
public abstract  class User implements Serializable {
    protected String name;
    protected String password;
    protected int usernumber;

    public User(String name, String password, int usernumber) {
        this.name = name;
        this.password = password;
        this.usernumber = usernumber;
    }  

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
    
    public String getPassword() {
        return password;
    }

    public void setUserNumber(int usernumber) {
        this.usernumber = usernumber;
    }
    
    public int getUserNumber() {
        return usernumber;
    } 
    
}
