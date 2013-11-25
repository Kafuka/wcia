/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia;

import com.africomgroup.wcia.entities.Contact;
import com.africomgroup.wcia.entities.Individual;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 
 * @author Jordy Mugeni
 */
public class WCIA {

    public static void main(String[] args) {

        BufferedReader reader = null;
        int option =0;
        int updateOption=0;
        String typedOption;

        printHeader();
        printMainMenu();

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            typedOption = reader.readLine();

            System.out.println("The size of the input is : " + typedOption);

            option = Integer.parseInt(typedOption);

            if (option == 1) {
                printMainUpdateMenu();
                
                typedOption = reader.readLine();
                updateOption = Integer.parseInt(typedOption);
                
                if (updateOption ==1 ){
                    // create customer;
                    
                    Individual customer = new Individual();
                    
                    System.out.println ("Enter Customer name :");
                    customer.setName(reader.readLine());
                    System.out.println ("Enter Custoner surname : ");
                    customer.setSurname(reader.readLine());
                    System.out.println("Enter Customer cell number");
                    String cell = reader.readLine();
                    System.out.println ("Enter Customer email address");
                    String email = reader.readLine();
                    
                    Contact contact = new Contact(cell, email, "");
                    customer.setContact(contact);//Address(contact);
                    
                    System.out.println ("===== Thank You =======");
                    System.out.println ("You have successfully captured \n"+ customer);
                }

            }

        } catch (Exception ex) {

            System.out.println("Please contact Chis Kapanga for support");
        }
    }
    /**
     *
     */
    public static void printHeader() {
        System.out.println("===================================");
        System.out.println("       Welcome to WCIA System      ");
        System.out.println("===================================");
    }

    /**
     *
     */
    public static void printMainMenu() {
        System.out.println("***********************************");
        System.out.println("   Press 1 : To Update System   ");
        System.out.println("   Press 2 : To Process an Order ");
        System.out.println("   Press 3 : To Process Invoice ");
        System.out.println("***********************************");
    }

    /**
     *
     */
    public static void printMainUpdateMenu() {
        System.out.println("***********************************");
        System.out.println("   Press 1 : To Update Employee   ");
        System.out.println("   Press 2 : To Update Customer ");
        System.out.println("   Press 3 : To Process Service ");
        System.out.println("   Press 4 : To Process Product ");
        System.out.println("***********************************");
    }
}
