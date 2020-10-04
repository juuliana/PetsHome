package Controller;

import Model.Cliente;
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
        
        String sql = "select id as ID, nome as Nome, email as Email from funcionario";
        
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
        
        String sql = "insert funcionario values (?, ?, ?, md5(?))";
        
        try {
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            
            pst.setInt(1, funcionario.getFunc_id());
            pst.setString(2, funcionario.getFunc_nome());
            pst.setString(3, funcionario.getFunc_email());
            pst.setString(4, funcionario.getFunc_senha());
           
            if ((funcionario.getFunc_nome().isEmpty())||(funcionario.getFunc_email().isEmpty())||(funcionario.getFunc_senha().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = pst.executeUpdate();

                if(adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
                } 
            }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jfFuncionario, "Erro ao inserir funcionario: " + e);
        }
        
        Connect.desconector(conexao);
    }
    
    public void alterarFuncionario(Funcionario funcionario, JFrame jffuncionario){
        String sql = "update from funcionario set nome=?, email=?, senha=md5(?) where id=?";
    
        try{
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, funcionario.getFunc_nome());
            pst.setString(2, funcionario.getFunc_email());
            pst.setString(3, funcionario.getFunc_senha());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Funcionário alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jffuncionario, "Erro ao alterar funcionário: " + e);
        }
        
        Connect.desconector(conexao);
    }
    
    public void removerFuncionario(Funcionario funcionario, JFrame jffuncionario){

        String sql = "delete from funcionario where id=?";

        try {

            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);

            pst.setInt(1, funcionario.getFunc_id());

            if(JOptionPane.showConfirmDialog(jffuncionario, "Deseja realmente excluir o funcionário?", "Atenção", JOptionPane.YES_NO_CANCEL_OPTION)==0){
                pst.execute();
                JOptionPane.showMessageDialog(jffuncionario, "Funcionário excluído com sucesso!");
            }else{
                JOptionPane.showMessageDialog(jffuncionario, "O funcionário não foi excluído!");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(jffuncionario, "Erro ao excluir o funcionário: "+e);
        }
    }
}
