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
public interface CustomerDAO {
    public Customer create (Customer customer) throws DAOException;
    public void update (Customer customer)throws DAOException;
    public Customer findById (String id) throws DAOException;
    public List      <Customer> findByAll () throws DAOException;
}
