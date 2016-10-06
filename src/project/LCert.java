/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import project.ScienceAppUI;
import java.awt.Color;


/**
 *
 * @author Mark Hayden
 */
public class LCert extends javax.swing.JFrame {

    /**
     * Creates new form LCert
     */
    public LCert() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        physicsBtnGroup = new javax.swing.ButtonGroup();
        biologyBtnGroup = new javax.swing.ButtonGroup();
        chemistryBtnGroup = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblOption = new javax.swing.JLabel();
        Backbtn = new javax.swing.JButton();
        Phybtn = new javax.swing.JButton();
        Biobtn = new javax.swing.JButton();
        Chembtn = new javax.swing.JButton();
        btnPhysicsHL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(153, 153, 255));
        lblTitle.setText("Leaving Cert Science");

        lblOption.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblOption.setForeground(new java.awt.Color(153, 153, 255));
        lblOption.setText("Please choose an option:");

        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        Phybtn.setText("PhysicsOL");
        Phybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhybtnActionPerformed(evt);
            }
        });

        Biobtn.setText("Biology");
        Biobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiobtnActionPerformed(evt);
            }
        });

        Chembtn.setText("Chemistry");
        Chembtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChembtnActionPerformed(evt);
            }
        });

        btnPhysicsHL.setText("PhysicsHL");
        btnPhysicsHL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhysicsHLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Backbtn)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Phybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Biobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Chembtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOption)
                            .addComponent(lblTitle)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPhysicsHL, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Backbtn)
                .addGap(11, 11, 11)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOption)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Biobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Phybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chembtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPhysicsHL, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
        new ScienceAppUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackbtnActionPerformed

    private void ChembtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChembtnActionPerformed
        // TODO add your handling code here:
        new ChemMain().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChembtnActionPerformed

    private void PhybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhybtnActionPerformed
        // TODO add your handling code here:
        new PhysicsLcOl().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PhybtnActionPerformed

    private void BiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiobtnActionPerformed
        // TODO add your handling code here:
        new BiologyLcOl().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BiobtnActionPerformed

    private void btnPhysicsHLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhysicsHLActionPerformed
        // TODO add your handling code here:
        new PhysicsLcHl().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPhysicsHLActionPerformed

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
            java.util.logging.Logger.getLogger(LCert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LCert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LCert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LCert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LCert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton Biobtn;
    private javax.swing.JButton Chembtn;
    private javax.swing.JButton Phybtn;
    private javax.swing.ButtonGroup biologyBtnGroup;
    private javax.swing.JButton btnPhysicsHL;
    private javax.swing.ButtonGroup chemistryBtnGroup;
    private javax.swing.JLabel lblOption;
    private javax.swing.JLabel lblTitle;
    private javax.swing.ButtonGroup physicsBtnGroup;
    // End of variables declaration//GEN-END:variables
}
