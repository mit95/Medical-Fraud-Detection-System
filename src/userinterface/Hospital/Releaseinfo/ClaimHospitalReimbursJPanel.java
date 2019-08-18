/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital.Releaseinfo;
import Business.EcoSystem;
import Business.Enterprise.DepartmentOfPublicHealthEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HealthInsuranceEnterprise;
import Business.Network.Network;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfAdulteration;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfInsurance;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfMedServices;
import Business.Organization.HealthInsurance.ClaimsOrganization;
import Business.Organization.Hospital.PatientOrganization;
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
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.HealthInsurance.ClaimsOrganization.ClaimsOfficerWorkAreaJPanel;
/**
 *
 * @author Samartha
 */
public class ClaimHospitalReimbursJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private MedicalWorkRequest request;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ReleaseOfInfoOrganization release;
    private ReimbursementDirectory Reimbursedir;
    private EcoSystem business;
//    Organization org = null;
    Organization claimorg = null;
    String PatientInsuracneId;
    public ArrayList<Reimbursement> Search;
    private PatientOrganization patorg;
    private Reimbursement reimb1;
    private boolean flag = false;
    DefaultTableModel dtm ;
    ReleaseOfInfoOrganization roiorg;
    boolean duplicate_req = false;
    boolean donot_append = false;
    Organization organization;
   
    
    /**
     * Creates new form ReleaseinfoWorkJPanel
     */
    
//    ClaimHospitalReimbursJPanel(JPanel userProcessContainer, UserAccount userAccount, ReleaseOfInfoOrganization releaseorg, Enterprise enterprise , ReimbursementDirectory Reimbursedir , EcoSystem Business ) {
        ClaimHospitalReimbursJPanel(JPanel userProcessContainer, UserAccount userAccount, ReleaseOfInfoOrganization releaseorg, Enterprise enterprise , EcoSystem Business ) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.request=request;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.release = releaseorg;
        this.business =  Business;
        this.Reimbursedir = new ReimbursementDirectory();
        this.Reimbursedir = Reimbursedir;
        this.Search = new ArrayList<>();
        this.patorg = new PatientOrganization();
        this.reimb1 = new Reimbursement();
        this.roiorg = new ReleaseOfInfoOrganization();
        this.organization = organization;
        dtm = (DefaultTableModel) tblReimburse.getModel();
        dtm.setRowCount(0);
        
        populate_combo();
        populate_table();   
    }
    public void populate_table()
    {    
        if(PatientMediclIDTxt.getText().isEmpty())
        {
            // do nothing
        }
            else
        {
        PatientInsuracneId = PatientMediclIDTxt.getText();
        }       
     
//     DefaultTableModel dtm = (DefaultTableModel) tblReimburse.getModel();
//        dtm = (DefaultTableModel) tblReimburse.getModel();
//     dtm.setRowCount(0);
     int sum = 0;
        for(Reimbursement reimb : Reimbursedir.getReimbursementDirectory())
        {
        flag = true;
//        dtm.setRowCount(0);
        Object[] row = new Object[6];
        row[0] = reimb;//.getPatientID();
        dummyTxt.setText(reimb.getPatientID());
        row[1] = reimb.getTypeOfReimbursement();
//        row[2] = reimb.getDate();
        row[2] = reimb.getAmount();
        row[3] = reimb.getPatient_Insurance_Id();
        row[4] = reimb.getSending_Organization();
        dtm.addRow(row);  
//        if(reimb != null);
//        {
//        roiorg.getWorkQueue().getReimbursementDir().add(reimb);
////        org.getWorkQueue().getReimbursementDir().add(reimb);
//        claimorg.getWorkQueue().getReimbursementDir().add(reimb);
//        userAccount.getWorkQueue().getReimbursementDir().add(reimb);
//        patorg.getWorkQueue().getReimbursementDir().add(reimb);
//        }  
    }
        if(flag == false)
        {
//         for(Reimbursement reimb :org.getWorkQueue().getReimbursementDir())     
//         for(Reimbursement reimb :roiorg.getWorkQueue().getReimbursementDir()) 
     for(Reimbursement reimb :userAccount.getWorkQueue().getReimbursementDir()) 
        {
       Object[] row1 = new Object[6];
        row1[0] = reimb;//.getPatientID();
        dummyTxt.setText(reimb.getPatientID());
        row1[1] = reimb.getTypeOfReimbursement();
//        row1[2] = reimb.getDate();
        row1[2] = reimb.getAmount();
        row1[3] = reimb.getPatient_Insurance_Id();
        row1[4] = reimb.getSending_Organization();
        
        dtm.addRow(row1);     
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
//                      org = org1;
//                      governmentOrgComboBox.addItem(org);
                       claimorg = org1;
                      governmentOrgComboBox.addItem(claimorg);
                   
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
        CreateJButton = new javax.swing.JButton();
        ClaimRebuBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        governmentOrgComboBox = new javax.swing.JComboBox();
        btnView = new javax.swing.JButton();
        PatientIDLbl = new javax.swing.JLabel();
        dummyTxt = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReimburse = new javax.swing.JTable();

        setBackground(new java.awt.Color(210, 247, 247));

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        TitlLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitlLbl.setText("                      Claim Request Form of Patient");

        PatientMedicalIDLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        PatientMedicalIDLbl.setText("Patient Insurance ID ");

        PatientMediclIDTxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        PatientMediclIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientMediclIDTxtActionPerformed(evt);
            }
        });

        ReimburseLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ReimburseLbl.setText("Reimbursement Details");

        CreateJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CreateJButton.setText("Create Details for Reimbursement");
        CreateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateJButtonActionPerformed(evt);
            }
        });

        ClaimRebuBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ClaimRebuBtn.setText("Request For Reimbursement");
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

        btnView.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnView.setText("View/Update");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        dummyTxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        dummyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyTxtActionPerformed(evt);
            }
        });

        SearchBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        tblReimburse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientID", "Type of Reimbursement", "Amount", "Patient Insurance ID", "Sent By"
            }
        ));
        jScrollPane2.setViewportView(tblReimburse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(TitlLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ClaimRebuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(governmentOrgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(CreateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(ReimburseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(PatientMedicalIDLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PatientMediclIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256)
                        .addComponent(dummyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(PatientIDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitlLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatientMedicalIDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientMediclIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PatientIDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(dummyTxt)))))
                .addGap(32, 32, 32)
                .addComponent(ReimburseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(governmentOrgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(ClaimRebuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
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
        CreateReimbursementDetailsJPanel CreateReimbursementDetails;
        //CreateReimbursementDetails = new CreateReimbursementDetailsJPanel(userProcessContainer, userAccount, release, enterprise ,Reimbursedir,PatientInsuracneId , business);
        CreateReimbursementDetails = new CreateReimbursementDetailsJPanel(userProcessContainer, userAccount, release, enterprise,PatientInsuracneId , business);
        userProcessContainer.add("CreateReimbursementDetailsJPanel", CreateReimbursementDetails);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);  
        }
    }//GEN-LAST:event_CreateJButtonActionPerformed

    private void ClaimRebuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaimRebuBtnActionPerformed
        // TODO add your handling code here:
        donot_append = false;
        duplicate_req = false;
           int selectedRow = tblReimburse.getSelectedRow();
           if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        } 
           else{
     Reimbursement reimb2 = (Reimbursement)tblReimburse.getValueAt(selectedRow, 0); 
     String PatientID = reimb2.getPatientID();
     String Patient_Insurance_ID = reimb2.getPatient_Insurance_Id();
     ROI_ClaimWorkRequest req = new ROI_ClaimWorkRequest();
     for(ROI_ClaimWorkRequest request :claimorg.getWorkQueue().getROI_ClaimWorkRequestList())
             {
               duplicate_req = true;  
       if(PatientID.equals(request.getPatientID()))
            {
             JOptionPane.showMessageDialog(null, "Request already exists");
             donot_append = true;
            }
        else
            {
         req.setMessage("Insurance Claim for " + Patient_Insurance_ID);
         req.setOrganizationName(claimorg.getName());
         req.setStatus("Sent");
         req.setSender(userAccount);
         req.setPatientID(PatientID);
         req.setReimb(Reimbursedir);
         req.setMedicalId(Patient_Insurance_ID);
         req.setEnterpriseName(enterprise.getName());
             }
             }
     if(duplicate_req ==false)
     {
        req.setMessage("Insurance Claim for " + Patient_Insurance_ID);
         req.setOrganizationName(claimorg.getName());
         req.setStatus("Sent");
         req.setSender(userAccount);
         req.setPatientID(PatientID);
         req.setReimb(Reimbursedir);
         req.setMedicalId(Patient_Insurance_ID);
         
     }

     if(donot_append == false)
     {
//             if(claimorg!=null){
             claimorg.getWorkQueue().getROI_ClaimWorkRequestList().add(req);
             userAccount.getWorkQueue().getROI_ClaimWorkRequestList().add(req);
//         }   
         
        ClaimStatusJPanel ClaimStatus = new ClaimStatusJPanel(userProcessContainer,userAccount ,enterprise,release);
        userProcessContainer.add("ClaimStatus", ClaimStatus);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
     }
    }           
    }//GEN-LAST:event_ClaimRebuBtnActionPerformed

    private void governmentOrgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_governmentOrgComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_governmentOrgComboBoxActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
          int selectedrow = tblReimburse.getSelectedRow();
          if(selectedrow<0)
        {
             JOptionPane.showMessageDialog(null,"Please select a row","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        Reimbursement reim  = (Reimbursement) tblReimburse.getValueAt(selectedrow,0);  
        EditClaimJPanel panel = new EditClaimJPanel(userProcessContainer , reim );
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

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
//        String MedicalID = PatientMediclIDTxt.getText();
//        if (MedicalID.isEmpty())
//        {
//          JOptionPane.showMessageDialog(null,"please provide Patient MedicalID");  
//        }
//        else{
////       for( Reimbursement reimb :userAccount.getWorkQueue().getReimbursementDir())
//        for( Reimbursement reimb :userAccount.getWorkQueue().getReimbursementDir()) 
//        {
//            if(reimb.getPatient_Insurance_Id().equals(MedicalID))
//                Search.add(reimb);
//        }
//        }
//        System.out.println(Search);
//        if (Search != null)
//        {
//        DefaultTableModel dtm1 = (DefaultTableModel) tblReimburse21.getModel();
//        dtm1.setRowCount(0); 
//          for( Reimbursement reimb : Search)
//          {      
//        Object[] row1 = new Object[6];
//        row1[0] = reimb.getPatientID();
//        dummyTxt.setText(reimb.getPatientID());
//        row1[1] = reimb.getTypeOfReimbursement();
//        row1[2] = reimb.getDate();
//        row1[3] = reimb.getAmount();
//        row1[4] = reimb.getPatient_Insurance_Id();
//        row1[5] = reimb.getSending_Organization();
//        
//        dtm1.addRow(row1);  
////        Search.removeAll(Search);  
////         Search.clear();
//          }  
//        }
          
//     for(Iterator<Reimbursement> rem = Search.iterator();rem.hasNext();)
//          {
//              rem.remove();
//          }
//          
          
          
    }//GEN-LAST:event_SearchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClaimRebuBtn;
    private javax.swing.JButton CreateJButton;
    private javax.swing.JLabel PatientIDLbl;
    private javax.swing.JLabel PatientMedicalIDLbl;
    private javax.swing.JTextField PatientMediclIDTxt;
    private javax.swing.JLabel ReimburseLbl;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JLabel TitlLbl;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnView;
    private javax.swing.JTextField dummyTxt;
    private javax.swing.JComboBox governmentOrgComboBox;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblReimburse;
    // End of variables declaration//GEN-END:variables
}
