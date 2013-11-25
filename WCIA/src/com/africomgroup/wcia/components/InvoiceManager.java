/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.wcia.components;

import com.africomgroup.wcia.entities.Invoice;
import java.util.List;

/**
 *
 * @author Jordy Mugeni
 * 
 */
public interface InvoiceManager {
    
    public Invoice findInvoice ();
    public List <Invoice> findInvoicesByDate ();
    public void addInvoice (Invoice invoice);
    public void updateInvoice (Invoice invoice);
    public void deleteInvoice ();
    public void cancelInvoice ();
    public void concludeInvoide ();
}
