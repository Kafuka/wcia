/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.wcia.dao;

/**
 *
 * @author Jordy Mugeni
 */
public class DAOException extends Exception {
    
    public DAOException() {
        super();
    }
    
    public DAOException(String message) {
        super(message);
    }

    public DAOException(Throwable t) {
        super(t);
    }
    public DAOException (String message, Throwable t){
        super(message, t);
    }
}
