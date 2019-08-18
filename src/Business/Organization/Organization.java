/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author mitka
 */
public abstract class Organization {
    
    private String name;
    private int organizationId;
    private EmployeeDirectory employeeDirectory;
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectory;
    private static int count =0;

    public Object getSelectedItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum Type{
        Admin("Admin Organization"),
        divOfInsurance("Division of Insurance"), divOfAdulteration("Division of Adulteration"), divOfMedServices("Division of Medical Services"),
        lawEnforcement("Law Enforcement Organization"),
        releaseOfInfo("Release of Information Organization"),patient("Patient Organization"),pharmacy("Pharmacy Organization"),
        claims("Insurance Claims Organization");
        
        private String value;
        private Type(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
   
    }
    
    public Organization(String name){
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationId = count;
        count++;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
        
}
