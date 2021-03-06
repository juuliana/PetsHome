package Controller;
import Model.Cliente;
import Model.Pet;
import View.JF_Pet;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class PetDAO{
    
    //Atributos da Classe ClienteDAO
    Connection conexao = null;
    PreparedStatement pst = null;
    PreparedStatement dono = null;
    ResultSet rs = null;
    Pet pet = new Pet();
    
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
        
        String sql = "insert pet values (null, ?, ?, ?, ?, ?)";
        String getDonoSql = "select id from cliente where nome = ?";
        
        try {
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            dono = conexao.prepareStatement(getDonoSql);
            dono.setString(1, pet.getDono());
              
            
            ResultSet rsDono = dono.executeQuery();
            
            
            if(rsDono.next()){
                pst.setString(1, pet.getNome());
                pst.setString(2, pet.getRaca());
                pst.setString(3, pet.getPorte());
                pst.setInt(4, pet.getIdade());
                pst.setInt(5, rsDono.getInt("id"));
            }else{
                JOptionPane.showMessageDialog(jfpet, "Cliente não existente");
            }
            
            if ((pet.getNome().isEmpty())|| pet.getPorte().isEmpty() || pet.getRaca().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = pst.executeUpdate();
                
                if(adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Pet cadastrado com sucesso!");
                } 
            }   
        } catch (Exception e) {
                    System.out.println(e);
        }
        
        Connect.desconector(conexao);
    }
    
    //LUANN
    public void alterarPet(Pet pet, JF_Pet jfPet){
        String sql = "update pet set nome=?, raca=?, porte=?, idade = ? where id=?";
    
        try{
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, pet.getNome());
            pst.setString(2, pet.getRaca());
            pst.setString(3, pet.getPorte());
            pst.setInt(4, pet.getIdade());
            pst.setInt(5, pet.getId());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Pet alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jfPet, "Erro ao alterar pet: " + e);
        }
        
        Connect.desconector(conexao);
    }
    
    public void removerPet(Pet pet, JFrame jfpet){

        String sql = "delete from pet where id=?";

        try {

            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);

            pst.setInt(1, pet.getId());

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