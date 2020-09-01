package Controller;
import java.sql.*;

public class Connect {    
    public static Connection conectar(){
        java.sql.Connection conn = null;
        
        String driver = "com.mysql.jdbc.Driver";
        String host = "jdbc:mysql://localhost:3306/petshome";
        String user = "root";
        String pass = "";
        
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(host, user, pass);
            
            return conn;
        }
        catch (Exception e){
            return null;
        }
   }
}
