/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia.entities;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jordy Mugeni
 */
public class Invoice {
    
    private List <InvoiceItem> lineItems;
    private Customer customer;
    private String orderID;
    private Date orderDate;
    private double vat=0;
    private double total=0;
    private double grandTotal;

    private Invoice() {
        
        orderDate = DateFormat.getDateInstance().getCalendar().getTime();
        lineItems = new ArrayList<InvoiceItem> ();
        orderID = "INV" + orderDate;
    }
    
    /**
     * 
     */
    public Invoice (Customer cust){
        this ();
        this.customer =cust;
    }
    /**
     * 
     */
    public void addItem (InvoiceItem item){
        lineItems.add(item);
        
    }
    /**
     * 
     */
    private double calculateTotal (){
        double total =0;
        for (InvoiceItem item: lineItems){
            total +=item.getItem().getPrice()*item.getQuatity();
        }
        return total;
    }

    public double getTotal() {
        total = calculateTotal();
        return total;
    }
    
    public double getGrandTotal() {       
      
        grandTotal = total + vat;
        return grandTotal;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getVat() {
        vat = total*0.14;
        return this.vat;
    }    
    
    /**
     * 
     */
    public static void main (String [] args){
    
        Individual cust = new Individual();
        
        cust.setName("Jordy");
        cust.setSurname("Mugeni");
        cust.setAddress("Silicon valley");
        cust.setContact(new Contact("082", "jordy.mugeni@gmail.com", "no face book page"));
        
        
        Invoice invoice = new Invoice (cust);
        
        InvoiceItem item = new InvoiceItem();
        
        Service cleaning = new Service("01","Carpet Cleaning",10);
       
        
        item.setItem(cleaning);
        item.setQuatity(3);
        
        invoice.addItem(item);
        invoice.addItem(item);
        invoice.addItem(item);
        invoice.addItem(item);
        
        invoice.displayInvoice();
    }
    /**
     * 
     * 
     */
    public void displayInvoice (){
        
        System.out.println ("======= WCIA TAX Invoice ======");
        System.out.println(customer);
        System.out.println ("Order N0 : " + orderID);
        System.out.println ("Order Date : "+ orderDate);
        
        System.out.println ("||==================================================");
        
        for (InvoiceItem item : lineItems){
            
            System.out.println ("||"+item.getItem().getItemCode() + "| "+ item.getItem().getDescription() + "|"+ item.getQuatity() + " | "+ item.getItem().getPrice() + " |" + item.getTotal());
        
        }
        System.out.println ("||==================================================||");
        System.out.println ("||                          Total : " + this.getTotal()+"||");
        System.out.println ("||                            VAT : " + this.getVat()+"||");
        System.out.println ("||                    Grand Total : " + getGrandTotal()+"||");
        System.out.println ("||=================================================||");
    }
  
    
}
