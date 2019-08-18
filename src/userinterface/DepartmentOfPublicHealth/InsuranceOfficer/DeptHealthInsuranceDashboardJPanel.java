/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DepartmentOfPublicHealth.InsuranceOfficer;
import userinterface.Hospital.Releaseinfo.*;
import Business.EcoSystem;
import java.awt.CardLayout;
import Business.Organization.Hospital.PharmacyOrganization;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.UserAccount.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfInsurance;
import Business.WorkQueue.MedicalWorkRequest;
import Business.Organization.Hospital.ReleaseOfInfoOrganization;
import Business.Organization.Organization;
import Business.ReimbursementDirectory;
import javax.swing.JOptionPane;
/**
 *
 * @author Samartha
 */
public class DeptHealthInsuranceDashboardJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ReleaseOfInfoOrganization release;
    private ReimbursementDirectory Reimburse;
    private EcoSystem business;
    private String PatientId;
    private Organization organization;
    private DivisionOfInsurance divorganization;
//    /**
//     * Creates new form ProcessWorkRequestJPanel
//     */

    public DeptHealthInsuranceDashboardJPanel(JPanel userProcessContainer, UserAccount account, Organization divorganization, Enterprise enterprise, EcoSystem business) 
    {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
       this.organization = organization;
        this.business = business;
        this.PatientId = PatientId;
        this.divorganization = (DivisionOfInsurance)divorganization;
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
        WRJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        setBackground(new java.awt.Color(210, 247, 247));

        jPanel2.setBackground(new java.awt.Color(210, 247, 247));

        WRJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WRJButton.setText("Check Work Requests");
        WRJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WRJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(WRJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(WRJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to your workarea");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 218, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 218, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addContainerGap(705, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 148, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 148, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void WRJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WRJButtonActionPerformed
           DivInsuranceOfficerWorkJPanel DivInsuranceOfficerWork = 
           new DivInsuranceOfficerWorkJPanel(userProcessContainer, userAccount, enterprise, divorganization ,business);   
           userProcessContainer.add("DivInsuranceOfficerWork", DivInsuranceOfficerWork);
           CardLayout layout = (CardLayout) userProcessContainer.getLayout();
           layout.next(userProcessContainer);
    }//GEN-LAST:event_WRJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton WRJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
