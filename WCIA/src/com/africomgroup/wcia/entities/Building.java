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
public abstract class Building {
    private String name;
    private int floors;
    public abstract void generateTotalArea ();
    public abstract void generateTotalWindowArea ();
    /**
     * 
     */
    public Building (String name){
        this.name =name;
        this.floors=1;
    }
     public Building (String name,int floor){
        this.name =name;
        this.floors=floor;
    }
    /**
     * 
     */
    public String getName (){
        return name;
    }
}
