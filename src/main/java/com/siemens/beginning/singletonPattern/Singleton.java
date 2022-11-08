/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.singletonPattern;

/**
 *
 * @author castdani
 */
public class Singleton {
    static private Singleton instance;
    private Singleton(){
    }
    
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
            System.out.println("There was any instance created");
        }else{
            System.out.println("Retriving already existing instance.. ");
        }
        
        return instance;
    }
}
