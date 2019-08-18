/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthInsurance.ClaimsOrganization;

import Business.EcoSystem;
import Business.Enterprise.DepartmentOfPublicHealthEnterprise;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.DepartmentOfPublicHealth;
import Business.Network.Network;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfAdulteration;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfInsurance;
import Business.Organization.HealthInsurance.ClaimsOrganization;
import Business.Organization.Hospital.PatientOrganization;
import Business.Organization.Organization;
import Business.Reimbursement;
import Business.ReimbursementDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Claim_DeptHealthInsuranceWorkRequest;
import Business.WorkQueue.ComplainWorkRequest;
import Business.WorkQueue.Insurnce_PatientWorkRequest;
import Business.WorkQueue.ROI_ClaimWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DepartmentOfPublicHealth.InsuranceOfficer.DeptHealthInsuranceDashboardJPanel;
import userinterface.DepartmentOfPublicHealth.InsuranceOfficer.ProcessInsuranceFraudJPanel;

/**
 *
 * @author nikhi
 */
public class InsuranceContentJPanel extends javax.swing.JPanel {
private EcoSystem business;
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private ReimbursementDirectory reimbursementDirectoy;
    private ClaimsOrganization claimorg;
    private ROI_ClaimWorkRequest req;
    private ROI_ClaimWorkRequest request;
    private PatientOrganization patient;
    private String id;
    boolean flag;
    private int sum;
    private String PatientMedicalID;
    private DivisionOfInsurance divInsorg;
     Claim_DeptHealthInsuranceWorkRequest claim_health_req;
   
 InsuranceContentJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, ReimbursementDirectory reimbursementDirectoy, ClaimsOrganization claimorg , EcoSystem business, String patient_InsuranceID , String PatientMedicalId, ROI_ClaimWorkRequest request) 
     {
         initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.business = business;
        this.claimorg = new ClaimsOrganization();
        this.claimorg = claimorg;
        this.request = request;
        this.patient = new PatientOrganization();
        this.patient = patient;
        this.id = patient_InsuranceID;
        this.PatientMedicalID = PatientMedicalId;
        this.req = new ROI_ClaimWorkRequest();
        this.divInsorg = new DivisionOfInsurance();
        this.divInsorg = divInsorg;
        this.claim_health_req = new Claim_DeptHealthInsuranceWorkRequest();
        populateClaimTable();    
        populate_disable_btn(); 
      
 }
    
 
 public void populate_disable_btn()
 {
// RequestPatientBtn.setEnabled(false);
//     SendBtn.setEnabled(false);
 }
    public void populateClaimTable()
            
    {          
        /// Hospital Claim Table
        DefaultTableModel model = (DefaultTableModel) tblReimburse1.getModel();
        model.setRowCount(0);
        
         DefaultTableModel model1 = (DefaultTableModel) PatientClaimTbl.getModel();
         model1.setRowCount(0); 
        
        for(Reimbursement reimb : claimorg.getWorkQueue().getReimbursementDir())
        {                       
       if((reimb.getPatientID().equals(id)) && (reimb.getSending_Organization().equals("Hospital Organization")))
       {
       Object[] row = new Object[5];
       row[0] = reimb;//;.getPatientID();
       row[1] = reimb.getTypeOfReimbursement();
       row[2] = reimb.getDate();
       row[3] = reimb.getAmount();
       row[4] = reimb.getSending_Organization();
       sum = sum + reimb.getAmount();
       String check = reimb.getSending_Organization();
       model.addRow(row);
       
        }  
       
       /// Patient Claim Table
      if((reimb.getPatientID().equals(id))  && (reimb.getSending_Organization().equals("Patient Organization")))
       {
       RequestPatientBtn.setEnabled(false);
       SendBtn.setEnabled(true);
       Object[] row1 = new Object[5];
       row1[0] = reimb;//.getPatientID();
       row1[1] = reimb.getTypeOfReimbursement();
       row1[2] = reimb.getDate();
       row1[3] = reimb.getAmount();
       row1[4] = reimb.getSending_Organization();
       sum = sum + reimb.getAmount();
       model1.addRow(row1);
        } 
      else
      {
          SendBtn.setEnabled(false);
      }
      
    }
         flag = false;        
    }
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PatientClaimTbl = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        SendBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReimburse1 = new javax.swing.JTable();
        RequestPatientBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(210, 247, 247));

        PatientClaimTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Type of Reimbursement", "Date", "Amount", "Sent By"
            }
        ));
        jScrollPane1.setViewportView(PatientClaimTbl);

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        SendBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SendBtn.setText("Send Insurance Department for Verification");
        SendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendBtnActionPerformed(evt);
            }
        });

        tblReimburse1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Type of Reimbursement", "Date", "Amount", "Sent By"
            }
        ));
        jScrollPane2.setViewportView(tblReimburse1);

        RequestPatientBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        RequestPatientBtn.setText("Request Patient for Claim Report");
        RequestPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestPatientBtnActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(210, 247, 247));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setText("Insurance Details : Patient and Hospital");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(RequestPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(RequestPatientBtn)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(SendBtn)
                .addContainerGap(70, Short.MAX_VALUE))
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

    private void SendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendBtnActionPerformed

        for(Network network: business.getNetworkList()){
            for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof DepartmentOfPublicHealthEnterprise){
                    for(Organization loopOrg:e.getOrganizationDirectory().getOrganizationList()){
                        if(loopOrg instanceof DivisionOfInsurance){
                            divInsorg =  (DivisionOfInsurance) loopOrg;
                            break;
                        }                      
                    }
                }
            }
        }

         Claim_DeptHealthInsuranceWorkRequest claim_health_req = new Claim_DeptHealthInsuranceWorkRequest();
         claim_health_req.setMessage("Verification needed for Medi claim for Meidcal ID " + PatientMedicalID );
         claim_health_req.setMedicalId(PatientMedicalID);
         claim_health_req.setPatientID(id);
         claim_health_req.setStatus("Sent");
         claim_health_req.setSender(userAccount);
         claim_health_req.setReimb(reimbursementDirectoy);
         claim_health_req.setHospEnterprise(request.getEnterpriseName());
         divInsorg.getWorkQueue().getClaim_HealthInsuranceWorkRequest().add(claim_health_req);
         
         req.setMessage("Request for Verification sent to Department of Health Insurance");
         req.setPatientID(PatientMedicalID);
         req.setStatus("Sent");
         req.setSender(userAccount);
         claimorg.getWorkQueue().getROI_ClaimWorkRequestList().add(req);
       
         JOptionPane.showMessageDialog(null, "Details sent for Verification to Health Department");
     
    }//GEN-LAST:event_SendBtnActionPerformed

    private void RequestPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestPatientBtnActionPerformed
//        int selectedRow = tblReimburse1.getSelectedRow();
//        if(selectedRow<0){
//            JOptionPane.showMessageDialog(null, "Please select a row");
//        }
//        else{
//           Reimbursement reimb = (Reimbursement) tblReimburse1.getValueAt(selectedRow, 0); 
//            String PatientID = reimb.getPatientID();
//        for ( ComplainWorkRequest ComplainWR :patient.getWorkQueue().getComplainWorkRequestList())
//        {
//            if (ComplainWR.equals(PatientID))
//            {
//              JOptionPane.showMessageDialog(null, "Request already exists");  
//            }
//            else{
//                
//         Claim_DeptHealthInsuranceWorkRequest claim_health_req1 = new Claim_DeptHealthInsuranceWorkRequest();
//         claim_health_req1.setMessage("Verification needed for Medi claim for Meidcal ID " + PatientMedicalID );
//         claim_health_req1.setMedicalId(PatientMedicalID);
//         claim_health_req1.setPatientID(id);
//         claim_health_req1.setStatus("Sent");
//         claim_health_req1.setSender(userAccount);
//         claim_health_req1.setReimb(reimbursementDirectoy);
//         divInsorg.getWorkQueue().getClaim_HealthInsuranceWorkRequest().add(claim_health_req1);        
//         System.out.println("size "+divInsorg.getWorkQueue().getClaim_HealthInsuranceWorkRequest());       
                
                
//         req.setMessage("Request for Verification sent to Department of Health Insurance");
//         req.setPatientID(PatientMedicalID);
//         req.setStatus("Sent");
//         req.setSender(userAccount);
//         claimorg.getWorkQueue().getROI_ClaimWorkRequestList().add(req);
            

        req.setStatus("Fraud Not Detected");
        req.setFraudDetected("Sent for verification to Patient");
        RequestPatientReport RequestPatientReport = new RequestPatientReport(userProcessContainer, userAccount,patient, enterprise,business,id,PatientMedicalID);
        userProcessContainer.add("RequestPatientReport",RequestPatientReport);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_RequestPatientBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientClaimTbl;
    private javax.swing.JButton RequestPatientBtn;
    private javax.swing.JButton SendBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblReimburse1;
    // End of variables declaration//GEN-END:variables

   
}
