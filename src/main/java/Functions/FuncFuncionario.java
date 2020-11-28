package Functions;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FuncFuncionario {

    public void limparCampos(JTextField id,  JTextField nome, JTextField email, JPasswordField senha, JPasswordField redsenha) {
        id.setText(null);
        nome.setText(null);
        email.setText(null);
        senha.setText(null);
        redsenha.setText(null);
    }

    public boolean verificarCampos(JTextField txt_nome, JTextField txt_email, JPasswordField txt_senha, JPasswordField txt_redsenha, JFrame jfusuario) {

        if (txt_nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(jfusuario, "Por favor, preencha o campo Nome");
            txt_nome.requestFocus();
            return false;
        } else {
            if(txt_email.getText().isEmpty()){
                JOptionPane.showMessageDialog(jfusuario, "Por favor, preencha o campo E-mail");
                txt_email.requestFocus();
                return false;
            }else{
                if (txt_senha.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(jfusuario, "Por favor, preencha o campo Senha");
                    txt_senha.requestFocus();
                    return false;
                }else{
                    if(txt_redsenha.getText().isEmpty()){
                        JOptionPane.showMessageDialog(jfusuario, "Por favor, redigite a Senha");
                        txt_redsenha.requestFocus();
                        return false;
                    }
                }
            }
        }
        
        return true;

    }
   
    public void enviarDados(JTable tabFuncionario, JTextField id, JTextField nome, JTextField email, JTabbedPane pagina){  
        int linha = tabFuncionario.getSelectedRow();
        
        id.setText(tabFuncionario.getModel().getValueAt(linha, 0).toString());
        nome.setText(tabFuncionario.getModel().getValueAt(linha, 1).toString());
        email.setText(tabFuncionario.getModel().getValueAt(linha, 2).toString());
        
        pagina.setSelectedIndex(1);   
    }

    public void habilitarCampos(JTextField id, JTextField nome, JTextField email, JPasswordField senha, JPasswordField redsenha) {

        id.setEnabled(true);
        nome.setEnabled(true);
        email.setEnabled(true);
        senha.setEnabled(true);
        redsenha.setEnabled(true);

    }

    public void desabilitarCampos(JTextField id, JTextField nome, JTextField email, JPasswordField senha, JPasswordField redsenha) {

        id.setEnabled(false);
        nome.setEnabled(false);
        email.setEnabled(false);
        senha.setEnabled(false);
        redsenha.setEnabled(false);
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