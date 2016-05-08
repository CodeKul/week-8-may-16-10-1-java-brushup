/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javapp.inheritance;

/**
 *
 * @author melayer
 */
public class Human extends GpsListener{
    
    public void walkPaces(){
        
    }

    @Override
    public String getLocation() {
        return "North Gate";
    }
}
