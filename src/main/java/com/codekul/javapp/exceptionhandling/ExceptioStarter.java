/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javapp.exceptionhandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author melayer
 */
public class ExceptioStarter {

    private String[] countries = {"India", "china", "Japan", null};

    public void getCountry(int position) {

        try {
            File file = new File("");
            FileWriter writer = new FileWriter(file);

            System.out.println("Country - " + countries[position]); //  throw new ArrayIndexOutofBound();
        } catch (IOException e) {
             e.printStackTrace();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("" + e.getMessage());
        }

        System.out.println("Executed");
    }

    public void writeToFile() throws IOException, Exception, Throwable {

        File file = new File("");
        FileWriter writer = new FileWriter(file);
    }
    
    public void country(String mobileNum){
        
        if(mobileNum.length() < 10) throw new MyException(mobileNum);
        else{
            
        }
    }
}
