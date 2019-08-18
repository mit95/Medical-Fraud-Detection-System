/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital.Releaseinfo;
import Business.EcoSystem;
import java.awt.CardLayout;
import Business.Organization.Hospital.PharmacyOrganization;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.UserAccount.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HealthInsurance.ClaimsOrganization;
import Business.WorkQueue.MedicalWorkRequest;
import Business.Organization.Hospital.ReleaseOfInfoOrganization;
import Business.Organization.Organization;
import Business.Reimbursement;
import Business.ReimbursementDirectory;
import java.awt.Component;
import javax.swing.JOptionPane;
/**
 *
 * @author Samartha
 */
public class CreateReimbursementDetailsJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ReleaseOfInfoOrganization release;
    private ReimbursementDirectory reimbdir;
    private String PatientId;
    private String PatientInsuracneId;
    EcoSystem business;
     Organization claimorg = null;
     int Amount;
     boolean formatExc;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
   // public CreateReimbursementDetailsJPanel(JPanel userProcessContainer, UserAccount account, Organization release, Enterprise enterprise,ReimbursementDirectory reimbdir,String PatientInsuracneId,EcoSystem business) {
        public CreateReimbursementDetailsJPanel(JPanel userProcessContainer, UserAccount account, Organization release, Enterprise enterprise,String PatientInsuracneId,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.release = (ReleaseOfInfoOrganization) release;
        this.reimbdir = new ReimbursementDirectory();
        this.reimbdir = reimbdir;
        this.PatientId = PatientId;
        this.PatientInsuracneId = PatientInsuracneId;
        this.business = business;
        boolean formatExc = false;
//        populate_text();
        populate_combo();
    }

//    public void populate_text()
//    {
//    PatientTxt.setText(PatientId);
//    PatientTxt.setEnabled(false);
//    }
     
     public void populate_combo()
    {
     
        for(Network network: business.getNetworkList())
        {
            for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList()){  
                    for(Organization org1:e.getOrganizationDirectory().getOrganizationList()){
                  if(org1 instanceof ClaimsOrganization){ 
                       claimorg = org1;
             
                   
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

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Label = new javax.swing.JLabel();
        airplaneType = new javax.swing.JLabel();
        toLocation = new javax.swing.JLabel();
        reimbuTxt = new javax.swing.JTextField();
        AmtTxt = new javax.swing.JTextField();
        Create = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        PatientTxt = new javax.swing.JTextField();
        PatientLbl = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1223, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1223, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(210, 247, 247));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Label.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Label.setText("Reimbursement Details");

        airplaneType.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        airplaneType.setText("Type of Reimbursement");

        toLocation.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        toLocation.setText("Amount");

        reimbuTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reimbuTxtActionPerformed(evt);
            }
        });

        AmtTxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        AmtTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmtTxtActionPerformed(evt);
            }
        });

        Create.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        PatientTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientTxtActionPerformed(evt);
            }
        });

        PatientLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        PatientLbl.setText("Patient Medical ID");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(PatientLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(PatientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(airplaneType)
                            .addComponent(toLocation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AmtTxt)
                            .addComponent(reimbuTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))))
                .addGap(0, 764, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnBack)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(Label)))
                .addContainerGap(739, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBack))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Label)))
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientLbl))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reimbuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airplaneType))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toLocation)
                    .addComponent(AmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(Create)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        // TODO add your handling code here:
        
//        Reimbursement reimb = reimbdir.addreimbursement();
         Reimbursement reimb = new Reimbursement();
       String PatientID = PatientTxt.getText();
       String ReimbursementType = reimbuTxt.getText();
//       String Date = CreatedDatetxt.getText();
//       int Amount = Integer.parseInt(AmtTxt.getText());
       try{
           formatExc = false;
	Amount = Integer.parseInt(AmtTxt.getText());          
      }
       catch(NumberFormatException e){
	   JOptionPane.showMessageDialog(null,"Please enter a number !!");
           formatExc = true;
       }  
       
        if (ReimbursementType.isEmpty() || PatientID.isEmpty())      
       {
        JOptionPane.showMessageDialog(null,"All fields are mandatory !!");
       }
        if(formatExc != true)
        {
            
           String hosp = "Hospital Organization";
       reimb.setPatientID(PatientID);
       reimb.setTypeOfReimbursement(ReimbursementType);
//       reimb.setDate(Date);
       reimb.setAmount(Amount);
       reimb.setSending_Organization(hosp);
       reimb.setPatient_Insurance_Id(PatientInsuracneId);
      
       // nm 8-12
       
       claimorg.getWorkQueue().getReimbursementDir().add(reimb);
       userAccount.getWorkQueue().getReimbursementDir().add(reimb);   
            
         reimbuTxt.setText(" ");
//       CreatedDatetxt.setText(" ");
//       PatientTxt.setText(" ");
       AmtTxt.setText(null);
        reimbdir.addreimbursement();
        JOptionPane.showMessageDialog(null,"Reimbursement Details created !!"); 
        formatExc = false;
        }
    }//GEN-LAST:event_CreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        PatientTxt.setText(" ");      
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
    }//GEN-LAST:event_btnBackActionPerformed

    private void AmtTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmtTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmtTxtActionPerformed

    private void reimbuTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reimbuTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reimbuTxtActionPerformed

    private void PatientTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmtTxt;
    private javax.swing.JButton Create;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel PatientLbl;
    private javax.swing.JTextField PatientTxt;
    private javax.swing.JLabel airplaneType;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField reimbuTxt;
    private javax.swing.JLabel toLocation;
    // End of variables declaration//GEN-END:variables
}