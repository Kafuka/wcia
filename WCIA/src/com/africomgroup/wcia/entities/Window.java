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
public class Window {

    private int size;
    private int length;
    private int width;
    /**
     *
     */
    public Window() {
        size = 1 * 1;
    }

    /**
     *
     */
    public Window(int length, int width) {
        this.length = length;
        this.width = width;
        size = length * width;

    }

    /**
     * 
     */
    public int getSize() {
        return size;
    }

}
