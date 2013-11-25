/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.wcia;

/**
 *
 * @author Jordy Mugeni
 */
public class Person {
    
    private String name;
    private String surname;
    private String race;
    private String age;
    private int idNo;

    // Constructor
    public Person(String yourname) {
        this.name = yourname;
    }
    // method// function
    public String getFamilyname (){
    
        return surname;
    }
    // void 
    public void setSurname (String newSurname){
        this.surname = newSurname;
    
    }
    public static void display (){
    
        System.out.println ("Hello there ...");
    }

    @Override
    public String toString() {
        return name + " "+surname;
    }
    
    
    
  public static void main (String [] args){
  
      Person jordy = new Person("Jordy");
      jordy.setSurname("Mugeni");
      
      Person joe = new Person("Joe");
      joe.setSurname("Tshimpaka");
      
      System.out.println ("Person instance :" + jordy);
      System.out.println ("Person instance :"+ joe);
      
      Person.display();
      
  }
    
}
