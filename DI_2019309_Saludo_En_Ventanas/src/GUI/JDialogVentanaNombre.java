/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Gonzalo
 */
public class JDialogVentanaNombre extends javax.swing.JDialog {
    
    private JFrameVentanaPrincipal ventanaPrincipal;
    
    /**
     * Creates new form JDialogVentanaNombre
     */
    public JDialogVentanaNombre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ventanaPrincipal = (JFrameVentanaPrincipal) parent;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1_Volver = new javax.swing.JButton();
        jTextField1_Saludo = new javax.swing.JTextField();
        jLabel1_Nombre = new javax.swing.JLabel();
        jLabel1_Error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1_Volver.setText("MOSTRAR SALUDO");
        jButton1_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_VolverMouseClicked(evt);
            }
        });

        jTextField1_Saludo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_SaludoActionPerformed(evt);
            }
        });

        jLabel1_Nombre.setText("¿Cómo te llamas?");

        jLabel1_Error.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1_Error.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1_Error.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1_Saludo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1_Volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(jLabel1_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1_Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1_Saludo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1_Error, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_VolverMouseClicked
        if(jTextField1_Saludo.getText().isEmpty()){
           jLabel1_Error.setText("No has introducido el nombre, introdúcelo.");
        } else{
            ventanaPrincipal.mostrarSaludo(jTextField1_Saludo.getText());
            //dispose();
            setVisible(false);
        }
    }//GEN-LAST:event_jButton1_VolverMouseClicked

    private void jTextField1_SaludoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_SaludoActionPerformed
        if(jTextField1_Saludo.getText().isEmpty()){
           jLabel1_Error.setText("No has introducido el nombre, introdúcelo.");
        } else{
            ventanaPrincipal.mostrarSaludo(jTextField1_Saludo.getText());
            dispose();
            setVisible(false);
        }
    }//GEN-LAST:event_jTextField1_SaludoActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Volver;
    private javax.swing.JLabel jLabel1_Error;
    private javax.swing.JLabel jLabel1_Nombre;
    private javax.swing.JTextField jTextField1_Saludo;
    // End of variables declaration//GEN-END:variables
}
