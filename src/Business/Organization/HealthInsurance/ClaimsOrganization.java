/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.HealthInsurance;

import Business.Organization.Organization;
import Business.Role.HealthInsurance.InsuranceAgentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mitka
 */
public class ClaimsOrganization extends Organization{
    
    public ClaimsOrganization(){
        super(Organization.Type.claims.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role>roles = new ArrayList();
        roles.add(new InsuranceAgentRole());
        return roles;
    }
}
