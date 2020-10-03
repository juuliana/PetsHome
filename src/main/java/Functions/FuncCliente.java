package Functions;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FuncCliente {

//Limpar Campos
    public void limparCampos(JTextField id,  JTextField nome, JTextField contato, JTextField email, JPasswordField senha, JPasswordField redsenha) {
        id.setText(null);
        nome.setText(null);
        contato.setText(null);
        email.setText(null);
        senha.setText(null);
        redsenha.setText(null);
    }

//Validação de Campos Vazios
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
   
//Enviar dados da JTable para tab de manutenção de usuários
    public void enviarDados(JTable tabCliente, JTextField id, JTextField nome, JTextField contato, JTextField email, JTabbedPane pagina){  
        int linha = tabCliente.getSelectedRow();
        
        id.setText(tabCliente.getModel().getValueAt(linha, 0).toString());
        nome.setText(tabCliente.getModel().getValueAt(linha, 1).toString());
        contato.setText(tabCliente.getModel().getValueAt(linha, 2).toString());
        email.setText(tabCliente.getModel().getValueAt(linha, 3).toString());
        
        pagina.setSelectedIndex(1);   
    }

//Habilitar Campos
    public void habilitarCampos(JTextField id, JTextField nome, JTextField contato, JTextField email, JPasswordField senha, JPasswordField redsenha) {

        id.setEnabled(true);
        nome.setEnabled(true);
        contato.setEnabled(true);
        email.setEnabled(true);
        senha.setEnabled(true);
        redsenha.setEnabled(true);

    }

//Desabilitar Campos
    public void desabilitarCampos(JTextField id, JTextField nome, JTextField contato, JTextField email, JPasswordField senha, JPasswordField redsenha) {

        id.setEnabled(false);
        nome.setEnabled(false);
        contato.setEnabled(false);
        email.setEnabled(false);
        senha.setEnabled(false);
        redsenha.setEnabled(false);

    }

//Botões - Ação de Inserção
    public void acaoCUD(JButton inserir, JButton cancelar, JButton deletar, JButton editar) {

        inserir.setEnabled(true);
        deletar.setEnabled(false);
        cancelar.setEnabled(true);
        editar.setEnabled(false);
    }

//Botões - Ação de Ir para tela de Edição
    public void acaoIrEdicao(JButton inserir, JButton cancelar, JButton deletar, JButton editar) {
        inserir.setEnabled(false);
        cancelar.setEnabled(false);
        deletar.setEnabled(true);
        editar.setEnabled(true);
    }

//Botões - Ação de Edição
    public void acaoEdicao(JButton inserir, JButton cancelar, JButton deletar, JButton editar) {
        inserir.setEnabled(true);
        cancelar.setEnabled(true);
        deletar.setEnabled(true);
        editar.setEnabled(false);
    }

//Botões - Ação de OK e Cancelar
    public void acaoOkCancelar(JButton inserir, JButton cancelar, JButton deletar, JButton editar) {
        inserir.setEnabled(true);
        cancelar.setEnabled(true);
        deletar.setEnabled(false);
        editar.setEnabled(false);
    }

}