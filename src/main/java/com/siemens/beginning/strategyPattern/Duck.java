/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.strategyPattern;

/**
 *
 * @author castdani
 */
public class Duck {

    IFlyBehaviour fb;
    
    public Duck (IFlyBehaviour fb){
        this.fb = fb;
        
    }
    public String fly(){
        return this.fb.flyMethod();
    }
}
