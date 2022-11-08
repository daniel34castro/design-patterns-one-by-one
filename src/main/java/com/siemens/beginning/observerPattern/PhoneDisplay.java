/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.observerPattern;

/**
 *
 * @author castdani
 */
public class PhoneDisplay implements IObserver {
    WeatherStation station;
    int temperatureInDisplay;
    
    public PhoneDisplay(WeatherStation station){
        this.station = station;
    }
    public void display () {
        System.out.println("Phone displaying: " + temperatureInDisplay + " degrees.");
    };
    public void update () {
        temperatureInDisplay = station.getTemperature();
    };
    

    
}
