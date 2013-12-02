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
public class Room {
    
    int size;
    int length;
    int width;
    String name;
    CARPETTYPE type;
    /**
     * Default surface is 9 meter squared
     * @param  name : provides description of the room
     */
    public Room(String name) {
        
        this.size = 3*3;
        this.type = CARPETTYPE.SIMPLE;
        this.name = name;
    }
    /**
     * 
     */
    public Room(String name,int length, int width, CARPETTYPE type) {
        
        this.length = length;
        this.width =width;
        this.type = type;
        this.name = name;
        this.size = length*width;
    }
    /**
     * 
     */
    public void setCarpetType (CARPETTYPE typ){
 
        type = typ;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Room Name: "+name+ " Room size "+ size;
    }
    
}
