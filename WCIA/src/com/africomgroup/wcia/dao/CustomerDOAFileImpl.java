/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.wcia.dao;

import com.africomgroup.wcia.entities.Customer;
import java.util.List;

/**
 *
 * @author Jordy Mugeni
 * 
 */
public class CustomerDOAFileImpl implements CustomerDAO{

    @Override
    public void update(Customer customer) {
        
    }

    @Override
    public Customer create(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> findByAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
