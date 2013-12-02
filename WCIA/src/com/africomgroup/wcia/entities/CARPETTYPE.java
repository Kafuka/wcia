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
public enum CARPETTYPE {

    SIMPLE("Simple Carpet"), SPECIAL("Fuur"), EXPENSIVE ("extra fuur");
    private String type;

    private CARPETTYPE(String desc) {
        type = desc;
    }

    public String getType() {
        return type;
    }

}
