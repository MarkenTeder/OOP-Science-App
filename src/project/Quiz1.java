/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;


import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Mark Hayden
 */

public class Quiz1 extends javax.swing.JFrame {
    
    
    private ArrayList <String> answers;
    private ArrayList <String> questions;
    private int count;
    private int marks;
    
    
    

    /**
     * Creates new form Quiz1
     */
    public Quiz1() {
        initComponents();
        answers = new ArrayList<String>();  
        questions = new ArrayList<String>();

        String q1 = "What is the breaking down of food?";
        String q2 = "What is the release of energy from food?";
        String q3 = "What is the removal of waste products from the body?";
        String q4 = "What is the release of an egg from the ovary?";
        String q5 = "What is the joining of the sperm and the egg to form a zygote?";
        String q6 = "What is the prevention of fertilisation?";
        String q7 = "What are animals that do not have backbones?";
        String q8 = "What are animals that do have backbones?";
        String q9 = "What is the loss of water from a plant?";
        String q10 = "What is the way in which green plants make food?";
        
        String a1 = "Digestion";
        String a2 = "Respiration";
        String a3 = "Excretion";
        String a4 = "Ovulation";
        String a5 = "Fertilisation";
        String a6 = "Contraception";
        String a7 = "Invertabrates";
        String a8 = "Vertabrates";
        String a9 = "Transpiration";
        String a10 = "Photosynthesis";
        
        questions.add(q1);
        questions.add(q2);
        questions.add(q3); 
        questions.add(q4); 
        questions.add(q5);
        questions.add(q6); 
        questions.add(q7); 
        questions.add(q8); 
        questions.add(q9); 
        questions.add(q10); 
        
        answers.add(a1);
        answers.add(a2);
        answers.add(a3);
        answers.add(a4);
        answers.add(a5);
        answers.add(a6);
        answers.add(a7);
        answers.add(a8);
        answers.add(a9);
        answers.add(a10);
        
        count = 0;
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        Yesbtn = new javax.swing.JButton();
        Nobtn = new javax.swing.JButton();
        lblQuestion = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(153, 153, 255));
        lblTitle.setText("Biology");

        Yesbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Yesbtn.setText("Yes I am");
        Yesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesbtnActionPerformed(evt);
            }
        });

        Nobtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nobtn.setText("No, take me back!");
        Nobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NobtnActionPerformed(evt);
            }
        });

        lblQuestion.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblQuestion.setForeground(new java.awt.Color(153, 153, 255));
        lblQuestion.setText("Are you ready to take/retake the Quiz?");

        lblMsg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(175, 175, 175))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblMsg)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Yesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Nobtn))
                            .addComponent(lblQuestion))))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblQuestion)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(lblMsg)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesbtnActionPerformed
        // TODO add your handling code here
        while(count < answers.size()){
           
            String inAnswer = JOptionPane.showInputDialog(null,questions.get(count));

            if(inAnswer.equals(answers.get(count))){
                JOptionPane.showMessageDialog(null,"Correct");
                marks = marks +1;
            }
            else{
                JOptionPane.showMessageDialog(null,"Incorrect");
            }
            count++;
     
            
        }
        
        QuizMarks obj1 = new QuizMarks();
        obj1.setValues(marks,1);
        int r;
        r = obj1.getProduct();
        this.lblMsg.setText("Your results are: " + String.valueOf(r) + "/10");
        
    }//GEN-LAST:event_YesbtnActionPerformed

    private void NobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NobtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new JCQuiz().setVisible(true);
    }//GEN-LAST:event_NobtnActionPerformed

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
            java.util.logging.Logger.getLogger(Quiz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Nobtn;
    private javax.swing.JButton Yesbtn;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
