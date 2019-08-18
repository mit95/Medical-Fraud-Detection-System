/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import Business.Reimbursement;

/**
 *
 * @author nikhi
 */
public class ReimbursementDirectory {
     public ArrayList<Reimbursement> ReimbursementDirectory ;
     public ArrayList<Reimbursement> HospitalClaim ;
     public ArrayList<Reimbursement> PatientClaim ;

    public ReimbursementDirectory(){
        this.ReimbursementDirectory = new ArrayList<>();
        this.HospitalClaim = new ArrayList<>();
        this.PatientClaim = new ArrayList<>();
    }

    public ArrayList<Reimbursement> getHospitalClaim() {
        return HospitalClaim;
    }

    public void setHospitalClaim(ArrayList<Reimbursement> HospitalClaim) {
        this.HospitalClaim = HospitalClaim;
    }

    public ArrayList<Reimbursement> getPatientClaim() {
        return PatientClaim;
    }

    public void setPatientClaim(ArrayList<Reimbursement> PatientClaim) {
        this.PatientClaim = PatientClaim;
    }
     
    public ArrayList<Reimbursement> getReimbursementDirectory() {
        return ReimbursementDirectory;
    }

    public void setReimbursementDirectory(ArrayList<Reimbursement> ReimbursementDirectory) {
        this.ReimbursementDirectory = ReimbursementDirectory;
    }
    public Reimbursement addreimbursement()
    {
       Reimbursement reimburse = new Reimbursement();
        ReimbursementDirectory.add(reimburse);
        return reimburse;    
    }
    
    
    public Reimbursement addHospitalClaim()
    {
       Reimbursement reimburse = new Reimbursement();
        HospitalClaim.add(reimburse);
        return reimburse;    
    }
    
    
    
    public Reimbursement addPatientClaim()
    {
       Reimbursement reimburse = new Reimbursement();
        PatientClaim.add(reimburse);
        return reimburse;    
    }
    
    
    
    
    
       public void deleteAccount(Reimbursement reimbursement){
       ReimbursementDirectory.remove(reimbursement);
    }
    
    
    
    
}
