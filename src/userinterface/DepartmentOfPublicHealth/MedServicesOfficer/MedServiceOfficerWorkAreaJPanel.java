/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DepartmentOfPublicHealth.MedServicesOfficer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfMedServices;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ComplainWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mitka
 */
public class MedServiceOfficerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedServiceOfficerWorkAreaJPanel
     */
    private EcoSystem business;
    private UserAccount userAccount;
    private DivisionOfMedServices divisionMedicalServices;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private ComplainWorkRequest request;
    public MedServiceOfficerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
         this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.business = business;
        this.divisionMedicalServices = (DivisionOfMedServices)organization;
        request = new ComplainWorkRequest();
        enterpriseNameTextField.setText(enterprise.getName());
        populateTable();
        
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) ServicesFraudTable.getModel();
        
        model.setRowCount(0);
        
        for(ComplainWorkRequest request:divisionMedicalServices.getWorkQueue().getComplainWorkRequestList()){
            Object[]row = new Object[6];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ?null:request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            row[4] = request.getHospitalstatusDoc();
            row[5] = request.getPatientID();
            
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
        enterpriseNameTextField = new javax.swing.JTextField();
        refreshBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ServicesFraudTable = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(210, 247, 247));

        jLabel1.setText("ENTERPRISE :");

        enterpriseNameTextField.setEditable(false);
        enterpriseNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseNameTextFieldActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        ServicesFraudTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Hospital Document", "Complain Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ServicesFraudTable);
        if (ServicesFraudTable.getColumnModel().getColumnCount() > 0) {
            ServicesFraudTable.getColumnModel().getColumn(4).setPreferredWidth(150);
            ServicesFraudTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("PATIENT WORK REQUEST");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(refreshBtn)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignBtn)
                        .addGap(537, 537, 537)
                        .addComponent(processBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(refreshBtn))))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(86, 86, 86)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignBtn)
                    .addComponent(processBtn))
                .addContainerGap(395, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ServicesFraudTable.getSelectedRow();

        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }

        request = (ComplainWorkRequest)ServicesFraudTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
    }//GEN-LAST:event_assignBtnActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = ServicesFraudTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        else{
            request = (ComplainWorkRequest)ServicesFraudTable.getValueAt(selectedRow, 0);
            if(request.getReceiver()==null){
                JOptionPane.showMessageDialog(null, "Work request not assigned to anyone");
            }
            else{
                if(request.getStatus().equals("Completed")){
                    JOptionPane.showMessageDialog(null, "Complain already processed");
                }
                else{
                    request.setStatus("Processing");
                    ProcessServicesFraudJPanel processServiceJPanel = new ProcessServicesFraudJPanel(userProcessContainer,request,business, userAccount);
                    userProcessContainer.add("ProcessServicesFraudJPanel",processServiceJPanel);
                    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
            }
        }
        
    }//GEN-LAST:event_processBtnActionPerformed

    private void enterpriseNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseNameTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ProcessServicesFraudJPanel dwjp = (ProcessServicesFraudJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ServicesFraudTable;
    private javax.swing.JButton assignBtn;
    private javax.swing.JTextField enterpriseNameTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processBtn;
    private javax.swing.JButton refreshBtn;
    // End of variables declaration//GEN-END:variables
}
