/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia.entities;
/**
 *
 * @author Jordy Mugeni
 */
public class Quote {
    
    private String id;
    private double total;

    public Quote() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
