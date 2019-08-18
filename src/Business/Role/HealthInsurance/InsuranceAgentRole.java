/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.HealthInsurance;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfInsurance;
import Business.Organization.HealthInsurance.ClaimsOrganization;
import Business.Organization.Hospital.PatientOrganization;
import Business.Organization.Organization;
import Business.Reimbursement;
import Business.ReimbursementDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.Hospital.Patient.LodgeComplainJPanel;
import javax.swing.JPanel;
import userinterface.HealthInsurance.ClaimsOrganization.ClaimsOfficerWorkAreaJPanel;

/**
 *
 * @author mitka
 */
//private ReimbursementDirectoy  reimbursementDirectoy ;
public class InsuranceAgentRole extends Role {
    private ReimbursementDirectory reimbursementDirectoy;
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
     return new ClaimsOfficerWorkAreaJPanel(userProcessContainer, account, (ClaimsOrganization) organization, enterprise, business , reimbursementDirectoy);
    }
    
}
