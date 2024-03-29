/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital.Patient;
import userinterface.Hospital.Releaseinfo.*;
import java.awt.CardLayout;
import Business.Organization.Hospital.PharmacyOrganization;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.UserAccount.UserAccount;
import Business.Enterprise.Enterprise;
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
public class PatientcreateReimbursementDetailsJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ReleaseOfInfoOrganization release;
    private ReimbursementDirectory reimbdir;
    private String PatientId;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public PatientcreateReimbursementDetailsJPanel(JPanel userProcessContainer, UserAccount account, Organization release, Enterprise enterprise,ReimbursementDirectory reimbdir,String PatientID) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.release = (ReleaseOfInfoOrganization) release;
        this.reimbdir = reimbdir;
        this.PatientId = PatientID;
        populate_text();
    }

    public void populate_text()
    {
    PatientTxt.setText(PatientId);
    PatientTxt.setEnabled(false);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Label = new javax.swing.JLabel();
        airplaneType = new javax.swing.JLabel();
        startTime = new javax.swing.JLabel();
        toLocation = new javax.swing.JLabel();
        reimbuTxt = new javax.swing.JTextField();
        CreatedDatetxt = new javax.swing.JTextField();
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

        jPanel5.setBackground(new java.awt.Color(214, 240, 240));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Label.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Label.setText("Reimbursement Details");

        airplaneType.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        airplaneType.setText("Type of Reimbursement");

        startTime.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        startTime.setText("Date");

        toLocation.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        toLocation.setText("Amount");

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

        PatientLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        PatientLbl.setText("Patient Medical ID");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(airplaneType)
                            .addComponent(startTime)
                            .addComponent(toLocation))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CreatedDatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reimbuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PatientLbl))
                .addGap(0, 747, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnBack)
                        .addGap(182, 182, 182)
                        .addComponent(Label))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Label)))
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PatientLbl)
                    .addComponent(PatientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reimbuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airplaneType))
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreatedDatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startTime))
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toLocation))
                .addGap(58, 58, 58)
                .addComponent(Create)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1367, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1367, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        // TODO add your handling code here:
        
       Reimbursement reimb = reimbdir.addreimbursement();
       String PatientID = PatientTxt.getText();
       String ReimbursementType = reimbuTxt.getText();
       String Date = CreatedDatetxt.getText();
       int Amount = Integer.parseInt(AmtTxt.getText());
       String patient = "Patient Organization";

       reimb.setPatientID(PatientID);
       reimb.setTypeOfReimbursement(ReimbursementType);
       reimb.setDate(Date);
       reimb.setAmount(Amount);
       reimb.setSending_Organization(patient);
//       reimb.
      
       reimbuTxt.setText(" ");
       CreatedDatetxt.setText(" ");
//       PatientTxt.setText(" ");
       AmtTxt.setText(null);
       
        if (ReimbursementType.isEmpty() || Date.isEmpty() || PatientID.isEmpty())      
       {
        JOptionPane.showMessageDialog(null,"All fields are mandatory !!");
       }
       else{
        JOptionPane.showMessageDialog(null,"Reimbursement Details created !!");
        }
    }//GEN-LAST:event_CreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        PatientTxt.setText(" ");
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] components = userProcessContainer.getComponents();
        for(Component c : components){
        if(c instanceof PatientClaimHospitalReimbursJPanel)
        {
          PatientClaimHospitalReimbursJPanel mp = (PatientClaimHospitalReimbursJPanel)c;
            mp.populate_table();
        }
       }        
    }//GEN-LAST:event_btnBackActionPerformed

    private void AmtTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmtTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmtTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmtTxt;
    private javax.swing.JButton Create;
    private javax.swing.JTextField CreatedDatetxt;
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
    private javax.swing.JLabel startTime;
    private javax.swing.JLabel toLocation;
    // End of variables declaration//GEN-END:variables
}
