/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author mitka
 */
public abstract class Role {

    
    public enum RoleType{
        Admin("Admin"),
        InsuranceOfficer("Insurance Officer"), AdulterationOfficer("Adulteration Officer"), MedicalServicesOfficer("Medical Services Officer"),
        Lawyer("Lawyer"),PoliceOfficer("Police Officer"),
        ReleaseOfInformation("Information Staff"),Patient("Patient"),Pharmacist("Pharmacist"),
        InsuranceAgent("Insurance Agent");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }
      
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }
    
    // NM - 28-11
    
        public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);
    // NM - 28-11
    
    @Override
   public String toString() {
       return this.getClass().getName();
   }
}
