/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.DepartmentOfPublicHealth;

import Business.Organization.Organization;
import Business.Role.DepartmentOfPublicHealth.InsuranceOfficerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mitka
 */
public class DivisionOfInsurance extends Organization {
 
    public DivisionOfInsurance(){
        super(Organization.Type.divOfInsurance.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role>roles = new ArrayList();
        roles.add(new InsuranceOfficerRole());
        return roles;
    }
}
