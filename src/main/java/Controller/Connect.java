package Controller;
import java.sql.*;

public class Connect {    
    public static Connection conectar(){
        java.sql.Connection conn = null;
        
        String driver = "com.mysql.jdbc.Driver";
        String host = "jdbc:mysql://localhost:3306/petshome";
        String user = "root";
        String pass = "Ch@ap0l!n6@@a";
        
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(host, user, pass);
            
            return conn;
        }
        catch (Exception e){
            return null;
        }
   }
    
   public static void desconector(Connection con){
       try {
           con.close();
           System.out.println("Banco Desconectado");
       } catch (Exception e) {
           System.out.println("Erro ao desconectar: " + e);
       }
   }
}
