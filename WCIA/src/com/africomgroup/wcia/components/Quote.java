/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.wcia.components;

import java.util.List;

/**
 *
 * @author Jordy Mugeni
 */
public interface Quote {
    public Quote requestQuote ();
    public Quote findQuote ();
    public List <Quote> findbyDate ();
    public Quote findByQuoteNo ();
    public Quote adjustQuote ();
    public void acceptQuote ();
}
