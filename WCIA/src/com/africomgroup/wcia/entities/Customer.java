/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia.entities;
/**
 *
 * @author Jordy Mugeni
 */
public class Customer {
    private int id;
    private String name;
    private String surname;
    private String address;
    private Contact contact;
    private String physical;

    public Customer() {
        System.out.println ("Called ");
        this.name = "default";
    }

    public Customer(String name) {
        this.name = name;
      
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public String toString() {
        return name + " " + surname;
    }
    public void displayName (){
    
        System.out.println ("My name is : " + name + " from ancestor ");
    }
       public void displayName (String address){
    
        System.out.println ("My name is : " + name + " from ancestor " + address);
    }
}
