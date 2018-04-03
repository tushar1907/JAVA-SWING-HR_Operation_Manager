/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Main;

import Business.Applicant.Applicant;
import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raj
 */
public class SignupFormPage2 extends javax.swing.JPanel {

    /**
     * Creates new form SignupForm
     */
    JPanel container;
    EcoSystem system;
    Applicant applicant;
    public SignupFormPage2(JPanel container,EcoSystem system,Applicant applicant) {
        initComponents();
        this.container= container;
        this.system=system;
        this.applicant=applicant;
    }

    

    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        al1 = new javax.swing.JTextField();
        zipcodeTF = new javax.swing.JTextField();
        countryTF = new javax.swing.JTextField();
        lTF = new javax.swing.JTextField();
        al2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cTF = new javax.swing.JTextField();
        sTF = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Step 2: Enter Your Address");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Addess Line 1:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Addess Line 2:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Landmark:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("State:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Country:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Zipcode:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, 20));

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 68, -1));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        al1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                al1ActionPerformed(evt);
            }
        });
        jPanel1.add(al1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 290, 30));

        zipcodeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipcodeTFActionPerformed(evt);
            }
        });
        jPanel1.add(zipcodeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 290, 30));

        countryTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryTFActionPerformed(evt);
            }
        });
        jPanel1.add(countryTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 290, 30));

        lTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lTFActionPerformed(evt);
            }
        });
        jPanel1.add(lTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 290, 30));

        al2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                al2ActionPerformed(evt);
            }
        });
        jPanel1.add(al2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 290, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Page 2 ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        cTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTFActionPerformed(evt);
            }
        });
        jPanel1.add(cTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 290, 30));

        sTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sTFActionPerformed(evt);
            }
        });
        jPanel1.add(sTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 290, 30));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void al1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_al1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_al1ActionPerformed

    private void zipcodeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipcodeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipcodeTFActionPerformed

    private void countryTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryTFActionPerformed

    private void lTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lTFActionPerformed

    private void al2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_al2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_al2ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void cTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTFActionPerformed

    private void sTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sTFActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
         String a1= al1.getText();
       String a2= al2.getText();
       String landmark = lTF.getText();
       String city = cTF.getText();
       String state= sTF.getText();
       String country = countryTF.getText();
       String zipcode = zipcodeTF.getText();
       
        //Applicant applicant= system.getApplicantDirectory().addApplicantAddress(a1, a2, landmark, city, country, state, zipcode);
        
        JOptionPane.showMessageDialog(nextButton,"Details Submitted Succesfully");
        SignupFormPage3 sufp3 = new SignupFormPage3(container,system,applicant);
       container.add("SignupForm",sufp3);
       CardLayout crdLyt = (CardLayout) container.getLayout();
       crdLyt.next(container);
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField al1;
    private javax.swing.JTextField al2;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cTF;
    private javax.swing.JTextField countryTF;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lTF;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField sTF;
    private javax.swing.JTextField zipcodeTF;
    // End of variables declaration//GEN-END:variables
}