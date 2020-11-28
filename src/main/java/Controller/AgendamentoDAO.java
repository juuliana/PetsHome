package Controller;

import Functions.FormatDate;
import Model.Agendamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class AgendamentoDAO {
    
    //Atributos da Classe ClienteDAO
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    //Método de Consultar Todos os Registros
    public void consultarTodos(JTable tabAgendamento, JFrame jfagendamento){
        
        String sql = "select id as ID,  date_format(dia, '%d/%m/%Y') as Data, hora as Hora, tipo as Tipo, valor as Valor, pet_id as PET, cliente_id as Cliente from agendamento";
        
        try {
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            tabAgendamento.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jfagendamento, "Ocorreu um erro: " + e); 
        }
        
        Connect.desconector(conexao);
    }
    
    //Método de Inserção de Usuário no Banco
    public void inserirAgendamento(Agendamento agendamento, JFrame jfagendamento){
        
        String sql = "insert agendamento values (null, ?, ?, ?, ?, ?, ?)";
        FormatDate formatDate = new FormatDate();
        
        try {
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, formatDate.DefaultToSqlDate(agendamento.getDia()));
            pst.setString(2, agendamento.getHora());
            pst.setDouble(3, agendamento.getValor());
            pst.setString(4, agendamento.getTipo());
            pst.setString(5, agendamento.getCliente());
            pst.setString(6, agendamento.getPet());

            
            if (
                    (agendamento.getDia().toString().isEmpty() ||(agendamento.getHora().isEmpty())
                    ||(agendamento.getTipo().isEmpty())||(agendamento.getPet().isEmpty()))
                ) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = pst.executeUpdate();
                
                if(adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso!");
                } 
            }   
        } catch (Exception e) {
                    JOptionPane.showMessageDialog(jfagendamento, "Erro ao realizar agendamento: " + e);
        }
        
        Connect.desconector(conexao);
    }
    
    public void alterarAg(Agendamento agendamento, JFrame jfagendamento){
        String sql = "update agendamento set dia=?, hora=?, valor=?, tipo=? where id=?";
    
        try{
            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, agendamento.getDia());
            pst.setString(2, agendamento.getHora());
            pst.setDouble(3, agendamento.getValor());
            pst.setString(2, agendamento.getTipo());
            pst.setInt(4, agendamento.getId());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jfagendamento, "Erro ao realizar agendamento: " + e);
        }
        
        Connect.desconector(conexao);
    }
    
    public void removerAg(Agendamento agendamento, JFrame jfagendamento){

        String sql = "delete from agendamento where id=?";

        try {

            conexao = Connect.conectar();
            pst = conexao.prepareStatement(sql);

            pst.setInt(1, agendamento.getId());

            if(JOptionPane.showConfirmDialog(jfagendamento, "Deseja realmente excluir o agendamento?", "Atenção", JOptionPane.YES_NO_CANCEL_OPTION)==0){
                pst.execute();
                JOptionPane.showMessageDialog(jfagendamento, "Agendamento excluído com sucesso!");
            }else{
                JOptionPane.showMessageDialog(jfagendamento, "O agendamento não foi excluído!");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(jfagendamento, "Erro ao excluir o agendamento: "+e);
        }
    }
}