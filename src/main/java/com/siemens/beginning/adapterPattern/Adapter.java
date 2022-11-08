/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.adapterPattern;

/**
 *
 * @author castdani
 */
public class Adapter implements ITarget{
    Adaptee adaptee;
    
    
    // Dependency ingestion 
    // https://www.youtube.com/watch?v=IKD2-MAkXyQ
    //@Inject
    public Adapter(Adaptee adap){
       // Wrong!!
       //this.adaptee = new Adaptee();
       //Correct!
       this.adaptee = adap; 
    }
    
    public void request(){
        this.adaptee.specificRequest();
    }
}
