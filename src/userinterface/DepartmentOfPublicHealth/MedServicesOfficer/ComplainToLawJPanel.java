/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DepartmentOfPublicHealth.MedServicesOfficer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FraudDetectionEnterprise;
import Business.Network.Network;
import Business.Organization.FraudDetectionAgency.LawEnforcementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ComplainWorkRequest;
import Business.WorkQueue.DepartmentToLawWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author mitka
 */
public class ComplainToLawJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ComplainToLawJPanel
     */
    JPanel userProcessContainer;
    ComplainWorkRequest request;
    DepartmentToLawWorkRequest lawRequest;
    EcoSystem business;
    UserAccount account;
    public ComplainToLawJPanel(JPanel userProcessContainer,ComplainWorkRequest request,EcoSystem business, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.business = business;
        this.account = account;
        lawRequest = new DepartmentToLawWorkRequest();
        
        complainTypeTextField.setText("Medical Services");
        enterpriseNameTextField.setText(request.getEnterpriseName());
        
        
        fraudLevelComboBox.removeAllItems();
        fraudLevelComboBox.addItem("Serious");
        fraudLevelComboBox.addItem("Medium");
        fraudLevelComboBox.addItem("Mild");
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
        complainTypeTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        enterpriseNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fraudReportTextField = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        fraudLevelComboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(210, 247, 247));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Complain Type:");

        complainTypeTextField.setEditable(false);
        complainTypeTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Enterprise Name:");

        enterpriseNameTextField.setEditable(false);
        enterpriseNameTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Fraud Report:");

        fraudReportTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        fraudReportTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        uploadButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Fraud Level:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Complain To Law Enforcement");

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        submitButton.setText("Send");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        fraudLevelComboBox.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        fraudLevelComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                .addGap(196, 196, 196)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fraudReportTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uploadButton)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fraudLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(complainTypeTextField)
                                .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(complainTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fraudReportTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(uploadButton)
                        .addGap(46, 46, 46)
                        .addComponent(fraudLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89)
                .addComponent(submitButton)
                .addGap(246, 246, 246))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF files","pdf");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = file.getSelectedFile();
            lawRequest.setFraudReportPath(selectedFile.getAbsolutePath());
            fraudReportTextField.setText("File Uploaded");

        }
        else if(result == JFileChooser.CANCEL_OPTION)
        {
            System.out.println("No File Selected");
        }

    }//GEN-LAST:event_uploadButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ProcessServicesFraudJPanel dwjp = (ProcessServicesFraudJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void backtomainpg(){
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ProcessServicesFraudJPanel dwjp = (ProcessServicesFraudJPanel) component;
        dwjp.backbtn();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
        if(lawRequest.getFraudReportPath()!=null){
            //int totalOffense = 0;
            lawRequest.setComplainType(complainTypeTextField.getText());
//            if(lawRequest.getHospitalPenalty().containsKey(request.getEnterpriseName())){
//                totalOffense = lawRequest.getHospitalPenalty().get(request.getEnterpriseName())+1;
//                lawRequest.getHospitalPenalty().put(request.getEnterpriseName(), totalOffense);
//            }
//            else{
//                totalOffense = 1;
//                lawRequest.getHospitalPenalty().put(request.getEnterpriseName(), totalOffense);
//            }
            lawRequest.setFraudLevel(fraudLevelComboBox.getSelectedItem().toString());
            lawRequest.setReq(request);
            lawRequest.setSender(account);
            lawRequest.setMessage(request.getGovMessage());
            lawRequest.setStatus("Action Required");
            request.setStatus("Completed");
            
            Organization org = null;
                for(Network network:business.getNetworkList()){
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    if(enterprise instanceof FraudDetectionEnterprise){
                        for(Organization looporg:enterprise.getOrganizationDirectory().getOrganizationList()){
                            if(looporg instanceof LawEnforcementOrganization){
                                org = looporg;
                                break;
                            }
                        }
                    }
                }
                }
                if(org!=null){
                    org.getWorkQueue().getDepartmenttolawWorkRequestList().add(lawRequest);
                    JOptionPane.showMessageDialog(null, "Complain sent to Law Enforcement");
                    backtomainpg();
                }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please give input for all fields");
        }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField complainTypeTextField;
    private javax.swing.JTextField enterpriseNameTextField;
    private javax.swing.JComboBox fraudLevelComboBox;
    private javax.swing.JLabel fraudReportTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
