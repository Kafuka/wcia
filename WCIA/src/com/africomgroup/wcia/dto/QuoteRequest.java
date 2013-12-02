/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.wcia.dto;

import com.africomgroup.wcia.entities.CARPETTYPE;
import com.africomgroup.wcia.entities.CleaningService;
import com.africomgroup.wcia.entities.House;
import com.africomgroup.wcia.entities.Room;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jordy Mugeni
 * 
 */
public class QuoteRequest extends DTO{
    
    private String cellNumber;
    private String name;
    private String area;
    private List <CleaningService> services;
    
    /**
     * 
     */
    public QuoteRequest() {
        services = new ArrayList<CleaningService> ();
    }
    /**
     * 
     */
    public QuoteRequest(String cellNumber, String name) {
        this.cellNumber = cellNumber;
        this.name = name;
    }
    /**
     * 
     */
    public void addService (CleaningService service){
        services.add(service);
    }
    
    /**
     * 
     */
    public List <CleaningService> getServiceList (){
    
        return services;
    }
    /**
     * 
     * 
     */
    public static void main (String[] args){
    
        QuoteRequest quote = new QuoteRequest ();
        
        House house = new House("Town House");
        Room room1 = new Room ("Bedroom 1",9, 10, CARPETTYPE.SIMPLE);
        room1.setCarpetType(CARPETTYPE.SIMPLE);
        
        System.out.println (room1);
        
        
        Room room2 = new Room ("Bedroom 2");
        System.out.println (room2);
        
        house.addRoom(room1);
        house.addRoom(room2);
        
        house.generateTotalArea();        
        System.out.println ("Total Area value is : "+ house.getTotalArea());
                
    }
}
