package Controller;
import Model.Cliente;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class ClienteDAO {
    
    //Atributos da Classe ClienteDAO
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    //Método de Consultar Todos os Registros
    public void consultarTodos(JTable tabCliente, JFrame jfcliente){
        
        String sql = "select id as ID, nome as Nome, enderecoID as Endereco from Cliente";
        
        try {
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            tabCliente.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jfcliente, "Ocorreu um erro: " + e); 
        }
        
        Connect.desconector(conexao);
    }
    
    //Método de Inserção de Usuário no Banco
    public void inserirCliente(Cliente cliente, JFrame jfcliente){
        
        String sql = "insert into Cliente(nome, contato, email, senha, enderecoID values (?, ?, ?, md5(?), ?))";
        
        try {
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, cliente.getCli_nome());
            pst.setString(2, cliente.getCli_end());
            pst.setString(3, cliente.getCli_email());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(jfcliente, "Cliente inserido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jfcliente, "Erro ao inserir cliente: " + e);
        }
        
        Connect.desconector(conexao);
    }
}
