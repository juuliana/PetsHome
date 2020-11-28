package Functions;

import Model.Agendamento;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FuncAgendamento {

    public void limparCampos(  JTextField data, JTextField hora, JComboBox tipo, JTextField valor) {
        data.setText(null);
        hora.setText(null);
        tipo.setSelectedIndex(1);
        valor.setText(null);
        
        Agendamento ag = new Agendamento();
        
        ag.setIsUpdating(false);
    }

    public boolean verificarCampos(JTextField txt_data, JTextField txt_hora, JComboBox box_tipo, JComboBox box_pagamento, JFrame jfagendamento) {

        if (txt_data.getText().isEmpty()) {
            JOptionPane.showMessageDialog(jfagendamento, "Por favor, preencha o campo Data");
            txt_data.requestFocus();
            return false;
        } else {
            if(txt_hora.getText().isEmpty()){
                JOptionPane.showMessageDialog(jfagendamento, "Por favor, preencha o campo Hora");
                txt_hora.requestFocus();
                return false;
            }else{
                if(box_tipo.getSelectedItem().toString().isEmpty()){
                    JOptionPane.showMessageDialog(jfagendamento, "Por favor, preencha o campo Tipo");
                    box_tipo.requestFocus();
                    return false;
                }
            }
        }
        
        return true;
    }
   
    public void enviarDados(JTable tabAgendamento,   JTextField data, JTextField hora, JComboBox tipo, JTextField valor, JComboBox pagamento, JTabbedPane pagina){  
        int linha = tabAgendamento.getSelectedRow();

        data.setText(tabAgendamento.getModel().getValueAt(linha, 1).toString());
        hora.setText(tabAgendamento.getModel().getValueAt(linha, 2).toString());
        tipo.setSelectedItem(tabAgendamento.getModel().getValueAt(linha, 3).toString());
        valor.setText(tabAgendamento.getModel().getValueAt(linha, 4).toString());
        pagamento.setSelectedItem(tabAgendamento.getModel().getValueAt(linha, 4).toString());
        
        pagina.setSelectedIndex(1);  
    }

    public void habilitarCampos(  JTextField data, JTextField hora, JComboBox tipo, JTextField valor) {
        data.setEnabled(true);
        hora.setEnabled(true);
        tipo.setEnabled(true);
        valor.setEnabled(true);
        
    }

    public void desabilitarCampos(  JTextField data, JTextField hora, JComboBox tipo, JTextField valor) {
        data.setEnabled(false);
        hora.setEnabled(false);
        tipo.setEnabled(false);
        valor.setEnabled(false);
    }

    public void acaoCUD(JButton inserir, JButton cancelar, JButton deletar, JButton editar) {

        inserir.setEnabled(true);
        deletar.setEnabled(false);
        cancelar.setEnabled(true);
        editar.setEnabled(false);
    }

    public void acaoIrEdicao(JButton inserir, JButton cancelar, JButton deletar, JButton editar) {
        inserir.setEnabled(false);
        cancelar.setEnabled(false);
        deletar.setEnabled(true);
        editar.setEnabled(true);
    }

    public void acaoEdicao(JButton inserir, JButton cancelar, JButton deletar, JButton editar) {
        inserir.setEnabled(true);
        cancelar.setEnabled(true);
        deletar.setEnabled(true);
        editar.setEnabled(false);
    }

    public void acaoOkCancelar(JButton inserir, JButton cancelar, JButton deletar, JButton editar) {
        inserir.setEnabled(true);
        cancelar.setEnabled(true);
        deletar.setEnabled(false);
        editar.setEnabled(false);
    }
}