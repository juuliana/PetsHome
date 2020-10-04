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

public class FuncCliente {

    public void limparCampos(JTextField id,  JTextField nome, JTextField contato, JTextField email) {
        id.setText(null);
        nome.setText(null);
        contato.setText(null);
        email.setText(null);
        
        Cliente cli = new Cliente();
        
        cli.setIsUpdating(false);
    }

    public boolean verificarCampos(JTextField txt_nome, JTextField txt_contato, JFrame jfusuario) {

        if (txt_nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(jfusuario, "Por favor, preencha o campo Nome");
            txt_nome.requestFocus();
            return false;
        } else {
            if(txt_contato.getText().isEmpty()){
                JOptionPane.showMessageDialog(jfusuario, "Por favor, preencha o campo Contato");
                txt_contato.requestFocus();
                return false;
            }
        }
        
        return true;
    }
   
    public void enviarDados(JTable tabCliente, JTextField id, JTextField nome, JTextField contato, JTextField email, JTabbedPane pagina){  
        int linha = tabCliente.getSelectedRow();
        
        id.setText(tabCliente.getModel().getValueAt(linha, 0).toString());
        nome.setText(tabCliente.getModel().getValueAt(linha, 1).toString());
        contato.setText(tabCliente.getModel().getValueAt(linha, 2).toString());
        email.setText(tabCliente.getModel().getValueAt(linha, 3).toString());
        
        pagina.setSelectedIndex(1);   
    }

    public void habilitarCampos(JTextField id, JTextField nome, JTextField contato, JTextField email) {

        id.setEnabled(true);
        nome.setEnabled(true);
        contato.setEnabled(true);
        email.setEnabled(true);
    }

    public void desabilitarCampos(JTextField id, JTextField nome, JTextField contato, JTextField email) {

        id.setEnabled(false);
        nome.setEnabled(false);
        contato.setEnabled(false);
        email.setEnabled(false);
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