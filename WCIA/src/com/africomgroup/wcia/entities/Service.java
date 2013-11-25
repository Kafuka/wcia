/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia.entities;

/**
 *
 * @author Jordy Mugeni
 */
public class Service implements LineItem {
    
    private String serviceID;
    private String description;
    private float price;

    public Service(String id, String description,float price) {
        this.serviceID =id;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getItemCode() {
        return this.serviceID;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
