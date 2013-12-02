/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jordy Mugeni
 */
public class House extends Building{
    
    private int workers;
    private int totalArea;
    private int totalWindowArea;
    private List<Room> rooms;
    private List<Window> windows;
    /**
     *
     */
    public House(String name) {
        super(name);
        workers = 1;
        rooms = new ArrayList<Room> ();
        windows= new ArrayList <Window> ();
    }
    /**
     *
     */
    public House(String name, int floor,int workers) {
        super (name,floor);
        this.workers = workers;
        rooms = new ArrayList <Room> ();
        windows = new ArrayList <Window>();
    }
    /**
     *
     */
    public void addRoom(Room room) {
        // to be validated
        this.rooms.add(room);
    }
    /**
     *
     */
    public void addWindow(Window window) {
        this.windows.add(window);
    }
    /**
     *
     */
    public void generateTotalArea() {
        int total = 0;
        for (Room room : rooms) {
            total += room.getSize();
        }
        this.totalArea = total;
    }
    /**
     * 
     */
    public void generateTotalWindowArea() {
        int total = 0;

        for (Window window : windows) {
            total += window.getSize();
        }
        total = totalWindowArea;
}

    public int getWorkers() {
        return workers;
    }

    public int getTotalArea() {
        return totalArea;
    }

    public int getTotalWindowArea() {
        return totalWindowArea;
    }
/**
 * 
 */
@Override
        public String toString() {
        return "Total Workers : " + workers +"\n" + "Total Area : "+ totalArea + "\n"
                + "Total Window Area" + totalWindowArea;
    }
    
}
