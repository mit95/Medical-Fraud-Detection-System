/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.DepartmentOfPublicHealth.*;
import Business.Organization.FraudDetectionAgency.*;
import Business.Organization.Hospital.*;
import Business.Organization.HealthInsurance.*;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author mitka
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        organizationList = new ArrayList<>();
    }
    
    // NM - 28/11
       public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
        // NM - 28/11
    public Organization createOrganization(Type type){
        Organization organization = null;
        //Department of Public Health
        if(type.getValue().equals(Type.divOfInsurance.getValue())){
            organization = new DivisionOfInsurance();
            organizationList.add(organization);
        }
        
        else if(type.getValue().equals(Type.divOfAdulteration.getValue())){
            organization = new DivisionOfAdulteration();
            organizationList.add(organization);
        }
        
        else if(type.getValue().equals(Type.divOfMedServices.getValue())){
            organization = new DivisionOfMedServices();
            organizationList.add(organization);
        }
        
        //Fraud Detection Agency
        else if(type.getValue().equals(Type.lawEnforcement.getValue())){
            organization = new LawEnforcementOrganization();
            organizationList.add(organization);
        }
        
        //Hospital
        else if(type.getValue().equals(Type.releaseOfInfo.getValue())){
            organization = new ReleaseOfInfoOrganization();
            organizationList.add(organization);
        }
        
        else if(type.getValue().equals(Type.patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
        
        else if(type.getValue().equals(Type.pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        
        //Health Insurance 
        else if(type.getValue().equals(Type.claims.getValue())){
            organization = new ClaimsOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
//      public String toString(){
//        return 
//    }
    
}
