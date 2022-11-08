/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.adapterPattern;

/**
 *
 * @author castdani
 */

// Represented as Client in the UML design
public class AdapterPatternApp {
    public static void main(String[] args) {
       // With Dependency Ingestion you can have multiple Adapters 
       //without creating multiple instances of Adaptee Object.
       Adaptee theAdaptee =new Adaptee();
       ITarget target1 = new Adapter(theAdaptee);
       ITarget target2 = new Adapter(theAdaptee);
       target1.request();
       target2.request();
    }
    
}
