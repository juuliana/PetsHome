package Controller;

import Model.Funcionario;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class FuncionarioDAO {
    
    //Atributos da Classe ClienteDAO
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    //Método de Consultar Todos os Registros
    public void consultarTodos(JTable tabFuncionario, JFrame jfFuncionario){
        
        String sql = "select id as ID, nome as Nome, email as Usuario from funcionario";
        
        try {
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            tabFuncionario.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jfFuncionario, "Ocorreu um erro: " + e); 
        }
        
        Connect.desconector(conexao);
    }
    
    //Método de Inserção de Usuário no Banco
    public void inserirFuncionario(Funcionario funcionario, JFrame jfFuncionario){
        
        String sql = "insert funcionario values (null, ?, ?, md5(?))";
        
        try {
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, funcionario.getFunc_nome());
            pst.setString(2, funcionario.getFunc_email());
            pst.setString(3, funcionario.getFunc_senha());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(jfFuncionario, "Funcionário inserido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jfFuncionario, "Erro ao inserir funcionario: " + e);
        }
        
        Connect.desconector(conexao);
    }
}
