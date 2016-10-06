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
public class Quiz2 extends javax.swing.JFrame {
    private ArrayList <String> answers;
    private ArrayList <String> questions;
    private int marks;
    private int total;
    private String feedback;
    
    
    private int count;

    /**
     * Creates new form Quiz2
     */
    public Quiz2() {
        initComponents();
        answers = new ArrayList<String>();  
        questions = new ArrayList<String>();

        String q1 = "What is a mixture of metals?";
        String q2 = "What is a mixture of a solute and a solvent?";
        String q3 = "What is a change in which no new substance is formed?";
        String q4 = "What is a change in which at least one new substance is formed?";
        String q5 = "What is a substance that burns in oxygen to produce heat?";
        String q6 = "What is an atom which has lost or gained electrons?";
        String q7 = "What are substances made up of only one type of atom?";
        String q8 = "What are made up of two atoms chemically combined?";
        String q9 = "What are made up of two or more elements chemically combined?";
        String q10 = "When crystals are formed by cooling a saturated solution it's called?";
        
        String a1 = "Alloy";
        String a2 = "Solution";
        String a3 = "Physical Change";
        String a4 = "Chemical Change";
        String a5 = "Fuel";
        String a6 = "Ion";
        String a7 = "Elements";
        String a8 = "Molecules";
        String a9 = "Compounds";
        String a10 = "Crystallisation";
        
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
        lblQuestion = new javax.swing.JLabel();
        Yesbtn = new javax.swing.JButton();
        Notbtn = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(540, 458));

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(153, 153, 255));
        lblTitle.setText("Chemistry");

        lblQuestion.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblQuestion.setForeground(new java.awt.Color(153, 153, 255));
        lblQuestion.setText("Are you ready to take/retake the Quiz?");

        Yesbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Yesbtn.setText("Yes I am");
        Yesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesbtnActionPerformed(evt);
            }
        });

        Notbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Notbtn.setText("No, take me back!");
        Notbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotbtnActionPerformed(evt);
            }
        });

        lblMsg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuestion)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMsg)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Yesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(Notbtn)))))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblQuestion)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Notbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lblMsg)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NotbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new JCQuiz().setVisible(true);
    }//GEN-LAST:event_NotbtnActionPerformed

    private void YesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesbtnActionPerformed
        // TODO add your handling code here:
        
        while(count < answers.size()){
           

            String inAnswer = JOptionPane.showInputDialog(null,questions.get(count));

            if(inAnswer.equals(answers.get(count))){
                JOptionPane.showMessageDialog(null,"Correct");
                marks = marks +1;
            }
            else{
                JOptionPane.showMessageDialog(null,"Incorect");
            }
            count++;
        }
        
        QuizMarks obj1 = new QuizMarks();
        obj1.setValues(marks,1);
        int r;
        r = obj1.getProduct();
        this.lblMsg.setText("Your results are: " + String.valueOf(r) + "/10");
    }//GEN-LAST:event_YesbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Quiz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Notbtn;
    private javax.swing.JButton Yesbtn;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
