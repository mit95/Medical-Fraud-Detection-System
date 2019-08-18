/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Reimbursement;
import java.util.ArrayList;
import Business.WorkQueue.ROI_ClaimWorkRequest;

/**
 *
 * @author mitka
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<ROI_ClaimWorkRequest> ROI_ClaimWorkRequestList;
    private ArrayList<Reimbursement> ReimbursementDir;
    private ArrayList<ComplainWorkRequest>ComplainWorkRequestList;
     private ArrayList<Claim_DeptHealthInsuranceWorkRequest>Claim_HealthInsuranceWorkRequestList;
     private ArrayList<DepartmentToLawWorkRequest>departmenttolawWorkRequestList;
    
    public WorkQueue(){
        workRequestList = new ArrayList<>();
        ROI_ClaimWorkRequestList = new ArrayList<>();
        ReimbursementDir = new ArrayList<>();
        ComplainWorkRequestList = new ArrayList<>();
        Claim_HealthInsuranceWorkRequestList = new ArrayList<>();
        departmenttolawWorkRequestList = new ArrayList<>();
        
    }

    public ArrayList<Claim_DeptHealthInsuranceWorkRequest> getClaim_HealthInsuranceWorkRequestList() {
        return Claim_HealthInsuranceWorkRequestList;
    }

   public ArrayList<DepartmentToLawWorkRequest> getDepartmenttolawWorkRequestList() {
        return departmenttolawWorkRequestList;
    }

    public ArrayList<ComplainWorkRequest> getComplainWorkRequestList() {
        return ComplainWorkRequestList;
    }

    public ArrayList<Reimbursement> getReimbursementDir() {
        return ReimbursementDir;
    }
    
    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
       public ArrayList<ROI_ClaimWorkRequest> getROI_ClaimWorkRequestList() {
        return ROI_ClaimWorkRequestList;
    }
       
        public ArrayList<Claim_DeptHealthInsuranceWorkRequest> getClaim_HealthInsuranceWorkRequest() {
        return Claim_HealthInsuranceWorkRequestList;
    }
    public void deleteAccount(Reimbursement reimbursement){
       ReimbursementDir.remove(reimbursement);
    }
    
}
