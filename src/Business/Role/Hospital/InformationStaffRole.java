/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Hospital;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Hospital.PatientOrganization;
import Business.Organization.Hospital.PharmacyOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Hospital.Pharmacy.PharmacyWorkAreaJPanel;
import Business.Organization.Hospital.ReleaseOfInfoOrganization;
import UserInterface.Hospital.Patient.LodgeComplainJPanel;
import userinterface.Hospital.Releaseinfo.FirstROIWorkRequestJPanel;

/**
 *
 * @author mitka
 */
public class InformationStaffRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return new FirstROIWorkRequestJPanel(userProcessContainer, account, (ReleaseOfInfoOrganization) organization, enterprise , business);
    }
//    ProcessWorkRequestJPanel
}
