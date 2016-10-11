/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jramirez25
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JButton botonesH[]={cmdCrear, cmdLimpiar};
        JButton botonesD[]={cmdLlenadoManual,cmdLlenadoAutomatico,cmdOperacion};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumerodeFilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumerodeColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNumerodeFilas1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumerodeColumnas1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        cmdLlenadoAutomatico = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmbOperaciones = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("RECORRIDOS MATRICES");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("No. de Filas:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        txtNumerodeFilas.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtNumerodeFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerodeFilasActionPerformed(evt);
            }
        });
        txtNumerodeFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerodeFilasKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumerodeFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 30, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("No. de Columnas: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 20));

        txtNumerodeColumnas.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtNumerodeColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerodeColumnasKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumerodeColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("No. de Filas:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));
        jPanel3.add(txtNumerodeFilas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 30, -1));

        jLabel5.setText("No. de Columnas: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 20));
        jPanel3.add(txtNumerodeColumnas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 350, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 350, 60));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        cmdLlenadoManual.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdLlenadoManual.setText("Manual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        cmdLlenadoAutomatico.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdLlenadoAutomatico.setText("Automático");
        cmdLlenadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        cmdOperacion.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel4.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        cmdLimpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 130, 180));

        cmbOperaciones.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Recorrido 1", "Recorrido 2", "Recorrido 3", "Recorrido 4", "Recorrido 5", "Recorrido 6" }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        tblTablaInicial.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 360, 210));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane3.setViewportView(txtResultado);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 480, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(536, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int nf, nc;
        DefaultTableModel tm;

        if (txtNumerodeColumnas.getText().trim().isEmpty())
        {
          Helper.mensaje(this, "Ingrese el Numero de Columnas", 3);
          txtNumerodeColumnas.requestFocusInWindow();
        }
        else if (txtNumerodeFilas.getText().trim().isEmpty()){
            Helper.mensaje(this, "Ingrese el Numero de Filas", 3);
            txtNumerodeFilas.requestFocusInWindow();
        }
        else {
            
        try{
        nf = Integer.parseInt(txtNumerodeFilas.getText());
        nc = Integer.parseInt(txtNumerodeColumnas.getText());

        if (nf <4)
        {
           Helper.mensaje(this, "El numero de filas no puede ser menor a 4", 2);
        }
        else if (nc <4)
        {
            Helper.mensaje(this, "El numero de columnas no puede ser menor a 4 ", 2);
        }
        else if ( nc>=12)
        {
            Helper.mensaje(this, "El numero de columnas no puede ser mayor a 12 ", 2);
        }
        else if ( nf >=12 )
        {
           Helper.mensaje(this, "El numero de filas no puede mayor a 12", 2);
        }
        else {
        
        nf = Integer.parseInt(txtNumerodeFilas.getText());
        nc = Integer.parseInt(txtNumerodeColumnas.getText());

        tm = (DefaultTableModel) tblTablaInicial.getModel();
       

        tm.setRowCount(nf);
        tm.setColumnCount(nc);

        
        
        JButton botonesH[]={cmdLlenadoManual,cmdLlenadoAutomatico, cmdLimpiar};
        JButton botonesD[]={cmdCrear, cmdOperacion};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        
        }
        }catch (NumberFormatException e)
        {
           Helper.mensaje(this, "Ingrese un numero valido", 3);
        }
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutomaticoActionPerformed
        int nf, nc, n;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }

        }

        JButton botonesH[]={cmdOperacion, cmdLimpiar};
        JButton botonesD[]={cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdLlenadoAutomaticoActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        int op, cantPares, nf, nc;
        DefaultTableModel tm;
        op = cmbOperaciones.getSelectedIndex();
        
        nf = Integer.parseInt(txtNumerodeFilas.getText());
        nc = Integer.parseInt(txtNumerodeColumnas.getText());
        tm = (DefaultTableModel) tblTablaInicial.getModel();
        
        tm.setRowCount(nf);
        tm.setColumnCount(nc);
       
        switch (op) {
                 case 0:
                     if (nf != nc || nf%2 == 0 && nc%2 == 0)
                {
                    Helper.mensaje(this, "La matriz debe ser cuadrada e impar", 2);
                }
                else {
                txtResultado.setText(Helper.recorridoUno(tblTablaInicial));
                     }
                break;
                
                  case 1:
                      if (nf != nc || nf%2 == 0 && nc%2 == 0)
                {
                    Helper.mensaje(this, "La matriz debe ser cuadrada e impar", 2);
                }
                else {
                txtResultado.setText(Helper.recorridoDos(tblTablaInicial));
                      }
                break;
                
                  case 2:
                txtResultado.setText(Helper.recorridoTres(tblTablaInicial));
                break;
                
                  case 3:
                      if (nf != nc || nf%2 == 0 && nc%2 == 0)
                {
                    Helper.mensaje(this, "La matriz debe ser cuadrada e impar", 2);
                }
                else {
                txtResultado.setText(Helper.recorridoCuatro(tblTablaInicial));
                      }
                break;
                
                  case 4:
                      if (nf != nc || nf%2 == 0 && nc%2 == 0)
                {
                    Helper.mensaje(this, "La matriz debe ser cuadrada e impar", 2);
                }
                else {
                txtResultado.setText(Helper.recorridoCinco(tblTablaInicial));
                      }
                break;
                     
        }
        
        JButton botonesH[]={cmdOperacion,cmdLimpiar};
        JButton botonesD[]={cmdLlenadoManual,cmdLlenadoAutomatico};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed

        txtNumerodeFilas.setText("");
        txtNumerodeColumnas.setText("");
        txtNumerodeFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);
        txtResultado.setText("");

       Helper.porDefectoTabla(tblTablaInicial);
       
       
       JButton botonesH[]={cmdCrear, cmdLimpiar};
        JButton botonesD[]={cmdLlenadoManual,cmdLlenadoAutomatico,cmdOperacion};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed
        int nf, nc;
        int n;
        int sw, res;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elmento en la posición [" + i + "]" + "[" + j + "]").trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un número válido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = nf;
                            j = nc;

                            Helper.porDefectoTabla(tblTablaInicial);
                            
                        } else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);
            }
        }
        JButton botonesH[]={cmdOperacion, cmdLimpiar};
        JButton botonesD[]={cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

    private void txtNumerodeFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerodeFilasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerodeFilasActionPerformed

    private void txtNumerodeFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerodeFilasKeyTyped
       char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumerodeFilasKeyTyped

    private void txtNumerodeColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerodeColumnasKeyTyped
       char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumerodeColumnasKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAutomatico;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTextField txtNumerodeColumnas;
    private javax.swing.JTextField txtNumerodeColumnas1;
    private javax.swing.JTextField txtNumerodeFilas;
    private javax.swing.JTextField txtNumerodeFilas1;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
