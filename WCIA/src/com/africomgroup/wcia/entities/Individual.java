/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia.entities;

/**
 *
 * @author Jordy Mugeni
 */
public class Individual extends Customer {
    
    private String gender;
    private String surname;
    private String preference;

    public Individual() {
        super();
    }

    public Individual(String name) {
      super (name);
        
    }
    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

 
    
    public static void main (String [] args ){
    
        Customer jordy = new Customer ();
        jordy.setName("Jordy");
        
        jordy.displayName();
        
        Individual neo = new Individual("neo");
        neo.displayName();
    }
    
}
