/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador_sintactico;

import javax.swing.JOptionPane;

/**
 *
 * @author Mabel
 */
public class Analizador_Sintáctico extends javax.swing.JFrame {

    /**
     * Creates new form Analizador_Sintáctico
     */
    public Analizador_Sintáctico() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtcaracteres.setText("{3)");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcaracteres = new javax.swing.JTextField();
        BtnAnalizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 153));

        txtcaracteres.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N

        BtnAnalizar.setBackground(new java.awt.Color(204, 204, 204));
        BtnAnalizar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        BtnAnalizar.setText("Analizador Sintáctico");
        BtnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnalizarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcaracteres)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAnalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(txtcaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BtnAnalizar.getAccessibleContext().setAccessibleName("BtnAnSint");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnalizarActionPerformed
        if (Analizar_Cadena()) {
            JOptionPane.showMessageDialog(null, "Carácteres correctos");
        } else {
            JOptionPane.showMessageDialog(null, "Carácteres INCORRECTOS");
        }
    }//GEN-LAST:event_BtnAnalizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtcaracteres.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Analizador_Sintáctico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analizador_Sintáctico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analizador_Sintáctico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analizador_Sintáctico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analizador_Sintáctico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnalizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField txtcaracteres;
    // End of variables declaration//GEN-END:variables

    public boolean Analizar_Cadena() {

        Analizador analizador = new Analizador();
        String Cadena = txtcaracteres.getText();

        for (int i = 0; i < Cadena.length(); i++) {

            //Recuperar un caracter dependiendo la posición
            if (Cadena.charAt(i) == '(' || Cadena.charAt(i) == '[' || Cadena.charAt(i) == '{') {
                analizador.caracteres_ingresados(Cadena.charAt(i));
            } else {
                if (Cadena.charAt(i) == ')') {
                    if (analizador.extraer_caracteres() != '(') {
                        return false;
                    }
                } else {
                    if (Cadena.charAt(i) == '[') {
                        if (analizador.extraer_caracteres() != '[') {
                            return false;
                        }
                    } else {

                        if (Cadena.charAt(i) == '}') {
                            if (analizador.extraer_caracteres() != '{') {
                                return false;
                            }
                        }

                    }

                }
            }

        }

        return analizador.Comprobar_Cadena_Vacia();
    }
}
