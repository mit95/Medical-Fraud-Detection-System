/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.ReimbursementDirectory;
import Business.Role.Role;

/**
 *
 * @author nikhi
 */
public class Insurnce_PatientWorkRequest extends WorkRequest {
    String PatientID;
    ReimbursementDirectory reimb;
    String organizationName;
    String fraudDetected;

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
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
}
