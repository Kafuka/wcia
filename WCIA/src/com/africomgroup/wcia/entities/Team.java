/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia.entities;

import java.util.HashMap;
/**
 *
 * @author Jordy Mugeni
 */
public class Team {
    
    private String name;
    private Employee leader;
    private HashMap <String,Employee> members;
    /**
     * 
     */
    public Team(String name, String leaderId) {
        
        this.name =name;
        this.members = new HashMap<String, Employee > ();
        leader = new Employee(leaderId);
    }
    /**
     * 
     */
    public void addMember (Employee member){
        members.put(member.getEmpNo(), member);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getLeader() {
        return leader;
    }

    public void setLeader(Employee leader) {
        this.leader = leader;
    }
    
}
