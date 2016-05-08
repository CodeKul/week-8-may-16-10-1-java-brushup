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
// Tiger is an Animal
public /*abstract*/ class Tiger extends Animal {

    private int eye;
    
    public Tiger() {

        legs = 4;
        name = "Jira";
    }
    
    public void blinkEye(){
        
        eye = 0;
    }

    @Override
    public void walk() {
        
    }

    @Override
    public void eat() {
        
    }
}
