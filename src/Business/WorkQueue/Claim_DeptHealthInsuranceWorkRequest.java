/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.ReimbursementDirectory;

/**
 *
 * @author nikhi
 */
public class Claim_DeptHealthInsuranceWorkRequest extends WorkRequest {
    String PatientID;
    String MedicalId;
    ReimbursementDirectory reimb;
    String organizationName;
    String fraudDetected;
    String hospEnterprise;

    public Claim_DeptHealthInsuranceWorkRequest(){
       
    }
    
    public String getMedicalId() {
        return MedicalId;
    }

    public void setMedicalId(String MedicalId) {
        this.MedicalId = MedicalId;
    }

    public ReimbursementDirectory getReimb() {
        return reimb;
    }

    public void setReimb(ReimbursementDirectory reimb) {
        this.reimb = reimb;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getFraudDetected() {
        return fraudDetected;
    }

    public void setFraudDetected(String fraudDetected) {
        this.fraudDetected = fraudDetected;
    }

    public String getHospEnterprise() {
        return hospEnterprise;
    }

    public void setHospEnterprise(String hospEnterprise) {
        this.hospEnterprise = hospEnterprise;
    }

    
 
}
