/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.wcia.dao;

import com.africomgroup.wcia.entities.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Jordy Mugeni
 * 
 */
public class CustomerDAODBImpl implements CustomerDAO{
    
    private Connection connection = null;
    private String url = "";
    private String username="";
    private String password ="";

    
    public CustomerDAODBImpl() {
        url = "jdbc:derby://localhost:1527/wcia";
        username ="wcia";
        password ="welcome1";
        
        try {
            connection = DriverManager.getConnection(url,username,password);
        }catch (SQLException ex){
            System.out.println ("Error obtaining connection to database : "+ ex);
            System.exit(-1);         
        }
    }
/**
 * Creating a new customer record.
 * 
 */
    @Override
    public Customer create(Customer customer) throws DAOException{
        Statement statement = null;
        String query = "INSERT INTO CUSTOMER VALUES (";
        
        try {
            query = query +customer.getId()+ ",'" +customer.getName() + "',"+"'" + customer.getSurname()+"')";
            
            System.out.println (query);
            
            statement = connection.createStatement();
            if (statement.executeUpdate(query)!=1){
                throw new DAOException("Error adding a new Customer");
            }else {
            System.out.println("Success");
            
            }
            statement.close();
            connection.commit();
        }catch (SQLException ex){
            throw new DAOException("Error adding Customer on DOA",ex);
        }        
        return customer;
    }

    /**
     * Updating customer record.
     */
    @Override
    public void update(Customer customer) throws DAOException{
       Statement statement = null;
       String query="";
        try {
            statement = connection.createStatement();
            query = query + "UPDATE CUSTOMER "
                    + "SET NAME ='"+customer.getName() + "', "
                    + "SURNAME ='"+ customer.getSurname() + "'"
                    + "WHERE ID ="+customer.getId();
            
            System.out.println(query);
            if (statement.executeUpdate(query)!=1){
                throw new DAOException ("Error Updating Customer");
            }
            statement.close();
            connection.commit();
                    
       }catch (SQLException ex){
           throw new DAOException("Error updating customer DOA ", ex);
       }
    }

    /**
     * 
     */
    @Override
    public Customer findById(String id) throws DAOException{
        
         Statement statement = null;
         Customer customer=null;
        String query = "SELECT * FROM CUSTOMER WHERE ID =" + id;
        try {
            System.out.println (query);
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            if (!result.next()){
            return null;
            }
            
            customer = new Customer();
            customer.setId(result.getInt("ID"));
            customer.setName(result.getString("NAME"));
            customer.setSurname(result.getString("SURNAME"));
     
        }catch (SQLException ex){
            throw new DAOException("Error finding record "+ id + ex.getMessage(),ex);
        }
        return customer;
    }
/**
 * 
 * 
 */
    @Override
    public List<Customer> findByAll() throws DAOException{
        return null;
    }
}
