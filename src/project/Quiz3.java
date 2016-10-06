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
public class Quiz3 extends javax.swing.JFrame {
    private ArrayList <String> answers;
    private ArrayList <String> questions;
    private int marks;
    private int total;
    private String feedback;
    
    
    private int count;

    /**
     * Creates new form Quiz3
     */
    public Quiz3() {
        initComponents();
        answers = new ArrayList<String>();  
        questions = new ArrayList<String>();

        String q1 = "What is the straight line distance between two points in space called?";
        String q2 = "What is the quantity of matter in a body called?";
        String q3 = "What is the quantity in which change happens called?";
        String q4 = "How do you measure of how hot or cold a body is?";
        String q5 = "What is the amount of surface that covers a body called?";
        String q6 = "How do you calculate it?";
        String q7 = "What is the amount of space taken up by a body called?";
        String q8 = "How do you calculate it?";
        String q9 = "A luminous body creates it's own what?";
        String q10 = "Name the rigid body that rotates around a fulcrum?";
        
        String a1 = "Length";
        String a2 = "Mass";
        String a3 = "Time";
        String a4 = "Temperature";
        String a5 = "Area";
        String a6 = "Length x Width";
        String a7 = "Volume";
        String a8 = "Length x Width x Height";
        String a9 = "Light";
        String a10 = "Lever";
        
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

        lblTiltle = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();
        Yesbtn = new javax.swing.JButton();
        Nobtn = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTiltle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblTiltle.setForeground(new java.awt.Color(153, 153, 255));
        lblTiltle.setText("Physics");

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

        Nobtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nobtn.setText("No, take me back!");
        Nobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NobtnActionPerformed(evt);
            }
        });

        lblMsg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(lblTiltle)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMsg)
                    .addComponent(lblQuestion)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Yesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(Nobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTiltle)
                .addGap(44, 44, 44)
                .addComponent(lblQuestion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Yesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(Nobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblMsg)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NobtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new JCQuiz().setVisible(true);
        
    }//GEN-LAST:event_NobtnActionPerformed

    private void YesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesbtnActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Quiz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Nobtn;
    private javax.swing.JButton Yesbtn;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblTiltle;
    // End of variables declaration//GEN-END:variables
}