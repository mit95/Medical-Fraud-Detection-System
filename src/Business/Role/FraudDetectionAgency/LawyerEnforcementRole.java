/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.FraudDetectionAgency;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FraudDetectionAgency.LawEnforcementOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FraudDetectionAgency.LawEnforcement.FirstLawEnforcementJPanel;
import userinterface.FraudDetectionAgency.LawEnforcement.LawEnforcementWorkRequestJPanel;

/**
 *
 * @author mitka
 */
public class LawyerEnforcementRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FirstLawEnforcementJPanel(userProcessContainer, account, (LawEnforcementOrganization) organization, enterprise, business);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//            LawEnforcementWorkRequestJPanel
    
}
