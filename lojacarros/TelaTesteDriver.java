/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lojacarros;

import java.awt.Color;

/**
 *
 * @author maycon.mssouza
 */
public class TelaTesteDriver extends javax.swing.JFrame {
public Carro MeuCarro;
    /**
     * Creates new form TelaTesteDriver
     */
    public TelaTesteDriver() {
        initComponents();
        MeuCarro = new Carro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        mnuCorBranca = new javax.swing.JMenuItem();
        pnlVelocidade = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblVelocidade = new javax.swing.JLabel();
        btnAcerelar = new javax.swing.JButton();
        btnFrear = new javax.swing.JButton();

        jMenu1.setText("alterar cor de fundo");

        mnuCorBranca.setText("jMenuItem1");
        mnuCorBranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCorBrancaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCorBranca);

        jPopupMenu1.add(jMenu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlVelocidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlVelocidade.setToolTipText("");
        pnlVelocidade.setComponentPopupMenu(jPopupMenu1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/velocidade.png"))); // NOI18N

        javax.swing.GroupLayout pnlVelocidadeLayout = new javax.swing.GroupLayout(pnlVelocidade);
        pnlVelocidade.setLayout(pnlVelocidadeLayout);
        pnlVelocidadeLayout.setHorizontalGroup(
            pnlVelocidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVelocidadeLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlVelocidadeLayout.setVerticalGroup(
            pnlVelocidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVelocidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Velocimetro"));
        jPanel2.setToolTipText("");

        lblVelocidade.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblVelocidade.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblVelocidade)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblVelocidade)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        btnAcerelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seta-cima.png"))); // NOI18N
        btnAcerelar.setText("Acelerar");
        btnAcerelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAcerelar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnAcerelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcerelarActionPerformed(evt);
            }
        });

        btnFrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seta-baixo.png"))); // NOI18N
        btnFrear.setText("Frear");
        btnFrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFrear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAcerelar, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(pnlVelocidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnAcerelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFrearActionPerformed

    private void btnAcerelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcerelarActionPerformed
    int velocidade = MeuCarro.acelerar();
    lblVelocidade.setText(String.valueOf(velocidade));
    }//GEN-LAST:event_btnAcerelarActionPerformed

    private void mnuCorBrancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCorBrancaActionPerformed
       pnlVelocidade.setBackground(Color.white);
    }//GEN-LAST:event_mnuCorBrancaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTesteDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTesteDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTesteDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTesteDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTesteDriver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcerelar;
    private javax.swing.JButton btnFrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblVelocidade;
    private javax.swing.JMenuItem mnuCorBranca;
    private javax.swing.JPanel pnlVelocidade;
    // End of variables declaration//GEN-END:variables
}
