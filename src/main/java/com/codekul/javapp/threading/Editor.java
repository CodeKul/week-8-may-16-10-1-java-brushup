/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javapp.threading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melayer
 */
public class Editor extends Thread{

    public Editor() {
        super();
    }
    
    @Override
    public void run() {
        super.run();

       for (int i = 0 ; i<=10 ;i++){
           
           try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           System.out.println(""+getName()+(i*3));
       }
    }
}
