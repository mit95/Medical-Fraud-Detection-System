/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Hospital;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Hospital.PatientOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.Hospital.Patient.LodgeComplainJPanel;
import javax.swing.JPanel;
import Business.Organization.Hospital.PharmacyOrganization;
import userinterface.Hospital.Pharmacy.PharmacyWorkAreaJPanel;

/**
 *
 * @author mitka
 */
public class PharmacistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
     //            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   return new PharmacyWorkAreaJPanel(userProcessContainer, account, (PharmacyOrganization) organization, enterprise); 
    }
    
}
