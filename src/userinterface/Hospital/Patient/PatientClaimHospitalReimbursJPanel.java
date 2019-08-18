/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital.Patient;
import userinterface.Hospital.Releaseinfo.*;
import Business.EcoSystem;
import Business.Enterprise.DepartmentOfPublicHealthEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HealthInsuranceEnterprise;
import Business.Network.Network;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfAdulteration;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfInsurance;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfMedServices;
import Business.Organization.HealthInsurance.ClaimsOrganization;
import Business.Organization.Hospital.ReleaseOfInfoOrganization;
import Business.Organization.Organization;
import Business.Reimbursement;
import Business.ReimbursementDirectory;
import static Business.Role.Role.RoleType.InsuranceAgent;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ComplainWorkRequest;
import Business.WorkQueue.MedicalWorkRequest;
import Business.WorkQueue.ROI_ClaimWorkRequest;
import UserInterface.Hospital.Patient.ComplainStatusJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.HealthInsurance.ClaimsOrganization.ClaimsOfficerWorkAreaJPanel;
/**
 *
 * @author Samartha
 */
public class PatientClaimHospitalReimbursJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private MedicalWorkRequest request;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ReleaseOfInfoOrganization release;
    private ReimbursementDirectory Reimbursedir;
    private EcoSystem business;
    Organization org = null;
    String PatientID;
    String Medicalid;
    String PatientInsuracneId;
    
    /**
     * Creates new form ReleaseinfoWorkJPanel
     */

//    public PatientClaimHospitalReimbursJPanel(JPanel userProcessContainer, UserAccount userAccount, ReleaseOfInfoOrganization releaseorg, Enterprise enterprise , ReimbursementDirectory Reimbursedir , EcoSystem Business ) {
     public PatientClaimHospitalReimbursJPanel(JPanel userProcessContainer, UserAccount userAccount,  Enterprise enterprise , EcoSystem Business , String MedicalID, String PatientID)
     {
    initComponents();
        this.userProcessContainer=userProcessContainer;
        this.request=request;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.release = new ReleaseOfInfoOrganization();
        this.business = new EcoSystem();
        this.business = Business;
        this.Medicalid = MedicalID;
        this.Reimbursedir = new ReimbursementDirectory();
        this.PatientID = PatientID;
        populate_text();
       populate_combo();
        populate_table();
        
    }
     
     public void populate_text()
     {
     PatientMediclIDTxt.setText(Medicalid);
     
     }
    public void populate_table()
    {    
//     PatientInsuracneId = PatientMediclIDTxt.getText();
     DefaultTableModel dtm = (DefaultTableModel) tblReimburse.getModel();
     dtm.setRowCount(0);
     int sum = 0;
        for(Reimbursement reimb : Reimbursedir.getReimbursementDirectory())
        {
            if (PatientMediclIDTxt == null)
            {
         PatientMediclIDTxt.setText(Medicalid);
            }
        Object[] row = new Object[6];
        row[0] = reimb.getPatientID();
        dummyTxt.setText(reimb.getPatientID());
        row[1] = reimb.getTypeOfReimbursement();
//        row[2] = reimb.getDate();
        row[2] = reimb.getAmount();
        row[3] = reimb.getPatient_Insurance_Id();//PatientInsuracneId;
        row[4] = reimb.getSending_Organization();
        
        dtm.addRow(row);  
        if(reimb != null);
        {
        org.getWorkQueue().getReimbursementDir().add(reimb);
        }
    }
    }
    
   public void populate_combo()
    {
     governmentOrgComboBox.removeAllItems();
        for(Network network: business.getNetworkList())
        {
            for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList()){  
                    for(Organization org1:e.getOrganizationDirectory().getOrganizationList()){
                  if(org1 instanceof ClaimsOrganization){ 
                      org = org1;
                      governmentOrgComboBox.addItem(org);
                    }
                }
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

        backJButton = new javax.swing.JButton();
        TitlLbl = new javax.swing.JLabel();
        PatientMedicalIDLbl = new javax.swing.JLabel();
        PatientMediclIDTxt = new javax.swing.JTextField();
        ReimburseLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReimburse = new javax.swing.JTable();
        CreateJButton = new javax.swing.JButton();
        ClaimRebuBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        governmentOrgComboBox = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        PatientIDLbl = new javax.swing.JLabel();
        dummyTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(210, 247, 247));

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        TitlLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitlLbl.setText("                             Claim form");

        PatientMedicalIDLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        PatientMedicalIDLbl.setText("Patient Insurance ID ");

        PatientMediclIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientMediclIDTxtActionPerformed(evt);
            }
        });

        ReimburseLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ReimburseLbl.setText("Reimbursement Details");

        tblReimburse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientID", "Type of Reimbursement", "Amount", "Patient Insurance ID", "Sent By"
            }
        ));
        jScrollPane1.setViewportView(tblReimburse);

        CreateJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CreateJButton.setText("Create Details for Reimbursement");
        CreateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateJButtonActionPerformed(evt);
            }
        });

        ClaimRebuBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ClaimRebuBtn.setText("Send Medical Report");
        ClaimRebuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaimRebuBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Receiving Organization:");

        governmentOrgComboBox.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        governmentOrgComboBox.setToolTipText("");
        governmentOrgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                governmentOrgComboBoxActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnView.setText("View/Update");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        dummyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(PatientMedicalIDLbl)
                        .addGap(18, 18, 18)
                        .addComponent(PatientMediclIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dummyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(PatientIDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CreateJButton)
                                .addGap(23, 23, 23)
                                .addComponent(btnView)
                                .addGap(91, 91, 91)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addGap(172, 177, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(TitlLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(ReimburseLbl)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(governmentOrgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(ClaimRebuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitlLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatientMedicalIDLbl)
                            .addComponent(PatientMediclIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dummyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PatientIDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(ReimburseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(governmentOrgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ClaimRebuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(384, 384, 384))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void CreateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateJButtonActionPerformed
        PatientInsuracneId = PatientMediclIDTxt.getText();
        if (PatientInsuracneId.isEmpty())
        {
       JOptionPane.showMessageDialog(null,"Patient Medical ID mandatory ","warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
        PatientcreateReimbursementDetailsJPanel CreateReimbursementDetails;
        CreateReimbursementDetails = new PatientcreateReimbursementDetailsJPanel(userProcessContainer, userAccount, release, enterprise ,Reimbursedir ,PatientID);
        userProcessContainer.add("CreateReimbursementDetailsJPanel", CreateReimbursementDetails);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);  
        }
    }//GEN-LAST:event_CreateJButtonActionPerformed

    private void ClaimRebuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaimRebuBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReimburse.getSelectedRow();
           if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        } 
           else{
         ROI_ClaimWorkRequest req = new ROI_ClaimWorkRequest();
         req.setMessage("Patient Medical Details  for " + PatientMediclIDTxt.getText());
         req.setOrganizationName(org.getName());
         req.setStatus("Sent");
         req.setSender(userAccount);
         req.setPatientID(dummyTxt.getText());
         req.setReimb(Reimbursedir);
         req.setMedicalId(PatientMediclIDTxt.getText());
         Organization org = null;
         for(Network network: business.getNetworkList()){
            for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof HealthInsuranceEnterprise){
                    for(Organization loopOrg:e.getOrganizationDirectory().getOrganizationList()){
                        if(governmentOrgComboBox.getSelectedItem() instanceof ClaimsOrganization){
                            org = loopOrg;
                            break;
                        }
                }
            }
        }
         }
         if(org!=null){
             org.getWorkQueue().getROI_ClaimWorkRequestList().add(req);
             userAccount.getWorkQueue().getROI_ClaimWorkRequestList().add(req);
         }
         JOptionPane.showMessageDialog(null,"Reimbursement Details Sent to Health Insurance !!");
    }//GEN-LAST:event_ClaimRebuBtnActionPerformed
    }
    private void governmentOrgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_governmentOrgComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_governmentOrgComboBoxActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblReimburse.getSelectedRow();
        if(selectedrow >= 0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "would you like to delete?","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                Reimbursement reim  = (Reimbursement) tblReimburse.getValueAt(selectedrow,1);
                Reimbursedir.deleteAccount(reim);
                populate_table();
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row","warning",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
          int selectedrow = tblReimburse.getSelectedRow();
          if(selectedrow<0)
        {
             JOptionPane.showMessageDialog(null,"Please select a row","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        Reimbursement reim  = (Reimbursement) tblReimburse.getValueAt(selectedrow,1);  
        PatientEditClaimJPanel panel = new PatientEditClaimJPanel(userProcessContainer , reim );
        userProcessContainer.add("EditClaimJPanel", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);  
  }
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void dummyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyTxtActionPerformed

    private void PatientMediclIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientMediclIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientMediclIDTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClaimRebuBtn;
    private javax.swing.JButton CreateJButton;
    private javax.swing.JLabel PatientIDLbl;
    private javax.swing.JLabel PatientMedicalIDLbl;
    private javax.swing.JTextField PatientMediclIDTxt;
    private javax.swing.JLabel ReimburseLbl;
    private javax.swing.JLabel TitlLbl;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JTextField dummyTxt;
    private javax.swing.JComboBox governmentOrgComboBox;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReimburse;
    // End of variables declaration//GEN-END:variables
}
