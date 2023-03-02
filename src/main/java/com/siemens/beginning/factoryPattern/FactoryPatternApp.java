/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.factoryPattern;


/**
 *
 * @author castdani
 */
public class FactoryPatternApp {
    public static void main(String[] args) {
        IAnimalFactory soundFactory = new RandomFactory();
        // This is possible because of polymorphism
        // All animal classes have the method animalSound
        soundFactory.createAnimal().animalSound();
        


    }
}
