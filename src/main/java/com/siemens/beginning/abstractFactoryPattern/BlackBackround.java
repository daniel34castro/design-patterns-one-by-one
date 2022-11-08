/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.abstractFactoryPattern;

/**
 *
 * @author castdani
 */
public class BlackBackround implements IProductA{
    private String color = "black";
    @Override
    public String createProductA(){
        System.out.println("ProductA backround color : " + color);
        return this.color;
    }
}
