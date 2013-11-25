/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia.entities;

/**
 * @author Jordy Mugeni
 * 
 */
public class Admin extends Employee{
    private String department;
 
    public Admin(String empNo) {
       super (empNo);
       this.department = "";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
