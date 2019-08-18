/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.DepartmentOfPublicHealth;

import Business.Organization.Organization;
import Business.Role.DepartmentOfPublicHealth.*;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mitka
 */
public class DivisionOfAdulteration extends Organization {
    
    public DivisionOfAdulteration(){
        super(Organization.Type.divOfAdulteration.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role>roles = new ArrayList();
        roles.add(new AdulterationOfficerRole());
        return roles;
    }
}
