package Controller;
import Functions.FuncCliente;
import Model.Cliente;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class PetDAO{
    
    //Atributos da Classe ClienteDAO
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    //Método de Consultar Todos os Registros
    public void consultarTodos(JTable tabPet, JFrame jfpet){
        
        String sql = "select id as ID, nome as Nome, raca as Raça, porte as Porte, idade as Idade, dono_id as Dono from pet";
        
        try {
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            tabPet.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jfpet, "Ocorreu um erro: " + e); 
        }
        
        Connect.desconector(conexao);
    }
    
    //LUANN
    public void inserirPet(Pet pet, JFrame jfpet){
        
        String sql = "insert cliente values (null, ?, ?, ?)";
        
        try {
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, cliente.getCli_nome());
            pst.setString(2, cliente.getCli_contato());
            pst.setString(3, cliente.getCli_email());

            
            if ((cliente.getCli_nome().isEmpty())||(cliente.getCli_contato().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = pst.executeUpdate();
                
                if(adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                } 
            }   
        } catch (Exception e) {
                    JOptionPane.showMessageDialog(jfcliente, "Erro ao inserir cliente: " + e);
        }
        
        Connect.desconector(conexao);
    }
    
    //LUANN
    public void alterarCli(Cliente cliente, JFrame jfcliente){
        String sql = "update cliente set nome=?, contato=?, email=? where id=?";
    
        try{
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, cliente.getCli_nome());
            pst.setString(2, cliente.getCli_contato());
            pst.setString(3, cliente.getCli_email());
            pst.setInt(4, cliente.getCli_id());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jfcliente, "Erro ao alterar cliente: " + e);
        }
        
        Connect.desconector(conexao);
    }
    
    public void removerPet(Pet pet, JFrame jfpet){

        String sql = "delete from pet where id=?";

        try {

            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);

            pst.setInt(1, pet.getPet_id());

            if(JOptionPane.showConfirmDialog(jfpet, "Deseja realmente excluir o Pet?", "Atenção", JOptionPane.YES_NO_CANCEL_OPTION)==0){
                pst.execute();
                JOptionPane.showMessageDialog(jfpet, "Pet excluído com sucesso!");
            }else{
                JOptionPane.showMessageDialog(jfpet, "O Pet não foi excluído!");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(jfpet, "Erro ao excluir o Pet: "+e);
        }
    }
}