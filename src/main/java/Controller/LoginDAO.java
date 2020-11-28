package Controller;

import Model.Funcionario;
import View.JF_Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LoginDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void login(Funcionario funcionario, JFrame jfLogin, JFrame jfMain){
        String sql = "select * from funcionario where email = ? and senha = md5(?)";
        
        try{
            conn = Connect.conectar();
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, funcionario.getFunc_email());
            ps.setString(2, funcionario.getFunc_senha());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                jfLogin.dispose();
                jfLogin.setVisible(false);
                jfMain.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        Connect.desconector(conn);
    }       
}
