/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Hospital;

import Business.Organization.Organization;
import Business.Role.HealthInsurance.InsuranceAgentRole;
import Business.Role.Hospital.InformationStaffRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mitka
 */
public class ReleaseOfInfoOrganization extends Organization {
    
    public ReleaseOfInfoOrganization(){
        super(Organization.Type.releaseOfInfo.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role>roles = new ArrayList();
        roles.add(new InformationStaffRole());
        return roles;
    }
}
