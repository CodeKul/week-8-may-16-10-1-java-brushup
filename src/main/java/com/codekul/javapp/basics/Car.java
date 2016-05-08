/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javapp.basics;

/**
 *
 * @author melayer
 */
public class Car {
   
    // state -> fields
    private int speed;
    public static int owner;
    
    static {
        owner = 50;
    }
    
    // behaviour -> methods
    public Car() {
        
        speed = 0;
    }
    
    public Car(int sp){
        speed = sp;
    }
    
    public Car(Car c){
        speed = c.speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void increaseSpeed(){
        speed++;
    }
    
    public void speedoMeter(){
        System.out.println(""+speed);
        
        System.out.print("555");
        
        owner = 10;
    }
    
    public int speedoMeter(Car c){
        return 0;
    }
    
    public void speedoMeter(int speed){
        System.out.println(""+speed);
    }
    
    public static void init(){
        
        owner = 10;
        //speed = 10;
    }
}
