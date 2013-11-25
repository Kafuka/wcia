/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia.entities;

/**
 *
 * @author Jordy Mugeni
 */
public class InvoiceItem {
    
    private LineItem item;
    private int quatity;
    private float total;

    public InvoiceItem() {
    }

    public LineItem getItem() {
        return item;
    }

    public void setItem(LineItem item) {
        this.item = item;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public float getTotal() {
        return item.getPrice()*quatity;
    }
    
}
