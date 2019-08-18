/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DepartmentOfPublicHealth.InsuranceOfficer;

import Business.EcoSystem;
import Business.Enterprise.DepartmentOfPublicHealthEnterprise;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.HealthInsurance;
import Business.Enterprise.FraudDetectionEnterprise;
import Business.Enterprise.HealthInsuranceEnterprise;
import Business.Network.Network;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfInsurance;
import Business.Organization.FraudDetectionAgency.LawEnforcementOrganization;
import Business.Organization.HealthInsurance.ClaimsOrganization;
import Business.Organization.Organization;
import Business.Reimbursement;
import Business.ReimbursementDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DepartmentToLawWorkRequest;
import Business.WorkQueue.Claim_DeptHealthInsuranceWorkRequest;
import Business.WorkQueue.ComplainWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mitka
 */
public class ProcessInsuranceFraudJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessInsuranceFraudJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    private Claim_DeptHealthInsuranceWorkRequest depthealth_wr;
    private DivisionOfInsurance divinsorg;
    private String PatientID;
    int sum;
    int sum1;
    private ReimbursementDirectory hospitalclaim;
    private ReimbursementDirectory patientclaim;
    private ClaimsOrganization claimorg;
    private ReimbursementDirectory compare_reimbdir_hos;
    private ReimbursementDirectory compare_reimbdir_pat;
    private int counter;
    private EcoSystem Buisness;
    String MedicalId;
    private LawEnforcementOrganization lawOrg;
    public ProcessInsuranceFraudJPanel(JPanel userProcessContainer, UserAccount userAccount , DivisionOfInsurance divInsorg, String PatientID,EcoSystem Buisness, Claim_DeptHealthInsuranceWorkRequest claimrequest)
    {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.PatientID =PatientID;
        this.divinsorg = (DivisionOfInsurance)divInsorg;
        this.Buisness =  Buisness;
        hospitalclaim = new ReimbursementDirectory();
        patientclaim = new ReimbursementDirectory();
        compare_reimbdir_hos = new ReimbursementDirectory();
        compare_reimbdir_pat = new ReimbursementDirectory();
        this.lawOrg = new LawEnforcementOrganization();
        this.depthealth_wr = claimrequest;
      
        populate_org();
        populate_table();
    } 
    
    public void populate_org()
    {
          for(Network network: Buisness.getNetworkList()){
            for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof HealthInsuranceEnterprise){
                    for(Organization loopOrg:e.getOrganizationDirectory().getOrganizationList()){
                        if(loopOrg instanceof ClaimsOrganization){
                            claimorg = (ClaimsOrganization) loopOrg;
                            break;
                        }                      
                    }
                }
            }
        }
}
    public void populate_table()
    { 
        DefaultTableModel model = (DefaultTableModel) HospitalJTable.getModel();
        model.setRowCount(0);
        
         DefaultTableModel model1 = (DefaultTableModel) PatientJTable.getModel();
         model1.setRowCount(0); 
        
            for(Reimbursement reimb : claimorg.getWorkQueue().getReimbursementDir())
        {              
       if((reimb.getPatientID().equals(PatientID)) && (reimb.getSending_Organization().equals("Hospital Organization")))
       {
       Object[] row = new Object[2];
       row[0] = reimb.getTypeOfReimbursement();
       row[1] = reimb.getAmount();
       sum = sum + reimb.getAmount();
       model.addRow(row);
       
       Reimbursement hos_reimb = hospitalclaim.addHospitalClaim();
       hos_reimb.setPatientID(reimb.getPatientID());
       hos_reimb.setTypeOfReimbursement(reimb.getTypeOfReimbursement());
       hos_reimb.setDate(reimb.getDate());
       hos_reimb.setAmount(reimb.getAmount());
       hos_reimb.setSending_Organization(reimb.getSending_Organization());
     
       MedicalIDTxt.setText( reimb.getPatient_Insurance_Id());
       MedicalId = reimb.getPatient_Insurance_Id();
        }  
       /// Patient Claim Table
      if((reimb.getPatientID().equals(PatientID))  && (reimb.getSending_Organization().equals("Patient Organization")))
       {
       Object[] row1 = new Object[2];
       row1[0] = reimb.getTypeOfReimbursement();
       row1[1] = reimb.getAmount();
       sum1 = sum1 + reimb.getAmount();
       model1.addRow(row1);
       
       Reimbursement pat_reimb = patientclaim.addPatientClaim();
       pat_reimb.setPatientID(reimb.getPatientID());
       pat_reimb.setTypeOfReimbursement(reimb.getTypeOfReimbursement());
       pat_reimb.setDate(reimb.getDate());
       pat_reimb.setAmount(reimb.getAmount());
       pat_reimb.setSending_Organization(reimb.getSending_Organization());
        }  
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HospitalJTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        TotalTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatientJTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        Total1Txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        MedicalIDTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(210, 247, 247));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(210, 247, 247));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Hospital Medical Report");

        HospitalJTable.setBackground(new java.awt.Color(210, 247, 247));
        HospitalJTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        HospitalJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Code", "Amount"
            }
        ));
        jScrollPane1.setViewportView(HospitalJTable);

        jButton2.setText("Total");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(TotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(TotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );

        jPanel2.setBackground(new java.awt.Color(210, 247, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Patient Medical Report");

        PatientJTable.setAutoCreateRowSorter(true);
        PatientJTable.setBackground(new java.awt.Color(210, 247, 247));
        PatientJTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PatientJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Code", "Amount"
            }
        ));
        jScrollPane2.setViewportView(PatientJTable);

        jButton3.setText("Total");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Total1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel3)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(80, 80, 80)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(Total1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Medical Claim Report for Mediclam ID : ");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Compare the claim report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MedicalIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedicalIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:        
        if ((sum > sum1) || (sum < sum1))
        {    
       DepartmentToLawWorkRequest Department_LawWR = new DepartmentToLawWorkRequest();
        Department_LawWR.setComplainType("Insurance Services");
//      enterpriseNameTextField.setText(request.getEnterpriseName());
         Department_LawWR.setMessage("Fraud has been detected for MedicalID " + MedicalId  +  "relavent to Patient"  +  PatientID);
         Department_LawWR.setStatus("Sent");
         Department_LawWR.setSender(userAccount);
         Department_LawWR.setPatientID(PatientID);
         Department_LawWR.setMedicalID(MedicalId);
         Department_LawWR.setFraudResult("Fraud has been detected for MedicalID " + MedicalId + "relavent to Patient" + PatientID);
         Department_LawWR.setClaimReq(depthealth_wr);
         Department_LawWR.setFraudReportPath("Automated Result");
         
         if(Math.abs(sum - sum1)<10){
             Department_LawWR.setFraudLevel("Mild");
         }
         else if(Math.abs(sum - sum1)<100){
             Department_LawWR.setFraudLevel("Medium");
         }
         else if(Math.abs(sum - sum1)<1000){
             Department_LawWR.setFraudLevel("Serious");
         }
            
         for(Network network: Buisness.getNetworkList())
         {
            for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof FraudDetectionEnterprise){
                    for(Organization loopOrg:e.getOrganizationDirectory().getOrganizationList()){
                        if(loopOrg instanceof LawEnforcementOrganization){
                            lawOrg =  (LawEnforcementOrganization) loopOrg;
                            break;
                        }      
                    }
                }
            }
        }
            lawOrg.getWorkQueue().getDepartmenttolawWorkRequestList().add(Department_LawWR);
//          claimorg.
           //divinsorg.getWorkQueue().getClaim_HealthInsuranceWorkRequestList().add(Department_LawWR);
//            claimorg.getWorkQueue().getClaim_HealthInsuranceWorkRequestList().add(depthealth_wr);
            JOptionPane.showMessageDialog(null,"Fraud Detected , Request sent to Government !!");
//        }
//        else
//        {
//         Claim_DeptHealthInsuranceWorkRequest claim_HealthDeptrequest = new Claim_DeptHealthInsuranceWorkRequest();
//         claim_HealthDeptrequest.setMessage("Verification Passed " + MedicalId + "relavent to Patient" + PatientID);
//         claim_HealthDeptrequest.setOrganizationName(claimorg.getName());
//         claim_HealthDeptrequest.setStatus("Sent");
//         claim_HealthDeptrequest.setSender(userAccount);
//         claim_HealthDeptrequest.setPatientID(PatientID);
//         claim_HealthDeptrequest.setMedicalId(MedicalId);  
//         claim_HealthDeptrequest.setFraudDetected("Medical Claim Verified , Reimbursement processed!");
//         //lawOrg.getWorkQueue().getDepartment_LawWorkRequestList().add(claim_HealthDeptrequest);
//         //divinsorg.getWorkQueue().getClaim_HealthInsuranceWorkRequestList().add(claim_HealthDeptrequest);
//         claimorg.getWorkQueue().getClaim_HealthInsuranceWorkRequestList().add(claim_HealthDeptrequest);
//         JOptionPane.showMessageDialog(null,"Medical Claim Verified!!");
        
        
        
        
        
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      String Total =  Integer.toString(sum);
      TotalTxt.setText(Total);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      String Total1 =  Integer.toString(sum1);
      Total1Txt.setText(Total1);          
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HospitalJTable;
    private javax.swing.JTextField MedicalIDTxt;
    private javax.swing.JTable PatientJTable;
    private javax.swing.JTextField Total1Txt;
    private javax.swing.JTextField TotalTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
