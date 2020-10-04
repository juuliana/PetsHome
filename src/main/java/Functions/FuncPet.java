package Functions;

import Model.Cliente;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FuncPet {

    public void limparCampos(JTextField id,  JTextField nome, JTextField raca, JComboBox porte, JTextField idade, JComboBox dono) {
        id.setText(null);
        nome.setText(null);
        raca.setText(null);
        porte.setSelectedIndex(1);
        idade.setText(null);
        dono.setSelectedIndex(1);
        
        Pet pet = new Pet();
        
        pet.setIsUpdating(false);
    }

    public boolean verificarCampos(JTextField txt_nome, JTextField txt_raca, JComboBox box_porte, JTextField txt_idade, JComboBox box_dono, JFrame jfusuario) {

        if (txt_nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(jfusuario, "Por favor, preencha o campo Nome");
            txt_nome.requestFocus();
            return false;
        } else {
            if(txt_raca.getText().isEmpty()){
                JOptionPane.showMessageDialog(jfusuario, "Por favor, preencha o campo Raça");
                txt_raca.requestFocus();
                return false;
            }else{
                if(box_porte.getSelectedIndex().isEmpty()){
                    JOptionPane.showMessageDialog(jfusuario, "Por favor, preencha o campo Porte");
                    box_porte.requestFocus();
                    return false;
                }else{
                    if(txt_idade.getText().isEmpty()){
                        JOptionPane.showMessageDialog(jfusuario, "Por favor, preencha o campo Idade");
                        txt_idade.requestFocus();
                        return false;
                    }else{
                        if(box_dono.getSelectedIndex().isEmpty()){
                            JOptionPane.showMessageDialog(jfusuario, "Por favor, preencha o campo Dono");
                            box_dono.requestFocus();
                            return false;
                        }
                    }
                }
            }
        }
        
        return true;
    }
   
    public void enviarDados(JTable tabCliente, JTextField id, JTextField nome, JTextField raca, JComboBox porte, JTextField idade, JComboBox dono, JTabbedPane pagina){  
        int linha = tabCliente.getSelectedRow();
        
        id.setText(tabCliente.getModel().getValueAt(linha, 0).toString());
        nome.setText(tabCliente.getModel().getValueAt(linha, 1).toString());
        raca.setText(tabCliente.getModel().getValueAt(linha, 2).toString());
        porte.setSelectedIndex(tabCliente.getModel().getValueAt(linha, 3).toString());
        idade.setText(tabCliente.getModel().getValueAt(linha, 4).toString());
        dono.setSelectedIndex(tabCliente.getModel().getValueAt(linha, 5).toString());
        
        pagina.setSelectedIndex(1);   
    }

    public void habilitarCampos(JTextField id, JTextField nome, JTextField raca, JComboBox porte, JTextField idade, JComboBox dono) {

        id.setEnabled(true);
        nome.setEnabled(true);
        raca.setEnabled(true);
        porte.setEnabled(true);
        idade.setEnabled(true);
        dono.setEnabled(true);
    }

    public void desabilitarCampos(JTextField id, JTextField nome, JTextField raca, JComboBox porte, JTextField idade, JComboBox dono) {

        id.setEnabled(false);
        nome.setEnabled(false);
        raca.setEnabled(false);
        porte.setEnabled(false);
        idade.setEnabled(false);
        dono.setEnabled(false);
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