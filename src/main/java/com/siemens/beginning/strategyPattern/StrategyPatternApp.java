/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.strategyPattern;

/**
 *
 * @author castdani
 */
public class StrategyPatternApp {
    
    public static void main(String[] args) {
        // Strategy Pattern Example
        // https://www.youtube.com/watch?v=v9ejT8FO-7I&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=2
        IFlyBehaviour wildDuckFlight = new SimpleFly();
        Duck wildDuck =  new Duck(wildDuckFlight);
        System.out.println(wildDuck.fly());
        
    }
            
 
}
