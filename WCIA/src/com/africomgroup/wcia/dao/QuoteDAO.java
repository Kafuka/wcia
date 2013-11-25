/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.wcia.dao;

import com.africomgroup.wcia.entities.Quote;
import java.util.List;

/**
 *
 * @author Jordy Mugeni
 */
public interface QuoteDAO {
    
    public Quote createQuote (Quote quote);
    public void updateQuote (Quote quote);
    public Quote findById (String id);
    public List <Quote> findbyDate ();
}
