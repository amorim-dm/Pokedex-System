/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class connection {
     public static Connection conector(){
      java.sql.Connection conexao = null;
        
      String driver = "com.mysql.jdbc.Driver";   
      String url = "jdbc:mysql://localhost:3306/pokemon";  
        
      String user = "root";  
      String password = "root"; 
      
      try {
          Class.forName(driver);
          conexao = DriverManager.getConnection(url,user,password);
          return conexao;
      }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }  
    }
}
