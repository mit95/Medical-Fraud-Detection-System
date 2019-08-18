/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthInsurance.ClaimsOrganization;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfAdulteration;
import Business.Organization.HealthInsurance.ClaimsOrganization;
import Business.Organization.Hospital.PatientOrganization;
import Business.Organization.Organization;
import Business.Reimbursement;
import Business.ReimbursementDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ComplainWorkRequest;
import Business.WorkQueue.Insurnce_PatientWorkRequest;
import Business.WorkQueue.ROI_ClaimWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nikhi
 */
public class PatientInsuranceContentJPanel1 extends javax.swing.JPanel {
private EcoSystem business;
    private UserAccount userAccount;
    private DivisionOfAdulteration divisionAdulteration;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private ReimbursementDirectory reimbursementDirectoy;
    private ClaimsOrganization claimorg;
    private ROI_ClaimWorkRequest req;
    PatientOrganization patient;
    private String id;
    boolean flag;
    private String patient_InsuranceID;
    private int sum;
    
 PatientInsuranceContentJPanel1(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, ReimbursementDirectory reimbursementDirectoy, ClaimsOrganization claimorg ,EcoSystem business, String patient_InsuranceID) 
 {
         initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.business = business;
        this.claimorg = new ClaimsOrganization();
        this.claimorg = claimorg;
        this.patient = patient;
        this.id = patient_InsuranceID;
        populateClaimTable();    
    }
    
    public void populateClaimTable()
    {   
        DefaultTableModel model = (DefaultTableModel) tblReimburse.getModel();
        model.setRowCount(0);
        for(Reimbursement reimb : claimorg.getWorkQueue().getReimbursementDir())
        {           
            if( flag == false)
            {
         patient_InsuranceID = reimb.getPatientID();
            flag = true;
            }
       if (reimb.getPatientID().equals(patient_InsuranceID))
       {
       Object[] row = new Object[5];
       row[0] = reimb.getPatientID();
       row[1] = reimb.getTypeOfReimbursement();
       row[2] = reimb.getDate();
       row[3] = reimb.getAmount();
//       row[4] = 
       sum = sum + reimb.getAmount();
       model.addRow(row);
        }            
    }
         flag = false;   
    }
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblReimburse = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(210, 247, 247));

        tblReimburse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Type of Reimbursement", "Date", "Amount", "Sent By"
            }
        ));
        jScrollPane1.setViewportView(tblReimburse);

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Request Patient for Claim Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(210, 247, 247));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setText("Patient Insurance Content");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)))
                .addGap(101, 101, 101)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addContainerGap(356, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ClaimsOfficerWorkAreaJPanel pwjp = (ClaimsOfficerWorkAreaJPanel) component;
        pwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
//        RequestPatientReport RequestPatientReport = new RequestPatientReport(userProcessContainer, userAccount,patient, enterprise,business,patient_InsuranceID);
//        userProcessContainer.add("RequestPatientReport",RequestPatientReport);
//        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblReimburse;
    // End of variables declaration//GEN-END:variables

   
}
