/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author mitka
 */
public class DepartmentToLawWorkRequest extends WorkRequest {
    String officerName;
    String complainType;
    //HashMap<String,Integer> hospitalPenalty;
    String fraudReportPath;
    String fraudLevel;
    int penalty;
    //HashMap<String,Integer> penaltyTotalAmount;
    ComplainWorkRequest req;
    Claim_DeptHealthInsuranceWorkRequest claimReq;
    String MedicalID;
    String fraudResult;

    public String getFraudResult() {
        return fraudResult;
    }

    public void setFraudResult(String fraudResult) {
        this.fraudResult = fraudResult;
    }

    public String getMedicalID() {
        return MedicalID;
    }

    public void setMedicalID(String MedicalID) {
        this.MedicalID = MedicalID;
    }

    public String getComplainType() {
        return complainType;
    }

    public void setComplainType(String complainType) {
        this.complainType = complainType;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public String getFraudReportPath() {
        return fraudReportPath;
    }

    public void setFraudReportPath(String fraudReportPath) {
        this.fraudReportPath = fraudReportPath;
    }

    public String getFraudLevel() {
        return fraudLevel;
    }

    public void setFraudLevel(String fraudLevel) {
        this.fraudLevel = fraudLevel;
    }
    
    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public ComplainWorkRequest getReq() {
        return req;
    }

    public void setReq(ComplainWorkRequest req) {
        this.req = req;
    }

    public Claim_DeptHealthInsuranceWorkRequest getClaimReq() {
        return claimReq;
    }

    public void setClaimReq(Claim_DeptHealthInsuranceWorkRequest claimReq) {
        this.claimReq = claimReq;
    }
    
    @Override
    public String toString(){
        return complainType;
    }
}
