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
        
        String sql = "select id as ID, nome as Nome, contato as Contato from Cliente";
        
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
        
        String sql = "insert cliente values (?, ?, ?, ?, md5(?))";
        
        try {
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            
            pst.setInt(1, cliente.getCli_id());
            pst.setString(2, cliente.getCli_nome());
            pst.setString(3, cliente.getCli_contato());
            pst.setString(4, cliente.getCli_email());
            pst.setString(5, cliente.getCli_senha());
            
            if ((cliente.getCli_nome().isEmpty())||(cliente.getCli_email().isEmpty())||(cliente.getCli_senha().isEmpty())) {//IsEmpty = Vazio
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                //A estrutura abaixo e usada para confirmar os dados inseridos na tabela
                int adicionado = pst.executeUpdate();//Atualiza a tab 
                    //System.out.println(adicionado);//Apareceera 1 se der certo no teste abaixo a condicao 1 é maior que 0 entao ele aparece cadastrado
                if(adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                    //As linhas abaixo, limpam os campos
                } 
            }   
        } catch (Exception e) {
                    JOptionPane.showMessageDialog(jfcliente, "Erro ao inserir cliente: " + e);
        }
        
        Connect.desconector(conexao);
    }
    
    public void alterarCli(Cliente cliente, JFrame jfcliente){
        String sql = "update from cliente set nome=?, contato=?, email=?, senha=md5(?) where id=?";
    
        try{
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, cliente.getCli_nome());
            pst.setString(2, cliente.getCli_contato());
            pst.setString(3, cliente.getCli_email());
            pst.setString(4, cliente.getCli_senha());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jfcliente, "Erro ao alterar cliente: " + e);
        }
        
        Connect.desconector(conexao);
    }
    
    public void removerCli(Cliente cliente, JFrame jfcliente){

        String sql = "delete from cliente where id=?";

        try {

            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);

            pst.setInt(1, cliente.getCli_id());

            if(JOptionPane.showConfirmDialog(jfcliente, "Deseja excluir o registro?", "Atenção", JOptionPane.YES_NO_CANCEL_OPTION)==0){
                pst.execute();
                JOptionPane.showMessageDialog(jfcliente, "Registro excluído com sucesso!");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(jfcliente, "Erro ao excluir registro: "+e);
        }
    }

}
