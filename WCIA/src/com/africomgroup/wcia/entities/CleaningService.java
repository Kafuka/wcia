/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.wcia.entities;

/**
 *
 * @author Jordy Mugeni
 */
public class CleaningService {
    
    private int NoOfPeople;
    private House house;

    public CleaningService() {
        NoOfPeople =1;
    }
    /**
     * 
     */
    public CleaningService(int NoOfPeople) {
        this.NoOfPeople = NoOfPeople;
    }
    /**
     * 
     */
    public House getHouse() {
        return house;
    }
    /**
     * 
     */
    public void setHouse (House house){
    
        this.house = house;
    }
    /**
     * 
     */
    public int getTotalLabour (){  
        return NoOfPeople;
    }
    
}
