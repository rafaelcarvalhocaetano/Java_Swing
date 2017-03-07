
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static final String USUARIO = "root";
    private static final String SENHA = "q1w2e3r4";
    private static final String URL = "jdbc:mysql://localhost:3306/login";
    
    
    public static Connection getConectando() throws SQLException{
        
       
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());   
        Connection con = DriverManager.getConnection(URL, USUARIO, SENHA);  
        return con;
    }
    
}
