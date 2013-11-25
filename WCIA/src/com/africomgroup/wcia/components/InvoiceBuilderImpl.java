/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.wcia.components;

import com.africomgroup.wcia.dao.CustomerDAO;
import com.africomgroup.wcia.dao.DAOException;
import com.africomgroup.wcia.dao.DAOFactory;
import com.africomgroup.wcia.entities.Customer;
import com.africomgroup.wcia.entities.Invoice;

/**
 *
 * @author Jordy Mugeni
 */
public class InvoiceBuilderImpl implements InvoiceBuilder{
    

    @Override
    public Invoice buildInvoice() {
        
        CustomerDAO dao = DAOFactory.createCustomerDOA();
        Customer customer = new Customer();
        customer.setName("Judith");
        customer.setSurname("Mugeni");
        customer.setAddress("test");
        customer.setId(16011);
        
        try {
        dao.create(customer);
        System.out.println (dao.findById("10"));
        }catch (DAOException ex){
            System.out.println (ex.getMessage());
        
        }
        return null;
    }
    
    public static void main (String [] args){
        
        InvoiceBuilderImpl builder = new InvoiceBuilderImpl();
        builder.buildInvoice();
        
    }
    
}
