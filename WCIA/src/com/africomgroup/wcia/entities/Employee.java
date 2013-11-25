/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia.entities;

/**
 *
 * @author Jordy Mugeni
 */
public class Employee {
    
    private String name;
    private String surname;
    private String empNo;
    private String contact;

    public Employee(String empNo) {
        this.empNo = empNo;
    }
    /**
     * 
     */
    public Employee (String name, String surname, String empNo){
    
        this.name= name;
        this.surname =surname;
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }  
    
}
