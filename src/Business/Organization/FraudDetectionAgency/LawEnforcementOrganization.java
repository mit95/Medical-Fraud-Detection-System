/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FraudDetectionAgency;

import Business.Organization.Organization;
import Business.Role.FraudDetectionAgency.LawyerEnforcementRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mitka
 */
public class LawEnforcementOrganization extends Organization {
    
    public LawEnforcementOrganization(){
        super(Organization.Type.lawEnforcement.getValue());
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role>roles = new ArrayList();
        roles.add(new LawyerEnforcementRole());
        return roles;
    }
}
