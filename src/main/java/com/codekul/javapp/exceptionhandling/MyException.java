/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javapp.exceptionhandling;

/**
 *
 * @author melayer
 */
public class MyException extends RuntimeException{

    private String mobileNum;

    public MyException(String mobileNum) {
        this.mobileNum = mobileNum;
    }
    
    @Override
    public String getMessage() {
        return super.getMessage() +" Not Indian Mobile Number Exception"; 
    }

    @Override
    public String toString() {
        return super.toString() + "Invalid Mobile Num "+mobileNum; 
    }
}
