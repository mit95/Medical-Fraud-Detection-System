/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital.Patient;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Hospital.PatientOrganization;
import Business.Reimbursement;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DepartmentToLawWorkRequest;
import Business.WorkQueue.ComplainWorkRequest;
import Business.WorkQueue.ROI_ClaimWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DepartmentOfPublicHealth.AdulterationOfficer.ProcessMedicineFraudJPanel;
import userinterface.Hospital.Releaseinfo.EditClaimJPanel;
import userinterface.Hospital.Patient.PatientClaimHospitalReimbursJPanel;

/**
 *
 * @author Samartha
 */
public class ComplainStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form complainStatusJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Enterprise enterprise;
    String name;
    PatientOrganization patOrg;
    private EcoSystem business;
    private  String MedicalID ;
    private String PatientID;
    
    public ComplainStatusJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise , PatientOrganization patientOrganization , EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        //this.name = name;
        //this.patOrg = new PatientOrganization();
        this.patOrg = patientOrganization;
        this.business = new EcoSystem();
        this.business = business;
//        this.MedicalReq =  new ComplainWorkRequest();
        
        populateCompTable();
    }
    
    public void populateCompTable(){ 
        DefaultTableModel model = (DefaultTableModel) complainStatusJTable.getModel();
        model.setRowCount(0);
        // to get details of complaint raised by patient
        for (ComplainWorkRequest request : userAccount.getWorkQueue().getComplainWorkRequestList())
//        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
        {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getPatientID();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            String result = ((ComplainWorkRequest) request).getFraudDetected();
            row[4] =  result == null ? "Sent to Government" : result;
            model.addRow(row);
        }
        // to get details of medical claim request raised by Claim Orgainization to patient
//        for (WorkRequest request1 : patOrg.getWorkQueue().getWorkRequestList()){
        for (ComplainWorkRequest request1 : patOrg.getWorkQueue().getComplainWorkRequestList())
        {
            Object[] row = new Object[5];
            row[0] = request1;
            row[1] = request1.getPatientID();
            row[2] = request1.getReceiver();
            row[3] = request1.getStatus();
            String result = ((ComplainWorkRequest) request1).getFraudDetected();
            row[4] =  result == null ? "Waiting for Acknowledgement" : result;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        complainStatusJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        RequestJBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(210, 247, 247));

        complainStatusJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "ID", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(complainStatusJTable);

        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        enterpriseLabel.setText("Enterprise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        valueLabel.setText("<value>");

        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        assignJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        RequestJBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        RequestJBtn.setText("Send Medical Reports");
        RequestJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(refreshJButton))
                            .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(RequestJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refreshJButton))
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(RequestJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed

        populateCompTable();

    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_BackBtnActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = complainStatusJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        else
        {
        ComplainWorkRequest MedicalReq = (ComplainWorkRequest)complainStatusJTable.getValueAt(selectedRow, 0);
        MedicalReq.setReceiver(userAccount);
        MedicalReq.setStatus("Pending");
        populateCompTable();
        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void RequestJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestJBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = complainStatusJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        else
        {
        ComplainWorkRequest request = (ComplainWorkRequest) complainStatusJTable.getValueAt(selectedRow, 0); 
        Pattern pattern = Pattern.compile("COM*");
        Matcher m = pattern.matcher(request.getPatientID());
        if(!m.find()){
            if(request.getReceiver() != null)
            {
            PatientID = request.getPatientID();
            MedicalID = request.getpatientMedical();
            // update the messge stating patient has sent the report to the Claim
            request.setFraudDetected("Reports sent");
            request.setStatus("Completed");
            populateCompTable();

            PatientClaimHospitalReimbursJPanel PatientMedicalReport = new userinterface.Hospital.Patient.PatientClaimHospitalReimbursJPanel(userProcessContainer,userAccount, enterprise, business ,MedicalID, PatientID);
            userProcessContainer.add("PatientMedicalReport", PatientMedicalReport);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            }
            else{
            JOptionPane.showMessageDialog(null, "Please assign the request first!");  
            }  
        }
        else{
            JOptionPane.showMessageDialog(null, "Complain message cannot be processes");
        }
    }//GEN-LAST:event_RequestJBtnActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton RequestJBtn;
    private javax.swing.JButton assignJButton;
    private javax.swing.JTable complainStatusJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
