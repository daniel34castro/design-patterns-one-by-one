/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.observerPattern;

/**
 *
 * @author castdani
 */
public class ObserverPatternApp {
        public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
        PhoneDisplay phoneA = new PhoneDisplay(station);
        PhoneDisplay phoneB = new PhoneDisplay(station);
        AlexaDisplay alexaA = new AlexaDisplay(station);
        station.add(phoneA);
        station.add(phoneB);
        station.add(alexaA);
        station.printObservers();
        phoneA.display();
        alexaA.display();
        station.refreshTemperature();
        phoneA.display();
        alexaA.display();
    }
}
