package View;

import Controller.AgendamentoDAO;
import Controller.ClienteDAO;
import Functions.FuncAgendamento;
import Model.Agendamento;
import java.awt.Color;
import java.awt.Component;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class JF_Agendar extends javax.swing.JFrame {

    Agendamento ag = new Agendamento();
    AgendamentoDAO agDAO = new AgendamentoDAO();
    FuncAgendamento funcag = new FuncAgendamento();
    
    String CLASS = "";
    int flag;
    
    public JF_Agendar() {
        initComponents();
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        funcag.acaoCUD(btn_ok, btn_cancel, btn_delete, btn_update);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAgendamento = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        box_tipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        btn_ok = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        txt_data = new javax.swing.JFormattedTextField();
        txt_hora = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        box_pagamento = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        tabAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Data", "Hora", "Tipo", "Valor", "PET", "Cliente", "Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAgendamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabAgendamento);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Consultar Agendamentos", jPanel1);

        jPanel2.setMinimumSize(new java.awt.Dimension(420, 270));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("* Data");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jLabel3.setText("* Horário");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jLabel4.setText("* Tipo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        box_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Tosa", "Banho", "Banho e tosa" }));
        box_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_tipoActionPerformed(evt);
            }
        });
        jPanel2.add(box_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 170, -1));

        jLabel5.setText("Valor");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 460, -1, -1));

        txt_valor.setEditable(false);
        txt_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorActionPerformed(evt);
            }
        });
        jPanel2.add(txt_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, 170, -1));

        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, -1, -1));

        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, -1, -1));

        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel2.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, -1, -1));

        try {
            txt_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txt_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 120, -1));

        try {
            txt_hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txt_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Cliente", "Cliente", "Id Pet", "Pet", "Raca", "Porte", "Idade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 100, 1060, 330));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Pesquisar Pet ou Cliente");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 280, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Selecione");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        box_pagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDENTE", "EFETUADO" }));
        jPanel2.add(box_pagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 200, -1));

        jLabel6.setText("Pagamento");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, -1, -1));

        jTabbedPane1.addTab("Cadastro e Manutenção", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        agDAO.consultarTodos(tabAgendamento, this);
        CorNaLinha();
        ClienteDAO clienteDao = new ClienteDAO();
        
        clienteDao.selectClientePet(jTable1, "", "");
    }//GEN-LAST:event_formWindowOpened

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        if (funcag.verificarCampos(txt_data, txt_hora, box_tipo, box_pagamento, this) == true) {
           
            ag.setDia(txt_data.getText());
            ag.setHora(txt_hora.getText());        
            ag.setTipo(box_tipo.getSelectedItem().toString());
            ag.setPagamento(box_pagamento.getSelectedItem().toString());
            ag.setValor(Double.parseDouble(txt_valor.getText()));
            
            if(jTable1.getSelectedRow() >= 0){
                ag.setCliente(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
                ag.setPet(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString()));
            }

            if(ag.getIsUpdating()){
                agDAO.alterarAg(ag, this);
                funcag.limparCampos(txt_data, txt_hora, box_tipo, txt_valor);
                funcag.acaoCUD(btn_ok, btn_cancel, btn_delete, btn_update);

                ag.setIsUpdating(false);
            }else{
                agDAO.inserirAgendamento(ag, this);
                funcag.limparCampos(txt_data, txt_hora, box_tipo, txt_valor);
            }
       }
    }//GEN-LAST:event_btn_okActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        agDAO.consultarTodos(tabAgendamento, this);
        funcag.acaoOkCancelar(btn_ok, btn_cancel, btn_delete, btn_update);
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        funcag.limparCampos(txt_data, txt_hora, box_tipo, txt_valor);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        agDAO.removerAg(ag, this);
        funcag.limparCampos(txt_data, txt_hora, box_tipo, txt_valor);
        funcag.acaoCUD(btn_ok, btn_cancel, btn_delete, btn_update);
        funcag.habilitarCampos(txt_data, txt_hora, box_tipo, txt_valor, box_pagamento);
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tabAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAgendamentoMouseClicked
        ag.setId(Integer.parseInt(tabAgendamento.getValueAt(tabAgendamento.getSelectedRow(), 0).toString()));
        funcag.enviarDados(tabAgendamento, txt_data, txt_hora, box_tipo, txt_valor, box_pagamento, jTabbedPane1);
        funcag.acaoIrEdicao(btn_ok, btn_cancel, btn_delete, btn_update);
        funcag.desabilitarCampos(txt_data, txt_hora, box_tipo, txt_valor, box_pagamento);
    }//GEN-LAST:event_tabAgendamentoMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        flag = 1;
        funcag.acaoEdicao(btn_ok, btn_cancel, btn_delete, btn_update);
        funcag.habilitarCampos(txt_data, txt_hora, box_tipo, txt_valor, box_pagamento);
        
        ag.setIsUpdating(true);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void txt_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorActionPerformed
    }//GEN-LAST:event_txt_valorActionPerformed

    private void box_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_tipoActionPerformed
        String tipo = box_tipo.getSelectedItem().toString();
        if(tipo == "Tosa"){
            txt_valor.setText("60.00");
        }
        else if(tipo == "Banho"){
            txt_valor.setText("45.00");
        }
        else if(tipo == "Banho e tosa"){
            txt_valor.setText("90.00");
        }
        else{
            txt_valor.setText("");
        }
    }//GEN-LAST:event_box_tipoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getID() >= 0){
            ClienteDAO clienteDao = new ClienteDAO();
            
            clienteDao.selectClientePet(jTable1, jTextField1.getText(), jTextField1.getText());
        }
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(JF_Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Agendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_pagamento;
    private javax.swing.JComboBox<String> box_tipo;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabAgendamento;
    private javax.swing.JFormattedTextField txt_data;
    private javax.swing.JFormattedTextField txt_hora;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables

public void CorNaLinha(){
        CLASS = (String) box_pagamento.getSelectedItem();
        tabAgendamento.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            
            @Override
            public Component getTableCellRendererComponent(JTable tabAgendamento, Object value, boolean isSelected, boolean hasFocus, int row, int column){
                JLabel label = (JLabel) super.getTableCellRendererComponent(tabAgendamento, value, isSelected, hasFocus, row, column);
        
                Color c = new java.awt.Color(0, 153, 0);
		Object pagamento = tabAgendamento.getValueAt(row, 7);
                
		if(box_pagamento != null && "PENDENTE".equals(pagamento.toString())){
                     c = Color.RED;
                }else{
                    c = Color.GREEN;
                }
		label.setForeground(c);

		return label;
            }
        });
    } 
}
