/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Developer
 */
public class ConnectionFactory {
    
   private static final String USUARIO = "root";
   private static final String SENHA = "q1w2e3r4";
   private static final String URL = "jdbc:mysql://localhost:3306/mydb";
		
    public static Connection getConectar()throws SQLException{
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	}catch(SQLException e){
            e.printStackTrace();
	}
	Connection conexao = (Connection) DriverManager.getConnection(URL, USUARIO, SENHA);
	return conexao;
    }
        public static void closeConnection(Connection con) {
            
            if(con != null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        public static void closeConnection(Connection con, PreparedStatement str) {
            
             closeConnection(con);
            
            
            if(str != null){
                 try {
                     str.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
        }
        public static void closeConnection(Connection con, PreparedStatement str, ResultSet rs) throws SQLException {
            
             closeConnection(con, str);
            
            if(rs != null){
                
                rs.close();
            }
           
        }
}
