
package ventanas;

public class ventanaInicial extends javax.swing.JFrame {

    private String usuario1, usuario2;
    
    public ventanaInicial() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etNombre = new javax.swing.JLabel();
        etNombre1 = new javax.swing.JLabel();
        etNombre2 = new javax.swing.JLabel();
        boxNombre1 = new javax.swing.JTextField();
        boxNombre2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        etMuestra1 = new javax.swing.JLabel();
        etMuestra2 = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        btnComenzar.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etNombre.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etNombre.setText("Tres en Raya");
        jPanel1.add(etNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 600, -1));

        etNombre1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        etNombre1.setText("Jugador 1: ");
        jPanel1.add(etNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 134, -1, -1));

        etNombre2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        etNombre2.setText("Jugador 2: ");
        jPanel1.add(etNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 213, -1, -1));

        boxNombre1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        boxNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(boxNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 131, 300, -1));

        boxNombre2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(boxNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 210, 300, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3enraya.gif"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 268, -1, -1));

        etMuestra1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        etMuestra1.setText(" ");
        jPanel1.add(etMuestra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 319, -1, -1));

        etMuestra2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        etMuestra2.setText(" ");
        jPanel1.add(etMuestra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 389, -1, -1));

        btnComenzar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnComenzar.setText("Comenzar Juego");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxNombre1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        usuario1=boxNombre1.getText();
        usuario2=boxNombre2.getText();
        
        btnGuardar.setVisible(false);
        etMuestra1.setText("Inicia "+usuario1+" con X");
        etMuestra2.setText("Después "+usuario2+" con O");
        btnComenzar.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        ventanaPrincipal ventP = new ventanaPrincipal(usuario1, usuario2);
        ventP.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnComenzarActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxNombre1;
    private javax.swing.JTextField boxNombre2;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel etMuestra1;
    private javax.swing.JLabel etMuestra2;
    private javax.swing.JLabel etNombre;
    private javax.swing.JLabel etNombre1;
    private javax.swing.JLabel etNombre2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
