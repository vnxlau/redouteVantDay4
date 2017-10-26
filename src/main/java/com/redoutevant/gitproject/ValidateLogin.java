/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redoutevant.gitproject;

/**
 *
 * 
 * @author dev
 * @serial 20171026
 */
public class ValidateLogin {
    
    private String password;
    private String username;
    private int active;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    public static void main(String[] args) {
            
    }    
}
