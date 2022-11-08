/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.observerPattern;

import java.util.ArrayList; // import the ArrayList class
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author castdani
 */
public class WeatherStation implements IObservable {
    private int temperature = ThreadLocalRandom.current().nextInt(0, 20 + 1);
    
    ArrayList<IObserver> observers = new ArrayList<IObserver>();
    
    public WeatherStation (){
        System.out.println("The temperature is " + temperature);
        this.notifyObservers();
    }
    
    public void printObservers (){
        for (IObserver observer : observers){
            System.out.println(observer);
        }
    }
    
    
    public void add (IObserver observer){
        observers.add(observer);
        this.notifyObservers();
    }
    

    public void notifyObservers() { // notify is a reserved word
        for (IObserver observer : observers){
            observer.update();
        }
    }
    
    public int getTemperature (){
        return temperature;
    }
    
    public void refreshTemperature(){
        temperature = ThreadLocalRandom.current().nextInt(0, 20 + 1);
        System.out.println("The temperature changed to: " + temperature);
        notifyObservers();
    }
}
