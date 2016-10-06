/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mark Hayden
 */
public class GlossaryGUI extends javax.swing.JFrame {
    private String name;
    private String term;
    private String study;
    
    private ArrayList <Glossary> gList;
    private int count;

    /**
     * Creates new form Glossary
     */
    public GlossaryGUI() {
        initComponents();
        gList = new ArrayList <>();
        name = new String();
        term = new String();
        study = new String();
        count = 0;
    }
    
    private void writeObjectToFile(){
        try{
            File f = new File("output.txt");
            FileOutputStream fow = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fow);
            
            oos.writeObject(gList);
            
            fow.close();
            oos.close();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    private void readObjectFromFile(){
        try{
            File f = new File("output.txt");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<Glossary> arr = new ArrayList<>();
            
            arr = (ArrayList<Glossary>) ois.readObject();
            
            gList = arr;
            ois.close();
            fis.close();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackBtn = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblTerm = new javax.swing.JLabel();
        lblSubject = new javax.swing.JLabel();
        Nametf = new javax.swing.JTextField();
        Termtf = new javax.swing.JTextField();
        Studytf = new javax.swing.JTextField();
        Addbtn = new javax.swing.JButton();
        Search1btn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        Displaybtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(153, 153, 255));
        lblTitle.setText("Glossary");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setText("Name of Term:");

        lblTerm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTerm.setText("Term Definition:");

        lblSubject.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubject.setText("Subject of Study:");

        Nametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NametfActionPerformed(evt);
            }
        });

        Addbtn.setText("Add");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        Search1btn.setText("Search Terms");
        Search1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1btnActionPerformed(evt);
            }
        });

        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        Displaybtn.setText("Display All");
        Displaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplaybtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTerm)
                            .addComponent(lblName)
                            .addComponent(lblSubject))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Nametf, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(Studytf))
                            .addComponent(Termtf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Addbtn)
                        .addGap(18, 18, 18)
                        .addComponent(Search1btn)
                        .addGap(18, 18, 18)
                        .addComponent(Deletebtn)
                        .addGap(18, 18, 18)
                        .addComponent(Displaybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblName)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTerm)
                            .addComponent(Termtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSubject)
                            .addComponent(Studytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addbtn)
                    .addComponent(Search1btn)
                    .addComponent(Deletebtn)
                    .addComponent(Displaybtn))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new JCStudy().setVisible(true);

    }//GEN-LAST:event_BackBtnActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
         name = Nametf.getText();
         term = Termtf.getText();
         study = Studytf.getText();
     
        //create a new Assessment object
        Glossary a = new Glossary();
        
        //add contents of textfields to q
        a.setName(name);
        a.setTerm(term);
        a.setStudy(study);
        
        
        //add q to array of Assessment objects
        gList.add(a);
        //increase count to show that another object has been added to the array
        count++;
        
        Nametf.setText("");
        Termtf.setText("");
        Studytf.setText("");
        
        writeObjectToFile();
        
        
        
    }//GEN-LAST:event_AddbtnActionPerformed

    private void Search1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1btnActionPerformed
        // TODO add your handling code here:
        String SearchType = JOptionPane.showInputDialog(null,"Enter Term: ");
        
        for(int i = 0; i < gList.size();i++){
            if(SearchType.equalsIgnoreCase(gList.get(i).getTerm())){
                 JOptionPane.showMessageDialog(null, "Subject Name: "+gList.get(i).getName()+"\n Definition of Term: "+gList.get(i).getTerm()+"\n Subject of Study: "+gList.get(i).getStudy());
            }
            if(!SearchType.equalsIgnoreCase(gList.get(i).getTerm())){
                JOptionPane.showMessageDialog(null,"Entry not found");
            }
        }
    }//GEN-LAST:event_Search1btnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
        String question = JOptionPane.showInputDialog(null,"Delete File?");
        
        
         File f = new File("output.txt");
         if (f.exists()) {
             f.delete();
             JOptionPane.showMessageDialog(null,"File Gone");
         }
         
         for(int i = 0; i<gList.size() ;i++){
             gList.remove(i);
         }
         
    
         
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void DisplaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplaybtnActionPerformed
        // TODO add your handling code here:
        readObjectFromFile(); 
        for(int i = 0; i < gList.size();i++){
             if(gList.size()>=0){
                 JOptionPane.showMessageDialog(null, "Subject Name: "+gList.get(i).getName()+"\n Definition of Term: "+gList.get(i).getTerm()+"\n Subject of Study: "+gList.get(i).getStudy());
            }
             else{
                 JOptionPane.showMessageDialog(null,"No entries found");
             } 
         }
    }//GEN-LAST:event_DisplaybtnActionPerformed

    private void NametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NametfActionPerformed

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
            java.util.logging.Logger.getLogger(GlossaryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlossaryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlossaryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlossaryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlossaryGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Displaybtn;
    private javax.swing.JTextField Nametf;
    private javax.swing.JButton Search1btn;
    private javax.swing.JTextField Studytf;
    private javax.swing.JTextField Termtf;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel lblTerm;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
