/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javapp;

import com.codekul.javapp.basics.Car;
import com.codekul.javapp.exceptionhandling.ExceptioStarter;
import com.codekul.javapp.generics.MyGeneric;
import com.codekul.javapp.inheritance.Animal;
import com.codekul.javapp.inheritance.Bike;
import com.codekul.javapp.inheritance.Human;
import com.codekul.javapp.inheritance.Tiger;
import com.codekul.javapp.inheritance.Utility;
import com.codekul.javapp.inheritance.GpsListener;
import com.codekul.javapp.innerclass.Outer;
import com.codekul.javapp.threading.Editor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melayer
 */
public class Main {

    public static void main(String[] args) {

        threading();
    }

    public static void basics() {

        Car car = new Car(); // car is ORV(Object Reference Variable)
        car.increaseSpeed(); // calling method
        car.speedoMeter();

        Car carPara = new Car(50);
        carPara.speedoMeter();
        carPara.setSpeed(80);

        Car carCopy = new Car(carPara);
        carCopy.speedoMeter();
        carCopy.setSpeed(20);

        Car.owner = 10;

        car.setSpeed(50);
        car.owner = 50;
    }

    /*
    (1). One class can extends one other class at a time
    (2). On class can implement one or more interfaces
    (3). One interface can extends one or more interfaces
    (4). One interface can never implement any other interface
    
    */
    public static void inheritance() {

        /*Animal animal = new Animal();
        animal.walk();
        animal.eat();*/
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.walk();

        Animal animalTiger = new Tiger();
        animalTiger.walk();
        animalTiger.setLegs(10);

        Tiger tigerAnimal = (Tiger) animalTiger; // casting is valid bcz animalTiger reference is having valid tiger object
        tigerAnimal.blinkEye();

        Human human = new Human();
        human.getLocation();

        Bike bike = new Bike();
        bike.getLocation();

        GpsListener listener = new Bike();
        GpsListener gl = new Human();
        Utility utility = new Utility();
        utility.locate(human);
        utility.locate(bike);
        utility.locate(listener);
        utility.locate(gl);
        
        
    }

    public static void innerClasses() {

        Outer outer = new Outer();

        Outer.InnerPublic innerPublic = outer.new InnerPublic();

        Outer.InnerStatic innerStatic = new Outer.InnerStatic();

        GpsListener listener = new GpsListener() {
            @Override
            public String getLocation() {

                return "Ano";
            }
        };
        
        System.out.println("Location - "+listener.getLocation());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
            }
        };
        
        runnable = () -> {
        
        };
    }
    
    public static void exceptionHandling() {
        
        ExceptioStarter starter = new ExceptioStarter();
        starter.getCountry(452);
        
        try {
            starter.writeToFile();
        } catch (Throwable ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        starter.country("5454");
    }
    
    public static void threading(){
        
        Editor editorCompiler = new Editor();
        editorCompiler.setName("Compiler");
        editorCompiler.setPriority(Thread.MAX_PRIORITY);
        editorCompiler.start();
        
        Editor editorSuggestion= new Editor();
        editorSuggestion.setName("Suggestion");
        editorSuggestion.setPriority(Thread.MIN_PRIORITY);
        editorSuggestion.start();
        
        Editor editorUpdate = new Editor();
        editorUpdate.setName("Update");
        editorUpdate.setPriority(Thread.NORM_PRIORITY);
        editorUpdate.start();
        
        Thread threadRunner = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <100 ; i++){
                    
                    System.out.println("Ano "+i);
                }
            }
        });
        threadRunner.setName("Ano");
        threadRunner.setPriority(Thread.MAX_PRIORITY);
        threadRunner.start();
    }
    
    public static void generics(){
        MyGeneric<String> myGeneric = new MyGeneric<>();
        myGeneric.setAnyObj("android");
        System.out.println("Any Obje - "+myGeneric.getAnyObj());
        
        MyGeneric<Animal> genericAnimal = new MyGeneric<>();
        genericAnimal.setAnyObj(new Tiger());
        genericAnimal.getAnyObj();
        
        MyGeneric<Integer> genericInt  = new MyGeneric<>();
        
    }
}
