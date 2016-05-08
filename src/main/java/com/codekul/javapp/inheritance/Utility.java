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
public class Utility {
    
    public void locate(GpsListener listener){
        
        if(listener instanceof Bike){
           Bike bike = (Bike) listener; 
           bike.speedUp();
        }
        else if(listener instanceof Human){
            
            Human human = (Human) listener;
            human.walkPaces();
        }
        else {
            return;
        }
        System.out.println("Locartion "+listener.getLocation());
    }
}
