/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia.entities;

/**
 *
 * @author Jordy
 */
public class Contact {
    
    private String phoneNo;
    private String cellNo;
    private String emailAddress;
    private String facebookpage;
    private String linkedInPage;

    public Contact(String cellphone,String email,String facebook) {
        this.cellNo= cellphone;
        this.emailAddress = email;
        this.facebookpage = facebook;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getCellNo() {
        return cellNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFacebookpage() {
        return facebookpage;
    }

    public String getLinkedInPage() {
        return linkedInPage;
    }

    @Override
    public String toString() {
        return "Cell : "+ cellNo + "\nEmail: "+emailAddress;
    }
    
    
}
