/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Hospital;

import Business.Organization.Organization;
import Business.Role.HealthInsurance.InsuranceAgentRole;
import Business.Role.Hospital.PharmacistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mitka
 */
public class PharmacyOrganization extends Organization {
    
    public PharmacyOrganization(){
        super(Organization.Type.pharmacy.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role>roles = new ArrayList();
        roles.add(new PharmacistRole());
        return roles;
    }
}
