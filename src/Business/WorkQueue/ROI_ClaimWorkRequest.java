/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Reimbursement;
import Business.ReimbursementDirectory;
import java.util.ArrayList;
import Business.UserAccount.UserAccount;

/**
 *
 * @author nikhi
 */
public class ROI_ClaimWorkRequest extends WorkRequest  {
    String PatientID;
    String MedicalId;
    ReimbursementDirectory reimb;
    String organizationName;
    String fraudDetected;
    String enterpriseName;
    
    
       public String getMedicalId() {
        return MedicalId;
    }

    public void setMedicalId(String MedicalId) {
        this.MedicalId = MedicalId;
    }
    
    public ROI_ClaimWorkRequest()
    {
    ReimbursementDirectory reimb = new ReimbursementDirectory();
    }

    public String getFraudDetected() {
        return fraudDetected;
    }

    public void setFraudDetected(String fraudDetected) {
        this.fraudDetected = fraudDetected;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public ReimbursementDirectory getReimb() {
        return reimb;
    }

    public void setReimb(ReimbursementDirectory reimb) {
        this.reimb = reimb;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
  
}
