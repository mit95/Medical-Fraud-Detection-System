/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthInsurance.ClaimsOrganization;

import userinterface.DepartmentOfPublicHealth.AdulterationOfficer.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfAdulteration;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfInsurance;
import Business.Organization.HealthInsurance.ClaimsOrganization;
import Business.Organization.Organization;
import Business.Reimbursement;
import Business.ReimbursementDirectory;
import Business.UserAccount.UserAccount;
//import Business.WorkQueue.Claim_DepartmentWorkRequest;
import Business.WorkQueue.ComplainWorkRequest;
import Business.WorkQueue.InsuranceWorkRequest;
import Business.WorkQueue.ROI_ClaimWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Hospital.Releaseinfo.ClaimStatusJPanel;

/**
 *
 * @author mitka
 */
public class ClaimsOfficerWorkAreaJPanel extends javax.swing.JPanel {

    private EcoSystem business;
    private UserAccount userAccount;
    private ClaimsOrganization claimorg;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private ROI_ClaimWorkRequest request;
   private ReimbursementDirectory reimbursementDirectoy;
//   private DivisionOfInsurance DivInsOrg;
   private String PatientId;
   private boolean flag;
   private String PatientMedicalId;
   private boolean assign;
    /**
     * Creates new form AdulterationOfficerWorkAreaJPanel
     */
   public ClaimsOfficerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ClaimsOrganization organization, Enterprise enterprise, EcoSystem business, ReimbursementDirectory reimbursementDirectoy ) {     
   initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.business = business;
        this.claimorg = (ClaimsOrganization)organization;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) StatusJTable.getModel();
        model.setRowCount(0);
        for(ROI_ClaimWorkRequest request : claimorg.getWorkQueue().getROI_ClaimWorkRequestList())
        {
            Object[]row = new Object[6];
            row[0] = request;
            row[1] = request.getPatientID();
            row[2] = request.getSender().getEmployee().getName();
            row[3] = request.getReceiver() == null ?null:request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            String result = ((ROI_ClaimWorkRequest) request).getFraudDetected();
            row[5] = result == null ? "Waiting for Acknowledgement" : result;
            model.addRow(row);
        }
        for(ROI_ClaimWorkRequest request1 : userAccount.getWorkQueue().getROI_ClaimWorkRequestList())
        {
            Object[]row = new Object[5];
            row[0] = request1;
            row[1] = request1.getPatientID();
            row[2] = request1.getSender().getEmployee().getName();
            row[3] = request1.getReceiver() == null ?null:request1.getReceiver().getEmployee().getName();
            row[4] = request1.getStatus();
            String result = ((ROI_ClaimWorkRequest) request).getFraudDetected();
            row[5] = result == null ? "Waiting for Acknowledgement" : result;
            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        assignBtn = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        enterpriseNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        StatusJTable = new javax.swing.JTable();
        CheckContectBtn1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(210, 247, 247));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("ENTERPRISE :");

        refreshBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        assignBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        assignBtn.setText("Assign to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        processBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        processBtn.setText("Process");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });

        StatusJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "PatientID", "Sender", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(StatusJTable);

        CheckContectBtn1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CheckContectBtn1.setText("Check the Content");
        CheckContectBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckContectBtn1ActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(210, 247, 247));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setText("CLAIMS OFFICER WORK REQUESTS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backBtn)
                        .addGap(112, 112, 112)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(refreshBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(CheckContectBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(refreshBtn)
                        .addComponent(backBtn))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(77, 77, 77)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckContectBtn1)
                    .addComponent(processBtn)
                    .addComponent(assignBtn))
                .addContainerGap(386, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = StatusJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        request = (ROI_ClaimWorkRequest)StatusJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
    }//GEN-LAST:event_assignBtnActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = StatusJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
       request = (ROI_ClaimWorkRequest)StatusJTable.getValueAt(selectedRow, 0); 
       request.setStatus("Processing");
        populateTable();   
    }//GEN-LAST:event_processBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void CheckContectBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckContectBtn1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = StatusJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        else
        {      
         request = (ROI_ClaimWorkRequest) StatusJTable.getValueAt(selectedRow, 0); 
        
         
         if (request.getReceiver() != null)
         {
             String PatientID = request.getPatientID();
             //nm
             
              request.setFraudDetected("Request sent to Patient");
              //nm
         for(ROI_ClaimWorkRequest request : claimorg.getWorkQueue().getROI_ClaimWorkRequestList())
         {
         if(request.getPatientID().equals(PatientID))
         {
         PatientMedicalId = request.getMedicalId();
         }
         }
         InsuranceContentJPanel InsuranceContent = new InsuranceContentJPanel(userProcessContainer,userAccount ,enterprise , reimbursementDirectoy , claimorg  ,business,PatientID,PatientMedicalId,request );
         userProcessContainer.add("ClaimStatus", InsuranceContent);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);  
            }
            else{
                JOptionPane.showMessageDialog(null, "Please assign the request");
            }
        }  
    }//GEN-LAST:event_CheckContectBtn1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckContectBtn1;
    private javax.swing.JTable StatusJTable;
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField enterpriseNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton processBtn;
    private javax.swing.JButton refreshBtn;
    // End of variables declaration//GEN-END:variables
}
