/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia.entities;

/**
 *
 * @author Jordy Mugeni
 */
public class Corporate extends Customer{
    private String contactPerson;
    private Contact contactDetails;

    public Corporate(String contactPerson, Contact contact) {
        this.contactPerson = contactPerson;
        this.contactDetails = contact;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public Contact getContactDetails() {
        return contactDetails;
    }
    
}
