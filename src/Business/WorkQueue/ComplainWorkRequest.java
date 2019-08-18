/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.HashMap;

/**
 *
 * @author Samartha
 */
public class ComplainWorkRequest extends WorkRequest {
    String fraudDetected;
    String enterpriseName;
    String path;
    String hosppath;
    String hospitalstatusDoc = "File not received";
    String patientstatusDoc = "File not received";
    String PatientID;
    String patientMedical;
    String organizationName;
    private String govMessage;
    private String fraudResult;
    
    
    public ComplainWorkRequest(){
        
    }
    
    public enum ComplainType{
        //InsuranceFraud("Insurance Fraud"),
        MedicineFraud("Adulteration Fraud"), MedicalServFraud("Medical Services Fraud");
        
        private String value;
        private ComplainType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
    }

	public String getpatientMedical() {
        return patientMedical;
    }

    public void setpatientMedical(String patientMedical) {
        this.patientMedical = patientMedical;
    }
	
	public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
	
	
    public String getHosppath() {
        return hosppath;
    }

    public void setHosppath(String hosppath) {
        this.hosppath = hosppath;
    }

    public String getHospitalstatusDoc() {
        return hospitalstatusDoc;
    }

    public void setHospitalstatusDoc(String hospitalstatusDoc) {
        this.hospitalstatusDoc = hospitalstatusDoc;
    }

    public String getPatientstatusDoc() {
        return patientstatusDoc;
    }

    public void setPatientstatusDoc(String patientstatusDoc) {
        this.patientstatusDoc = patientstatusDoc;
    }
    
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
   
    public String getFraudDetected() {
        return fraudDetected;
    }

    public void setFraudDetected(String fraudDetected) {
        this.fraudDetected = fraudDetected;
    }

    public String getPatientMedical() {
        return patientMedical;
    }

    public void setPatientMedical(String patientMedical) {
        this.patientMedical = patientMedical;
    }
    
    public String getFraudResult() {
        return fraudResult;
    }

    public void setFraudResult(String fraudResult) {
        this.fraudResult = fraudResult;
    }

    public String getGovMessage() {
        return govMessage;
    }

    public void setGovMessage(String govMessage) {
        this.govMessage = govMessage;
    }
    
}
