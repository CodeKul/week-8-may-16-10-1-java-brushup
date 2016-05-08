/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javapp.generics;

import com.codekul.javapp.inheritance.Animal;

/**
 *
 * @author melayer
 */
public class MyGeneric<T /*extends Animal*/> {
    
    private T anyObj;

    public T getAnyObj() {
        // use reflection api
        if(anyObj instanceof Animal){
            
        }
        return anyObj;
    }

    public void setAnyObj(T anyObj) {
        this.anyObj = anyObj;
    }
}
