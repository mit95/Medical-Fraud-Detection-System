/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author nikhi
 */
public class Reimbursement {
    private String PatientID;
    private String TypeOfReimbursement;
    private String Date;
    private int Amount;
    private String Patient_Insurance_Id;
    private String sending_Organization;

    public String getPatientID() {
        return PatientID;
    }

    public String getSending_Organization() {
        return sending_Organization;
    }

    public void setSending_Organization(String sending_Organization) {
        this.sending_Organization = sending_Organization;
    }

    public String getPatient_Insurance_Id() {
        return Patient_Insurance_Id;
    }

    public void setPatient_Insurance_Id(String Patient_Insurance_Id) {
        this.Patient_Insurance_Id = Patient_Insurance_Id;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public String getTypeOfReimbursement() {
        return TypeOfReimbursement;
    }

    public void setTypeOfReimbursement(String TypeOfReimbursement) {
        this.TypeOfReimbursement = TypeOfReimbursement;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }
    
    
    
@Override
public String toString()
{
//return TypeOfReimbursement;
    return PatientID;
}
}
