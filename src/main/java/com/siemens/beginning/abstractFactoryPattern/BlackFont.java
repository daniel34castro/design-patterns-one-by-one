/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.abstractFactoryPattern;

/**
 *
 * @author castdani
 */
public class BlackFont implements IProductB{

    private String color = "black";
    
    @Override
    public String createProductB() {
        System.out.println("ProductB font color : " + color);
        return this.color;
    }
}

