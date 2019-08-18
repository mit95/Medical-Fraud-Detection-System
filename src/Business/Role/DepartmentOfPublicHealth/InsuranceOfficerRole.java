/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.DepartmentOfPublicHealth;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DepartmentOfPublicHealth.DivisionOfInsurance;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DepartmentOfPublicHealth.InsuranceOfficer.DeptHealthInsuranceDashboardJPanel;


/**
 *
 * @author mitka
 */
public class InsuranceOfficerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        return new InsuranceOfficerWorkAreaJPanel(userProcessContainer, account, (DivisionOfInsurance) organization, enterprise, business);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return new DeptHealthInsuranceDashboardJPanel (userProcessContainer, account, (DivisionOfInsurance) organization , enterprise, business);
//    DivInsuranceOfficerWorkJPanel
//            DeptHealthInsuranceDashboardJPanel
            
//            InsuranceOfficerWorkAreaJPanel
    }
    
}
