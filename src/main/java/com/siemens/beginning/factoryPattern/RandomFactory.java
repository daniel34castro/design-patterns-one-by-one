/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.factoryPattern;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author castdani
 */
public class RandomFactory implements IAnimalFactory {

    public IAnimal createAnimal() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        System.out.println("Number: " + randomNum);
        switch (randomNum) {
            case 1:
                return new Dog();
            case 2:
                return new Cat();
            case 3:
                return new Duck();
        }
        throw new NullPointerException("No Animal Created");
                
    }

    
        

}
