/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital.Patient;


import userinterface.Hospital.Releaseinfo.*;
import Business.Reimbursement;
import Business.ReimbursementDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nikhi
 */
public class PatientEditClaimJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirplaneUpdateJPanel
     */
    private Reimbursement reim ;
    private JPanel userProcessContainer;
    private ReimbursementDirectory reimdir;
   

    PatientEditClaimJPanel(JPanel userProcessContainer, Reimbursement reim ) {
         initComponents();
        this.userProcessContainer = userProcessContainer;
        this.reim = reim;
        populate_data();
    }
    
    public void populate_data()
    {
        PatientTxt.setText(reim.getPatientID());
        reimbuTxt.setText(reim.getTypeOfReimbursement());
       CreatedDatetxt.setText(reim.getDate());
       //AmtTxt.setText(Integer.parseInt(reim.getAmount()));

    PatientTxt.setEnabled(false);
    reimbuTxt.setEnabled(false);
    CreatedDatetxt.setEnabled(false);
      AmtTxt.setEnabled(false);
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        PatientLbl = new javax.swing.JLabel();
        airplaneType = new javax.swing.JLabel();
        startTime = new javax.swing.JLabel();
        toLocation = new javax.swing.JLabel();
        PatientTxt = new javax.swing.JTextField();
        reimbuTxt = new javax.swing.JTextField();
        CreatedDatetxt = new javax.swing.JTextField();
        AmtTxt = new javax.swing.JTextField();
        Label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(210, 247, 247));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnUpdate.setText("Update Reimbursement Details");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSave.setText("Save Reimbursement Details");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        PatientLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        PatientLbl.setText("Patient ID");

        airplaneType.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        airplaneType.setText("Type of Reimbursement");

        startTime.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        startTime.setText("Date");

        toLocation.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        toLocation.setText("Amount");

        PatientTxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        PatientTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientTxtActionPerformed(evt);
            }
        });

        reimbuTxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        reimbuTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reimbuTxtActionPerformed(evt);
            }
        });

        CreatedDatetxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CreatedDatetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatedDatetxtActionPerformed(evt);
            }
        });

        AmtTxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        AmtTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmtTxtActionPerformed(evt);
            }
        });

        Label.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Label.setText("Reimbursement Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnBack1)
                        .addGap(212, 212, 212)
                        .addComponent(Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnSave)
                        .addGap(200, 200, 200)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CreatedDatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(airplaneType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(reimbuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(toLocation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PatientLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PatientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(391, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnBack1)))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientLbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reimbuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airplaneType))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CreatedDatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startTime))
                        .addGap(18, 18, 18)
                        .addComponent(AmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(toLocation))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:        
       String ReimbursementType = reimbuTxt.getText();
       String Date = CreatedDatetxt.getText();
       int Amount = Integer.parseInt(AmtTxt.getText());

      if(ReimbursementType.isEmpty() || Date.isEmpty())      
       {
        JOptionPane.showMessageDialog(null,"All fields are mandatory !!");
       }
       else{
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        reim.setPatientID(PatientTxt.getText());
       reim.setTypeOfReimbursement(ReimbursementType);
       reim.setDate(Date);
       reim.setAmount(Amount);
        JOptionPane.showMessageDialog(null,"Reimbursement Details created !!");
        }
      
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
      btnSave.setEnabled(true);
      btnUpdate.setEnabled(false);
      PatientTxt.setEnabled(true);
      reimbuTxt.setEnabled(true);
      CreatedDatetxt.setEnabled(true);
      AmtTxt.setEnabled(true);
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void AmtTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmtTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmtTxtActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] components = userProcessContainer.getComponents();
        for(Component c : components){
            if(c instanceof ClaimHospitalReimbursJPanel)
            {
                ClaimHospitalReimbursJPanel mp = (ClaimHospitalReimbursJPanel)c;
                mp.populate_table();
            }
        }
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void reimbuTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reimbuTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reimbuTxtActionPerformed

    private void CreatedDatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatedDatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreatedDatetxtActionPerformed

    private void PatientTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmtTxt;
    private javax.swing.JTextField CreatedDatetxt;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel PatientLbl;
    private javax.swing.JTextField PatientTxt;
    private javax.swing.JLabel airplaneType;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField reimbuTxt;
    private javax.swing.JLabel startTime;
    private javax.swing.JLabel toLocation;
    // End of variables declaration//GEN-END:variables

 
}
