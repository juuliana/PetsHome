package View;

import Controller.FuncionarioDAO;
import Functions.FuncCliente;
import Functions.FuncFuncionario;
import Model.Funcionario;
import javax.swing.JOptionPane;

public class JF_Funcionario extends javax.swing.JFrame {

    Funcionario func = new Funcionario();
    FuncionarioDAO funcDAO = new FuncionarioDAO();
    FuncFuncionario funcfunc = new FuncFuncionario();
    
    int flag;
    
    public JF_Funcionario() {
        initComponents();
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        funcfunc.acaoCUD(btn_ok, btn_cancel, btn_delete, btn_update);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tabFuncionario1 = new javax.swing.JScrollPane();
        tabFuncionario = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txt_redsenha = new javax.swing.JPasswordField();
        btn_ok = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(467, 273));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(500, 430));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(500, 430));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        tabFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabFuncionarioMouseClicked(evt);
            }
        });
        tabFuncionario1.setViewportView(tabFuncionario);

        jPanel1.add(tabFuncionario1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Consulta Funcionário", jPanel1);

        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 150));

        jLabel1.setText("* Nome");

        jLabel3.setText("* E-mail");

        jLabel4.setText("Senha");

        jLabel5.setText("Redigite a senha");

        btn_ok.setIcon(new javax.swing.ImageIcon("C:\\Users\\jumaj\\Desktop\\EDUVALE\\4°Termo\\Desenvolvimento de Software II\\Projeto Java\\correct.png")); // NOI18N
        btn_ok.setToolTipText("Adicionar");
        btn_ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        btn_cancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\jumaj\\Desktop\\EDUVALE\\4°Termo\\Desenvolvimento de Software II\\Projeto Java\\quit.png")); // NOI18N
        btn_cancel.setToolTipText("Limpar Campos");
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\jumaj\\Desktop\\EDUVALE\\4°Termo\\Desenvolvimento de Software II\\Projeto Java\\close.png")); // NOI18N
        btn_delete.setToolTipText("Deletar Funcionário");
        btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setIcon(new javax.swing.ImageIcon("C:\\Users\\jumaj\\Desktop\\EDUVALE\\4°Termo\\Desenvolvimento de Software II\\Projeto Java\\update.png")); // NOI18N
        btn_update.setToolTipText("Fazer Alterações");
        btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        txt_id.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancel))
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txt_redsenha, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txt_senha))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_update)
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_redsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancel)
                    .addComponent(btn_ok)
                    .addComponent(btn_delete)
                    .addComponent(btn_update))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manutenção de Funcionários", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        if (funcfunc.verificarCampos(txt_nome, txt_email, txt_senha, txt_redsenha, this) == true) {
        
        func.setFunc_nome(txt_nome.getText());
        func.setFunc_email(txt_email.getText());   
        func.setFunc_senha(txt_senha.getText());  
        
        if (txt_senha.getText().equals(txt_redsenha.getText())) {
            
                if (flag == 0) {
                    funcDAO.inserirFuncionario(func, this);
                    funcfunc.acaoOkCancelar(btn_ok, btn_cancel, btn_delete, btn_update);
                    funcfunc.limparCampos(txt_id, txt_nome, txt_email, txt_senha, txt_redsenha);
                } else {
                    func.setFunc_id(Integer.parseInt(txt_id.getText()));
                    funcDAO.alterarFuncionario(func, this);
                    funcfunc.acaoOkCancelar(btn_ok, btn_cancel, btn_delete, btn_update);
                    funcfunc.desabilitarCampos(txt_id, txt_nome, txt_email, txt_senha, txt_redsenha);
                    funcfunc.limparCampos(txt_id, txt_nome, txt_email, txt_senha, txt_redsenha);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Senhas não conferem");
                txt_senha.setText(null);
                txt_redsenha.setText(null);
                txt_senha.requestFocus();
            }
        }
    }//GEN-LAST:event_btn_okActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        funcDAO.consultarTodos(tabFuncionario, this);
        funcfunc.acaoOkCancelar(btn_ok, btn_cancel, btn_delete, btn_update);
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        funcDAO.consultarTodos(tabFuncionario, this);
    }//GEN-LAST:event_formWindowOpened

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        funcfunc.limparCampos(txt_id, txt_nome, txt_email, txt_senha, txt_redsenha);
        
        func.setIsUpdating(false);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        func.setFunc_id(Integer.valueOf(txt_id.getText()));
        funcDAO.removerFuncionario(func, this);
        funcfunc.limparCampos(txt_id, txt_nome, txt_email, txt_senha, txt_redsenha);
        funcfunc.acaoCUD(btn_ok, btn_cancel, btn_delete, btn_update);
        funcfunc.habilitarCampos(txt_id, txt_nome, txt_email, txt_senha, txt_redsenha);
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        flag = 1;
        funcfunc.acaoEdicao(btn_ok, btn_cancel, btn_delete, btn_update);
        funcfunc.habilitarCampos(txt_id, txt_nome, txt_email, txt_senha, txt_redsenha);
        
        func.setIsUpdating(true);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tabFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabFuncionarioMouseClicked
        funcfunc.enviarDados(tabFuncionario, txt_id, txt_nome, txt_email, jTabbedPane1);
        funcfunc.acaoIrEdicao(btn_ok, btn_cancel, btn_delete, btn_update);
        funcfunc.desabilitarCampos(txt_id, txt_nome, txt_email, txt_senha, txt_redsenha);
    }//GEN-LAST:event_tabFuncionarioMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabFuncionario;
    private javax.swing.JScrollPane tabFuncionario1;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JPasswordField txt_redsenha;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}
